package com.decorator.standard;

import android.util.Log;

import com.decorator.example.Utils;

public class Suit extends Finery {

	@Override
	public void show() {
		Log.d(Utils.TAG, "Î÷×°");
		super.show();
	}

}
