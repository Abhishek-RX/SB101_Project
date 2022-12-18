package project.DAO;

import project.Model.CaseBean;
import project.Model.PoliceBean;

public interface PoliceDao {

	public String RegisterPolice(PoliceBean police);
	public PoliceBean Login(String email, String password);
	public CaseBean AssignCaseToPolice(int id,int caseId);
	
}
