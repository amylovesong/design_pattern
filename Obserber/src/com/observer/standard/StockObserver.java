package com.observer.standard;

import android.util.Log;

import com.observer.utils.Utils;

public class StockObserver extends Observer {
	public StockObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update() {
		Log.d(Utils.TAG, sub.getAction() + name + ":�رչ�Ʊ���飬����������");
	}
}
