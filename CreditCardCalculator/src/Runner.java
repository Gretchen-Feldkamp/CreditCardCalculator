import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Runner
	{

	static int total;

		public static void main(String[] args)
			{
				Reader.readerMain();
				stepsInput();
				stepsReader();
			}
		
		public static boolean stepsInput()
		{
			
			int total = 0;
			
			 if(total%10==0)
		        {
		        	System.out.println("This is a valid number");
		        	return true;	
		        }
		        else
		        {
		        	System.out.println("This is not a valid number");
		        	return false;
		        }
		}
		
		public static boolean stepsReader()
		{
			while(Reader.cardFile.hasNext())
			{
			total = 0;
	        int[] doubleValues = new int[Reader.individualInt.length];
	        for (int i = 0; i < Reader.individualInt.length; i++) 
	        {
	            doubleValues[i] = Reader.individualInt[i];
	        }
	        for (int i = 0; i<Reader.individualInt.length-1; i=i+2) 
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
	        	System.out.println(Reader.cardFile.next()+" is a valid number");
	        	return true;	
	        }
	        else
	        {
	        	System.out.println(Reader.cardFile.next()+" is not a valid number");
	        	return false;
	        }
			}
			return true;
	    }
	}