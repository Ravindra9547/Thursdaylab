package shoppingkartusingarraylist;
import java.util.Scanner;
public class ProductOperations {
	
static void AllMenus()
{
	//Declaring variables
	int choice;
	Scanner sc=new Scanner(System.in);
	do {
	System.out.println("=====================================");
	System.out.println("Press 1. for Add Product\n"
			+ "Press 2. for get product by id\n"
			+ "Press 3. for update prodcut by Id\n"
			+ "Press 4. for delete product by id\n"
			+ "Press 5. for delete all product\n"
			+ "Press 6. for display all product details\n"
			+ "Press 7. for Book product\n"
			+ "Press 8. for cancel order\n"
			+ "Press 9. for check order details\n"
			+ "Press 10. for quit");
	System.out.println("=====================================");
	System.out.println("Enter your choice");
	choice=sc.nextInt();
	
	switch(choice)
	{
	   case 1:
	   ProductService.addProduct();
		
		System.out.println("=====================================");
		break;
		
	case 2:
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
		
	case 3:
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
		ProductService.deleteAllProduct();
		break;
		
	case 6:
		ProductService.displayAllProduct();
		break;
		
	case 7: 
		ProductService.bookProduct();
		break;
		
	case 8:
		break;
	}
	}while(choice!=9);
}
}	 

	
	

		