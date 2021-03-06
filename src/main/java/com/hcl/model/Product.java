package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product_ecom")
public class Product {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="prd_id")
	private Integer id;
	@Column(name="prd_name")
	private String name;
	@Column(name="prd_price")
	private float price;

}
