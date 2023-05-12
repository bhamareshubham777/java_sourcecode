package domain;

import java.util.ArrayList;
import java.util.Scanner;

import dao.ProductDAO;
import dto.ProductDTO;

public class ProductMainapp {
	static Scanner sc=new Scanner(System.in);
	static ProductDTO p1=new ProductDTO();
	static ProductDAO d1=new ProductDAO();
	public static void main(String[] args) {
		System.out.println(" SELECT MODE OF OPERATION: ");
		System.out.println(" 1: ADD PRODUCT \n 2: DELETE PRODUCT \n 3: DISPLAY PRODUCT");
		int choice=sc.nextInt();
		
		if(choice==1) {
			insertProduct();
		}else if(choice==2) {
			removeProduct();
		}else if(choice==3) {
			showProduct();
		}else {
			System.out.println("INVALID CHOICE..!!");
		}
	}
	
	static void insertProduct() {
		System.out.println("ENTER PRODUCT NAME: ");
		String name=sc.next();
		System.out.println("ENTER PRODUCT PRICE: ");
		double price=sc.nextDouble();
		//Add data to DTO object
		
		p1.setProductName(name);
		p1.setProductPrice(price);
		//pass dto obj as an argument to addProduct() method
		int count=d1.addProduct(p1);
		System.out.println(count+" PRODUCT INSERTED SUCCESSFULLY");
	}
	
	static void removeProduct() {
		System.out.println("ENTER PRODUCT ID");
		int pID=sc.nextInt();
		
		p1.setProductId(pID);
		int count=d1.deleteProduct(p1);
		System.out.println(count+" PRODUCT REMOVED SUCCEFULLY");
	}
	
	static void showProduct() {
		ArrayList<ProductDTO> data=d1.displayProduct();
		for(ProductDTO p1: data) {
			System.out.println(p1);
		}
	}
}
