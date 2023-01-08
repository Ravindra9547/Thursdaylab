package thursdaylab;

import java.util.LinkedList;

public class LabLinkedList {
public static void main (String [] args) 
{
	// create Integer type linked list
	LinkedList<Integer> linkedList=new LinkedList<Integer>();
	
	// Add elements to LinkedList
	linkedList.add(0);
	linkedList.add(3);
	linkedList.add(4);
	linkedList.add(5);
    System.out.println("LinkedList: " + linkedList);
    
    //adding element in 2nd index
    System.out.println("--------------------------------------------------------------------");
    linkedList.add(1, 2);
    System.out.println("After adding element in 2nd index LinkedList: " + linkedList);
    
    //Retrieve the first element of the list
    System.out.println("-----------------------------------------");
    System.out.println("Retrieve the first element of the list:" + linkedList.get(0));
    
    //replacing the first element of the list
    System.out.println("--------------------------------------------------------------------");
    linkedList.set(0, 1);
    System.out.println("Replace the first element of the list:" + linkedList);
    
    //Converting LinkedList To Array:
    Integer[] arr=linkedList.toArray(new Integer[(linkedList.size())]);
    
    //Print all elements of the Array
    System.out.println("-------------------------------------------------");
    System.out.print("After converted LinkedList to Array:");
    for(Integer obj : arr)
        System.out.print(obj+" ");
}
}
