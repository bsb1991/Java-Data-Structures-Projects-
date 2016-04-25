import java.io.*;
import java.util.*;
public class timeClock {
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour =0;
		int min = 0;
		int sec = 0;
		String strHour = " ";
		
		strHour= Integer.toString(hour);
		System.out.print(strHour);
		
		System.out.println("Enter hour (0-12): ");
		hour = console.nextInt();
		
		System.out.println("Enter number of minutes: ");
		min = console.nextInt();
		
		System.out.println("Enter number of seconds");
		sec = console.nextInt();
		
		hour= invalidHrException(hour);
		min = invalidMinException(min);
		sec = invalidSecException(sec);
		
		//if (hour < 10){
		//	strHour "0 "+ Integer.toString(hour)
		
		System.out.println("Your time is: "+hour+":"+min+":"+sec);
	}

	
	public static int invalidHrException(int hr) throws InputMismatchException
	{
		
		try{
			if (hr >=0 && hr <13)
			{
				
				hr = 12+hr;
				return hr;
			}
			else if (hr>12&& hr<24){
				hr = hr-12;
			}
			else
			{
				System.out.println();
				
				System.out.println("Invalid hour etered: ");
			}
			
			
		}
		catch (InputMismatchException imeRef){
			throw imeRef;
		}
		return hr;
			
			
			
			
	}
	
	public static int invalidMinException(int min) throws InputMismatchException
	{
		try{
			if (min <60 && min> 0)
			{
				return min;
			}
			else
			{
				System.out.println("Invalid min entered: ");
			}
		}
		catch (InputMismatchException imeRef){
			throw imeRef;
		}
			
			
			return min;
			
	}
	
	public static int invalidSecException(int sec) throws InputMismatchException
	{
		{
			try{
				if (sec <60 && sec> 0)
				{
					return sec;
				}
				else
				{
					System.out.println("Invalid sec entered: ");
				}
			}
			catch (InputMismatchException imeRef){
				throw imeRef;
			}
			
			
			return sec;
			
	}
	}
		
		
			

}//endOfClass
