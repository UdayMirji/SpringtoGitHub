package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.constants.ModeOfPayment;
import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.repository.CustomerRepo;
import com.xworkz.fooddelivery.repository.CustomerRepoImpl;
import com.xworkz.fooddelivery.services.CustomerService;
import com.xworkz.fooddelivery.services.CustomerServiceImpl;
import com.xworkz.fooddelivery.services.FoodItemService;
import com.xworkz.fooddelivery.services.FoodItemServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {

		CustomerEntity entity = new CustomerEntity(2,"kiran", "nagarabhavi", 765465213, "kiran@gmail.com",
				ModeOfPayment.DEBITCARD);
		CustomerRepo repository = new CustomerRepoImpl();
		CustomerService service = new CustomerServiceImpl(repository);
		service.validateAndSave(entity);

	}

}
