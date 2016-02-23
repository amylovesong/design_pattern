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

		/************* ������һ ***********/
		// // ֪ͨ��
		// Secretary tongzizhe = new Secretary();
		// // �۲���1
		// StockObserver tongshi1 = new StockObserver("weiguanbi", tongzizhe);
		// // �۲���2
		// NBAObserver tongshi2 = new NBAObserver("yiguancha", tongzizhe);
		// // ֪ͨ�߼�����λ�۲���
		// tongzizhe.attach(tongshi1);
		// tongzizhe.attach(tongshi2);
		// // ��������
		// tongzizhe.setAction("�ϰ�����ˣ�");
		// // ֪ͨ�۲���
		// tongzizhe.notifyToObserver();

		/************* �����϶� ***********/
		// �ϰ������
		Boss huhansan = new Boss();
		// ����Ʊ��ͬ��
		StockObserver tongshi1 = new StockObserver("weiguanbi", huhansan);
		// ��NBA��ͬ��
		NBAObserver tongshi2 = new NBAObserver("yiguancha", huhansan);

		huhansan.attach(tongshi1);
		huhansan.attach(tongshi2);

		huhansan.detach(tongshi1);

		// �ϰ����
		huhansan.setAction("�Һ����������ˣ�");
		// ����֪ͨ
		huhansan.notifyToObserver();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
