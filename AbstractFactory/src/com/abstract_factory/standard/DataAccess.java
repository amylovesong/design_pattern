package com.abstract_factory.standard;

import java.lang.reflect.Constructor;

import android.util.Log;

import com.abstract_factory.sun.AccessDepartment;
import com.abstract_factory.sun.AccessUser;
import com.abstract_factory.sun.IDepartment;
import com.abstract_factory.sun.IUser;
import com.abstract_factory.sun.SqlserverDepartment;
import com.abstract_factory.sun.SqlserverUser;
import com.abstract_factory.utils.Utils;

public class DataAccess {
	private static final String packageName = "com.sun.abstract_factory";
	// private static final String db = "Sqlserver";

	private static final String db = "Access";

	public static IUser createUser() {
		IUser result = null;
		if (db.equals("Sqlserver")) {
			result = new SqlserverUser();
		} else if (db.equals("Access")) {
			result = new AccessUser();
		}

		return result;
	}

	public static IDepartment createDepartment() {
		IDepartment result = null;
		if (db.equals("Sqlserver")) {
			result = new SqlserverDepartment();
		} else if (db.equals("Access")) {
			result = new AccessDepartment();
		}

		return result;
	}

	/** ------------利用反射机制省去在有新需求加入时要不断添加if()判断的麻烦---------- **/
	public static IUser createUser1() {
		IUser user = null;
		try {
			String className = packageName + "." + db + "User";
			Log.d(Utils.TAG, "className " + className);
			Class cls = Class.forName(className);
			// // Class的newInstance方法只提供默认无参构造实例
			// user = (IUser) cls.newInstance();

			// Constructor的newInstance可提供带参的构造实例
			Constructor ct = cls.getConstructor(null);
			user = (IUser) ct.newInstance(null);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;
	}

	public static IDepartment createDepartment1() {
		IDepartment department = null;
		try {
			String className = packageName + "." + db + "Department";
			Log.d(Utils.TAG, "className " + className);
			Class cls = Class.forName(className);

			// department = (IDepartment) cls.newInstance();

			Constructor ct = cls.getConstructor();
			department = (IDepartment) ct.newInstance(null);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return department;
	}
}
