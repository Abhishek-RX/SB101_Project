package project.Model;

import java.sql.Date;

public class CaseBean {

	private int crimeId;
	public CaseBean(int crimeId, String discription, String victims, String details, String suspects, boolean status,
			Date date, String place) {
		super();
		this.crimeId = crimeId;
		this.discription = discription;
		this.victims = victims;
		this.details = details;
		this.suspects = suspects;
		this.status = status;
		this.date = date;
		this.place = place;
	}
	
	public CaseBean() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CaseBean [crimeId=" + crimeId + ", discription=" + discription + ", victims=" + victims + ", details="
				+ details + ", suspects=" + suspects + ", status=" + status + ", date=" + date + ", place=" + place
				+ "]";
	}
	public int getCrimeId() {
		return crimeId;
	}
	public void setCrimeId(int crimeId) {
		this.crimeId = crimeId;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public String getVictims() {
		return victims;
	}
	public void setVictims(String victims) {
		this.victims = victims;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getSuspects() {
		return suspects;
	}
	public void setSuspects(String suspects) {
		this.suspects = suspects;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	private String discription;
	private String   victims;
	private  String details;
	private String suspects;
	private boolean status;
	private Date date;
	private String place;
	
	
	
}
