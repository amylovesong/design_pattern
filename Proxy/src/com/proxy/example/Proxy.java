package com.proxy.example;

import android.util.Log;

import com.proxy.utils.Utils;

public class Proxy {
	SchoolGirl mm;

	public Proxy(SchoolGirl mm) {
		this.mm = mm;
	}

	public void giveDolls() {
		Log.d(Utils.TAG, mm.getName() + " ����������");
	}

	public void giveFlowers() {
		Log.d(Utils.TAG, mm.getName() + " �����ʻ�");
	}

	public void giveChocolate() {
		Log.d(Utils.TAG, mm.getName() + " �����ɿ���");
	}
}
