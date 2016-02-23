package com.decorator.standard;

import android.util.Log;

import com.decorator.example.Utils;

public class Tie extends Finery {

	@Override
	public void show() {
		Log.d(Utils.TAG, "Áì´ø");
		super.show();
	}

}
