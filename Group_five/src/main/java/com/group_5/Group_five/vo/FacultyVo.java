package com.group_5.Group_five.vo;

import lombok.Data;

@Data
public class FacultyVo {

	private String name;
	private Long facultyId;
//	private String subject;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(Long facultyId) {
		this.facultyId = facultyId;
	}
	@Override
	public String toString() {
		return "FacultyVo [name=" + name + ", facultyId=" + facultyId + "]";
	}
}
