package com.decorator_coffee.example;

/**
 * ���ϳ�����
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
