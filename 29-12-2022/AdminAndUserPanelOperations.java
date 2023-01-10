package shoppingkartusingarraylist;

import java.util.Scanner;

//this class is for all Admin and User panel operations 
public class AdminAndUserPanelOperations {
static Scanner sc=new Scanner(System.in);

//all adminPanel operations listed here
static void adminPanel()
{
	while(true)
	{
	int choice;
	System.out.println("Enter 1.For Add Product\n"
			+ "Enter 2.For Update Product Details using id\n"
			+ "Enter 3.For Show Product by Id\n"
			+ "Enter 4.For Delete Product Details by id\n"
			+ "Enter 5.For Show All Product Details\n"
			+ "Enter 6.For Delete All Products\n"
			+ "Enter 7.For Show All Orders Details\n"
			+ "Enter 8.For Go Back to the Main menu");
	System.out.println("=========================================");
	System.out.println("Enter Your Choice");	
	choice=sc.nextInt();
	System.out.println("=========================================");
	switch(choice)
	{
	case 1:
		ProductService.addProduct();
	    System.out.println("=====================================");
	    break;
	    
	case 2:
		System.out.println("Enter id to update:");
		int id=sc.nextInt();
			
		try {
			 ProductService.updateProductById(id);
		} catch (GlobalException e) 
		{
			System.out.println("Exception occured: "+e.getMessage());
		}
		System.out.println("=====================================");
		break;
	    
	case 3:
		System.out.println("Enter id to search:");
		int pid=sc.nextInt();
		try {
		ProductService.getProductById(pid);
		}catch(GlobalException e)
		{
			System.out.println("Exception occured: "+e.getMessage());
	}
		System.out.println("=====================================");
		break;
		
	case 4:
		System.out.println("Enter id to Delete Product:");
		int did=sc.nextInt();
		try {
			ProductService.deleteProductById(did);
		} 
		catch (GlobalException e) {
			System.out.println("Exception occured: "+e.getMessage());
			
		}
			break;
			
	case 5:
		ProductService.displayAllProduct();
		System.out.println("====================================");
	    break;
	
	case 6:
		ProductService.deleteAllProduct();
	    System.out.println("====================================");
	    break;
	    
	case 7:
		ProductService.showAllOrder();	
	    System.out.println("====================================");
	    break;
	    
	case 8:
		AdminAndUserPanels.AllOPeration();
		
	default:
		System.out.println("Please enter a correct choice from the menu!");
	}
}
}

//all userPanel operation listed here
static void userPanel()
{
	while(true)
	{
	int choice;
	System.out.println("Enter 1.For Search Products\n"
			+ "Enter 2.For Order Product\n"
			+ "Enter 3.For Cancel Product\n"
			+ "Enter 4.For Go Back to the Main menu\n");
	System.out.println("=====================================");
	System.out.println("Enter Your Choice");
	choice=sc.nextInt();
	
	switch(choice)
	{
	case 1:
		System.out.println("Enter id to search:");
		int pid=sc.nextInt();
		try {
		ProductService.getProductById(pid);
		}catch(GlobalException e)
		{
			System.out.println("Exception occured: "+e.getMessage());
	}
		System.out.println("=====================================");
		break;
	    
	case 2:
		ProductService.bookProduct();
		System.out.println("====================================");
	    break;
	    
	case 3:
		 System.out.println("Enter Ordered Id to cancel an order:\n"
		 		+ "Note: Order Id persent in Ordered History!!");
		 int id=sc.nextInt();
		 try
			{
			ProductService.cancelOrder(id);
			}
			catch(GlobalException e)
			{
			System.out.println("Exception occured: "+e.getMessage());
			}
		System.out.println("====================================");
	    break;
	    
	case 4:
		AdminAndUserPanels.AllOPeration();
		
	default:
		System.out.println("Please enter a correct choice from the menu!");
	}
}	
}
}
