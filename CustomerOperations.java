package onlinehotelroombooking;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import static onlinehotelroombooking.HotelService.*;
import static onlinehotelroombooking.MainMenu.*;

public class CustomerOperations {
	
	static Scanner sc = new Scanner(System.in);
	
	
	static void roomBooking()
	{
		double totalBill = 0;
		System.out.println("Press 1 to Book Room\nPress 2 to get back to the menu");
		int c = sc.nextInt();
		if(c==1)
		{
			LocalTime orderTime = LocalTime.now();
			LocalDate orderDate = LocalDate.now();
			System.out.println("Enter Customer Name : ");
			String customerName = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Customer Address : ");
			String customerAddress = sc.nextLine();
		    System.out.println("Enter Hotel Id : ");
		    int hId = sc.nextInt();
		    for(int i =0; i<hindex; i++)
		    {
		    	if(hotels[i].getHotelId()==hId)
			    {
				    System.out.println("How many single room you want to book ? ");
				    int singleroom = sc.nextInt();
				    int singletemprooom = 0;
				    if(singleroom>0)
				    {
					    Room[] r = hotels[i].getSingleRooms();
					    for(int k = 0; k<r.length; k++)
					    {
						    if(r[k]==(null)||r[k].isRoomStatus())
						    {
						    	continue;
						    }
						    else
						    {
						        System.out.print(r[k].getRoomNo()+" ");
						        r[k].setRoomStatus(true);
						        singletemprooom++;  
						    }
						    if(singletemprooom==singleroom)
						    {
							    break;
						    }
					    
					    }		
					    System.out.println(" booked for you ");
					    totalBill=r[0].getRoomFare()*singleroom;
				    }
				    System.out.println("How many double room you want to book ? ");
				    int doubleroom = sc.nextInt();
				    int doubletemprooom = 0;
				    if(doubleroom>0)
				    {
					    Room[] r = hotels[i].getDoubleRooms();
					    for(int k = 0; k<r.length; k++)
					    {
						    if(r[k]==(null)||r[k].isRoomStatus())
						    {
						    	continue;
						    }
						    else
						    {
						        System.out.print(r[k].getRoomNo()+" ");
						        r[k].setRoomStatus(true);
						        doubletemprooom++;  
						    }
						    if(doubletemprooom==doubleroom)
						    {
							    break;
						    }
					    }		
					    System.out.println(" booked for you ");
					    totalBill=totalBill+r[0].getRoomFare()*doubleroom;
					}
				
				    System.out.println("How many suite room you want to book ? ");
				    int suiteroom = sc.nextInt();
				    int suitetemprooom = 0;
				    if(suiteroom>0)
				    {
					    Room[] r = hotels[i].getSuiteRooms();
					    for(int k = 0; k<r.length; k++)
					    {
						    if(r[k]==(null)||r[k].isRoomStatus())
						    {
						    	continue;
						    }
						    else
						    {
						        System.out.print(r[k].getRoomNo()+" ");
						        r[k].setRoomStatus(true);
						        suitetemprooom++;  
						    }
						    if(suitetemprooom==suiteroom)
						    {
							    break;
						    }
					    }		
					    System.out.println(" booked for you ");
					    totalBill=totalBill+r[0].getRoomFare()*suiteroom;
				    }
				
				    System.out.println("How many deluxe room you want to book ? ");
				    int deluxeroom = sc.nextInt();
				    int deluxetemprooom = 0;
				    if(deluxeroom>0)
				    {
					    Room[] r = hotels[i].getDeluxeRooms();
					    for(int k = 0; k<r.length; k++)
					    {
						    if(r[k]==(null)||r[k].isRoomStatus())
						    {
						    	continue;
						    }
						    else
						    {
						        System.out.print(r[k].getRoomNo()+" ");
						        r[k].setRoomStatus(true);
						        deluxetemprooom++;  
						    }
						    if(deluxetemprooom==deluxeroom)
						    {
							    break;
						    }
					    }		
					    System.out.println(" booked for you ");
					    totalBill=totalBill+r[0].getRoomFare()*deluxeroom;
				    }
			    }
		    }
		    System.out.println("~~~~~~~~Bill~~~~~~~~~");
		    System.out.println("Name : "+customerName+" Address : "+customerAddress+" Date : "+orderDate+" Time : "+orderTime+" Total Bill : "+totalBill);
		}
	}
	
	static void cancelBooking()
	{
		System.out.println("Enter the hotel id : ");
		int hId = sc.nextInt();
	    for(int i =0; i<hindex; i++)
	    {
	    	if(hotels[i].getHotelId()==hId)
		    {
	    		System.out.println("How many single room you want to cancel ? ");
			    int singleroom = sc.nextInt();
			    if(singleroom>0)
			    {
			    	Room[] r = hotels[i].getSingleRooms();
			    	for(int j = 0; j<singleroom; j++)
			    	{
			    		System.out.println("Enter the room no. ");
			    		int rNo = sc.nextInt();
			    		for(int k = 0; k<r.length; k++)
			    		{
			    			if(r[k]==(null)||!(r[k].isRoomStatus()))
			    			{
			    				continue;
			    			}
			    			else
			    			{
			    				if(r[k].getRoomNo()==rNo)
			    				{
					    	        r[k].setRoomStatus(false);
					    	        System.out.println("Your Single Room booking got cancelled."); 
					    	        break;
					            }
			    				else
			    				{
			    					System.out.println("Room not found.");
			    				}
			    		    }
			    	    }      
				    }
			    }
			    System.out.println("How many double room you want to cancel ? ");
			    int doubleroom = sc.nextInt();
			    if(doubleroom>0)
			    {
			    	Room[] r = hotels[i].getDoubleRooms();
			    	for(int j = 0; j<doubleroom; j++)
			    	{
			    		System.out.println("Enter the room no. ");
			    		int rNo = sc.nextInt();
			    		for(int k = 0; k<r.length; k++)
			    		{
			    			if(r[k]==(null)||!(r[k].isRoomStatus()))
			    			{
			    				continue;
			    			}
			    			else
			    			{
			    				if(r[k].getRoomNo()==rNo)
			    				{
					    	        r[k].setRoomStatus(false);
					    	        System.out.println("Your Double room booking got cancelled.");
					    	        break;
					            }
			    				else
			    				{
			    					System.out.println("Room not found.");
			    				}
			    		    }
			    	    }
				    }
			    }
			    System.out.println("How many suite room you want to cancel ? ");
			    int suiteroom = sc.nextInt();
			    if(suiteroom>0)
			    {
			    	Room[] r = hotels[i].getSuiteRooms();
			    	for(int j = 0; j<suiteroom; j++)
			    	{
			    		System.out.println("Enter the room no. ");
			    		int rNo = sc.nextInt();
			    		for(int k = 0; k<r.length; k++)
			    		{
			    			if(r[k]==(null)||!(r[k].isRoomStatus()))
			    			{
			    				continue;
			    			}
			    			else
			    			{
			    				if(r[k].getRoomNo()==rNo)
			    				{
					    	        r[k].setRoomStatus(false);
					    	        System.out.println("Your Suite Room booking got cancelled.");     
					    	        break;
					            }
			    				else
			    				{
			    					System.out.println("Room not found.");
			    				}
			    		    }
			    	    } 
				    }
			    }
			    System.out.println("How many deluxe room you want to cancel ? ");
			    int deluxeroom = sc.nextInt();
			    if(deluxeroom>0)
			    {
			    	Room[] r = hotels[i].getDeluxeRooms();
			    	for(int j = 0; j<deluxeroom; j++)
			    	{
			    		System.out.println("Enter the room no. ");
			    		int rNo = sc.nextInt();
			    		for(int k = 0; k<r.length; k++)
			    		{
			    			if(r[k]==(null)||!(r[k].isRoomStatus()))
			    			{
			    				continue;
			    			}
			    			else
			    			{
			    				if(r[k].getRoomNo()==rNo)
			    				{
					    	        r[k].setRoomStatus(false);
					    	        System.out.println("Your Deluxe Room booking got cancelled.");
					    	        break;
					            }
			    				else
			    				{
			    					System.out.println("Room not found.");
			    				}
			    		    }
			    	    }
				    }
			    }
		    }	
		}
	}
	static void userOperations()
	{
		int choice;
		while(true)
		{
			System.out.println("================================================");
			System.out.println("Press 1 to search all hotel details\n"
					+"Press 2 to search hotel by location\n"
					+"Press 3 to book room in a hotel\n"
					+"Press 4 to cancel booking\n"
					+"Press 5 to Get Back to the Main Menu");
			System.out.println("================================================");
			System.out.println("Enter your choice : ");
			System.out.println("================================================");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 :
				displayAllHotels();
				break;
			case 2 :
				displayHotelByLocation();
				break;
			case 3 :
				roomBooking();
				break;
			case 4 :
				cancelBooking();
				break;
			case 5 :
				allMenus();
				break;
			}
		}
	}

}
