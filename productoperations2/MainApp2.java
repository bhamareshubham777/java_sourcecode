package productoperations2;

import java.sql.SQLException;
import java.util.Scanner;

public class MainApp2 {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		LoginUser lu=new LoginUser();
		System.out.println(" SELECT MODE OF OPERATION: ");
		System.out.println(" 1:LOGIN \n 2:SIGNUP");
		int choice = sc1.nextInt();
		
		if(choice==1) {
			try {
				lu.login();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else if(choice==2) {
			try {
				lu.signUp();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		sc1.close();
	}
}
