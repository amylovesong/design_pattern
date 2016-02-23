package com.strategy.sun;

/**
 * 打折收费子类
 * 
 * @author sunxiaoling
 * 
 */
public class CashRebate extends CashSuper {
	/** 折扣率 */
	private double moneyRebate = 1d;

	/**
	 * 打折收费，初始化时，必须要输入折扣率
	 * 
	 * @param moneyRebate
	 *            折扣率
	 */
	public CashRebate(String moneyRebate) {
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}

	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}

}
