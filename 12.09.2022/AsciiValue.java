/*
Program: ASCII VALUE 
@author: Prithwish Shaw
@Date: 12 sep 2022
*/

//declaring a class
class AsciiValue
{
	static void printAsciiValue(char cValue)
	{
		int asciiValue = cValue;
		if((asciiValue>=48) && (asciiValue<=57))
		{
			System.out.println("2.It is a number");
		}
		else if((asciiValue>=97) && (asciiValue<=122))
		{
			if((asciiValue == 'a')||(asciiValue == 'e')||(asciiValue == 'i')||(asciiValue == 'o')||(asciiValue == 'u'))
			{
				System.out.println("2.It is a vovel(Lowercase)");
			}
			else
			{
				System.out.println("2.It is a consonent(Lowercase)");
			}
		}
		else if((asciiValue>=65) && (asciiValue<=90))
		{
			if((asciiValue == 'A')||(asciiValue == 'E')||(asciiValue == 'I')||(asciiValue == 'O')||(asciiValue == 'U'))
			{
				System.out.println("2.It is a vovel(Uppercase)");
			}
			else
			{
				System.out.println("2.It is a consonent(Uppercase)");
			}	
		}
		else
		{
			System.out.println("It is a special character");
		}
			
	}
	//calling main
	public static void main(String[] args)
	{
		char cValue = args[0].charAt(0);
		printAsciiValue(cValue);
	}
	//end of main
}
//end of class AsciiValue