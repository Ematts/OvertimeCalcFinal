import java.util.Scanner;
public class OvertimeCalcFinal {

public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Worker, A or B?");  
Scanner choice= new Scanner (System.in);
String choiceAnswer = choice.next();

switch(choiceAnswer){
case"A":
	double rate;
	rate=17.24;
	
	double hours;
	hours=34d;
	
	String dollar;
    dollar = "Your Gross Pay is $";
	
		if(hours<40){
			double total;
			total=rate*hours;
			System.out.printf(dollar + "%.2f",total);
		}
		else{
			double total;
			total= (40*rate) + ((hours-40) * rate* 1.5);
			System.out.printf(dollar + "%.2f",total);
		}
		break;
case"B":
	double brate; 
	brate=23.43d;
	
	double bhours;
	bhours=47d;
	
	String bdollar;
	bdollar = "Your Gross Pay is $";
	
		if(bhours<40){
			double btotal;
			btotal=brate*bhours;
			System.out.printf(bdollar + "%.2f",btotal);
			;
		}
		else{
			double btotal;
			btotal= (40*brate) + ((bhours-40) * brate * 1.5);
			System.out.printf(bdollar + "%.2f",btotal);
			
		}
					
		break;
			
	
		
default:
			System.out.println("Invalid worker");
			break;
				
		};
	
}}
		