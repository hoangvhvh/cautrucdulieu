package com.springmvc.cautrucdulieu.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="cart_detail")
public class CartDetail {
    
	public CartDetail() {
		// TODO Auto-generated constructor stub
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cart")
	private int idcart;
    
	@Column(name = "quantity")
	private float quantity;
	
	@Column(name = "price")
	private float price;
	
	@Column(name = "totalprice")
	private float totalprice;
	
	    @ManyToOne
	    @JoinColumn(name = "cart_id")
		@OneToOne(mappedBy="cartDetail",cascade= CascadeType.ALL)
	    private Cart cart;

	    @ManyToOne
	    @JoinColumn(name = "product_id")
	    private Product product;
	
	public int getIdcart() {
		return idcart;
	}
	public void setIdcart(int idcart) {
		this.idcart = idcart;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}
	
	/**
	 * @param cart the cart to set
	 */
	public void setCart(Cart cart) {
		this.cart = cart;
	}

	 
}
