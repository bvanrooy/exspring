package be.abis.exercise.model.enums;

public enum PageMapping {

	ROOT("./"),
	CHANGEPWD("changepwd"),
	COURSEFORM("courseform"),
	DELETEPERSON("deleteperson"),
	ERROR("error"),
	INDEX("index"),
	LOGIN("login"),
	PERSADMIN("persadmin"),
	PERSONFORM("personform"),
	SEARCHCOURSE("searchcourse"),
	SEARCHPERSON("searchperson");

	private String pageMappingName;
	
	PageMapping(String value) {
		this.pageMappingName=value;
	}
	
	public String getPageMappingName() {
		return this.pageMappingName;
	}
}
