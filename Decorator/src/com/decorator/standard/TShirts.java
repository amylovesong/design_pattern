package com.decorator.standard;

import android.util.Log;

import com.decorator.example.Utils;

public class TShirts extends Finery {

	@Override
	public void show() {
		Log.d(Utils.TAG, "��T��");
		super.show();
	}

}
