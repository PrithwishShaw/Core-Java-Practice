/*
sorting an array
*/

import java.util.Scanner;
class ArraySort
{
	static void inputArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		int myArray[] = new int[size];
		System.out.println("Enter " +size+ " elements" );
		for(int i=0;i<size;i++)
		{
			myArray[i] = sc.nextInt();
		}
		System.out.println("Array before sorting");
		displayArray(myArray);
		sortArray(myArray);
	}
	
	static void sortArray(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Array after sorting");
		displayArray(arr);
			
	}
	
	static void displayArray(int myArray[])
	{
		for(int arr:myArray)
		{
			System.out.print(arr + " ");
		}
	}
	
	public static void main(String ...args)
	{
		inputArray();
	}
}