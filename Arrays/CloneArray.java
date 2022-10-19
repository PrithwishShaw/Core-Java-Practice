/*
clone of a array
*/

class CloneArray
{

	static void copyArray(int arr[])
	{
		//declaring an array to create a clone
		
		int clArray[] = arr.clone();		// coming from object class
		
		//declaring array to create copyArray
		int copyarr[] = arr;
		System.out.println("Printing the values of orignial array");
		displayArray(arr);
		
		//changing the values of original array
		for(int i=0;i<arr.length;i++)
		{
			arr[i]+=2;
		}
		
		// after change
		System.out.println();
		System.out.println("Printing the values of copied array");
		displayArray(copyarr);
		System.out.println();
		
		System.out.println("Printing the values of copied array");
		displayArray(clArray);
	}

	static void displayArray(int myArray[])
	{
	  for(int i:myArray)  // int : data type of array 
	  {
		  System.out.print(i+ "  ");
		  
	  }
	   
   }
	
	public static void main(String ...args)
	{
		//declaring an array
		int arr[]={4,2,7,3};
		copyArray(arr);
	}
}	