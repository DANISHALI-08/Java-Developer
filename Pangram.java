package com.corejava.service;
import java.util.*;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean pang=true;
		String s1="Fix problem quickly with galvanized jets";
		s1=s1.replace(" ", "");
		char []ch=s1.toCharArray();
		int [] ar=new int[26];
		for(int i=0;i<ch.length-1;i++) {
			int index=ch[i]-65;
			ar [index]++;
			
		}
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==0) {
				System.out.println("The Input is not Pangram");
				 pang=false;
			}
		}
		
if(pang==true) {
			
			System.out.println("The Input is Pangram");
				
		}
	}

}
