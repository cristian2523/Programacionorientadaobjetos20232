package edu.ucaldas.ingenieria.poo.gradebook;

import java.util.Scanner;

public class Gradebook {
	
	private String courseName;
	//zona constructores//
	public Gradebook()
	{
		
	}
	
	 /**
	 * @param courseName
	 */
	public Gradebook(String courseName) {
		super();
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName; 
	}

	public void displayMessage(String course)
	 {
		System.out.print(" hello from GadeBook class " + getCourseName());
	 }

	public void determimeClassAveriguar() {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0, grade, gradeCounter = 1, average;
		
		while (gradeCounter <= 5) {
			System.out.println(" Por favor ingresar grado");
			grade = sc.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			
		}
		
		average = total/5;
		System.out.println("El promedio de las notas son "+ average);
			
	}
}
