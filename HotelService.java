package onlinehotelroombooking;
import java.util.Scanner;

public class HotelService {
	
	static Scanner sc = new Scanner(System.in);
	
	static Hotel[] hotels = new Hotel[50];
	static int hindex=0;
	static int singleRoomNum=0;
    static int doubleRoomNum=0;
    static int suiteRoomNum=0;
    static int deluxeRoomNum=0;
	
	static void displayAllHotels()
	{
		for(int i = 0; i<hindex; i++)
		{
			System.out.println("Hotel Id : "+hotels[i].getHotelId()
			+"  Hotel Name : "+hotels[i].getHotelName()
			+"  Hotel Address : "+hotels[i].getHotelAddress());
			
			singleRoomNum=0;
			Room[] r = hotels[i].getSingleRooms();
			for(int k = 0; k<r.length; k++)
			{
				if(r[k]==(null)||r[k].isRoomStatus())
				{
					continue;
				}
				else
				{
					singleRoomNum++;
				}
			}
			if(singleRoomNum>0) 
			{
				
			    System.out.println("There are "+singleRoomNum
					+" single rooms with the room fare "+hotels[i].getSingleRooms()[0].getRoomFare());
			}
			
			doubleRoomNum=0;
			
			Room[] r1 = hotels[i].getDoubleRooms();
			for(int k = 0; k<r1.length; k++)
			{
				if(r1[k]==(null)||r1[k].isRoomStatus())
				{
					continue;
				}
				else
				{
					doubleRoomNum++;
				}
			}
			if(doubleRoomNum>0) 
			{
				System.out.println("There are "+doubleRoomNum
					+" double rooms with the room fare "+hotels[i].getDoubleRooms()[0].getRoomFare());
			}
			
			suiteRoomNum=0;
			Room[] r2 = hotels[i].getSuiteRooms();
			for(int k = 0; k<r2.length; k++)
			{
				if(r2[k]==(null)||r2[k].isRoomStatus())
				{
					continue;
				}
				else
				{
					suiteRoomNum++;
				}
			}
			if(suiteRoomNum>0) 
			{
				System.out.println("There are "+suiteRoomNum
					+" suite rooms with the room fare "+hotels[i].getSuiteRooms()[0].getRoomFare());
			}
			
			deluxeRoomNum=0;
			Room[] r3 = hotels[i].getDeluxeRooms();
			for(int k = 0; k<r3.length; k++)
			{
				if(r3[k]==(null)||r3[k].isRoomStatus())
				{
					continue;
				}
				else
				{
					deluxeRoomNum++;
				}
			}
			if(deluxeRoomNum>0) 
			{
			    System.out.println("There are "+deluxeRoomNum
					+" deluxe rooms with the room fare "+hotels[i].getDeluxeRooms()[0].getRoomFare());
			}
			deluxeRoomNum=0;
			System.out.println("==============================================");
		}
	}
	
	static void displayHotelByLocation()
	{
		System.out.println("Enetr your location : ");
		String location = sc.nextLine();
		for(int i = 0; i<hindex; i++)
		{
			if(hotels[i].getHotelAddress().equalsIgnoreCase(location))
			{
				System.out.println("Hotel Id : "+hotels[i].getHotelId()
						+"  Hotel Name : "+hotels[i].getHotelName()
						+"  Hotel Address : "+hotels[i].getHotelAddress());
						
				singleRoomNum=0;
				for (int j = 0; j<hotels[i].getSingleRooms().length;j++)
				{
					Room[] r = hotels[i].getSingleRooms();
					if(r[j]==(null))
					{
						continue;
					}
						else
					{
						singleRoomNum++;
					}
				}
				if(singleRoomNum>0) {
				System.out.println("There are "+singleRoomNum
						+" single rooms with the room fare "+hotels[i].getSingleRooms()[0].getRoomFare());}
						
				doubleRoomNum=0;
				for (int j = 0; j<hotels[i].getDoubleRooms().length;j++)
				{
					Room[] r = hotels[i].getDoubleRooms();
					if(r[j]==(null))
					{
						continue;
					}
					else
					{
						doubleRoomNum++;
					}
				}
				if(doubleRoomNum>0) {
				System.out.println("There are "+doubleRoomNum
						+" double rooms with the room fare "+hotels[i].getDoubleRooms()[0].getRoomFare());}
						
				suiteRoomNum=0;
				for (int j = 0; j<hotels[i].getSuiteRooms().length;j++)
				{
					Room[] r = hotels[i].getSuiteRooms();
					if(r[j]==(null))
					{
						continue;
					}
					else
					{
						suiteRoomNum++;
					}
				}
				if(suiteRoomNum>0) {
				System.out.println("There are "+suiteRoomNum
						+" suite rooms with the room fare "+hotels[i].getSuiteRooms()[0].getRoomFare());}
				
				deluxeRoomNum=0;
				for (int j = 0; j<hotels[i].getDeluxeRooms().length;j++)
				{
					Room[] r = hotels[i].getDeluxeRooms();
					if(r[j]==(null))
					{
						continue;
					}
					else
					{
						deluxeRoomNum++;
					}
				}
				if(deluxeRoomNum>0) {
				System.out.println("There are "+deluxeRoomNum
								+" deluxe rooms with the room fare "+hotels[i].getDeluxeRooms()[0].getRoomFare());}
				System.out.println("==============================================");
			}
			else
			{
				continue;
			}
		}	
	}
	
}