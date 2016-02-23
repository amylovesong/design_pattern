package com.decorator_coffee.example;

/**
 * ����װ�����ࣨWhip��
 * 
 * @author sunxiaoling
 * 
 */
public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
