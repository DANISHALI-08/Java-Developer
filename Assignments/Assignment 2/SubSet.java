package com.Assignment_2;

import java.util.Arrays;

public class SubSet {

	public static void main(String[] args) {
		int [] ar= {3,15,10,17,9,5,6,32,23,19,11};
		System.out.println("Arrays Before Subset are below: ");
		for(int elem:ar) 
		{
			System.out.print(elem+" ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Arrays After Subset are below: ");
		Arrays.sort(ar,2,7);
		for(int elem:ar) 
		{
			System.out.print(elem+" ");
		}

	}

}
