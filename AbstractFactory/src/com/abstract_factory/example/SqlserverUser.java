package com.abstract_factory.example;

import android.util.Log;

import com.abstract_factory.utils.Utils;

/**
 * 用于操作User表
 * 
 * @author sunxiaoling
 * 
 */
public class SqlserverUser {

	public void insert(User user) {
		Log.d(Utils.TAG, "在SQL Server中给User表增加一条记录");
	}

	public User getUser(int id) {
		Log.d(Utils.TAG, "在SQL Server中根据ID得到User表一条记录");
		return null;
	}
}
