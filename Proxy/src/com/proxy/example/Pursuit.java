package com.proxy.example;

import com.proxy.utils.Utils;

import android.util.Log;

public class Pursuit {
	SchoolGirl mm;

	public Pursuit(SchoolGirl mm) {
		this.mm = mm;
	}

	public void giveDolls() {
		Log.d(Utils.TAG, mm.getName() + " ËÍÄãÑóÍŞÍŞ");
	}

	public void giveFlowers() {
		Log.d(Utils.TAG, mm.getName() + " ËÍÄãÏÊ»¨");
	}

	public void giveChocolate() {
		Log.d(Utils.TAG, mm.getName() + " ËÍÄãÇÉ¿ËÁ¦");
	}
}
