import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Runner
	{

		public static void main(String[] args)
			{
				Reader.readerMain();
				steps();
			}
		
		public static boolean steps()
		{
			int total;
			int valueOne=0;
			int valueTwo=0;
			int[] doubleValues=new int[8];
			for(int i=0; i<Reader.individualInt.length; i=i+2)
			{
				doubleValues[i]=Reader.individualInt[i]*2;
				if(doubleValues[i]>=10)
				{
					String doubleValueConverter= Integer.toString(doubleValues[i]);
					String[] doubleValueSplit = doubleValueConverter.split("");
					doubleValues[i]=Integer.parseInt(doubleValueSplit[0])+Integer.parseInt(doubleValueSplit[1]);
				}
			}
			for(int j=0; j< Reader.individualInt.length;j++)
			{
				if(!doubleValues[j]==Reader.individualInt[j])
				{
					Reader.individualInt[j]=doubleValues[j];
				}
			}
			for(int x=0; x<Reader.individualInt.length;x++)
			{
				total+=Reader.individualInt[x];
			}
			if(total%10<=0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

	}
