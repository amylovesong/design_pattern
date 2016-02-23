package com.decorator.sun;

import com.decorator.example.Utils;

import android.util.Log;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public void show() {
		Log.d(Utils.TAG, "×°°çµÄ£º" + name);
	}
}
