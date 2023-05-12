package productoperations;

import java.sql.SQLException;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		ProductSimulator ps=new ProductSimulator();
		System.out.println(" SELECT MODE OF OPERATION: ");
		System.out.println(" 1:ADD PRODUCT \n 2:DELETE PRODUCT \n 3:DISPLAY PRODUCT");
		int choice=sc.nextInt();
		
		if(choice==1) {
			System.out.println("ENTER PRODUCT ID: ");
			int id=sc.nextInt();
			System.out.println("ENTER PRODUCT NAME: ");
			String name=sc.next();
			System.out.println("ENTER PRODUCT PRICE: ");
			double price=sc.nextDouble();
			
			ps.addProduct(id,name,price);
		}else if(choice==2) {
			System.out.println("ENTER PRODUCT ID: ");
			int id=sc.nextInt();
			ps.deleteProduct(id);
		}else if(choice==3) {
			ps.displayProduct();
		}
	}
}
