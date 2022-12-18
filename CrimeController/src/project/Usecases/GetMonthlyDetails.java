package project.Usecases;

import project.DAO.CrimeDao;
import project.DAO.CrimeDaoImpl;
import project.Exceptions.CustomException;
import project.Model.CaseBean;

public class GetMonthlyDetails {

	public static void main(String[] args) {

		
		CrimeDao dao = new CrimeDaoImpl();
		try {
			CaseBean c = dao.crimeDetailsByMonth();
			System.out.println(c);
		} catch (CustomException e) {
			e.printStackTrace();
		}
		
		
	}

}
