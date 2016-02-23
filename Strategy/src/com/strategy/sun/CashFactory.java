package com.strategy.sun;

import android.util.Log;

import com.strategy.utils.Utils;

/**
 * 现金收费工厂类
 * 
 * @author sunxiaoling
 * 
 */
public class CashFactory {
	public static CashSuper createCashAccpet(String type) {
		Log.d(Utils.TAG, type);
		CashSuper cs = null;

		if (type.equals("正常收费")) {
			cs = new CashNormal();
		} else if (type.equals("满300返100")) {
			cs = new CashReturn("300", "100");
		} else if (type.equals("打8折")) {
			cs = new CashRebate("0.8");
		}

		return cs;
	}
}
