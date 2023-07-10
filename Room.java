package onlinehotelroombooking;

public class Room {
	
	private int roomNo;
	private String roomType;
	private double roomFare;
	private boolean roomStatus = false;
	public Room(int roomNo, String roomType, double roomFare) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomFare = roomFare;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getRoomFare() {
		return roomFare;
	}
	public void setRoomFare(double roomFare) {
		this.roomFare = roomFare;
	}
	public boolean isRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(boolean roomStatus) {
		this.roomStatus = roomStatus;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Room [roomNo=");
		builder.append(roomNo);
		builder.append(", roomType=");
		builder.append(roomType);
		builder.append(", roomFare=");
		builder.append(roomFare);
		builder.append(", roomStatus=");
		builder.append(roomStatus);
		builder.append("]");
		return builder.toString();
	}
	

}
