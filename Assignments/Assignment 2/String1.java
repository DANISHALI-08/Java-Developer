package com.Assignment_2;
import java.lang.String;

public class String1 {

	public static void main(String[] args) {
		// reverse the input and output is noruen I
	/*	String s1="I neuron";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) 
		{
			s2=s2+s1.charAt(i);
		}
       System.out.println(s2);*/
		
	//input is Ineuron Java and output is avaJ noruenI
		String s1="Ineuron Java";
		String s2="";
		String arr[]=s1.split("");
		for(int i=s1.length()-1;i>=0;i--) 
		{
			s2=s2+s1.charAt(i);
		}
		s2=s2+"";
		System.out.println(s2);
		
		//input is Ineuron Java and output is Java Ineuron
		/*String s1="Ineuron Java ";
		String s2="";
		String ar[]=s1.split(" ");
		for(int i=ar.length-1;i>=0;i--) {
			s2=s2+ar[i]+" ";
		}
		s2=s2+"";
		System.out.println(s2);*/
		
		
	}

}
