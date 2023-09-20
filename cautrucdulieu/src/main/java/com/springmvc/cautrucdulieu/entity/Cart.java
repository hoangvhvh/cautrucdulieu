package com.springmvc.cautrucdulieu.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cart")
public class Cart {
   
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
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="cart_detail_id")
	private CartDetail cartDetail;
	
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
	 * @return the cartDetail
	 */
	public CartDetail getCartDetail() {
		return cartDetail;
	}

	/**
	 * @param cartDetail the cartDetail to set
	 */
	public void setCartDetail(CartDetail cartDetail) {
		this.cartDetail = cartDetail;
	}
	
	@OneToMany(mappedBy = "cart")
    private List<CartDetail> cartDetails = new ArrayList<>();
	
}
