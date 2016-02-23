package com.sun.reflectiontest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class LoadMethod {

	/**
	 * 在运行时加载指定的类，并调用指定的方法
	 * 
	 * @param cName
	 *            类名
	 * @param methodname
	 *            方法名
	 * @param types
	 *            方法的参数类型
	 * @param params
	 *            方法的参数值
	 * @return
	 */
	public Object Load(String cName, String methodname, String[] types,
			String[] params) {
		Object retObject = null;

		try {
			// 加载指定的类
			Class cls = Class.forName(cName);

			// 利用newInstance()方法，获取构造方法的实例
			Constructor ct = cls.getConstructor(null);
			// Constructor的newInstance方法提供带参的构造实例
			// Object obj = ct.newInstance(null);
			// Class的newInstance方法只提供默认无参构造实例
			Object obj = cls.newInstance();

			// 构建方法的参数类型
			Class[] paramTypes = this.getMethodTypesClass(types);
			// 构建方法的参数值
			Object[] argList = this.getMethodParamObject(types, params);

			// 在指定类中获取指定的方法
			Method method = cls.getMethod(methodname, paramTypes);
			// 调用指定的方法并获取返回值为Object类型
			retObject = method.invoke(obj, argList);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return retObject;
	}

	/**
	 * 获取参数类型，返回值保存在Class[]中
	 * 
	 * @param types
	 *            参数类型
	 * @return
	 */
	public Class[] getMethodTypesClass(String[] types) {
		Class[] cs = new Class[types.length];
		String type = "";
		for (int i = 0; i < cs.length; i++) {
			type = types[i];
			if (type != null && !type.trim().equals("")) {
				if (type.equals("int") || type.equals("Integer")) {
					cs[i] = Integer.TYPE;
				} else if (type.equals("float") || type.equals("Float")) {
					cs[i] = Float.TYPE;
				} else if (type.equals("double") || type.equals("Double")) {
					cs[i] = Double.TYPE;
				} else if (type.equals("boolean") || type.equals("Boolean")) {
					cs[i] = Boolean.TYPE;
				} else {
					cs[i] = String.class;
				}
			}
		}

		return cs;
	}

	/**
	 * 获取参数Object[]
	 * 
	 * @param types
	 *            参数类型
	 * @param params
	 *            参数值
	 * @return
	 */
	public Object[] getMethodParamObject(String[] types, String[] params) {
		Object[] retObjects = new Object[params.length];

		String param = "", type = "";
		for (int i = 0; i < retObjects.length; i++) {
			param = params[i];
			type = types[i];
			if (param != null && !param.trim().equals("")) {
				if (type.equals("int") || type.equals("Integer")) {
					retObjects[i] = new Integer(param);
				} else if (type.equals("float") || type.equals("Float")) {
					retObjects[i] = new Integer(param);
				} else if (type.equals("double") || type.equals("Double")) {
					retObjects[i] = new Integer(param);
				} else if (type.equals("boolean") || type.equals("Boolean")) {
					retObjects[i] = new Integer(param);
				} else {
					retObjects[i] = param;
				}
			}
		}

		return retObjects;
	}
}
