package project.Usecases;

import java.util.Scanner;

import project.DAO.PoliceDao;
import project.DAO.PoliceDaoImpl;
import project.Model.PoliceBean;

public class RegisterPoliceUsecases {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		int id = sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter email");
		String email = sc.next();
		
		System.out.println("Enter Address.");
		String address = sc.next();
		
		System.out.println("Enter password");
		String password = sc.next();
		
		sc.close();
		
		
		PoliceBean police = new PoliceBean();
		
		police.setId(id);
		police.setAddress(address);
		police.setEmail(email);
		police.setName(name);
		police.setPassword(password);
		
		
		PoliceDao dao = new PoliceDaoImpl() ;
		
		String result = dao.RegisterPolice(police);
		System.out.println(result);
		
		
		
		
	}

}
