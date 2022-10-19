/*
anonymous array
*/

class AnonymousArray{

	static void printArray(int arr[])
	{
	  for(int i:arr)  // int : data type of array 
	  {
		  System.out.print(i+ "  ");
		  
	  }
	   
   }

	public static void main(String ...args)
	{
		printArray(new int[]{6,7,9,1,2});
	}
}	