package com.strategy.sun;

import android.util.Log;

import com.strategy.utils.Utils;

/**
 * �ֽ��շѹ�����
 * 
 * @author sunxiaoling
 * 
 */
public class CashFactory {
	public static CashSuper createCashAccpet(String type) {
		Log.d(Utils.TAG, type);
		CashSuper cs = null;

		if (type.equals("�����շ�")) {
			cs = new CashNormal();
		} else if (type.equals("��300��100")) {
			cs = new CashReturn("300", "100");
		} else if (type.equals("��8��")) {
			cs = new CashRebate("0.8");
		}

		return cs;
	}
}
