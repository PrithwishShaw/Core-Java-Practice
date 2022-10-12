/*
Program: Palendrome Number
3345 : not a palendrome number
3443 : is a palendrome number
@author: Prithwish Shaw
@Date: 13 sep 2022
*/

//declaring a class
class PalendromeNumberDemo
{
	static void palendromeNumber(int num)
	{
		int remainder=0;
		int reverseNumber=0;
		int temp=num;
		while(num>0)
		{
			remainder=num%10;
			reverseNumber=(reverseNumber*10)+remainder;
			num=num/10;
		}
		if(temp==reverseNumber)
		{
			System.out.println("It is a palendrome number");
		}
		else
		{
			System.out.println("It is not a palendrome number");
		}
	}
	
	//calling main
	public static void main(String[] args)
	{
		int number= Integer.parseInt(args[0]);
		palendromeNumber(number);

	}
	//end of main
}
//end of class PalendromeNumberDemo