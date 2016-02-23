package com.decorator.standard;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import com.decorator.example.Utils;
import com.example.decorator.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/**** װ��ģʽ��һ�� ****/
		// Person xc = new Person("С��");
		// Log.d(Utils.TAG, "��һ��װ�磺");
		// xc.wearTShirts();
		// xc.wearBigTrouser();
		// xc.wearSneakers();
		// xc.show();
		//
		// Log.d(Utils.TAG, "�ڶ���װ�磺");
		// xc.wearSuit();
		// xc.wearTie();
		// xc.wearLeatherShoes();
		// xc.show();

		/**** װ��ģʽ�ڶ��� ****/
		// Person xc = new Person("С��");
		// Log.e(Utils.TAG, "��һ��װ�磺");
		// Finery dtx = new TShirts();
		// Finery kk = new BigTrouser();
		// Finery pqx = new Sneakers();
		//
		// dtx.show();
		// kk.show();
		// pqx.show();
		// xc.show();
		//
		// Log.e(Utils.TAG, "�ڶ���װ�磺");
		// Finery xz = new Suit();
		// Finery ld = new Tie();
		// Finery px = new LeatherShoes();
		//
		// xz.show();
		// ld.show();
		// px.show();
		// xc.show();

	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();

		/**** װ��ģʽ������ ****/
		Person xc = new Person("С��");

		Log.e(Utils.TAG, "��һ��װ�磺");

		Sneakers pqx = new Sneakers();
		BigTrouser kk = new BigTrouser();
		TShirts dtx = new TShirts();

		pqx.decorate(xc);
		kk.decorate(pqx);
		dtx.decorate(kk);
		dtx.show();

		Log.e(Utils.TAG, "�ڶ���װ�磺");
		Finery px = new LeatherShoes();
		Finery ld = new Tie();
		Finery xz = new Suit();

		px.decorate(xc);
		ld.decorate(px);
		xz.decorate(ld);
		xz.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
