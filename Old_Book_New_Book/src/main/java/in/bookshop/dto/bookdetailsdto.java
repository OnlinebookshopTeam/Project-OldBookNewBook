package in.bookshop.dto;

import java.io.Serializable;
import java.util.Date;

public class bookdetailsdto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer isbn;
	private String bookname;
	private String category;
	private String authorname;
	private String publishername;
	private Integer weight;
	public Integer getIsbn() {
		return isbn;
	}
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getPublishername() {
		return publishername;
	}
	public void setPublishername(String publishername) {
		this.publishername = publishername;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "bookdetailsdto [isbn=" + isbn + ", bookname=" + bookname + ", category=" + category + ", authorname="
				+ authorname + ", publishername=" + publishername + ", weight=" + weight + "]";
	}
	
}