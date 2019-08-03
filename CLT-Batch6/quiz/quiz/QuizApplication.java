package quiz;

import java.util.Scanner;

class Question {
	
	String prompt;
	String answer;
	
	public Question(String prompt, String answer) {
		this.prompt=prompt;
		this.answer=answer;
	} // end of constructor

} // end of Question class


public class QuizApplication {
	
	public static void main(String[] args) {
		
		String q1 = "Q1. Capital of Japan?\n"
						 + "A.Osaka\nB.Kyto\nC.Tokyo\nD.Yokohama";
		
		String q2 = "Q2. Capital of Italy?\n"
				 + "A.Florence\nB.Rome\nC.Venice\nD.Milan";
		
		String q3 = "Q3. Capital of United Kindom?\n"
				 + "A.Manchester\nB.Liverpool\nC.Cambridge\nD.London";
		
		String q4 = "Q4. Capital of Australia?\n"
				 + "A.Sydney\nB.Canberra\nC.Melbourne\nD.Brisbane";
		
		String q5 = "Q5. Capital of United States of America?\n"
				 + "A.Washington\nB.Chicago\nC.New York\nD.San Francisco";
		
		
			Question [] question = {
				new Question(q1,"c"),
				new Question(q2,"b"),
				new Question(q3,"d"),
				new Question(q4,"b"),
				new Question(q5,"a"),
			}; // end of Array
		
			takeTest(question);
		
		} // end of main

	
		public static void takeTest(Question[] questions) {
			int score = 0;
			Scanner sc = new Scanner(System.in);
		
			for (int i = 0; i < questions.length; i++) {
				System.out.println(questions[i].prompt);
				System.out.println("\nEnter your Choice : ");
				String userInput = sc.next();
			
				if(userInput.equals(questions[i].answer)) {
					score++;
					System.out.println("Correct.. You have Scored "+score);
					
				} // end of if
				
				
				
				else {
					System.out.println("Wrong Answer!!!");
				}
				System.out.println("\n");
			} // end of for
		
			System.out.println("Your result : "+score);
			
		} // end of takeTest

} // end of QuizApplication
