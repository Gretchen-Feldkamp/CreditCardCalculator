import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

	static Scanner cardFile;
	static String[] individualStr;
	static int[] individualInt;
	public static int[] readerMain()
		{
			try 
			{
			cardFile = new Scanner(new File("CreditCards.txt"));
			individualStr = cardFile.next().split("");
			individualInt = new int[individualStr.length];
			for(int i=0; i<individualStr[i].length();i++)
				{
			individualInt[i] = Integer.parseInt(individualStr[i]);

				}
			}
			catch(FileNotFoundException x)
				{
					System.out.println("File not found.");
				}
			try
				{
				return individualInt;
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			return individualInt;
		}
	}

