package com.group_5.Group_five.vo;

import lombok.Data;

@Data
public class StudentVo {

	private String name;
	private String rno;
	private Long courseId;
	private Long facultyId;
	
	public StudentVo(String name, String rno, Long courceId, Long facultyId) {
		this.name = name;
		this.rno = rno;
		this.courseId = courceId;
		this.facultyId = facultyId;
	}
	
	public StudentVo() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRno() {
		return rno;
	}
	public void setRno(String rno) {
		this.rno = rno;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public Long getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(Long facultyId) {
		this.facultyId = facultyId;
	}
	@Override
	public String toString() {
		return "StudentVo [name=" + name + ", rno=" + rno + ", courseId=" + courseId + ", facultyId=" + facultyId + "]";
	}
	
	
}
