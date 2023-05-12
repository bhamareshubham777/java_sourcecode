package productoperations2;

import java.sql.SQLException;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		MinMaxPrize m1=new MinMaxPrize();
		System.out.println(" SELECT MODE OF OPERATION: ");
		System.out.println(" 1:MAXPRICE \n 2:MINPRICE");
		int choice = sc.nextInt();
		
		if(choice==1) {
			m1.maxPrice();
		}else if(choice==2) {
			m1.minPrice();
		}
	}
}
