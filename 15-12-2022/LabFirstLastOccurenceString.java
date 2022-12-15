package array;

public class LabFirstLastOccurenceString {
public static void main (String []args)
{
	String str = "Hello world";
	//To search and display first occurrence
	System.out.println("The first occurrence of the character is at index: "+str.indexOf('o'));
	//To search and display last occurrence
	System.out.println("The last occurrence of the character is at index: "+str.lastIndexOf('o'));
}
}
