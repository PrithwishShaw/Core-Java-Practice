/*
Program: factorial of a number
@author: Prithwish Shaw
@Date: 13 sep 2022
*/

//declaring a class
class FractorialDemo
{
	static void factorialNumber(int num)
	{
		long result=1;
		for(int i=num;i>1;i--)
		{
			result*=i;
			System.out.println("The factorial of "+num+" is "+result);
		}
	}
	
	//calling main
	public static void main(String[] args)
	{
		int number= Integer.parseInt(args[0]);
		factorialNumber(number);

	}
	//end of main
}
//end of class FractorialDemo