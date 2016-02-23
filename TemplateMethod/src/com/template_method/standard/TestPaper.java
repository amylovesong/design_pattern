package com.template_method.standard;

import android.util.Log;

import com.template_method.utils.Utils;

public abstract class TestPaper {
	public void testQuestion1() {
		Log.d(Utils.TAG, "testQuestion1");
		Log.d(Utils.TAG, "´ð°¸£º" + answer1());
	}

	public void testQuestion2() {
		Log.d(Utils.TAG, "testQuestion2");
		Log.d(Utils.TAG, "´ð°¸£º" + answer2());
	}

	public void testQuestion3() {
		Log.d(Utils.TAG, "testQuestion3");
		Log.d(Utils.TAG, "´ð°¸£º" + answer3());
	}

	protected abstract String answer1();

	protected abstract String answer2();

	protected abstract String answer3();
}
