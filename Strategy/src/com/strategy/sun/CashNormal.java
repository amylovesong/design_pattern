package com.strategy.sun;

/**
 * �����շ�����
 * 
 * @author sunxiaoling
 * 
 */
public class CashNormal extends CashSuper {

	/**
	 * �����շѣ�����ԭ��
	 */
	@Override
	public double acceptCash(double money) {
		return money;
	}

}
