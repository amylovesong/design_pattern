package com.strategy.sun;

/**
 * �����շ�����
 * 
 * @author sunxiaoling
 * 
 */
public class CashReturn extends CashSuper {
	private double moneyCondition = 0.0d;
	private double moneyReturn = 0.0d;

	/**
	 * �����շѣ���ʼ��ʱ����Ҫ���뷵�������ͷ���ֵ��������300��100����moneyConditionΪ300��moneyReturnΪ100
	 * 
	 * @param moneyCondition
	 *            ��������
	 * @param moneyReturn
	 *            ����ֵ
	 */
	public CashReturn(String moneyCondition, String moneyReturn) {
		this.moneyCondition = Double.parseDouble(moneyCondition);
		this.moneyReturn = Double.parseDouble(moneyReturn);
	}

	@Override
	public double acceptCash(double money) {
		double result = money;
		if (money >= moneyCondition) {
			// Math.floor():����С�ڵ������ֲ�������������������ֽ���������
			result = money - Math.floor(money / moneyCondition) * moneyReturn;
		}
		return result;
	}

}
