package org.demo.program;

public class Palindrome {
	
	public static String palname(String str) {
		
	
		for (int i = str.length()-1; i >=0; i--) {
			
			String reverse = "";
			
			reverse= reverse+str.charAt(i);
			
			System.out.print(reverse);	
			
		}
		
		return str;
		
	}
	public static void main(String[] args) {
		palname("sakhtimurugan");
	}

}
