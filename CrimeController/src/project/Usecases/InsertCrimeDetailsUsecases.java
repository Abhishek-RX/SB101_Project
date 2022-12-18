package project.Usecases;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

import project.DAO.CrimeDao;
import project.DAO.CrimeDaoImpl;
import project.Model.CaseBean;

public class InsertCrimeDetailsUsecases {

	public static void main(String[] args) throws ParseException {

	Scanner sc = new Scanner( System.in);
	
	System.out.println("Enter CrimeId");
	int crimeId = sc.nextInt();
	String x =sc.nextLine() ;
	
	System.out.println("Enter Discription. ");
    String discription = sc.nextLine();
    
    System.out.println("Enter victims");
    String victims = sc.nextLine();
    
    System.out.println("Enter Crime Details.");
    String details = sc.nextLine();
    
    System.out.println("Enter Suspects name.");
    String suspects = sc.nextLine();
    
    System.out.println("Enter case Status.");
    boolean status = sc.nextBoolean();
    
    System.out.println("Enter crime_date.");
    String date = sc.nextLine();
    
    Date date1 = (Date) new SimpleDateFormat("dd-MM-yyyy").parse(date);

    
    System.out.println("Enter Place.");
    String place = sc.nextLine();
    
    sc.close();
    
    
    CaseBean  c = new CaseBean();
    
    c.setCrimeId(crimeId);
    c.setDiscription(discription);
    c.setVictims(victims);
    c.setDetails(details);
    c.setSuspects(suspects);
    c.setStatus(status);
    c.setDate(date1);
    c.setPlace(place);
    
    CrimeDao dao = new CrimeDaoImpl();
    
    String res = dao.insertCrimeDetails(c);
    System.out.println(res);
	}

}
