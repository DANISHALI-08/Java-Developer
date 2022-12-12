package com.corejava.service;

import java.util.*;

public class DupString {

	public static void main(String[] args) {
		
		//WAP to remove Duplicates from a String.(Take any String ex with duplicates character)
		
		/*
		  String S1=("DanishAli"); 
		  String DupRem=" "+S1.charAt(0);
		  System.out.println("Remove Duplicares are:"); 
		  for(int i=1;i<S1.length();i++)
		  { if(!DupRem.contains(String.valueOf(S1.charAt(i)))) 
		  DupRem = DupRem + S1.charAt(i);
		 
		  }
		   System.out.println(DupRem);
		 
		*/
		
		//WAP to print Duplicates characters from the String.
		
	      String str = "Learning the Java Programing";
	      int count;
	      char Dup[] = str.toCharArray();
	      System.out.println("The string is: " + str);
	      System.out.println("Duplicate characters in a given string: ");
	      for (int i = 0; i < Dup.length; i++) {
	    	  count=1;
	         for (int j = i + 1; j < Dup.length;j++) {
	        	 if(Dup[i] == Dup[j] && Dup[i] != ' ') {  
	                    count++;
	                    
	            	Dup[j]='0';
	            }
	         }
	            if(count > 1 && Dup[i] != '0')  
	                System.out.println(Dup[i]); 
	   
	      }
	      
	  	
	}
	}
