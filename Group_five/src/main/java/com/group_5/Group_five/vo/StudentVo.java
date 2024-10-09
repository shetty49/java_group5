package com.group_5.Group_five.vo;

import lombok.Data;

@Data
public class StudentVo {

	private String name;
	private String rno;
	private Long courceId;
	private Long facultyId;
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
	public Long getCourceId() {
		return courceId;
	}
	public void setCourceId(Long courceId) {
		this.courceId = courceId;
	}
	public Long getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(Long facultyId) {
		this.facultyId = facultyId;
	}
	@Override
	public String toString() {
		return "StudentVo [name=" + name + ", rno=" + rno + ", courceId=" + courceId + ", facultyId=" + facultyId + "]";
	}
	
	
}
