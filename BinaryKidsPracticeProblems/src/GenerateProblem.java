import java.util.ArrayList;


public interface GenerateProblem 
{
	//a boolean to show whether the user got the answer correct
	boolean correctAnswer = false;
	
	//number of potentially different practice problems the user can have
	int practiceValues = 100;
	
	//to hold the test practice values
	ArrayList <Integer> values = new ArrayList<Integer>();
	
	//to hold the solutions to the practice problems
	ArrayList <Integer> solutions = new ArrayList<Integer>();
	
	void showQuestion(int articleQuestion);
	
	boolean checkAnswer(long userAnswer, int articleQuestion);
	
	void subsequentAction();
}
