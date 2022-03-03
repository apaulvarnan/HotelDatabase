package entity;

import java.util.List;

public class Hotels {
	private int hotelId;
	private String name;
	private List<Rooms> room;
	private String city;
	
	public Hotels() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotels(int hotelId, String name,  String city) {
		super();
		this.hotelId = hotelId;
		this.name = name;
		this.city = city;
	}

	

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Rooms> getRoom() {
		return room;
	}

	public void setRoom(List<Rooms> room) {
		this.room = room;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
