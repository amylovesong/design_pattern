package com.strategy.sun;

/**
 * 正常收费子类
 * 
 * @author sunxiaoling
 * 
 */
public class CashNormal extends CashSuper {

	/**
	 * 正常收费，返回原价
	 */
	@Override
	public double acceptCash(double money) {
		return money;
	}

}
