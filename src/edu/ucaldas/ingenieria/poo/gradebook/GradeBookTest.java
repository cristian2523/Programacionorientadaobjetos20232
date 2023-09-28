package edu.ucaldas.ingenieria.poo.gradebook;

import java.util.Scanner;

public class GradeBookTest {
	public GradeBookTest( ) {
	
	}
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			Gradebook gradebook = new Gradebook();
			Gradebook gradebookProgramacionOO = new Gradebook("Programacion Orientada a Objetos ");
			
			gradebook.determimeClassAveriguar();
			
			/*
			System.out.print("give a course name: ");
			String courseName = sc.nextLine();
			gradebook.setCourseName(courseName);
			System.out.println(" nombre del curso "+ gradebook.getCourseName());
			System.out.println("Nombre del curso con constructor" + gradebook);
			gradebook.displayMessage(courseName);
			*/
		}

	}
