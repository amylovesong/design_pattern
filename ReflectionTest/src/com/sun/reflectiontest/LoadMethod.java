package com.sun.reflectiontest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class LoadMethod {

	/**
	 * ������ʱ����ָ�����࣬������ָ���ķ���
	 * 
	 * @param cName
	 *            ����
	 * @param methodname
	 *            ������
	 * @param types
	 *            �����Ĳ�������
	 * @param params
	 *            �����Ĳ���ֵ
	 * @return
	 */
	public Object Load(String cName, String methodname, String[] types,
			String[] params) {
		Object retObject = null;

		try {
			// ����ָ������
			Class cls = Class.forName(cName);

			// ����newInstance()��������ȡ���췽����ʵ��
			Constructor ct = cls.getConstructor(null);
			// Constructor��newInstance�����ṩ���εĹ���ʵ��
			// Object obj = ct.newInstance(null);
			// Class��newInstance����ֻ�ṩĬ���޲ι���ʵ��
			Object obj = cls.newInstance();

			// ���������Ĳ�������
			Class[] paramTypes = this.getMethodTypesClass(types);
			// ���������Ĳ���ֵ
			Object[] argList = this.getMethodParamObject(types, params);

			// ��ָ�����л�ȡָ���ķ���
			Method method = cls.getMethod(methodname, paramTypes);
			// ����ָ���ķ�������ȡ����ֵΪObject����
			retObject = method.invoke(obj, argList);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return retObject;
	}

	/**
	 * ��ȡ�������ͣ�����ֵ������Class[]��
	 * 
	 * @param types
	 *            ��������
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
	 * ��ȡ����Object[]
	 * 
	 * @param types
	 *            ��������
	 * @param params
	 *            ����ֵ
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
