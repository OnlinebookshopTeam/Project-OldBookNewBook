package in.bookshop.dto;

import java.io.Serializable;
import java.util.Date;

public class sellerdto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer userid;
	private Integer banknumber;
	private Integer accountnumber;
	private String status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getBanknumber() {
		return banknumber;
	}
	public void setBanknumber(Integer banknumber) {
		this.banknumber = banknumber;
	}
	public Integer getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(Integer accountnumber) {
		this.accountnumber = accountnumber;
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
		return "sellerdto [id=" + id + ", userid=" + userid + ", banknumber=" + banknumber + ", accountnumber="
				+ accountnumber + ", status=" + status + "]";
	}
	
}