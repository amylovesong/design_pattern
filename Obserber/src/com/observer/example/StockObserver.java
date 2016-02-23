package com.observer.example;

import com.observer.utils.Utils;

import android.util.Log;

public class StockObserver {
	private String name;
	private Secretary sub;

	public StockObserver(String name, Secretary sub) {
		this.name = name;
		this.sub = sub;
	}

	public void update() {
		Log.d(Utils.TAG, sub.getAction() + name + ":关闭股票行情，继续工作！");
	}
}
