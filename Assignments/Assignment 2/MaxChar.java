package com.Assignment_2;

public class MaxChar {

	public static void main(String[] args) {
		 
		       /* String str = "I am learning Java";  
		        int[] freq = new int[str.length()];  
		        char maxChar = str.charAt(0);  
		        int i, j, max;          
		          
		      
		        char string[] = str.toCharArray();  
		          
		      
		        for(i = 0; i < string.length; i++) {  
		            freq[i] = 1;  
		            for(j = i+1; j < string.length; j++) {  
		                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
		                    freq[i]++;  
		                      
		                 
		                    string[j] = '0';  
		                }  
		            }  
		        }  
		          
		     
		         max = freq[0];  
		        for(i = 0; i <freq.length; i++) {  
		             
		            if(max < freq[i]) {  
		                max = freq[i];  
		                maxChar = string[i];  
		            }  
		        }  
		          
		         
		        System.out.println("Maximum occurring character: " + maxChar);*/
		        
		        //vowels
		        
		        String str="The village is near city and provide very good food.";
		        int vowels = 0, consonant = 0, specialChar = 0;
		               
		        for (int i = 0; i < str.length(); i++) {
		              
		            char ch = str.charAt(i);
		      
		            if ( (ch >= 'a' && ch <= 'z') || 
		                (ch >= 'A' && ch <= 'Z') ) {
		      
		               
		                ch = Character.toLowerCase(ch);
		      
		                if (ch == 'a' || ch == 'e' || ch == 'i' ||
		                    ch == 'o' || ch == 'u')
		                    vowels++;
		                else
		                    consonant++;
		            }
		           
		            else
		                specialChar++;
		        }
		          
		        System.out.println("Vowels: " + vowels);
		        System.out.println("Consonant: " + consonant);
		       System.out.println("Special Character: " + specialChar);
}
}
