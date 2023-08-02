//Layton Wylbacht-32043996

import javax.swing.JOptionPane;


public class Calc
{
	
	public static void main(String[] args)
	{
		String num1 = JOptionPane.showInputDialog("Enter your ID-number: ");
		//String num2 = JOptionPane.showInputDialog("Enter another number: ");
		
		//int n1 = Integer.parseInt(num1);
		//int n2 = Integer.parseInt(num2);
		//int sum = n1 + n2;
		
		if(num1.length()!= 13)
		{
			JOptionPane.showMessageDialog(null, "ID number: " + num1 + " is invalid(must be 13 digits in length).", "ID number validation", JOptionPane.WARNING_MESSAGE);
		}
		else if(num1.length()== 13)
		{
			JOptionPane.showMessageDialog(null, "ID number: " + num1 + " is valid!", "ID number validation", JOptionPane.INFORMATION_MESSAGE);
		}
		
		int sum = 0 ;
		
		for(int i = 0; i < 13; i = i + 2)
		{
			if((num1.charAt(i) < '0') || (num1.charAt(i) > '9'))
			{
				JOptionPane.showMessageDialog(null, "ID number: " + num1 + " is invalid(must only contain digits).", "ID number validation", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		
		//JOptionPane.showMessageDialog(null, "The sum is " + sum, "The sum of two numbers", JOptionPane.WARNING_MESSAGE);
		
		
		
		
		
	}
	
	
	

}