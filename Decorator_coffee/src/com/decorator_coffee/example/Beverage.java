package com.decorator_coffee.example;

/**
 * ÒûÁÏ³éÏóÀà
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Beverage {
	String description = "Unknow Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
