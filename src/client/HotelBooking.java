package client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Exception.ServiceException.ServiceException;
import entity.Hotels;
import service.ServiceImp;

public class HotelBooking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		boolean condition = true;
		ServiceImp ob = new ServiceImp();
		List<Hotels> hotl = new ArrayList<Hotels>();
		while(condition) {
			System.out.println("------------------------------");
			System.out.println("1.insert details \n2.Get list of rooms \n3.display all\n4.Exit");
			System.out.println("-------------------------------");
			System.out.println("enter choice");
			choice = sc.nextInt();
			switch(choice) 
			{
			case 1:
				
				try {
					ob.getHotelDetails();
				} catch (ServiceException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					ob.getRoomDetails();
				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					ob.display();
				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("Thank you for hotel booking services");
				condition = false;
				break;
			default:
				System.out.println("invalid choice");
				}
		}
		
	}

}
