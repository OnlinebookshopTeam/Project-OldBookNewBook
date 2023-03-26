package in.bookshop.dto;

import java.io.Serializable;

public class addressdto implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer userid;
	private String addressline1;
	private String addressline2;
	private String city;
	private String state;
	private String country;
	private Integer zipcode;
	private String  shipping_flag;
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
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	public String getShipping_flag() {
		return shipping_flag;
	}
	public void setShipping_flag(String shipping_flag) {
		this.shipping_flag = shipping_flag;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "addressdto [id=" + id + ", userid=" + userid + ", addressline1=" + addressline1 + ", addressline2="
				+ addressline2 + ", city=" + city + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode
				+ ", shipping_flag=" + shipping_flag + "]";
	}
	
}
