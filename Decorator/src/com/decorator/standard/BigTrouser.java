package com.decorator.standard;

import android.util.Log;

import com.decorator.example.Utils;

public class BigTrouser extends Finery {

	@Override
	public void show() {
		Log.d(Utils.TAG, "���");
		super.show();
	}

}
