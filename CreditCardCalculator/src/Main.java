import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main
	{

		public static void main(String[] args)
			{
				textFileReader();

			}
		
		public static void textFileReader() throws FileNotFoundException
		{
			try 
			{
			Scanner cardFile = new Scanner(new File("CreditCards.txt"));
			String[] individualStr = cardFile.next().split("");
			int[] individualInt = new int[individualStr.length];
			for(int i=0; i<individualStr[i].length()+1;i++)
				{
			individualInt[i] = Integer.parseInt(individualStr[i]);
				}
			}
			catch(FileNotFoundException x)
				{
					System.out.println("File not found.");
				}
		}

	}
