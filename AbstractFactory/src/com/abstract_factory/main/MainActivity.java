package com.abstract_factory.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.abstract_factory.example.User;
import com.abstract_factory.standard.DataAccess;
import com.abstract_factory.sun.Department;
import com.abstract_factory.sun.IDepartment;
import com.abstract_factory.sun.IUser;
import com.example.abstractfactory.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/************* 抽象工厂模式第一版 ***********/
		// User user = new User();
		// SqlserverUser su = new SqlserverUser();
		// su.insert(user);
		// su.getUser(1);

		/************* 抽象工厂模式第二版 ***********/
		// // 抽象工厂模式
		// User user = new User();
		// // IFactory factory = new SqlserverFactory();
		// IFactory factory = new AccessFactory();
		// IUser iu = factory.createIUser();
		//
		// iu.insert(user);
		// iu.getUser(1);
		//
		// // 增加Department表操作
		// Department department = new Department();
		// IDepartment id = factory.createIDepartment();
		// id.insert(department);
		// id.getDepartment(1);

		/************* 抽象工厂模式第三版 ***********/
		// // 用简单工厂改进抽象工厂
		// User user = new User();
		// Department department = new Department();
		//
		// IUser iu = DataAccess.createUser();
		// iu.insert(user);
		// iu.getUser(1);
		//
		// IDepartment id = DataAccess.createDepartment();
		// id.insert(department);
		// id.getDepartment(1);

		/************* 抽象工厂模式第四版 ***********/
		// 用反射机制改进上一版中的分支
		User user = new User();
		Department department = new Department();

		IUser iu = DataAccess.createUser1();
		iu.insert(user);
		iu.getUser(1);

		IDepartment id = DataAccess.createDepartment1();
		id.insert(department);
		id.getDepartment(1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
