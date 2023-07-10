package onlinehotelroombooking;
import static onlinehotelroombooking.MainMenu.*;
import static onlinehotelroombooking.HotelService.*;
import java.util.Scanner;

public class AdminOperations {
	
	static Scanner sc = new Scanner(System.in);
	
	static void createHotel()
	{
		System.out.println("Enter number of hotel you want to add to the system : ");
		int num = sc.nextInt();
		for(int i = 0; i<num; i++)
		{
			System.out.println("Enter Hotel Id : ");
			int hotelId = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Hotel Name : ");
			String hotelName = sc.nextLine();
			
			System.out.println("Enter Hotel Address : ");
			String hotelAddress = sc.nextLine();
			
			//return new Hotel(hotelId, hotelName, hotelAddress);
			hotels[hindex++] = new Hotel(hotelId, hotelName, hotelAddress);
		}		
		System.out.println(num+"Hotel added to the system successfully.");
		System.out.println("=============================================");
	}
	
	static void createRoomInHotel()
	{
		int singletempIndex = 0;
		int doubletempIndex = 0;
		int suitetempIndex = 0;
		int deluxetempIndex = 0;
		boolean status = false;
		System.out.println("Enter Hotel Id : ");
		int hotelId = sc.nextInt();
		for(int i = 0; i<hindex; i++)
		{
			if(hotels[i].getHotelId()==hotelId)
			{
				System.out.println("There are four types of room : Single, Double, Suite, Deluxe.\n");
				System.out.println("Enter how many single room you want to add : ");
				int singleNum = sc.nextInt();
				if(singleNum>0) {
				System.out.println("Enter Room Fare for Single Rooms : ");
		        double singleroomFare = sc.nextDouble();
		        String singleroomType = "Single";
				Room[] tempRoom1 = new Room[50];
				singletempIndex = 0;
				for(int j = 0;j<singleNum; j++)
				{
					
					System.out.println("Enter Room No. : ");
			        int roomNo = sc.nextInt();
			        Room r = new Room(roomNo,singleroomType,singleroomFare);
			        tempRoom1[singletempIndex++]=r;
				}
		        hotels[i].setSingleRooms(tempRoom1);
		        System.out.println(singleNum+" Single Room added to the hotel successfully.");
				}
		        
		        System.out.println("Enter how many double room you want to add : ");
				int doubleNum = sc.nextInt();
				if(doubleNum>0) {
				System.out.println("Enter Room Fare for Double Rooms : ");
		        double doubleroomFare = sc.nextDouble();
		        String doubleroomType = "Double";
				Room[] tempRoom2 = new Room[50];
				doubletempIndex = 0;
				for(int j = 0;j<doubleNum; j++)
				{
					
					System.out.println("Enter Room No. : ");
			        int roomNo = sc.nextInt();
			        Room r = new Room(roomNo,doubleroomType,doubleroomFare);
			        tempRoom2[doubletempIndex++]=r;
				}
				
		        hotels[i].setDoubleRooms(tempRoom2);
		        System.out.println(doubleNum+" Double Room added to the hotel successfully.");
				}
		        
		        System.out.println("Enter how many suite room you want to add : ");
				int suiteNum = sc.nextInt();
				if(suiteNum>0) {
				System.out.println("Enter Room Fare for Suite Rooms : ");
		        double suiteroomFare = sc.nextDouble();
		        String suiteroomType = "Suite";
				Room[] tempRoom3 = new Room[50];
				suitetempIndex = 0;
				for(int j = 0;j<suiteNum; j++)
				{
					
					System.out.println("Enter Room No. : ");
			        int roomNo = sc.nextInt();
			        Room r = new Room(roomNo,suiteroomType,suiteroomFare);
			        tempRoom3[suitetempIndex++]=r;
				}
				
		        hotels[i].setSuiteRooms(tempRoom3);
		        System.out.println(suiteNum+" Suite Room added to the hotel successfully.");
				}
		        
		        System.out.println("Enter how many deluxe room you want to add : ");
				int deluxeNum = sc.nextInt();
				if(deluxeNum >0) {
				System.out.println("Enter Room Fare for Deluxe Rooms : ");
		        double deluxeroomFare = sc.nextDouble();
		        String deluxeroomType = "Deluxe";
				Room[] tempRoom4 = new Room[50];
				deluxetempIndex = 0;
				for(int j = 0;j<deluxeNum; j++)
				{
					
					System.out.println("Enter Room No. : ");
			        int roomNo = sc.nextInt();
			        Room r = new Room(roomNo,deluxeroomType,deluxeroomFare);
			        tempRoom4[deluxetempIndex++]=r;
				}
				
		        hotels[i].setDeluxeRooms(tempRoom4);
		        System.out.println(deluxeNum+" Deluxe Room added to the hotel successfully.");
				}
		        status = true;
		        break;
			}
		}
		if(status == false)
		{
			System.out.println("Hotel id is not available.");
		}
	}
	
	static void adminOperations()
	{
		int choice;
		while(true)
		{
			System.out.println("================================================");
			System.out.println("Press 1 to Add Hotel\n"
					+"Press 2 to Add Rooms to Hotel\n"
					+"Press 3 to get all Hotel Details\n"
					+"Press 4 to get Hotel by Location\n"
					+"Press 5 to Get Back to the Main Menu");
			System.out.println("================================================");
			System.out.println("Enter your choice : ");
			System.out.println("================================================");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 :
				createHotel();
				break;
			case 2 :
				createRoomInHotel();
				break;
			case 3 :
				displayAllHotels();
				break;
			case 4 :
				displayHotelByLocation();
				break;
			case 5 :
				allMenus();
				break;
			}
		}
	}
}
