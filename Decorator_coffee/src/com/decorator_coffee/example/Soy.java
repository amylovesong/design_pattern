package com.decorator_coffee.example;

/**
 * ����װ�����ࣨSoy��
 * 
 * @author sunxiaoling
 * 
 */
public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
