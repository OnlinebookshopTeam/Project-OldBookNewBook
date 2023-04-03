package in.bookshop.dto;

import java.io.Serializable;
import java.util.Date;

public class bookratingdto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer isbn;
	private Integer rating;
	private Integer userid;
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
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "bookratingdto [id=" + id + ", isbn=" + isbn + ", rating=" + rating + ", userid=" + userid + "]";
	}
	
	
}