
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.util.ArrayList;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;


//the screen for subtracting binary numbers
@SuppressWarnings("serial")
public class BinarySubtractionPractice extends JPanel implements GenerateProblem
{
	//and member function that states a task to be completed by the user
	@Override
	public void showQuestion(int articleQuestion) 
	{
		JLabel question = new JLabel("Subtract these binary numbers");
		
		
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
	
	public void
	
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
						//panel.setName("Practice Binary Subtraction");
					
						JLabel lbl = new JLabel ("Practice Binary Subtraction");
						
						lbl.setFont(new Font("Verdana",23,30));
						
						
						lbl.add(panel, BorderLayout.NORTH);
						
						lbl.setLocation(0, 20);
						lbl.setSize(86, 14);
						lbl.setBorder(new LineBorder(Color.BLUE));
						
						
						add(lbl);
					}
		});
			
		}catch (Exception e)
			{
				System.err.println("createGUI didn't complete successfully");
			}
			
		
	}



}
