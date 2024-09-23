package org.generation;
import org.generation.classes.Student;

import org.generation.classes.StudentService;

public class Main {

    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
	    studentService.addStudent(new Student( "Carlos", "1030", 31 ) );
	    studentService.addStudent(new Student( "Ian", "1040", 31 ) );
	    studentService.addStudent(new Student( "Elise", "1050", 31 ) );
	    studentService.addStudent(new Student( "Santiago", "1020", 31 ) );
        
        studentService.showAllCourses();
        studentService.enrollStudents("Physics", "1030");
        studentService.showEnrolledStudents("Physics");

    }//main
}//class Main