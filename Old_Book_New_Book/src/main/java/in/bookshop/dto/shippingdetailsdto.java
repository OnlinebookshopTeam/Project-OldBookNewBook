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
	private String country;
	private Integer zipcode;
}