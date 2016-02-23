package com.proxy.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.example.proxy.R;
import com.proxy.example.SchoolGirl;
import com.proxy.standard.Proxy;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/**** ����ģʽ��һ�� ****/
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.setName("���");

		// Pursuit zhuojiayi = new Pursuit(jiaojiao);
		//
		// zhuojiayi.giveDolls();
		// zhuojiayi.giveFlowers();
		// zhuojiayi.giveChocolate();

		/**** ����ģʽ�ڶ��� ****/
		Proxy daili = new Proxy(jiaojiao);

		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
