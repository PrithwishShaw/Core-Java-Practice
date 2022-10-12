/*
Program: Pattern practice demo
@author: Prithwish Shaw
@Date: 13 sep 2022
*/

//declaring a class
class PatternDemo1
{																		
	static void reversePattern(int num)									
	{
		for(int i=num;i>=1;i--)
		{
			System.out.println(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		}
	}
		
	//calling main
	public static void main(String[] args)
	{
		int number= Integer.parseInt(args[0]);
		reversePattern(number);
	}
	//end of main
}
//end of class PatternDemo1