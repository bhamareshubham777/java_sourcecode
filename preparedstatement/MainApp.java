package preparedstatement;

import java.sql.SQLException;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		BikeInfo b1=new BikeInfo();
		Scanner sc=new Scanner(System.in);
		System.out.println(" SELECT MODE OF OPERATION");
		System.out.println(" 1:ADD BIKE \n 2:GET BIKE BY MODEL \n 3:GET BIKE BY COMPANY \n 4:GET ALL BIKES");
		int choice=sc.nextInt();
		
		if(choice==1) {
			try {
				b1.addBike();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else if(choice==2) {
			try {
				b1.getByModel();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else if(choice==3) {
			try {
				b1.getByCompany();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else if(choice==4) {
			try {
				b1.getAllBikes();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("INVALID CHOICE...!!!");
		}
		sc.close();
	}
}
