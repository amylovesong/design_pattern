package com.proxy.standard;

import android.util.Log;

import com.proxy.example.SchoolGirl;
import com.proxy.utils.Utils;

public class Pursuit implements GiveGift {
	SchoolGirl mm = new SchoolGirl();

	public Pursuit(SchoolGirl mm) {
		this.mm = mm;
	}

	@Override
	public void giveDolls() {
		Log.e(Utils.TAG, mm.getName() + " ËÍÄãÑóÍŞÍŞ");
	}

	@Override
	public void giveFlowers() {
		Log.e(Utils.TAG, mm.getName() + " ËÍÄãÏÊ»¨");
	}

	@Override
	public void giveChocolate() {
		Log.e(Utils.TAG, mm.getName() + " ËÍÄãÇÉ¿ËÁ¦");
	}

}
