package com.mediator.example;

//�����ࡣ�൱��Colleague��
public abstract class Country {
	protected UnitedNations mediator;

	public Country(UnitedNations mediator) {
		this.mediator = mediator;
	}
}
