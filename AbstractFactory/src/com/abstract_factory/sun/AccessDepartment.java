package com.abstract_factory.sun;

import com.abstract_factory.utils.Utils;

import android.util.Log;

/**
 * 用于访问Access的Department
 * 
 * @author sunxiaoling
 * 
 */
public class AccessDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		Log.d(Utils.TAG, "在Access中给Department表增加一条记录");
	}

	@Override
	public Department getDepartment(int id) {
		Log.d(Utils.TAG, "在Access中根据ID得到Department表一条记录");
		return null;
	}

}
