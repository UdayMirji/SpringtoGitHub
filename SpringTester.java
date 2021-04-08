package com.xworkz.fooddelivery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooddelivery.constants.Cuisine;
import com.xworkz.fooddelivery.constants.FoodType;
import com.xworkz.fooddelivery.constants.ModeOfPayment;
import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.entity.HotelVendorEntity;
import com.xworkz.fooddelivery.services.CustomerService;
import com.xworkz.fooddelivery.services.CustomerServiceImpl;
import com.xworkz.fooddelivery.services.FoodItemServiceImpl;
import com.xworkz.fooddelivery.services.HotelVendorServiceImpl;

public class SpringTester {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("fooddelivary.xml");

		FoodItemServiceImpl service = container.getBean(FoodItemServiceImpl.class);
		FoodItemEntity entity = new FoodItemEntity(1, "idli", 44, FoodType.VEGETERIAN, "5", "noflavor", Cuisine.ANDRA);
		service.validateAndSave(entity);

		CustomerService serviceImpl = (CustomerService) container.getBean(CustomerServiceImpl.class);
		CustomerEntity entity1 = new CustomerEntity("Pavan", "Rajajinagar", 9087654, "pavan@gmail.com",
				ModeOfPayment.CREDITCARD);
		serviceImpl.validateAndSave(entity1);

		HotelVendorServiceImpl serviceImpl2 = container.getBean(HotelVendorServiceImpl.class);
		HotelVendorEntity entity2 = new HotelVendorEntity("Nagarjun", "Jayanagar", 4.5, ModeOfPayment.ONLINE, "good",
				"9008745532");
 		serviceImpl2.validateAndSave(entity2);
 		
	}

}
