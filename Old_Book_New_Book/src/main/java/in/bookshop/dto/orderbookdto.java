package in.bookshop.dto;

import java.io.Serializable;
import java.util.Date;

public class orderbookdto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer userid;
	private Integer bookid;
	private Integer quantity;
	private Integer shipping;
	private Integer totalamount;
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
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getShipping() {
		return shipping;
	}
	public void setShipping(Integer shipping) {
		this.shipping = shipping;
	}
	public Integer getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(Integer totalamount) {
		this.totalamount = totalamount;
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
		return "orderbookdto [id=" + id + ", userid=" + userid + ", bookid=" + bookid + ", quantity=" + quantity
				+ ", shipping=" + shipping + ", totalamount=" + totalamount + ", status=" + status + "]";
	}
	
}
