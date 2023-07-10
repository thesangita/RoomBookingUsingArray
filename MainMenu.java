package onlinehotelroombooking;

import static onlinehotelroombooking.AdminOperations.*;
import static onlinehotelroombooking.CustomerOperations.*;
import java.util.Scanner;
public class MainMenu {

	
	    static Scanner sc = new Scanner(System.in);
		public static void allMenus()
		{
			int choice;
			
			while(true)
			{
				System.out.println("================================================");
				System.out.println("Press 1 for Admin Panel\nPress 2 for User Panel\nPress 3 to Quit");
				System.out.println("================================================");
				System.out.println("================================================");
				System.out.println("Enter your choice : ");
				System.out.println("================================================");
				choice = sc.nextInt();
				
				switch(choice)
				{
				case 1 :
					adminOperations();
					System.out.println("================================================");
					break;
				case 2 :
					userOperations();
					System.out.println("================================================");	
					break;
				case 3 :
					System.exit(0);
				}
		   }
		}

	    public static void main(String[] args)
	    {
	    	System.out.println("~~~~~Welcome to Online Room Booking System~~~~~");
	    	allMenus();
	    }	
	}