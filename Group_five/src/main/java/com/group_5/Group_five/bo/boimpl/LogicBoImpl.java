package com.group_5.Group_five.bo.boimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.group_5.Group_five.bo.LogicBo;
import com.group_5.Group_five.filedao.FileSaveDao;
import com.group_5.Group_five.vo.CourseVo;
import com.group_5.Group_five.vo.FacultyVo;
import com.group_5.Group_five.vo.StudentVo;
import com.group_5.Group_five.vo.SubjectVo;


public class LogicBoImpl implements LogicBo {
	
	@Autowired
	FileSaveDao fileSaveDao;
	
    private static final Logger logger = Logger.getLogger(LogicBoImpl.class.getName());

	@Override
	public void addStudent(StudentVo st) {
		logger.info("LogicBoImpl --> addStudent"+st);
		
//		fileSaveDao.addStudent(st);
	}

	@Override
	public void addFaculty(FacultyVo fa) {
		logger.info("LogicBoImpl --> addFaculty"+fa);
		
//		fileSaveDao.addFaculty(fa);
	}

	@Override
	public List<StudentVo> getStudentsByFaculty(Long facultyId) {
		logger.info("LogicBoImpl --> getStudentsByFaculty"+facultyId);
		
//		fileSaveDao.getStudentsByFaculty(facultyId);
		
		return null;
	}

	@Override
	public void addCourse(CourseVo co) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSubject(SubjectVo sub) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getStudentDetails(Long studentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCourseDetails(Long CourseId) {
		// TODO Auto-generated method stub
		
	}

}
