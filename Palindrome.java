package com.corejava.service;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		//WAP to check if “2552” is palindrome or not.
		
		/*String s1="2552";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
System.out.println(s2);
if(s1.equals(s2)) {
	System.out.println("Input is Palindrome");	
}
else
{
	System.out.println("Input is not Palindrome");	
}*/


        //WAP to implement Anagram Checking least inbuilt methods being used.
		
		/*String s1="RACE";
		String s3="";
		for(int i=0;i<s1.length();i++) {
			s3=s3+(char)(s1.charAt(i)+32);
		}
	
		char[]ch1=s3.toCharArray();
		System.out.println(ch1);
		Arrays.sort(ch1);
		for(char s5:ch1) {
			System.out.print(s5);
		}
		System.out.println();
		
		String s2="CARE";
		String s4="";
		for(int i=0;i<s1.length();i++) {
			s4=s4+(char)(s2.charAt(i)+32);
		}
		
		char[]ch2=s4.toCharArray();
		System.out.println(ch2);
		Arrays.sort(ch2);
		for(char s6:ch2) {
			System.out.print(s6);
		}
		
		System.out.println();
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("The Input is ANAGRAM");

	}
		else
		{
			System.out.println("The Input is not ANAGRAM");
		}*/
		
	
    //WAP to implement Pangram Checking with least inbuilt methods being used.
		
		
		String str="THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		
		int count[] = new int[26];
	    boolean flag = true;        
	    char ch;
	    for(int i=0; i<str.length(); i++){
	        ch = str.charAt(i);
	        
	        if(ch == ' ')
	        continue;
	        if(ch>='A' && ch<='Z'){
	            count[ch-'A']++;      
	        } else if(ch>='a' && ch<='z'){
	            count[ch-'a']++;      
	        }
	 
	    }
	 
	   
	    for(int i=0; i<count.length; i++){
	      if(count[i] == 0){
	        flag = false;    
	        break;
	      }
	    }
	 
	    if(flag)
	      System.out.println("It is a Pangram String");
	    else 
	      System.out.println("Not a Pangram String");
	 
	           
	        }
	 
	    }
	        
		
		
	
		
		
		
		
