package assignmentsWeek1Day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "sssssrt";
		String text2 = "potss"; 
		if(text1.length()==text2.length())
		{
			char[] charArray = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
				
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		System.out.print(charArray);
		System.out.println(" ");
		System.out.print(charArray2);
		
			
	if(Arrays.equals(charArray,charArray2))
	{
	System.out.println(" ");
	System.out.println("Its Anagram");
		}}
		else
			System.out.println("Not Anagram");
	}}


	

	


