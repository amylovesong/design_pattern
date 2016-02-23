package com.template_method.main;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import com.example.templatemethod.R;
import com.template_method.standard.TestPaper;
import com.template_method.standard.TestPaperA;
import com.template_method.standard.TestPaperB;
import com.template_method.utils.Utils;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/**** ģʽ����ģʽ��һ�� ****/
		// Log.e(Utils.TAG, "ѧ���׳����Ծ�");
		// TestPaperA studentA = new TestPaperA();
		// studentA.testQuestion1();
		// studentA.testQuestion2();
		// studentA.testQuestion3();
		//
		// Log.e(Utils.TAG, "ѧ���ҳ����Ծ�");
		// TestPaperB studentB = new TestPaperB();
		// studentB.testQuestion1();
		// studentB.testQuestion2();
		// studentB.testQuestion3();

		/**** ģʽ����ģʽ�ڶ��� ****/
		Log.d(Utils.TAG, "ѧ���׳����Ծ�");
		TestPaper studentA = new TestPaperA();
		studentA.testQuestion1();
		studentA.testQuestion2();
		studentA.testQuestion3();

		Log.d(Utils.TAG, "ѧ���ҳ����Ծ�");
		TestPaper studentB = new TestPaperB();
		studentB.testQuestion1();
		studentB.testQuestion2();
		studentB.testQuestion3();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
