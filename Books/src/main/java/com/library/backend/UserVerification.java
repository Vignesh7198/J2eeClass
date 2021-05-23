package com.library.backend;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.connection.ConnectionClass;

public class UserVerification {

	public static void main(String[] args) {
		Book Book1 = UserVerification.Login();
		
		System.out.println(Book1);

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static Book Login() {
		int s = 0;

		try (Scanner scan = new Scanner(System.in);) {

			for (int i = 0;;) {
				System.out.println("Enter You're User Name");
				String UserName = scan.nextLine();
				System.out.println("Enter you're Password");
				String Password = scan.nextLine();
				try {
					s = ConnectionClass.CheckUser(UserName, Password);
				} catch (SQLException e) {
					e.printStackTrace();
				}
	//			System.out.println(s);
				

				if ((s == 0)) {
					System.out.println("Invalid User Credentials!");
					i++;
					if (i > 2) {
						System.out.println("Account Locked ");
                        break;					

					}
				}
				if (s > 0) {					
					break;
				}

			}

		}
		if(s<=0) {
			return null;
		}
		else {
			return new Book();
		}

	}

}
