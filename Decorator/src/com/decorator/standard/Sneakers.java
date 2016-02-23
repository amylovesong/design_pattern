package com.decorator.standard;

import android.util.Log;

import com.decorator.example.Utils;

public class Sneakers extends Finery {

	@Override
	public void show() {
		Log.d(Utils.TAG, "∆∆«Ú–¨");
		super.show();
	}

}
