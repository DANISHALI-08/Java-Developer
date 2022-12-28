package com.Assignment_2;

public class MergeSort {
	public static void conquer(int ar[],int si,int mid,int ei) 
	{
		int merged[]=new int [ei-si+1];
		int x1=si;
		int x2=mid+1;
		int x=0;
		while(x1<= mid && x2<=ei) 
		{
			if(ar [x1]<=ar [x2]) 
			{
				merged[x++]=ar[x1++];
			}
			else {
				merged[x++]=ar[x2++];
			}
		}
		while(x1<=mid) {
			merged[x++]=ar[x1++];
		}
		while(x2<=ei) {
			merged[x++]=ar[x2++];
		     }
		for(int i=0,j=si;i<ar.length;i++,j++) {
			ar[j]=merged[i];
		}
		
		}
	
	public static void devide(int ar[],int si,int ei)
	{
		if(si>=ei) {
			return;
		}
		int mid=si+(ei-si)/2;
		devide(ar,si,mid);
		devide(ar,mid+1,ei);
		conquer(ar,si,mid,ei);
		
	}

	public static void main(String[] args) {
		int ar[]= {10,33,23,9,15,43};
		int n=ar.length;
		devide(ar,0,n-1);
		for(int i=0;i<n;i++) 
		{
			System.out.print(ar[i]+" ");
		}
		
		System.out.println();
	}


	}


