package com.decorator_coffee.example;

/**
 * 具体的饮料类（浓缩咖啡）
 * 
 * @author sunxiaoling
 * 
 */
public class Espresso extends Beverage {
	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
