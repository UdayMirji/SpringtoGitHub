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
@Table(name = "custimer_entity")

public class CustomerEntity {
	@Id
	@Column(name = "ID")
	@NotNull
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "PHONE_NUMBER")
	private int phoneNumber;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "PAYMENT")
	private ModeOfPayment payment;

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", location=" + location + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", payment=" + payment + "]";
	}

	public CustomerEntity(int id, String name, String location, int phoneNumber, String email, ModeOfPayment payment) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.payment = payment;
	}

}
