package com.springmvc.cautrucdulieu.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="product_tag")
public class ProductTag {
   
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
    @Column(name = "product_tag_id")
	 private int id;
	
    @Column(name = "name")
	 private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    @ManyToMany
    @JoinTable(
        name = "product_product_tag",
        joinColumns = @JoinColumn(name = "product_tag_id"),
        inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products = new ArrayList<>();
    
}
