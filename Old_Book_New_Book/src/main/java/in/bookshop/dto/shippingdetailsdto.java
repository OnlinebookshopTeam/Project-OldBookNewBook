package in.bookshop.dto;

import java.io.Serializable;
import java.util.Date;

public class shippingdetailsdto  implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer orderid;
	private Date shippingdate;
	private String shipname;
	private Integer trackingno;
	private String shipaddressline1;
	private String shipaddressline2;
	private String city;
	private String state;
	private String country;
	private Integer zipcode;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public Date getShippingdate() {
		return shippingdate;
	}
	public void setShippingdate(Date shippingdate) {
		this.shippingdate = shippingdate;
	}
	public String getShipname() {
		return shipname;
	}
	public void setShipname(String shipname) {
		this.shipname = shipname;
	}
	public Integer getTrackingno() {
		return trackingno;
	}
	public void setTrackingno(Integer trackingno) {
		this.trackingno = trackingno;
	}
	public String getShipaddressline1() {
		return shipaddressline1;
	}
	public void setShipaddressline1(String shipaddressline1) {
		this.shipaddressline1 = shipaddressline1;
	}
	public String getShipaddressline2() {
		return shipaddressline2;
	}
	public void setShipaddressline2(String shipaddressline2) {
		this.shipaddressline2 = shipaddressline2;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "shippingdetailsdto [id=" + id + ", orderid=" + orderid + ", shippingdate=" + shippingdate
				+ ", shipname=" + shipname + ", trackingno=" + trackingno + ", shipaddressline1=" + shipaddressline1
				+ ", shipaddressline2=" + shipaddressline2 + ", city=" + city + ", state=" + state + ", country="
				+ country + ", zipcode=" + zipcode + "]";
	}
	
}