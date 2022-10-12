/*
Program: If Eligibilty Demo
@author: Prithwish Shaw
@Date: 9 sep 2022
*/

//declaring a class
class EligibiltyDemo
{
	//calling main
	public static void main(String[] args)
	{
		int totalMarks = Integer.parseInt(args[0]);
		int pcmMarks = Integer.parseInt(args[1]);
		
		if(totalMarks>60)
		{
			if((totalMarks>=80) || (pcmMarks>85))
			{
				System.out.println("You are eligible for taking admission in B.Tech");
			}
			else
			{
				System.out.println("You are eligible for admission (NOT B.Tech)");
			}
		}
		else
		{				
			System.out.println("You are not eligible");
		}
	}
	//end of main
}
//end of class EligibiltyDemo