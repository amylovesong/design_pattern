package com.abstract_factory.sun;

import android.util.Log;

import com.abstract_factory.example.User;
import com.abstract_factory.utils.Utils;

public class AccessUser implements IUser {

	@Override
	public void insert(User user) {
		Log.d(Utils.TAG, "在Access中给User表增加一条记录");
	}

	@Override
	public User getUser(int id) {
		Log.d(Utils.TAG, "在Access中根据ID得到User表一条记录");
		return null;
	}

}
