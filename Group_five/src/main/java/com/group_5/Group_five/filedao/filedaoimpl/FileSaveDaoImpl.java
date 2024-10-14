package com.group_5.Group_five.filedao.filedaoimpl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.group_5.Group_five.bo.LogicBo;
import com.group_5.Group_five.bo.boimpl.LogicBoImpl;
import com.group_5.Group_five.filedao.FileSaveDao;
import com.group_5.Group_five.vo.CourseVo;
import com.group_5.Group_five.vo.FacultyVo;
import com.group_5.Group_five.vo.StudentVo;
import com.group_5.Group_five.vo.SubjectVo;

public class FileSaveDaoImpl implements FileSaveDao {
	
	
    private static final Logger logger = Logger.getLogger(LogicBoImpl.class.getName());
    private static final String FILE_PATH_STUDENT = "F:\\files_db\\students.txt";
    private static final String FILE_PATH_COURSE = "F:\\files_db\\course.txt";
    private static final String FILE_PATH_FACULTY = "F:\\files_db\\faculty.txt";
    private static final String FILE_PATH_SUBJECT = "F:\\files_db\\subject.txt";


	@Override
	public void addStudent(StudentVo st) {
		logger.info("FileSaveDaoImpl --> addStudent"+st);
		 try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH_STUDENT, true))) {
	            writer.write(st.toString());
	            writer.newLine();
	        } catch (IOException e) {
	            logger.error("Error writing to file: " + e.getMessage());
	        }
	}

	@Override
	public void addFaculty(FacultyVo fa) {
		logger.info("FileSaveDaoImpl --> addFaculty"+fa);
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH_FACULTY, true))) {
            writer.write(fa.toString());
            writer.newLine();
        } catch (IOException e) {
            logger.error("Error writing to file: " + e.getMessage());
        }
	}

	@Override
	public List<StudentVo> getStudentsByFaculty(Long facultyId) {
		logger.info("FileSaveDaoImpl --> getStudentsByFaculty"+facultyId);
		List<StudentVo> students = new ArrayList<>();
		List<StudentVo> mentoredStudent = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_PATH_STUDENT));
            for (String line : lines) {
                students.add(fromString(line));
            }
            for (StudentVo svo : students) {
            	if(svo.getFacultyId() == facultyId) {
            		System.out.println("return :"+svo);
            		mentoredStudent.add(svo);
            	} else {
            	}
            }
        } catch (IOException e) {
            logger.error("Error reading from file: " + e.getMessage());
        }
		return mentoredStudent;
	}

	@Override
	public void addCourse(CourseVo co) {
		logger.info("FileSaveDaoImpl --> addCourse"+co);
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH_COURSE, true))) {
            writer.write(co.toString());
            writer.newLine();
        } catch (IOException e) {
            logger.error("Error writing to file: " + e.getMessage());
        }		
	}

	@Override
	public void addSubject(SubjectVo sub) {
		logger.info("FileSaveDaoImpl --> addSubject"+sub);
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH_SUBJECT, true))) {
            writer.write(sub.toString());
            writer.newLine();
        } catch (IOException e) {
            logger.error("Error writing to file: " + e.getMessage());
        }		
	}

	@Override
	public StudentVo getStudentDetails(Long studentId) {
		List<StudentVo> students = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_PATH_STUDENT));
            for (String line : lines) {
                students.add(fromString(line));
            }
            for (StudentVo svo : students) {
            	if(svo.getRno().equalsIgnoreCase(studentId.toString())) {
            		System.out.println("return :"+svo);
            		return svo;
            	}
            }
        } catch (IOException e) {
            logger.error("Error reading from file: " + e.getMessage());
        }
		return null;		
	}

	@Override
	public CourseVo getCourseDetails(Long CourseId) {
		return null;
		
	}
	
	public StudentVo fromString(String line) {
		
	    String cleanLine = line.replace("StudentVo [", "").replace("]", "").trim();
	    
	    String[] parts = cleanLine.split(", ");
	    
	    String name = "", rno = "", courseId = "", facultyId = "";
	    
	    for (String part : parts) {
	        String[] keyValue = part.split("=");
	        switch (keyValue[0].trim()) {
	            case "name":
	                name = keyValue[1].trim();
	                break;
	            case "rno":
	                rno = keyValue[1].trim();
	                break;
	            case "courseId":
	                courseId = keyValue[1].trim();
	                break;
	            case "facultyId":
	                facultyId = keyValue[1].trim();
	                break;
	        }
	    }
	    
	    return new StudentVo(name, rno, Long.parseLong(courseId), Long.parseLong(facultyId));
	}


}
