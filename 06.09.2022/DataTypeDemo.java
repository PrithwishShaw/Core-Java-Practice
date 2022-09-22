/*
Program: Understanding data types in java
@author: Prithwish Shaw
@Date: 6 sep 2022
*/

//declaring a class
class DataTypeDemo
{
	//calling main
	public static void main(String[] args)
	{
		int value;
		float marks= 67.8f;
		double percentage= 98.765;
		short number= (short)-32769; //type casting
		char grade='A';
		long hugeNumber= 1621621646;
		boolean status= true;
		byte b = (byte)128; //type casting
		String firstName= "Prithwish"; // not primitive data type : String is a class
		System.out.println("The value of value is:"+value);
		System.out.println("The value of marks is:"+marks);
		System.out.println("The value of percentage is:"+percentage);
		System.out.println("The value of number is:"+number);
		System.out.println("The value of grade is:"+grade);
		System.out.println("The value of hugeNumber is:"+hugeNumber);
		System.out.println("The value of status is:"+status);
		System.out.println("The value of b is:"+b);
		System.out.println("The value of string is:"+firstName);
	}
	//end of main
}
//end of class DataTypeDemo
