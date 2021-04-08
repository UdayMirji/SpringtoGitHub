package com.xworkz.fooddelivery.services;

import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.repository.FoodItemRepo;
import com.xworkz.fooddelivery.repository.FoodItemRepoImpl;

public class FoodItemServiceImpl implements FoodItemService {
	private FoodItemRepo repository ;
	public FoodItemServiceImpl(FoodItemRepo repository) {
		super();
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.repository = repository;
	}
	

	@Override
	public boolean validateAndSave(FoodItemEntity entity) {
		System.out.println("invoked validateAndSave "+this.getClass().getSimpleName());
		if (null != entity) {
			System.out.println("entity is valid" + entity);
			repository.save(entity);
		} else {
			System.out.println("entity is invalid");
		}
		return false;
	}





}
