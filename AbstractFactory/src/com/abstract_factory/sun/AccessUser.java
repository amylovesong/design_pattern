package com.abstract_factory.sun;

import android.util.Log;

import com.abstract_factory.example.User;
import com.abstract_factory.utils.Utils;

public class AccessUser implements IUser {

	@Override
	public void insert(User user) {
		Log.d(Utils.TAG, "��Access�и�User������һ����¼");
	}

	@Override
	public User getUser(int id) {
		Log.d(Utils.TAG, "��Access�и���ID�õ�User��һ����¼");
		return null;
	}

}