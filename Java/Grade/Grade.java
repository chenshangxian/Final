package Java.Grade;
/* This class accepts a letter grade A-F
   and a numeric grade 0 - 4 and converts
   the letter grade to a numeric grade and
   the numeric grade to a letter grade.
*/

public class Grade
{
	// Instance fields
	private String origLetter;
	private double newNumeric;
	
	private double origNumeric;
	private String newLetter;
	
	// Default constructor
	public Grade()
	{
		origLetter = "";
		origNumeric = 0;
		newLetter = "";
		newNumeric = 0;
	}
	
	// Parametric constructor
	public Grade(String oldLetter, double oldNumeric)
	{
		origLetter = oldLetter;
		origNumeric = oldNumeric;
		
		setNewNumeric();
		setNewLetter();
	}
	
	// Mutator method for new numeric grade
	private void setNewNumeric() {
		if (origLetter.substring(0, 1).equals("A")) {
			newNumeric = 4;
		} else if (origLetter.substring(0, 1).equals("B")) {
			newNumeric = 3;
		} else if (origLetter.substring(0, 1).equals("C")) {
			newNumeric = 2;
		} else if (origLetter.substring(0, 1).equals("D")) {
			newNumeric = 1;
		} else if (origLetter.substring(0, 1).equals("F")) {
			newNumeric = 0;
		}
	}
	
	// Mutator method for new letter grade
	private void setNewLetter() {
		if (origNumeric == 4) {
			newLetter = "A+";
		} else if (origNumeric <= 3.99 && origNumeric >= 3.85) {
			newLetter = "A";
		} else if (origNumeric < 3.85 && origNumeric >= 3.7) {
			newLetter = "A-";
		} else if (origNumeric < 3.7 && origNumeric >= 3.3) {
			newLetter = "B+";
		}else if (origNumeric < 3.3 && origNumeric >= 3.0) {
			newLetter = "B";
		}else if (origNumeric < 3.0 && origNumeric >= 2.7) {
			newLetter = "B-";
		}else if (origNumeric < 2.7 && origNumeric >= 2.3) {
			newLetter = "C+";
		}else if (origNumeric < 2.3 && origNumeric >= 2.0) {
			newLetter = "C";
		}else if (origNumeric < 2.0 && origNumeric >= 1.7) {
			newLetter = "C-";
		}else if (origNumeric < 1.7 && origNumeric >= 1.3) {
			newLetter = "D+";
		}else if (origNumeric < 1.3 && origNumeric >= 1.0) {
			newLetter = "D";
		}else{
			newLetter = "F";
		}
	}
	
	// Accessor method for new numeric grade
	public double getNewNumeric()
	{
		//complete this method
		return newNumeric;
	}
	
	// Accessor method for new letter grade
	public String getNewLetter()
	{
		//complete this method
		return newLetter;
	}
}
