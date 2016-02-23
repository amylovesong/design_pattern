package com.decorator_coffee.example;

/**
 * 具体的饮料类（综合咖啡）
 * 
 * @author sunxiaoling
 * 
 */
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "HouseBlend";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
