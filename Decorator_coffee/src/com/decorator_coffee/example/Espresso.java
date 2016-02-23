package com.decorator_coffee.example;

/**
 * ����������ࣨŨ�����ȣ�
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
