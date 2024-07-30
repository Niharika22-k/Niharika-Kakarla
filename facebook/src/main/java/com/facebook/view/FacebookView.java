package com.facebook.view;
import java.util.Scanner;

import com.facebook.controller.FacebookController;
import com.facebook.controller.FacebookControllerInterface;

public class FacebookView {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("***********************************************");

		System.out.println("Press 1 to create profile");

		System.out.println("Press 2 to view profile");

		System.out.println("Press 3 to delete profile");

		System.out.println("Press 4 to edit profile");

		System.out.println("Press 5 to search profile");

		System.out.println("Press 6 to view all profile");

		System.out.println("Press 7 to login profile");

		

		Scanner sc=new Scanner(System.in);

		

		System.out.println("Enter your choice: ");

		int c=sc.nextInt();

		

		FacebookControllerInterface fc=new FacebookController(); 

		

		switch(c)

		{

		case 1:

			fc.createProfileController();

			break;

		case 2:

			fc.viewProfileController();

			break;

		case 3:

			fc.deleteProfileController();

			break;

		case 4:

			fc.editProfileController();

			break;

		case 5:

			fc.searchprofileController();

			break;

		case 6:

			fc.viewallProfileController();

			break;

		case 7:

			fc.loginProfileController();

			break;

		}



	}




	

}
