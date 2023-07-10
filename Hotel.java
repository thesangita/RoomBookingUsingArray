package onlinehotelroombooking;

import java.util.Arrays;

public class Hotel {
	
	private int hotelId;
	private String hotelName;
	private String hotelAddress;
	
	Room[] singleRooms = new Room[50];
	Room[] doubleRooms = new Room[50];
	Room[] suiteRooms = new Room[50];
	Room[] deluxeRooms = new Room[50];
	public Hotel(int hotelId, String hotelName, String hotelAddress) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	public Room[] getSingleRooms() {
		return singleRooms;
	}
	public void setSingleRooms(Room[] singleRooms) {
		this.singleRooms = singleRooms;
	}
	public Room[] getDoubleRooms() {
		return doubleRooms;
	}
	public void setDoubleRooms(Room[] doubleRooms) {
		this.doubleRooms = doubleRooms;
	}
	public Room[] getSuiteRooms() {
		return suiteRooms;
	}
	public void setSuiteRooms(Room[] suiteRooms) {
		this.suiteRooms = suiteRooms;
	}
	public Room[] getDeluxeRooms() {
		return deluxeRooms;
	}
	public void setDeluxeRooms(Room[] deluxeRooms) {
		this.deluxeRooms = deluxeRooms;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hotel [hotelId=");
		builder.append(hotelId);
		builder.append(", hotelName=");
		builder.append(hotelName);
		builder.append(", hotelAddress=");
		builder.append(hotelAddress);
		builder.append(", singleRooms=");
		builder.append(Arrays.toString(singleRooms));
		builder.append(", doubleRooms=");
		builder.append(Arrays.toString(doubleRooms));
		builder.append(", suiteRooms=");
		builder.append(Arrays.toString(suiteRooms));
		builder.append(", deluxeRooms=");
		builder.append(Arrays.toString(deluxeRooms));
		builder.append("]");
		return builder.toString();
	}
}