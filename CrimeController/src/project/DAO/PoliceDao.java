package project.DAO;

import project.Model.PoliceBean;

public interface PoliceDao {

	public String RegisterPolice(PoliceBean police);
	public PoliceBean Login(String email, String password);
	
}
