/*
Program: Operators
@author: Prithwish Shaw
@Date: 7 sep 2022
*/

//declaring a class
class Operators
{
	//calling main
	public static void main(String[] args)
	{
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		int sum = a%b;
		
		System.out.println("The sum of two numbers is:"+sum);
	}
	//end of main
}
//end of class Operators