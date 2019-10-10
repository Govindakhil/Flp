package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name = "MyCartItem")
public class Cartitem {

	@Id
	@SequenceGenerator(name = "myseq", initialValue = 1023641, allocationSize = 1)
	@GeneratedValue(generator = "myseq", strategy = GenerationType.SEQUENCE)
	private Integer cartId;

	private Integer productId;

	private Integer customerId;

	@Min(1)
	private int quantity;

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Integer getCartId() {
		return cartId;
	}

}
