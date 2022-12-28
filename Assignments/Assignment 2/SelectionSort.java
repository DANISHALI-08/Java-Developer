package com.Assignment_2;

public class SelectionSort {
	public static void SelectionSort(int ar[]) 
	{
		for(int i=0;i<ar.length-1;i++) {
			int index=i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[index]) {
				 index=j;
				}
				}
			
		int smallnum=ar[index];
		ar[index]=ar[i];
		ar[i]=smallnum;
		}
		
	}

	public static void main(String[] args) {
		int [] ar1= {2,5,3,23,12,14,43,33,20};
		SelectionSort(ar1);
		for(int elem:ar1) {
			System.out.print(elem +" ");
		}
		}

}
