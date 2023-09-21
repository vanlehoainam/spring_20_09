package pxu.com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cart;

	private Date date;
	private String status;

	
	public Cart(int id_cart, Date date, String status) {
		super();
		this.id_cart = id_cart;
		this.date = date;
		this.status = status;
	}


	public int getId_cart() {
		return id_cart;
	}


	public void setId_cart(int id_cart) {
		this.id_cart = id_cart;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Cart() {
		super();
	}

}
