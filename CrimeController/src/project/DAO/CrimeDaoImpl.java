package project.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import project.Exceptions.CustomException;
import project.Model.CaseBean;
import project.Utility.DBUtility;

public class CrimeDaoImpl implements CrimeDao {

	@Override
	public String insertCrimeDetails(CaseBean crime) {
		String message = "Not saved..!";
		try( Connection conn= DBUtility.provideConnection()){
			
			 PreparedStatement ps= conn.prepareStatement("insert into crime values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, crime.getCrimeId());
			ps.setString(2, crime.getDiscription());
			ps.setString(3, crime.getVictims());
			ps.setString(4, crime.getDetails());
			ps.setString(5, crime.getSuspects());
			ps.setBoolean(6, crime.isStatus());
			ps.setDate(7,crime.getDate());
			ps.setString(8, crime.getPlace());
			
		int x =	ps.executeUpdate();
			if(x>0) {
				message = "Data saved successfully.";
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return message;
	}

	@Override
	public CaseBean crimeDetailsByMonth() throws CustomException {
		CaseBean c = null;
		
		
		try(Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select * from crime group by month(date)");
		ResultSet rs=	ps.executeQuery();
		
		while(rs.next()) {
			
			c= new CaseBean();
			
			c.setCrimeId(rs.getInt("CrimeId"));
			c.setDiscription(null);
			c.setDate(rs.getDate("date"));
			c.setDetails(rs.getString("details"));
			c.setPlace(rs.getString("place"));
			c.setSuspects(rs.getString("suspects"));
			c.setVictims(rs.getString("victims"));
			c.setStatus(rs.getBoolean("status"));
		}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return c;
	}

	
	
	
	
}
