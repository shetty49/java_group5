package com.group_5.Group_five.bo.boimpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.group_5.Group_five.bo.LogicBo;
import com.group_5.Group_five.filedao.FileSaveDao;
import com.group_5.Group_five.filedao.filedaoimpl.FileSaveDaoImpl;
import com.group_5.Group_five.vo.CourseVo;
import com.group_5.Group_five.vo.FacultyVo;
import com.group_5.Group_five.vo.StudentVo;
import com.group_5.Group_five.vo.SubjectVo;


public class LogicBoImpl implements LogicBo {
	
	
	FileSaveDao fileSaveDao = new FileSaveDaoImpl();
	
    private static final Logger logger = Logger.getLogger(LogicBoImpl.class.getName());

	@Override
	public void addStudent(StudentVo st) {
		logger.info("LogicBoImpl --> addStudent"+st);		
		fileSaveDao.addStudent(st);
	}

	@Override
	public void addFaculty(FacultyVo fa) {
		logger.info("LogicBoImpl --> addFaculty"+fa);	
		fileSaveDao.addFaculty(fa);
	}

	@Override
	public List<StudentVo> getStudentsByFaculty(Long facultyId) {
		logger.info("LogicBoImpl --> getStudentsByFaculty"+facultyId);
		List<StudentVo> stlist = new ArrayList<>();
		stlist =fileSaveDao.getStudentsByFaculty(facultyId);
		System.out.println("list of students with faculty = "+facultyId+" as  mentor are");
		for(StudentVo stl : stlist) {
			System.out.print(" ,"+stl.getName());
		}
		return null;
	}

	@Override
	public void addCourse(CourseVo co) {
		logger.info("LogicBoImpl --> addCourse"+co);	
		fileSaveDao.addCourse(co);
	}

	@Override
	public void addSubject(SubjectVo sub) {
		logger.info("LogicBoImpl --> addSubject"+sub);
		fileSaveDao.addSubject(sub);
	}

	@Override
	public void getStudentDetails(Long studentId) {
		// TODO Auto-generated method stub
		fileSaveDao.getStudentDetails(studentId);
	}

	@Override
	public void getCourseDetails(Long CourseId) {
		// TODO Auto-generated method stub
		
	}

}
