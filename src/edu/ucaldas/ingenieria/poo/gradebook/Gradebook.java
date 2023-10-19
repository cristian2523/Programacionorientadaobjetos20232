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
		
		int total = 0;
		int grade; 
		int gradeCounter = 1;
		int average = 0; 
		
			System.out.println(" ingrese la nota o -1 para salir");
			grade = sc.nextInt();
			
			while (grade != -1)  {
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			
			System.out.println(" ingrese la tecla -1 para salir");
			grade = sc.nextInt();
		}
		if (gradeCounter !=0) {
			average = total/gradeCounter;
		}
		
		System.out.println("El promedio total de la nota es " + average);
			
	}
}

