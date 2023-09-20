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
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "order")
public class Order {
    
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
    
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="order_detail_id")
	private OrderDetail orderDetail;
	
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
	 * @return the instructorDetail
	 */
	public OrderDetail getOrderDetail() {
		return orderDetail;
	}

	/**
	 * @param instructorDetail the instructorDetail to set
	 */
	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}
	
	@OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails = new ArrayList<>();

}
