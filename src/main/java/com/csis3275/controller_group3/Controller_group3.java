package com.csis3275.controller_group3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller_group3 {


	@GetMapping("/")
	public String showMainPage() {

		return "home";
	}

}
