package com.decorator_coffee.main;

import com.decorator_coffee.example.Beverage;
import com.decorator_coffee.example.Espresso;
import com.decorator_coffee.example.HouseBlend;
import com.decorator_coffee.example.Mocha;
import com.decorator_coffee.example.Soy;
import com.decorator_coffee.example.Whip;
import com.example.decorator_coffee.R;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	private static final String TAG = "coffee";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Beverage beverage1 = new Espresso();
		Log.d(TAG, beverage1.getDescription() + "  $" + beverage1.cost());

		Beverage beverage2 = new HouseBlend();
		beverage2 = new Soy(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		Log.d(TAG, beverage2.getDescription() + "  $" + beverage2.cost());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
