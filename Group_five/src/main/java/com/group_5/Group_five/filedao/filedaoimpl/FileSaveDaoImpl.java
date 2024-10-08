package com.group_5.Group_five.filedao.filedaoimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.group_5.Group_five.bo.boimpl.LogicBoImpl;
import com.group_5.Group_five.filedao.FileSaveDao;
import com.group_5.Group_five.vo.FacultyVo;
import com.group_5.Group_five.vo.StudentVo;

public class FileSaveDaoImpl implements FileSaveDao {
	
	
    private static final Logger logger = Logger.getLogger(LogicBoImpl.class.getName());


	@Override
	public void addStudent(StudentVo st) {
		logger.info("FileSaveDaoImpl --> addStudent"+st);

	}

	@Override
	public void addFaculty(FacultyVo fa) {
		logger.info("FileSaveDaoImpl --> addFaculty"+fa);

	}

	@Override
	public List<StudentVo> getStudentsByFaculty(Long facultyId) {
		logger.info("FileSaveDaoImpl --> getStudentsByFaculty"+facultyId);
		
		return null;
	}

}