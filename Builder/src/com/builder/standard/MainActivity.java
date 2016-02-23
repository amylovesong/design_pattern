package com.builder.standard;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.example.builder.R;

public class MainActivity extends Activity {
	private DrawPerson drawPerson;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_main);
		this.drawPerson = new DrawPerson(this);
		setContentView(drawPerson);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
