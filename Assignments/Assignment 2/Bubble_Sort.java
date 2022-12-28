package com.Assignment_2;

public class Bubble_Sort {

	public static void main(String[] args) {
	int ar[]= {25,36,10,47,22,17,30};
	for(int i=0;i<ar.length;i++) 
	{
		for(int j=0;j<ar.length-1;j++)
		{
			if(ar[j]>ar[j+1])
			{
				int temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
			}
		}
	}
	for(int elem:ar) 
	{
		System.out.print(elem+" ");	
	}

	}

}
