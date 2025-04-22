import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

	static int[] individualInt;
	public static int[] readerMain()
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

