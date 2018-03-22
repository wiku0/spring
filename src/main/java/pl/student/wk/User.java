package pl.student.wk;

import javax.persistence.*;



@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@Column	
	private String frstname;
	private String lstname;
	private String email;
	private String telno;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrstname() {
		return frstname;
	}
	public void setFrstname(String frstname) {
		this.frstname = frstname;
	}
	public String getLstname() {
		return lstname;
	}
	public void setLstname(String lstname) {
		this.lstname = lstname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	
	
	
	
	
	

	
	
	
	
	
	

	
	
	

}
