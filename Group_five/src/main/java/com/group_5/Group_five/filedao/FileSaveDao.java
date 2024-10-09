package com.group_5.Group_five.filedao;

import java.util.List;

import com.group_5.Group_five.vo.CourseVo;
import com.group_5.Group_five.vo.FacultyVo;
import com.group_5.Group_five.vo.StudentVo;

public interface FileSaveDao {
	
	void addStudent(StudentVo st);
	void addFaculty(FacultyVo fa);
	void addCourse(CourseVo co);
	void addSubject(StudentVo sub);
	List<StudentVo> getStudentsByFaculty(Long facultyId);
	void getStudentDetails(Long studentId);
	void getCourseDetails(Long CourseId);

}
