package com.observer.standard;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.example.observer.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/************* 解除耦合一 ***********/
		// // 通知者
		// Secretary tongzizhe = new Secretary();
		// // 观察者1
		// StockObserver tongshi1 = new StockObserver("weiguanbi", tongzizhe);
		// // 观察者2
		// NBAObserver tongshi2 = new NBAObserver("yiguancha", tongzizhe);
		// // 通知者记下两位观察者
		// tongzizhe.attach(tongshi1);
		// tongzizhe.attach(tongshi2);
		// // 发现问题
		// tongzizhe.setAction("老板回来了！");
		// // 通知观察者
		// tongzizhe.notifyToObserver();

		/************* 解除耦合二 ***********/
		// 老板胡汉三
		Boss huhansan = new Boss();
		// 看股票的同事
		StockObserver tongshi1 = new StockObserver("weiguanbi", huhansan);
		// 看NBA的同事
		NBAObserver tongshi2 = new NBAObserver("yiguancha", huhansan);

		huhansan.attach(tongshi1);
		huhansan.attach(tongshi2);

		huhansan.detach(tongshi1);

		// 老板回来
		huhansan.setAction("我胡汉三回来了！");
		// 发出通知
		huhansan.notifyToObserver();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
