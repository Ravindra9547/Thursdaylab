package array;

import java.util.Scanner;

public class LabReverseString {
public static void main(String []args)
{
	String string;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string:");
	string=sc.nextLine();
	
	//Stores the reverse of given string   
	String reversedStr = "";    
    
    //Iterate through the string from last and add each character to variable reversedStr    
    for(int i=string.length()-1;i>=0;i--)
    {    
        reversedStr=reversedStr+string.charAt(i);    
    }           
    //Displays the original string 
    System.out.println("Original string: "+string);    
    //Displays the reverse of given string    
    System.out.println("Reverse of given string: "+reversedStr);
}
}
