package com.strategy.sun;

/**
 * �����շ�����
 * 
 * @author sunxiaoling
 * 
 */
public class CashRebate extends CashSuper {
	/** �ۿ��� */
	private double moneyRebate = 1d;

	/**
	 * �����շѣ���ʼ��ʱ������Ҫ�����ۿ���
	 * 
	 * @param moneyRebate
	 *            �ۿ���
	 */
	public CashRebate(String moneyRebate) {
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}

	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}

}
