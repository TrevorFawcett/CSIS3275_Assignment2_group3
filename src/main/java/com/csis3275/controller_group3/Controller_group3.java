package com.csis3275.controller_group3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csis3275.model_group3.*;

@Controller
public class Controller_group3 {

	
	String studentName_tfa = "Trevor Fawcett";
	String imgLink_tfa = "/images/profilepicture.png";
	
	String bioInfo_tfa = "Studied at Douglas college since Winter 2018. Currently enrolled in Comp Study & Information Systems diploma."
			+ "Age 26. Have some experience programming in HTML, CSS, Javascript, PHP, Java, Android development.";

	

	@GetMapping("/")
	public String showMainPage() {

		return "home";
	}
	
	@GetMapping("/trevor")
	public String showTrevorPage(Model model) {
		Model_group3 object = new Model_group3(studentName_tfa, imgLink_tfa,bioInfo_tfa);
		model.addAttribute("trevor", object);
		
		return "trevorPage";
	}
}
