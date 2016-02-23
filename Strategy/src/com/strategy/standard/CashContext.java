package com.strategy.standard;

import com.strategy.sun.CashSuper;

/**
 * Context类，用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用
 * 
 * @author sunxiaoling
 * 
 */
public class CashContext {
	private CashSuper cSuper;

	/**
	 * 初始化时传入具体的策略对象。这里传入的是具体的收费策略
	 * 
	 * @param cSuper
	 */
	public CashContext(CashSuper cSuper) {
		this.cSuper = cSuper;
	}

	/**
	 * 根据具体的策略对象，调用其算法的方法。由于实例化不同的策略，所以最终得到的结果也不尽相同
	 * 
	 * @param money
	 * @return
	 */
	public double getResult(double money) {
		// 根据收费策略的不同，获得不同的计算结果
		return cSuper.acceptCash(money);
	}

}
