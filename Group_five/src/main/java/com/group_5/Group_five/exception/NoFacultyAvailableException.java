package com.group_5.Group_five.exception;


public class NoFacultyAvailableException extends RuntimeException {
	
 public NoFacultyAvailableException() {
     super("Error: No faculty members available for assignment. Please add faculty details first.");
 }

 public NoFacultyAvailableException(String message) {
     super(message);
 }
}
