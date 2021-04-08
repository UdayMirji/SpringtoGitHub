package com.xworkz.fooddelivery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;
import com.xworkz.fooddelivery.constants.ModeOfPayment;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "hotel_vender")
public class HotelVendorEntity {
	@Id
	@NotNull
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "RATING")
	private double rating;
	@Column(name = "PAYEMENT")
	private ModeOfPayment payment;
	@Column(name = "FEEDBACK")
	private String feedback;
	@Column(name = "PHONE_NUMBER")
	private String contctNumber;

	public HotelVendorEntity(int id, String name, String location, double rating, ModeOfPayment payment,
			String feedback, String contctNumber) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.payment = payment;
		this.feedback = feedback;
		this.contctNumber = contctNumber;
	}

	@Override
	public String toString() {
		return "HotelVendorEntity [id=" + id + ", name=" + name + ", location=" + location + ", rating=" + rating
				+ ", payment=" + payment + ", feedback=" + feedback + ", contctNumber=" + contctNumber + "]";
	}

}
