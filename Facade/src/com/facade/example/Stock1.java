package com.facade.example;

import com.facade.utils.Utils;

import android.util.Log;

public class Stock1 {
	public void sell() {
		Log.d(Utils.TAG, "股票1卖出");
	}

	public void buy() {
		Log.d(Utils.TAG, "股票1买入");
	}
}
