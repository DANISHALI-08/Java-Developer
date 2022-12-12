package com.corejava.service;

import java.util.*;
//WAP to find if String contains all unique characters.
public class UniqueString {
	 boolean uniqueCharacter(String str)
	    {
	        
	        for (int i = 0; i < str.length(); i++)
	            for (int j = i + 1; j < str.length(); j++)
	                if (str.charAt(i) == str.charAt(j)) 
	                    return false;
	 
	        // If no duplicate characters encountered,
	        // return true
	        return true;
	                }
	

	public static void main(String[] args) {
		

		UniqueString obj = new UniqueString();
        String input = "Mouse";
 
        if (obj.uniqueCharacter(input))
            System.out.println("The String " + input + " has all unique characters");
        else
            System.out.println("The String " + input + " has duplicate characters");
		

	}

}
