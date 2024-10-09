package com.group_5.Group_five.vo;

public class CourseVo {
	
	private Long courseId;
	private String courseName;
//	List<String> Subjects;
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "CourseVo [courseId=" + courseId + ", courseName=" + courseName + "]";
	}	
}
