package com.group_5.Group_five;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentInformationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentInformationSystemApplication.class, args);
		
		Scanner sc = new Scanner( System.in );
		
		System.out.println("select the task (1, 2, 3, 4 or 5)");
		System.out.println("1 . add student");
		System.out.println("2 . add faculty");
		System.out.println("3 . add course");
		System.out.println("4 . add subject");
		System.out.println("5 . get student list by faculty");
		System.out.println("6 . get student details");
		System.out.println("7 . get course details");
		
	    Integer task = sc.nextInt();
	    
	    switch (task) {
	    case 1:
	    	//call add student
	    	break;
	    case 2:
	    	//call add faculty
	    	break;
	    case 3:
	    	//call add course
	    	break;
	    case 4:
	    	//call add subject
	    	break;
	    case 5:
	    	//call get student list by faculty
	    	break;
	    case 6:
	    	//call get student details
	    	break;
	    case 7:
	    	//call get course details
	    	break;
	    default:
	    	System.out.println("enter a valid number");
	    }
	}

}
