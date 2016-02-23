package com.abstract_factory.example;

import android.util.Log;

import com.abstract_factory.utils.Utils;

/**
 * ���ڲ���User��
 * 
 * @author sunxiaoling
 * 
 */
public class SqlserverUser {

	public void insert(User user) {
		Log.d(Utils.TAG, "��SQL Server�и�User������һ����¼");
	}

	public User getUser(int id) {
		Log.d(Utils.TAG, "��SQL Server�и���ID�õ�User��һ����¼");
		return null;
	}
}
