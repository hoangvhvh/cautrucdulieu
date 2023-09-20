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
@Table(name="order_detail")
public class OrderDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_order")
	private int idorder;
    
	@Column(name = "orderdate")
	private String orderdate;
	
	@Column(name = "totalprice")
	private float totalprice;
	
	@Column(name = "address")
	private String address;
	
	  @ManyToOne
	  @JoinColumn(name = "order_id")
	  @OneToOne(mappedBy="orderDetail",cascade= CascadeType.ALL)
	    private Order order;

	    @ManyToOne
	    @JoinColumn(name = "product_id")
	    private Product product;
	    
	public int getIdorder() {
		return idorder;
	}

	public void setIdorder(int idorder) {
		this.idorder = idorder;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public float getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

}
