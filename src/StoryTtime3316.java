import java.util.Scanner;
public class StoryTtime3316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	     System.out.println("Fight or Flight?");  
	     Scanner choice= new Scanner (System.in);
	     String choiceAnswer = choice.next();
	     	if(choiceAnswer.equals("Fight")){
	     			System.out.println("Did you train?");
	     			Scanner train= new Scanner (System.in);
	     			String trainAnswer=train.next();
	     				if(trainAnswer.equals("Yes")) {
	     					System.out.println("You win");
	     					}
	     					else if (trainAnswer.equals("No")){
	     					System.out.println("You lose");
	     					}
	     					else {System.out.println("You must answer Yes or No, and be case sensative");}
	     	}
	     	else if (choiceAnswer.equals("Flight")) {
	     		System.out.println("Are you fast?");
	     		Scanner fast= new Scanner (System.in);
     			String fastAnswer=fast.next();
     				if(fastAnswer.equals("Yes")) {
     					System.out.println("You got away");
     					}
     					else if (fastAnswer.equals("No")){
     					System.out.println("You got caught");
     					}
     					else {System.out.println("You must answer Yes or No, and be case sensative");}
	     	}
	     		
	     	else {
	     		System.out.println("You must choose Fight or Flight and be case sensative");
	     		
	     	}
	     					
	     				
	     			
	     		
	     		
	     		
	     		
	     		
	     	}
	}
		

