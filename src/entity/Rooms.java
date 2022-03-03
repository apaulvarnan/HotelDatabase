package entity;

public class Rooms {
	private int roomNo;
	private String roomType;
	private int roomCost;
	private int hotelId;
	
	public Rooms() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rooms(int roomNo, String roomType, int roomCost,int hotelId) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomCost = roomCost;
		this.setHotelId(hotelId);
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
	public int getRoomCost() {
		return roomCost;
	}
	public void setRoomCost(int roomCost) {
		this.roomCost = roomCost;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	@Override
	public String toString() {
		return "Rooms [roomNo=" + roomNo + ", roomType=" + roomType + ", roomCost=" + roomCost + "]";
	}
	
	

}
