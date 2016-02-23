package com.template_method.sun;

import android.util.Log;

import com.template_method.utils.Utils;

public class TestPaperA extends TestPaper {
	@Override
	public void testQuestion1() {
		super.testQuestion1();
		Log.d(Utils.TAG, "�𰸣�1");
	}

	@Override
	public void testQuestion2() {
		super.testQuestion2();
		Log.d(Utils.TAG, "�𰸣�2");
	}

	@Override
	public void testQuestion3() {
		super.testQuestion3();
		Log.d(Utils.TAG, "�𰸣�3");
	}
}
