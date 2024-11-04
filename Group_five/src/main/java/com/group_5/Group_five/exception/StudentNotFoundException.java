package com.group_5.Group_five.exception;


public class StudentNotFoundException extends RuntimeException {
	
 public StudentNotFoundException() {
     super("No Faculty Available for Assignment Exception");
 }

 public StudentNotFoundException(String message) {
     super(message);
 }
}
