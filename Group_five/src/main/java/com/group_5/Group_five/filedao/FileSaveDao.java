package com.group_5.Group_five.filedao;

import java.util.List;

import com.group_5.Group_five.vo.CourseVo;
import com.group_5.Group_five.vo.FacultyVo;
import com.group_5.Group_five.vo.StudentVo;
import com.group_5.Group_five.vo.SubjectVo;

public interface FileSaveDao {
	
	void addStudent(StudentVo st);
	void addFaculty(FacultyVo fa);
	void addCourse(CourseVo co);
	void addSubject(SubjectVo sub);
	List<StudentVo> getStudentsByFaculty(Long facultyId);
	StudentVo getStudentDetails(Long studentId);
	CourseVo getCourseDetails(Long CourseId);

}
