package com.facade.main;

import com.example.facade.R;
import com.facade.example.Fund;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/**** 外观模式第一版 *****/
		// Stock1 stock1 = new Stock1();
		// Stock2 stock2 = new Stock2();
		// Stock3 stock3 = new Stock3();
		//
		// NationalDebt1 debt1 = new NationalDebt1();
		// Realty1 realty1 = new Realty1();
		//
		// stock1.buy();
		// stock2.buy();
		// stock3.buy();
		// debt1.buy();
		// realty1.buy();
		//
		// stock1.sell();
		// stock2.sell();
		// stock3.sell();
		// debt1.sell();
		// realty1.sell();

		/**** 外观模式第二版 *****/
		Fund fund = new Fund();
		fund.buyFund();
		fund.sellFund();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
