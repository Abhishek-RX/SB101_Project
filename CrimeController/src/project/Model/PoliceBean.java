package project.Model;

public class PoliceBean {

	@Override
	public String toString() {
		return "PoliceBean [id=" + id + ", name=" + name + ", email=" + email + ", Address=" + Address + ", caseId="
				+ caseId + ", password=" + password + "]";
	}
	
	public PoliceBean() {
		
	}
	public PoliceBean(int id, String name, String email, String address, int caseId, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		Address = address;
		this.caseId = caseId;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getCaseId() {
		return caseId;
	}
	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private int id;
	private String name;
	private String email;
	private String Address;
	private  int caseId;
	private String password ;
	
	
	
}
