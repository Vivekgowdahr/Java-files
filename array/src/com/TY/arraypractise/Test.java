package com.TY.arraypractise;

public class Test 
{
	public static void main(String[] args) 
	{
	int[] a= {10,45,1520,586,45,-52,58,54,-588,23,23,-4586};
    	System.out.println(a.length);
    	// for each loop
    	
    	//for(int x :a)
    	//datatype ref :target	
    	//{
    //	System.out.println(x);	
    		
    	//}
    	int smaller=a[0];
    	for (int i = 0; i < a.length-1; i++) 
    	{
		if(smaller>a[i])
		{
		smaller = a[i];	
			
		}
		}
	System.out.println(smaller);
	}

}
 