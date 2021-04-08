package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.constants.Cuisine;
import com.xworkz.fooddelivery.constants.FoodType;
import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.repository.FoodItemRepo;
import com.xworkz.fooddelivery.repository.FoodItemRepoImpl;
import com.xworkz.fooddelivery.services.FoodItemService;
import com.xworkz.fooddelivery.services.FoodItemServiceImpl;

public class FoodItemTester {

	public static void main(String[] args) {
		
		FoodItemEntity entity = new FoodItemEntity(2,"vegbiriyani",99, FoodType.VEGETERIAN, "4.6", "biriyani", Cuisine.RAJASTANI);
		FoodItemRepo repository = new FoodItemRepoImpl();
		FoodItemService service = new FoodItemServiceImpl(repository);
		service.validateAndSave(entity);
	}

}
