package com.Assignment_2;

public class Duplicate {

	public static void main(String[] args) {
		int ar[]= {10,15,20,10,32,8,32,54,43,30,50,8};
		System.out.println("Duplicates present iArray are as follows:");
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1;j<ar.length;j++) 
			{
				if(ar[i]==ar[j]) 
				{
					System.out.println(ar[i]);
				}
			}
		}

	}


	}


