package com.aspl.org.dto;

public class SectionMasterDTO {

	private Integer sectionId;
	
	private String sectionnme;
	private String sectiondetails;
	
	public Integer getSectionId() {
		return sectionId;
	}
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	public String getSectionnme() {
		return sectionnme;
	}
	public void setSectionnme(String sectionnme) {
		this.sectionnme = sectionnme;
	}
	public String getSectiondetails() {
		return sectiondetails;
	}
	public void setSectiondetails(String sectiondetails) {
		this.sectiondetails = sectiondetails;
	}
	@Override
	public String toString() {
		return "SectionMasterDTO [sectionId=" + sectionId + ", sectionnme=" + sectionnme + ", sectiondetails="
				+ sectiondetails + "]";
	}
	
	
	
}
