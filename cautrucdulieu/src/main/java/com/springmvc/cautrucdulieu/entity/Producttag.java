package com.springmvc.cautrucdulieu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "producttag")
public class Producttag {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producttag")
	private int id_producttag;

	@Column(name = "tag_name")
	private String tag_name;

	@Column(name = "product_description")
	private String product_description;

	@ManyToOne
	@JoinColumn(name = "id_product", referencedColumnName = "id_product")
	private Product product;

	public int getId_producttag() {
		return id_producttag;
	}

	public void setId_producttag(int id_producttag) {
		this.id_producttag = id_producttag;
	}

	public String getTag_name() {
		return tag_name;
	}

	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Producttag(int id_producttag, String tag_name, String product_description, Product product) {
		super();
		this.id_producttag = id_producttag;
		this.tag_name = tag_name;
		this.product_description = product_description;
		this.product = product;
	}

	public Producttag() {
		super();
	}

}
