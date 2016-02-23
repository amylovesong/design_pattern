package com.abstract_factory.sun;

import com.abstract_factory.utils.Utils;

import android.util.Log;

/**
 * ���ڷ���Access��Department
 * 
 * @author sunxiaoling
 * 
 */
public class AccessDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		Log.d(Utils.TAG, "��Access�и�Department������һ����¼");
	}

	@Override
	public Department getDepartment(int id) {
		Log.d(Utils.TAG, "��Access�и���ID�õ�Department��һ����¼");
		return null;
	}

}
