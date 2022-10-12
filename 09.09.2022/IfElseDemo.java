/*
Program: If Else Demo
@author: Prithwish Shaw
@Date: 9 sep 2022
*/

//declaring a class
class IfElseDemo
{
	//calling main
	public static void main(String[] args)
	{
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		int number3 = Integer.parseInt(args[2]);
		
		if((number1 == number2)&&(number1 ==number3))
		{
			System.out.println("All the numbers are equal");
		}
		else if((number1>number2)&&(number1>number3))
		{
			System.out.println("The number " + number1 + " is greater than other two numbers");
		}
		else if(number2>number3)
		{
			System.out.println("The number " + number2 + " is greater than other two numbers");
		}
		else
		{
			System.out.println("The number " + number3 + " is greater than other two numbers");
		}
		
	}
	//end of main
}
//end of class IfElseDemo