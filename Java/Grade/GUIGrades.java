package Java.Grade;
/* The driver class below uses
   the Grade class to convert
   grades entered by the user
   into other forms of the same
   grade. The results are shown
   in a GUI, as is the input.
*/

import javax.swing.JOptionPane;

public class GUIGrades
{
	public static void main(String[] args)
	{
		String origLetter = JOptionPane.showInputDialog("Please enter Letter Grade:");
    
		//include string for origNumeric
		String origNumeric = JOptionPane.showInputDialog("Please enter Numeric Grade:");
		//constructor of new Grade object from Grade.java file
		Grade userGrades = new Grade(origLetter, Double.parseDouble(origNumeric));
    
    //displays the final result
		
		JOptionPane.showMessageDialog(null,
				"Numeric Grade Equivalent = " + userGrades.getNewNumeric() +
						"\n\nLetter Grade Equivalent = " + userGrades.getNewLetter(),
				"Grades",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
