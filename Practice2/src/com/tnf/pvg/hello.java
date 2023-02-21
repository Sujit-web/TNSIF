package com.tnf.pvg;

import java.util.Scanner;

/**
 * @author aher5
 *
 */
public class hello {

	public static void main(String[] args) {
		//System.out.println("Hello GOOd morning");
		// TODO Auto-generated method stub
	/*---------HOLLOW RECTANGLE--------------
	//*****
	//*   *
	//*   *
	//*****
	 *	int n=4;
		int m=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1 ||j==1 ||i==n ||j==m )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				
				}
			}
		System.out.println();

		}
		
		*/
		
		/*----------HALF PYRAMID-----------
		//	*
		//	**
		//	***
		//	*****
		int n=4;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("* ");	
			}
			System.out.println();
		}
		
		*/
		
		/*//---------------invert half pyramid------------------- 
		//****
		//***
		//**
		//*
		
		
		int n=4;
		
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		//-----------------------------------------
		//    *
		//   **
		//  ***
		// ****
		int n=4;
		for(int i=1;i<=n;i++)
		{
			//inner loop for space
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			//inner loop for star 
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		*/
		
		/* -----------------------------------------------------
	 	//1
		//12
		//123
		//1234
		//12345
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		*/
		
		/*----------------------------------------------
		 //	12345
		 //1234
		 //123
		 //12
		 //1
		  
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(j);
				
			}
			System.out.println();
		}
		*/////////////////////////////////

		/* ---------------------------------
	//	   1
	//		12
	//		123
	//		1234
	//		12345
		 
		int n=5;
		int number=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				number++;
			}
			System.out.println();
		}
		*/
		
		
		/*
		 //	1
		 //	0 1
		 //	1 0 1 
		 //	0 1 0 1
		 // 1 0 1 0 1
		    
		 
		 // 
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int sum=i+j;
				if(sum % 2==0)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
							
			}
			System.out.println();
		}
		
		*/
		
		/*
		 // liner search----------------------------
		  
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array");
		int size =sc.nextInt();
		int numbers[] =new int[size];
		System.out.println("Enter the numbers");
		for(int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		
		for(int i=0;i<numbers.length;i++)
		{ 
			
		if(numbers[i]==x) 
			{
			System.out.println(" x found at index:"+i);
			}
		}	
		
		*/
		
		
}
}
