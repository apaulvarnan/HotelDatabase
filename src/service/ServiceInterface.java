package service;

import Exception.ServiceException.ServiceException;

public interface ServiceInterface {

	public void getHotelDetails() throws ServiceException;
    public void getRoomDetails() throws ServiceException;
 
	public void display() throws  ServiceException;
	

}
