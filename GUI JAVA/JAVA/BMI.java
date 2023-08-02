//Layton Wylbacht-32043996

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;


public class BMI extends JFrame
{
	
	private JLabel weightL;
	private JTextField weightTF;
	
	private JLabel heightL;
	private JTextField heightTF;
	
	private JRadioButton maleSelect;
	private JRadioButton femaleSelect;
	private ButtonGroup genderSelect;
	
	private int genderValue = 5; // 0 - male, 1 - femaleSelect
	
	private JButton calculate;
	
	private JLabel bmiL;
	private JLabel displayL;
	
	
	private GridLayout layout;
	
	
	
	public BMI()
	{
		
		super ("BMI Calculator");
		layout = new GridLayout(5,2);
		setLayout(layout);
		weightL = new JLabel("Enter weight in kg: ");
		weightTF = new JTextField("");
		
		
		heightL = new JLabel("Enter height in meters: ");
		heightTF = new JTextField("");
		
		
		maleSelect = new JRadioButton("Male");
		femaleSelect = new JRadioButton("Female");
		genderSelect = new ButtonGroup();
		
		genderSelect.add(maleSelect);
		genderSelect.add(femaleSelect);
		
		
		calculate = new JButton("Calculate BMI");
		bmiL = new JLabel("Waiting for BMI calculation");
		displayL = new JLabel("");
		
		add(weightL);
		add(weightTF);
		add(heightL);
		add(heightTF);
		add(maleSelect);
		add(femaleSelect);
		add(calculate);
		add(bmiL);
		add(displayL);
		
		
		maleSelect.addItemListener(new GenderHandler(0));
		femaleSelect.addItemListener(new GenderHandler(1));
		
		
		CalculateHandler handler = new CalculateHandler();
		calculate.addActionListener(handler);
		
	}
	
	private class GenderHandler implements ItemListener
	{
		
		private int gender;
		
		public GenderHandler(int sel)
		{
			gender = sel;
		}
		
		
		
		public void itemStateChanged(ItemEvent e)
		{
			genderValue = gender;
			System.out.println(genderValue);
		}
		
		
	}
	
	
	private class CalculateHandler implements ActionListener
		{
			
			public void actionPerformed(ActionEvent e)
			{
				double weight = Double.parseDouble(weightTF.getText());
				double height = Double.parseDouble(heightTF.getText());
				double bmi = weight / (height * height);
				
				bmiL.setText(String.format("Your BMI is: %4.2f", bmi));
				
				if(genderValue == 0)
				{
					if(bmi < 22.5)
					{
						displayL.setText("M Your are underweight");
					}
					else if(bmi < 29.5)
					{
						displayL.setText("M Your weight is ideal");
					}
					else
					{
						displayL.setText("M You are overweight");
					}
				}
				else if(genderValue == 1)
				{
					if(bmi < 18.5)
					{
						displayL.setText("F Your are underweight");
					}
					else if(bmi < 24.5)
					{
						displayL.setText("F Your weight is ideal");
					}
					else
					{
						displayL.setText("F You are overweight");
					}
				}
				
				
				
			}
			
		}
	
	
	
	
	
	public static void main(String[] args)
	{
		
		BMI bmi = new BMI();
		bmi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bmi.setSize(500,250);
		bmi.setVisible(true);
		
		
		
	}
	
	
	
}