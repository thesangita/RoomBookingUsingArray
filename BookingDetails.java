package onlinehotelroombooking;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class BookingDetails {
	
	private int bookingId;
	private String customerName;
	private String customerAddress;
	private double totalBill;
	private LocalDate orderDate;
	private boolean bookingStatus = false;
	private int hotelId;
	Room[] custRoom = new Room[10];
	public BookingDetails(int bookingId, String customerName, String customerAddress, double totalBill,
		 LocalDate orderDate, boolean bookingStatus, int hotelId, Room[] custRoom) {
		super();
		this.bookingId = bookingId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.totalBill = totalBill;
		this.orderDate = orderDate;
		this.bookingStatus = bookingStatus;
		this.hotelId = hotelId;
		this.custRoom = custRoom;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public boolean isBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public Room[] getCustRoom() {
		return custRoom;
	}
	public void setCustRoom(Room[] custRoom) {
		this.custRoom = custRoom;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookingDetails [bookingId=");
		builder.append(bookingId);
		builder.append(", customerName=");
		builder.append(customerName);
		builder.append(", customerAddress=");
		builder.append(customerAddress);
		builder.append(", totalBill=");
		builder.append(totalBill);
		builder.append(", orderDate=");
		builder.append(orderDate);
		builder.append(", bookingStatus=");
		builder.append(bookingStatus);
		builder.append(", hotelId=");
		builder.append(hotelId);
		builder.append(", custRoom=");
		builder.append(Arrays.toString(custRoom));
		builder.append("]");
		return builder.toString();
	}
	

}
