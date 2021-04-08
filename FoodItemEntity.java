package com.xworkz.fooddelivery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;
import com.xworkz.fooddelivery.constants.Cuisine;
import com.xworkz.fooddelivery.constants.FoodType;

import lombok.NoArgsConstructor;

@Entity

@NoArgsConstructor

@Table(name = "food_item")
public class FoodItemEntity {

	public FoodItemEntity(int id, String name, double price, FoodType type, String rating, String flavor,
			Cuisine cuisine) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.rating = rating;
		this.flavor = flavor;
		this.cuisine = cuisine;
	}

	public String toString() {
		return "FoodItemEntity [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", rating="
				+ rating + ", flavor=" + flavor + ", cuisine=" + cuisine + "]";
	}

	@Id
	@NotNull
	@Column(name = "FID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "TYPE")
	private FoodType type;

	@Column(name = "RATING")
	private String rating;

	@Column(name = "FLAVOR")
	private String flavor;

	@Column(name = "CUISINE")
	private Cuisine cuisine;

}
