package in.bookshop.dto;

import java.io.Serializable;

import java.util.Date;

public class paymentdto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer userid;
	private String payment_type;
	private Integer cardnumber;
	private Integer cvv;
	private Date expirydate;
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
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public Integer getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(Integer cardnumber) {
		this.cardnumber = cardnumber;
	}
	public Integer getCvv() {
		return cvv;
	}
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	public Date getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
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
		return "paymentdto [id=" + id + ", userid=" + userid + ", payment_type=" + payment_type + ", cardnumber="
				+ cardnumber + ", cvv=" + cvv + ", expirydate=" + expirydate + ", status=" + status + "]";
	}

}
