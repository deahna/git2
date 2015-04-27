
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;


//the screen to practice converting decimal numbers to binary
@SuppressWarnings("serial")
public class BinaryToDecimalPractice extends JPanel implements GenerateProblem , ActionListener
{
	protected JButton nextTutorialButton, previousTutorialButton, submitAnswerButton;
	protected JLabel instructionLabel, successLabel, failureLabel; 
	protected JTextArea editTextArea, typedAnswer;
	
	boolean correctAnswer = false;
	String userResponse;
	int convertValue;
	
	@Override
	public void showQuestion(int articleQuestion) 
	{
		// TODO Auto-generated method stub
		convertValue = initiateConvertValue();
		
		instructionLabel = new JLabel("Convert This Binary Number to Decimal! " + convertValue);
		instructionLabel.setForeground(Color.WHITE);
		instructionLabel.setVerticalTextPosition(JLabel.BOTTOM);
		instructionLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		submitAnswerButton = new JButton("Submit Answer!");
	    submitAnswerButton.setVerticalTextPosition(AbstractButton.CENTER);
	    submitAnswerButton.setHorizontalTextPosition(AbstractButton.LEADING);
	    submitAnswerButton.setActionCommand("Submitted");
	    submitAnswerButton.setToolTipText("Click this button to submit answer.");
	    submitAnswerButton.addActionListener(this);
	    
	    add(submitAnswerButton);
	    
	    editTextArea = new JTextArea("Type Here");
		editTextArea.setBackground(Color.BLUE);
		editTextArea.setForeground(Color.WHITE);
		
		typedAnswer = new JTextArea();
		typedAnswer.setEditable(false);
		
		
		add(instructionLabel);
		add(editTextArea);
		add(typedAnswer);
		
	}

	@Override
	public boolean checkAnswer(String userAnswer, int articleQuestion) 
	{
		int decimalNumber = articleQuestion;
		int remainder;
		String binary = "";
				
		while(decimalNumber > 0)
		{
			remainder = decimalNumber % 2;
			binary = remainder + binary;
			decimalNumber /= 2;
		}
		
		if(userAnswer != binary)
			return false;
		return true;
	}

	@Override
	public void subsequentAction() 
	{
		// TODO Auto-generated method stub
		
	}	
	
	//initates the arraylist value with random decimal numbers
	public int initiateConvertValue()
	{
		Random rand = new Random();
		int chooseArticleQuestion = rand.nextInt(1000);
		
		return chooseArticleQuestion;			
	}
	
	public BinaryToDecimalPractice()
	{		
		showQuestion(1);
			    
	    correctAnswer = checkAnswer(userResponse, convertValue);
	    		
		if(correctAnswer)
		{
			successLabel = new JLabel("Good Job! Proceed to the next tutorial!");
				successLabel.setForeground(Color.WHITE);
				successLabel.setVerticalTextPosition(JLabel.BOTTOM);
				successLabel.setHorizontalTextPosition(JLabel.CENTER);
			
			nextTutorialButton = new JButton("Next Tutorial!");
				nextTutorialButton.setVerticalTextPosition(AbstractButton.CENTER);
				nextTutorialButton.setHorizontalTextPosition(AbstractButton.LEADING);
				nextTutorialButton.setLocation(200, 100);
				nextTutorialButton.setToolTipText("Click this button to proceed to next tutorial.");
				nextTutorialButton.setActionCommand("Success");
				nextTutorialButton.addActionListener(this);
				
				add(nextTutorialButton);
		}
		
		else if(!correctAnswer)
		{
			failureLabel = new JLabel("Oops! You need more practice. Go back to the previous tutorial!");
				failureLabel.setForeground(Color.WHITE);
				failureLabel.setVerticalTextPosition(JLabel.BOTTOM);
				failureLabel.setHorizontalTextPosition(JLabel.CENTER);
			
			previousTutorialButton = new JButton("Back to Tutorial!");
				previousTutorialButton.setVerticalTextPosition(AbstractButton.BOTTOM);
				previousTutorialButton.setHorizontalTextPosition(AbstractButton.CENTER);
				nextTutorialButton.setLocation(200, 100);
				previousTutorialButton.setToolTipText("Click this button to proceed to previous tutorial.");
				previousTutorialButton.setActionCommand("Failure"); 
				previousTutorialButton.addActionListener(this);
				
				add(previousTutorialButton);
		}
	       
	}
	
	public static void initPracticeProblem()
	{
		//JPanel practicePanel = new JPanel();
		//JLabel practiceLabel = new JLabel("Decimal to Binary Practice Problem.");
		
		JFrame frame = new JFrame("Binary to Decimal Practice Problem.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BinaryToDecimalPractice pane = new BinaryToDecimalPractice();
		pane.setBackground(Color.BLACK);
		//
		pane.setOpaque(true);
		pane.setPreferredSize(new Dimension(600, 500));
		
		//frame.setBackground(Color.BLUE);
		frame.add(pane);
		frame.setSize(500, 500);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
	}
	
	public static void main(String[] args)
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				initPracticeProblem();
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if("Success".equals(e.getActionCommand()))
		{
			//go to next tutorial
		}
		
		else if("Failure".equals(e.getActionCommand()))
		{
			//go to previous tutorial
		}
		
		else if("Submitted".equals(e.getActionCommand()))
		{
			userResponse = editTextArea.getText();
			
		}		
		
	}
	
}
