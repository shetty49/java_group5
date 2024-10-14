package com.group_5.Group_five;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.group_5.Group_five.bo.LogicBo;
import com.group_5.Group_five.bo.boimpl.LogicBoImpl;
import com.group_5.Group_five.vo.CourseVo;
import com.group_5.Group_five.vo.FacultyVo;
import com.group_5.Group_five.vo.StudentVo;
import com.group_5.Group_five.vo.SubjectVo;

@SpringBootApplication
public class StudentInformationSystemApplication {
		
	public static void main(String[] args) {
		SpringApplication.run(StudentInformationSystemApplication.class, args);
		
		LogicBo logicBo = new LogicBoImpl();				
		Scanner sc = new Scanner( System.in );
		Integer task;
		
		do {
		System.out.println("select the task (1, 2, 3, 4 or 5)");
		System.out.println("1 . add student");
		System.out.println("2 . add faculty");
		System.out.println("3 . add course");
		System.out.println("4 . add subject");
		System.out.println("5 . get student list by faculty");
		System.out.println("6 . get student details");
		System.out.println("7 . get course details");
		System.out.println("8 . to exit");
		
		 task = sc.nextInt();
	    
	    
	    switch (task) {
	    case 1:
	    	System.out.println("enter student name, rollno, courseId, facultyId");
	    	StudentVo st = new StudentVo();
	        Scanner stInfo = new Scanner(System.in);
	    	st.setName(stInfo.next());
	    	st.setRno(stInfo.next());
	    	st.setCourseId(Long.parseLong(stInfo.next()));
	    	st.setFacultyId(Long.parseLong(stInfo.next()));
	    	System.out.println("student -> "+st);
	    	//call add student
	    	logicBo.addStudent(st);
	    	break;
	    case 2:
	    	System.out.println("enter faculty name and facultyId");
	    	FacultyVo fa = new FacultyVo();
	        Scanner faInfo = new Scanner(System.in);
	        fa.setName(faInfo.next());
	        fa.setFacultyId(Long.parseLong(faInfo.next()));
	    	System.out.println("Faculty -> "+fa);
	    	//call add faculty
	    	logicBo.addFaculty(fa);
	    	break;
	    case 3:
	    	System.out.println("enter course name and courseId");
	    	CourseVo co = new CourseVo();
	        Scanner coInfo = new Scanner(System.in);
	        co.setCourseName(coInfo.next());
	        co.setCourseId(Long.parseLong(coInfo.next()));
	    	System.out.println("course -> "+co);
	    	//call add course
	    	logicBo.addCourse(co);
	    	break;
	    case 4:
	    	System.out.println("enter subject name, subjectId and facultyId");
	    	SubjectVo su = new SubjectVo();
	        Scanner suInfo = new Scanner(System.in);
	        su.setName(suInfo.next());
	        su.setSubjectId(Long.parseLong(suInfo.next()));
	        su.setFacultyId(Long.parseLong(suInfo.next()));
	    	//call add subject
	        logicBo.addSubject(su);
	    	break;
	    case 5:
	    	System.out.println("enter the facultyId");
	        Scanner facultyId = new Scanner(System.in);
	    	//call get student list by faculty
	        logicBo.getStudentsByFaculty(Long.parseLong(facultyId.next()));
	    	break;
	    case 6:
	    	System.out.println("enter the studentId");
	        Scanner studentId = new Scanner(System.in);
	    	//call get student details
	        logicBo.getStudentDetails(Long.parseLong(studentId.next()));
	    	break;
	    case 7:
	    	System.out.println("enter the courseId");
	        Scanner courseId = new Scanner(System.in);
	    	//call get course details
	        logicBo.getCourseDetails(Long.parseLong(courseId.next()));
	    	break;
	    case 8:
	    	System.out.println("exiting scanner");
	    	sc.close();
	    	break;
	    default:
	    	System.out.println("enter a valid number");
	    }
		} while(task != 8);
	}
}
