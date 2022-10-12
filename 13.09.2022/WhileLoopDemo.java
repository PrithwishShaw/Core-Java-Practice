/*
Program: While loop practice
@author: Prithwish Shaw
@Date: 13 sep 2022
*/

//declaring a class
class WhileLoopDemo
{
	static void bulbDurability(int durability)
	{
		while(durability>=10)
		{
			System.out.println("Bulb is ON -----Durability: " +durability);
			durability-=5;
		}
		if(durability<10)
		{
			System.out.println("Bulb is off--------durability " +durability);
		}
	}															
	//calling main
	public static void main(String[] args)
	{
		int number= Integer.parseInt(args[0]);
		bulbDurability(number);

	}
	//end of main
}
//end of class WhileLoopDemo