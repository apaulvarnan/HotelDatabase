package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Exception.DaoException.CityNotFoundException;
import Exception.DaoException.DaoException;
import entity.Hotels;
import entity.Rooms;
import utility.JdbcConnection;

public class DaoImp implements DaoInterface{
	
	public void insertIntoDB(Hotels details) throws DaoException {
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			con=JdbcConnection.connect();
			String query="insert into Hotel values(?,?,?);";
			stmt=con.prepareStatement(query);
			stmt.setInt(1, details.getHotelId());
			stmt.setString(2, details.getName());
			stmt.setString(3,details.getCity());
			stmt.execute();
			System.out.println("Details added");
		}catch(SQLException e) {
			throw new DaoException("Connection failure"+e);
		
		}
	}
		public void insetIntoDB(Rooms room) throws DaoException{
			Connection con=null;
			PreparedStatement stmt=null;
			try {
				con=JdbcConnection.connect();
				String query="insert into Room values(?,?,?,?);";
				stmt=con.prepareStatement(query);
				stmt.setInt(1, room.getRoomNo());
				stmt.setString(2, room.getRoomType());
				stmt.setInt(3,room.getRoomCost());
				stmt.setInt(4,room.getHotelId());
				stmt.execute();
				System.out.println("Details added");
			}catch(SQLException e) {
				throw new DaoException("Connection failure"+e);
			}
		}

		public void displayHotels(String city) throws CityNotFoundException {
			Connection con=null;
			PreparedStatement stmt=null;
			ResultSet rs=null;
			try {
				con=JdbcConnection.connect();
				String query="select * from hotel join room on hotel.Hotelid=room.hotelId where city=?;";
				stmt=con.prepareStatement(query);
				stmt.setString(1, city);
				rs=stmt.executeQuery();
				if(rs.next()==false) 
					throw new CityNotFoundException("City not found");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4)+
							"  "+rs.getString(5)+"  "+rs.getInt(6)); 
				}
			}catch(SQLException e ) {
				throw new CityNotFoundException("City not found"+e);
			}
				
		}

}
