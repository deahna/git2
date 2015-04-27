
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


//the screen for converting binary numbers to decimal
@SuppressWarnings("serial")
public class BinaryToDecimalPractice extends JPanel implements GenerateProblem
{
	
	@Override
	public void showQuestion(int articleQuestion) 
	{
		JLabel question = new JLabel("Convert this binary number to decimal.");
		
		
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
						panel.setName("Practice Calculating Binary to Decimal");
					
						JLabel lbl = new JLabel ("Practice Calculating Binary to Decimal");
						
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
