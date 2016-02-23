package com.strategy.standard;

import com.strategy.sun.CashSuper;

/**
 * Context�࣬��һ��ConcreteStrategy�����ã�ά��һ����Strategy���������
 * 
 * @author sunxiaoling
 * 
 */
public class CashContext {
	private CashSuper cSuper;

	/**
	 * ��ʼ��ʱ�������Ĳ��Զ������ﴫ����Ǿ�����շѲ���
	 * 
	 * @param cSuper
	 */
	public CashContext(CashSuper cSuper) {
		this.cSuper = cSuper;
	}

	/**
	 * ���ݾ���Ĳ��Զ��󣬵������㷨�ķ���������ʵ������ͬ�Ĳ��ԣ��������յõ��Ľ��Ҳ������ͬ
	 * 
	 * @param money
	 * @return
	 */
	public double getResult(double money) {
		// �����շѲ��ԵĲ�ͬ����ò�ͬ�ļ�����
		return cSuper.acceptCash(money);
	}

}
