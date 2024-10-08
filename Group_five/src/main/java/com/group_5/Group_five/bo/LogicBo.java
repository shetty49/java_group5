package com.group_5.Group_five.bo;

import java.util.List;

import com.group_5.Group_five.vo.FacultyVo;
import com.group_5.Group_five.vo.StudentVo;

public interface LogicBo {
	
	void addStudent(StudentVo st);
	void addFaculty(FacultyVo fa);
	List<StudentVo> getStudentsByFaculty(Long facultyId);
}