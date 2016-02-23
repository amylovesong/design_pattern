package com.decorator_coffee.example;

/**
 * ����װ�����ࣨĦ����
 * 
 * @author sunxiaoling
 * 
 */
public class Mocha extends CondimentDecorator {
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
