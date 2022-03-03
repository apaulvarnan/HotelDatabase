package service;

import java.util.List;
import java.util.Scanner;
import Exception.DaoException.CityNotFoundException;
import Exception.DaoException.DaoException;
import Exception.ServiceException.ServiceException;
import dao.DaoImp;
import dao.DaoInterface;
import entity.Hotels;
import entity.Rooms;
public class ServiceImp implements ServiceInterface{
	DaoInterface obj = new DaoImp();
	static Scanner sc = new Scanner(System.in);

	public void getHotelDetails() throws ServiceException{

		System.out.println("Enter the hotel ID");
		int id=sc.nextInt();
		System.out.println("Enter the hotel name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter city");
		String city=sc.next();
		Hotels details=new Hotels(id,name,city);
		try{
			obj.insertIntoDB(details);
		}catch(DaoException e) {
			throw new ServiceException("Insertion failure"+e);
		}
	}
	
	public void getRoomDetails() throws ServiceException {
	
	System.out.println("Enter the room number");
	int num=sc.nextInt();
	System.out.println("Enter the room type(luxury/semi luxury/deluxe)");
	sc.nextLine();
	String type=sc.nextLine();
	int cost=getCost(type);
	System.out.println("Enter the hotel ID");
	int hotelid=sc.nextInt();
	Rooms room=new Rooms(num,type,cost,hotelid);
	try {
		obj.insetIntoDB(room);
	}catch(DaoException e) {
		throw new ServiceException("Insertion failure"+e);
	}
	
}

   public int getCost(String type) {
	if(type.compareTo("luxury")==0)
		return 3000;
	if(type.compareTo("semi luxury")==0)
		return 2000;
	if(type.compareTo("deluxe")==0)
		return 1000;
	return 0;
}
	
	public void display() throws ServiceException {
		System.out.println("Enter city");
		String city=sc.nextLine();
		try {
			obj.displayHotels(city);
		} catch (CityNotFoundException e) {
			throw new ServiceException("Insertion failure"+e);
		
		}
	}


}
