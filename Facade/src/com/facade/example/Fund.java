package com.facade.example;

import com.facade.utils.Utils;

import android.util.Log;

public class Fund {
	Stock1 stock1;
	Stock2 stock2;
	Stock3 stock3;
	NationalDebt1 debt1;
	Realty1 realty1;

	public Fund() {
		stock1 = new Stock1();
		stock2 = new Stock2();
		stock3 = new Stock3();

		debt1 = new NationalDebt1();
		realty1 = new Realty1();
	}

	/**
	 * ��������
	 */
	public void buyFund() {
		Log.e(Utils.TAG, "��������");
		stock1.buy();
		stock2.buy();
		stock3.buy();
		debt1.buy();
		realty1.buy();
	}

	/**
	 * ��������
	 */
	public void sellFund() {
		Log.e(Utils.TAG, "��������");
		stock1.sell();
		stock2.sell();
		stock3.sell();
		debt1.sell();
		realty1.sell();
	}
}
