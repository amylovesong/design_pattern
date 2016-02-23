package com.abstract_factory.sun;

import android.util.Log;

import com.abstract_factory.example.User;
import com.abstract_factory.utils.Utils;

public class SqlserverUser implements IUser {

	@Override
	public void insert(User user) {
		Log.d(Utils.TAG, "在SQL Server中给User表增加一条记录");
	}

	@Override
	public User getUser(int id) {
		Log.d(Utils.TAG, "在SQL Server中根据ID得到User表一条记录");
		return null;
	}

}
