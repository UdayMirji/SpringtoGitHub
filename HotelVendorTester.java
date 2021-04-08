package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.constants.ModeOfPayment;
import com.xworkz.fooddelivery.entity.HotelVendorEntity;
import com.xworkz.fooddelivery.repository.HotelVendorRepo;
import com.xworkz.fooddelivery.repository.HotelVendorRepoImpl;
import com.xworkz.fooddelivery.services.HotelVendorServiceImpl;
import com.xworkz.fooddelivery.services.HotelVendorSevice;

public class HotelVendorTester {

	public static void main(String[] args) {
		HotelVendorEntity entity = new HotelVendorEntity(2,"b2cofee", "vijayanagr", 3.5, ModeOfPayment.CASH, "ok",
				"8907645532");
		HotelVendorRepo repository = new HotelVendorRepoImpl();
		HotelVendorSevice service = new HotelVendorServiceImpl(repository);
		service.validateAndSave(entity);

	}

}
