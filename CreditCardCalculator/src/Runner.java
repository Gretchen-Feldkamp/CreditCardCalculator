import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Runner
	{

	static int total;

		public static void main(String[] args)
			{
				Reader.readerMain();
				System.out.println("Pleas select option 1 or 2.");
				System.out.println("1: enter card 2. Scan cards");
				Scanner userInput=new Scanner(System.in);
				String answer=userInput.next();
				if(answer.equals("1")) 
				{
				stepsInput();
				}
				else if(answer.equals("2"))
					{
				stepsReader();
					}
				else
					{
						System.out.println("Invalid answer");
						return;
					}
			}
		
		public static void stepsInput()
		{
			
			System.out.println("Please enter card number");
			
			Scanner userInput=new Scanner(System.in);
			
			total = 0;
			String userInput2=userInput.nextLine();
			String[] userInput1=userInput2.split("");
			int[] digits=new int[userInput2.length()];
			
			for(int t=0; t<userInput1.length;t++)
				{
			digits[t] = Integer.parseInt(userInput1[t]);

				}
			
	        int[] doubleValues = new int[digits.length];
	        for (int i = 0; i < digits.length; i++) 
	        {
	            doubleValues[i] = digits[i];
	        }
	        for (int i = 0; i<digits.length-1; i=i+2) 
	        {
	            doubleValues[i] *= 2;
	            if (doubleValues[i] >= 10) 
	            {
	                String[] individualparts = Integer.toString(doubleValues[i]).split("");
	                doubleValues[i] = Integer.parseInt(individualparts[0]) + Integer.parseInt(individualparts[1]);
	            }
	        }
	        for (int num : doubleValues) 
	        {
	            total += num;
	        }
			
			
			 if(total%10==0)
		        {
		        	System.out.println("This is a valid number");	
		        }
		        else
		        {
		        	System.out.println("This is not a valid number");
		        }
		}
		
		public static void stepsReader()
		{
			int counter=0;
			while(Reader.cardFile.hasNext())
			{
			String cardNum = Reader.cardFile.next();
			total = 0;
			String[] parts = cardNum.split("");
			int[] digits = new int[parts.length];
			for (int i = 0; i < parts.length; i++) 
			{
			    digits[i] = Integer.parseInt(parts[i]);
			}
			
	        int[] doubleValues = new int[digits.length];
	        for (int i = 0; i < digits.length; i++) 
	        {
	            doubleValues[i] = digits[i];
	        }
	        for (int i = 0; i<digits.length-1; i=i+2) 
	        {
	            doubleValues[i] *= 2;
	            if (doubleValues[i] >= 10) 
	            {
	                String[] individualparts = Integer.toString(doubleValues[i]).split("");
	                doubleValues[i] = Integer.parseInt(individualparts[0]) + Integer.parseInt(individualparts[1]);
	            }
	        }
	        for (int num : doubleValues) 
	        {
	            total += num;
	        }

	        if(total%10==0)
	        {
	        	System.out.println(cardNum+" is a valid number");
	        	counter++;
	        }
	        else
	        {
	        	System.out.println(cardNum+" is not a valid number");
	        }
			}
			System.out.println(counter + " valid cards are present");

	    }
	}