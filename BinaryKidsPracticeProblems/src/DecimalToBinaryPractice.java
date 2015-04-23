
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;


//the screen to practice converting decimal numbers to binary
@SuppressWarnings("serial")
public class DecimalToBinaryPractice extends JPanel implements GenerateProblem
{	
	@Override
	public void showQuestion(int articleQuestion) 
	{
		JLabel question = new JLabel("Convert this decimal number to binary.");
		
		
		JTextField input = new JTextField();
		JTextField answer = new JTextField();
		
				
	}

	//a member tasks that compares the user input with the correct answer
	@Override
	public boolean checkAnswer(long userAnswer, int articleQuestion) 
	{
		JLabel question = new JLabel("Correct Answer:");
		return false;
	}

	//a directive to continue on in the program or to return to the previous tutorial
	@Override
	public void subsequentAction() 
	{
		// TODO Auto-generated method stub
		
	} 
	
	//initates the arraylist value with random decimal numbers
	public void initiateValueArray()
	{
		values.clear();
		
		Random rand = new Random();
		for(int count = 0; count < practiceValues; count++)
		{
			int randomNum = rand.nextInt(1000);
			values.add(randomNum);
		}
		
		
	}
	
	//converts the values in arraylist value into binary representations for the user to determine
	public void initiateSolutionArray()
	{
		String binary = "";
		int decimalNumber = 0;
		int remainder = 0;
		
		for(int count =0; count < practiceValues; count++)
		{
			if(values.get(count) == 0)
				solutions.add(count, 0);
			else
			{
				
			
				while(decimalNumber > 0)
				{
					remainder = decimalNumber % 2;
					binary = remainder + binary;
					decimalNumber /= 2;
				}
				
			}
			int convertInt = Integer.parseInt(binary);
			solutions.add(count, convertInt);
		}
		
	}
	
	public void init()
	{
		try
		{
			SwingUtilities.invokeAndWait(new Runnable()
			{
					public void run()
					{		
						JPanel panel = new JPanel();
						panel.setLayout(new BorderLayout());
					//	panel.setName("Practice Calculating Decimal to Binary");
					
						JLabel lbl = new JLabel ("Practice Calculating Decimal to Binary");
						
						lbl.setFont(new Font("Verdana",23,30));				
						
						lbl.setLocation(0, 20);
						lbl.setSize(86, 14);
						lbl.setBorder(new LineBorder(Color.BLUE));
						
						lbl.add(panel, BorderLayout.NORTH);
						add(lbl);
					}
		});
			
		}catch (Exception e)
			{
				System.err.println("createGUI didn't complete successfully");
			}
			
		
	}


	


}
