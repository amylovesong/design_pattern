package com.observer.standard;

import android.util.Log;

import com.observer.utils.Utils;

public class NBAObserver extends Observer {

	public NBAObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update() {
		Log.d(Utils.TAG, sub.getAction() + name + ":关闭NBA直播，继续工作！");
	}

}
