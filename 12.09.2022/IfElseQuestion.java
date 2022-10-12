/*
Program: If Else Question
@author: Prithwish Shaw
@Date: 12 sep 2022
*/

//declaring a class
class IfElseQuestion
{
	//calling main
	public static void main(String[] args)
	{
		int marks = Integer.parseInt(args[0]); //taking input 
		
		if(marks<=25)
		{
			System.out.println("Your grade is 'F' "); //printing grade F
		}
		else if((marks>25) && (marks<=45))
		{
			System.out.println("Your grade is 'E' "); //printing grade E
		}
		else if((marks>45) && (marks<=50))
		{
			System.out.println("Your grade is 'D' "); //printing grade D
		}
		else if((marks>50) && (marks<=60))
		{
			System.out.println("Your grade is 'C' "); //printing grade C
		}
		else if((marks>60) && (marks<=80))
		{
			System.out.println("Your grade is 'B' "); //printing grade B
		}
		else
		{
			System.out.println("Your grade is 'A' "); //printing grade A
		}
		
	}
	//end of main
}
//end of class IfElseQuestion