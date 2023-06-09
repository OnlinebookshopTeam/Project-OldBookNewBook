package in.bookshop.dto;

import java.io.Serializable;
import java.util.Date;

public class userdto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String email;
	private String password;
	private String firstname;
	private String lastname;
	private String emailverified;
	private Date createddate;
	private String status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailverified() {
		return emailverified;
	}
	public void setEmailverified(String emailverified) {
		this.emailverified = emailverified;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "userdto [id=" + id + ", email=" + email + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", emailverified=" + emailverified + ", createddate=" + createddate
				+ ", status=" + status + "]";
	}
	
	}	

