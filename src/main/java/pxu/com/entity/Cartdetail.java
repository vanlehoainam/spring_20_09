package pxu.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cartdetail")
public class Cartdetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cartdetail;

	private int quantity;
	private float price;

	@ManyToOne
	@JoinColumn(name = "id_cart", referencedColumnName = "id_cart")
	private Cart cart;

	@ManyToOne
	@JoinColumn(name = "id_product", referencedColumnName = "id_product")
	private Product product;

	public int getId_cartdetail() {
		return id_cartdetail;
	}

	public Cartdetail(int id_cartdetail, int quantity, float price, Cart cart, Product product) {
		super();
		this.id_cartdetail = id_cartdetail;
		this.quantity = quantity;
		this.price = price;
		this.cart = cart;
		this.product = product;
	}

	public void setId_cartdetail(int id_cartdetail) {
		this.id_cartdetail = id_cartdetail;
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

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Cartdetail() {
		super();
	}

}
