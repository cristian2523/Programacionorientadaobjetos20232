package edu.ucaldas.ingenieria.poo.gradebook;

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

}
