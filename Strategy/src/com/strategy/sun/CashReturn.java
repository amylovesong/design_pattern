package com.strategy.sun;

/**
 * 返利收费子类
 * 
 * @author sunxiaoling
 * 
 */
public class CashReturn extends CashSuper {
	private double moneyCondition = 0.0d;
	private double moneyReturn = 0.0d;

	/**
	 * 返利收费，初始化时必须要输入返利条件和返利值。比如满300返100，则moneyCondition为300，moneyReturn为100
	 * 
	 * @param moneyCondition
	 *            返利条件
	 * @param moneyReturn
	 *            返利值
	 */
	public CashReturn(String moneyCondition, String moneyReturn) {
		this.moneyCondition = Double.parseDouble(moneyCondition);
		this.moneyReturn = Double.parseDouble(moneyReturn);
	}

	@Override
	public double acceptCash(double money) {
		double result = money;
		if (money >= moneyCondition) {
			// Math.floor():返回小于等于数字参数的最大整数，对数字进行下舍入
			result = money - Math.floor(money / moneyCondition) * moneyReturn;
		}
		return result;
	}

}
