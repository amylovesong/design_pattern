package com.prototype.standard.finalversion;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.example.prototype.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/**** 原型模式第一版 ****/
		// Resume resume1 = new Resume("大鸟");
		// resume1.setPersonalInfo("男", "29");
		// resume1.setWorkExperience("1998-2000", "XX公司");
		//
		// Resume resume2 = new Resume("大鸟");
		// resume2.setPersonalInfo("男", "29");
		// resume2.setWorkExperience("1998-2000", "XX公司");
		//
		// Resume resume3 = new Resume("大鸟");
		// resume3.setPersonalInfo("男", "29");
		// resume3.setWorkExperience("1998-2000", "XX公司");
		//
		// // // 传的引用而非值。相当于在resume2和resume3上写着简历在resume1处，没有实际的内容
		// // Resume resume2 = resume1;
		// // Resume resume3 = resume1;
		//
		// resume1.display();
		// resume2.display();
		// resume3.display();

		/**** 原型模式第二版 ****/
		// Resume resume1 = new Resume("大鸟");
		// resume1.setPersonalInfo("男", "29");
		// resume1.setWorkExperience("1998-2000", "XX公司");
		//
		// Resume resume2;
		// Resume resume3;
		// try {
		// resume2 = (Resume) resume1.clone();
		// resume2.setWorkExperience("1998-2006", "YY公司");
		//
		// resume3 = (Resume) resume1.clone();
		// resume3.setPersonalInfo("男", "24");
		//
		// resume1.display();
		// resume2.display();
		// resume3.display();
		// } catch (CloneNotSupportedException e) {
		// e.printStackTrace();
		// }

		/**** 原型模式第三版（浅复制。见com.standard.prototype） ****/
		/**** 原型模式终极版（深复制。见com.standard.prototype.finalversion） ****/
		Resume resume1 = new Resume("大鸟");
		resume1.setPersonalInfo("男", "29");
		resume1.setWorkExperience("1998-2000", "XX公司");

		Resume resume2;
		Resume resume3;
		try {
			resume2 = (Resume) resume1.clone();
			resume2.setWorkExperience("1998-2006", "YY公司");

			resume3 = (Resume) resume1.clone();
			resume3.setWorkExperience("1998-2003", "ZZ公司");

			resume1.display();
			resume2.display();
			resume3.display();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
