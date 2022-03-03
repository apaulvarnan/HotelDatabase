package dao;

import java.sql.ResultSet;

import Exception.DaoException.CityNotFoundException;
import Exception.DaoException.DaoException;
import entity.Hotels;
import entity.Rooms;

public interface DaoInterface {
	public void insertIntoDB(Hotels details) throws DaoException;
	public void insetIntoDB(Rooms room) throws DaoException;
	public void displayHotels(String city) throws  CityNotFoundException;

}
