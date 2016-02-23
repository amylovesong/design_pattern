package com.abstract_factory.sun;

import com.abstract_factory.utils.Utils;

import android.util.Log;

/**
 * ���ڷ���SQL Server��Department
 * 
 * @author sunxiaoling
 * 
 */
public class SqlserverDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		Log.d(Utils.TAG, "��SQL Server�и�Department������һ����¼");
	}

	@Override
	public Department getDepartment(int id) {
		Log.d(Utils.TAG, "��SQL Server�и���ID�õ�Department��һ����¼");
		return null;
	}

}
