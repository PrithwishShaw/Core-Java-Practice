/*
Program: Printing left triangle
@author: Prithwish Shaw
@Date: 14 sep 2022
*/

//declaring a class
class StarsPattern
{
	static void firstPattern(int noOfRows)
	{
		for(int i=1;i<=noOfRows;i++)
		{
			System.out.println();
			for(int spaces=noOfRows-i;spaces>0;spaces--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
		}
		
		for(int i=1;i<=noOfRows;i++)
		{
			System.out.println();
			for(int spaces=noOfRows-i;spaces<noOfRows;spaces++)
			{
				System.out.print(" ");
			}
			
			for(int j=noOfRows-1;j>=i;j--)
			{
				System.out.print("*");
			}
		}
	}
		
			
	
	//calling main
	public static void main(String[] args)
	{
		int number= Integer.parseInt(args[0]);
		firstPattern(number);

	}
	//end of main
}
//end of class StarsPattern  