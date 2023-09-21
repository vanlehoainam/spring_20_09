package pxu.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetail")
public class Orderdetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_orderdetail;

	private int quantity;
	private float price;

	@ManyToOne
	@JoinColumn(name = "id_order", referencedColumnName = "id_order")
	private Orderr orderr;
	
	
	@ManyToOne
	@JoinColumn(name = "id_product", referencedColumnName = "id_product")
	private Product product;


	public int getId_orderdetail() {
		return id_orderdetail;
	}


	public void setId_orderdetail(int id_orderdetail) {
		this.id_orderdetail = id_orderdetail;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public Orderr getOrderr() {
		return orderr;
	}


	public void setOrderr(Orderr orderr) {
		this.orderr = orderr;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public Orderdetail(int id_orderdetail, int quantity, float price, Orderr orderr, Product product) {
		super();
		this.id_orderdetail = id_orderdetail;
		this.quantity = quantity;
		this.price = price;
		this.orderr = orderr;
		this.product = product;
	}


	public Orderdetail() {
		super();
	}
	
	
}
