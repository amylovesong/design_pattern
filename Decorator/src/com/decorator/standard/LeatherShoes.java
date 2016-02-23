package com.decorator.standard;

import android.util.Log;

import com.decorator.example.Utils;

public class LeatherShoes extends Finery {

	@Override
	public void show() {
		Log.d(Utils.TAG, "ƤЬ");
		super.show();
	}

}
