package com.mediator.example;

//联合国安全理事会
public class UnitedNationsSecurityCouncil extends UnitedNations {
	private USA colleague1;
	private Iraq colleague2;

	// 联合国安理会了解所有的国家，所以拥有美国和伊拉克的对象属性
	// 美国
	public void setUSA(USA value) {
		colleague1 = value;
	}

	// 伊拉克
	public void setIraq(Iraq value) {
		colleague2 = value;
	}

	// 声明
	// 重写“声明”方法，实现了两个对象间的通信
	@Override
	public void declare(String message, Country colleague) {
		if (colleague == colleague1) {
			colleague2.getMessage(message);
		} else {
			colleague1.getMessage(message);
		}
	}

}
