package project.Usecases;

import java.util.Scanner;

import project.DAO.PoliceDao;
import project.DAO.PoliceDaoImpl;
import project.Model.CaseBean;

public class RegPoliceToCaseUsecases {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Police ID..");
		int id = sc.nextInt();
		System.out.println("Enter Crime ID");
		int cId = sc.nextInt();
		
		sc.close();
		
		
		PoliceDao  dao = new PoliceDaoImpl();
		CaseBean bean = dao.AssignCaseToPolice(id, cId);
		if(bean != null){
			System.out.println(bean);
		}
		
	}

}
