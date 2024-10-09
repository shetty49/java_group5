package com.group_5.Group_five.bo;

import java.util.List;

import com.group_5.Group_five.vo.CourseVo;
import com.group_5.Group_five.vo.FacultyVo;
import com.group_5.Group_five.vo.StudentVo;
import com.group_5.Group_five.vo.SubjectVo;

public interface LogicBo {
	
	void addStudent(StudentVo st);
	void addFaculty(FacultyVo fa);
	void addCourse(CourseVo co);
	void addSubject(SubjectVo sub);
	List<StudentVo> getStudentsByFaculty(Long facultyId);
	void getStudentDetails(Long studentId);
	void getCourseDetails(Long CourseId);
}
