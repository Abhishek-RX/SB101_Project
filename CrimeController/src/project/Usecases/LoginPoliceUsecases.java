package project.Usecases;

import java.util.Scanner;

import project.DAO.PoliceDao;
import project.DAO.PoliceDaoImpl;
import project.Model.PoliceBean;

public class LoginPoliceUsecases {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email");
		String email = sc.next();
		
		System.out.println("Enter password");
		String password = sc.next();
		
		sc.close();
		
		PoliceDao dao = new PoliceDaoImpl();
		PoliceBean police =dao.Login(email, password);
		
		if(police !=null) {
	    System.out.println("|====================================================|");
	
		System.out.println("ID is :"+police.getId());
		System.out.println("Name :"+police.getName());
		
		System.out.println("Email :"+police.getEmail());
		System.out.println("Address :"+police.getAddress());
		if(police.getCaseId() == 0) {
			String caseID = "Not Assigned to any case .";
			System.out.println("CaseID :"+caseID);	
		}else {
		System.out.println("CaseID :"+police.getCaseId());
		}
		System.out.println("|====================================================|");
		}
		
		else {
			System.out.println("Details not found...!");
		}
	}

}
