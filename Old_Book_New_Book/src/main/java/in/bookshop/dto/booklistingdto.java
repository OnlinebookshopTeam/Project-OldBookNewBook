package in.bookshop.dto;

import java.io.Serializable;
import java.util.Date;

public class booklistingdto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer isbn;
	private float price;
	private Integer stock;
	private String bookstatus;
	private Integer sellerid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIsbn() {
		return isbn;
	}
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getBookstatus() {
		return bookstatus;
	}
	public void setBookstatus(String bookstatus) {
		this.bookstatus = bookstatus;
	}
	public Integer getSellerid() {
		return sellerid;
	}
	public void setSellerid(Integer sellerid) {
		this.sellerid = sellerid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "booklistingdto [id=" + id + ", isbn=" + isbn + ", price=" + price + ", stock=" + stock + ", bookstatus="
				+ bookstatus + ", sellerid=" + sellerid + "]";
	}
	
	
}