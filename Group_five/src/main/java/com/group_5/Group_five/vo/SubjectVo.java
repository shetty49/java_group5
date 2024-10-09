package com.group_5.Group_five.vo;

public class SubjectVo {

	private Long subjectId;
	private String name;
	private Long facultyId;
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
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
		return "SubjectVo [subjectId=" + subjectId + ", name=" + name + ", facultyId=" + facultyId + "]";
	}
}
