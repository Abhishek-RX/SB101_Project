package project.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Result;

import project.Model.PoliceBean;
import project.Utility.DBUtility;

public class PoliceDaoImpl implements PoliceDao {

	@Override
	public String RegisterPolice(PoliceBean police) {
		String message = "Not registered...!";
		
		try(Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("insert into police (id,name,email,Address,password) values(?,?,?,?,?)");
			
			ps.setInt(1, police.getId());
			ps.setString(2, police.getName());
			ps.setString(3, police.getEmail());
			ps.setString(4, police.getAddress());
			ps.setString(5, police.getPassword());
			
			int x =ps.executeUpdate();
			if(x>0) {
				message = "Registered Successfully.";
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return message;
	}

	@Override
	public PoliceBean Login(String email, String password) {
		PoliceBean police  = null;
		
		try(Connection conn = DBUtility.provideConnection()){
			
		PreparedStatement ps=	conn.prepareStatement("select * from police where email=? AND password = ?");
			ps.setString(1, email);
			ps.setString(2, password);
            ResultSet rs =ps.executeQuery();
      
			if(rs.next()) {
			
				
			 police = new PoliceBean();
			 
			 police.setEmail(rs.getString("email"));
			 police.setId(rs.getInt("id"));
			 police.setAddress(rs.getString("address"));
			 police.setCaseId(rs.getInt("caseID"));
			 police.setName(rs.getString("name"));
			 police.setPassword(rs.getString("password"));
			 
			}else {
				System.out.println("Invalid Credentials");
			}
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return police;
	}

	
	
}
