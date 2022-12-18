package project.DAO;

import java.sql.Date;

import project.Exceptions.CustomException;
import project.Model.CaseBean;

public interface CrimeDao {

	
	
	public String insertCrimeDetails(CaseBean crime) ;
	public CaseBean crimeDetailsByMonth() throws CustomException;
		
	
}
