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

		/**** ԭ��ģʽ��һ�� ****/
		// Resume resume1 = new Resume("����");
		// resume1.setPersonalInfo("��", "29");
		// resume1.setWorkExperience("1998-2000", "XX��˾");
		//
		// Resume resume2 = new Resume("����");
		// resume2.setPersonalInfo("��", "29");
		// resume2.setWorkExperience("1998-2000", "XX��˾");
		//
		// Resume resume3 = new Resume("����");
		// resume3.setPersonalInfo("��", "29");
		// resume3.setWorkExperience("1998-2000", "XX��˾");
		//
		// // // �������ö���ֵ���൱����resume2��resume3��д�ż�����resume1����û��ʵ�ʵ�����
		// // Resume resume2 = resume1;
		// // Resume resume3 = resume1;
		//
		// resume1.display();
		// resume2.display();
		// resume3.display();

		/**** ԭ��ģʽ�ڶ��� ****/
		// Resume resume1 = new Resume("����");
		// resume1.setPersonalInfo("��", "29");
		// resume1.setWorkExperience("1998-2000", "XX��˾");
		//
		// Resume resume2;
		// Resume resume3;
		// try {
		// resume2 = (Resume) resume1.clone();
		// resume2.setWorkExperience("1998-2006", "YY��˾");
		//
		// resume3 = (Resume) resume1.clone();
		// resume3.setPersonalInfo("��", "24");
		//
		// resume1.display();
		// resume2.display();
		// resume3.display();
		// } catch (CloneNotSupportedException e) {
		// e.printStackTrace();
		// }

		/**** ԭ��ģʽ�����棨ǳ���ơ���com.standard.prototype�� ****/
		/**** ԭ��ģʽ�ռ��棨��ơ���com.standard.prototype.finalversion�� ****/
		Resume resume1 = new Resume("����");
		resume1.setPersonalInfo("��", "29");
		resume1.setWorkExperience("1998-2000", "XX��˾");

		Resume resume2;
		Resume resume3;
		try {
			resume2 = (Resume) resume1.clone();
			resume2.setWorkExperience("1998-2006", "YY��˾");

			resume3 = (Resume) resume1.clone();
			resume3.setWorkExperience("1998-2003", "ZZ��˾");

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
