package com.strategy.sun;

/**
 * 现金收费抽象类
 * 
 * @author sunxiaoling
 * 
 */
public abstract class CashSuper {
	/**
	 * 收取现金
	 * 
	 * @param money
	 *            原价
	 * @return 当前价
	 */
	public abstract double acceptCash(double money);
}
