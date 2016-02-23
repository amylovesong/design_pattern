package com.abstract_factory.sun;

import com.abstract_factory.utils.Utils;

import android.util.Log;

/**
 * 用于访问SQL Server的Department
 * 
 * @author sunxiaoling
 * 
 */
public class SqlserverDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		Log.d(Utils.TAG, "在SQL Server中给Department表增加一条记录");
	}

	@Override
	public Department getDepartment(int id) {
		Log.d(Utils.TAG, "在SQL Server中根据ID得到Department表一条记录");
		return null;
	}

}
