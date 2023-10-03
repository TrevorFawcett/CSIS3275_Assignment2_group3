package com.csis3275.model_group3;

public class Model_group3 {

	public String studentName;
	public String imgLink;
	public String bioInfo;
	
	public Model_group3(String sName, String link, String bio) {
		this.studentName = sName;
		this.imgLink = link;
		this.bioInfo = bio;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getImgLink() {
		return imgLink;
	}

	public void setImgLink(String imgLink) {
		this.imgLink = imgLink;
	}

	public String getBioInfo() {
		return bioInfo;
	}

	public void setBioInfo(String bioInfo) {
		this.bioInfo = bioInfo;
	}




}


