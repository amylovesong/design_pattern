package com.sun.reflectiontest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * ������LoadMethod�Ļ����ϣ�ȥ���˲������͵Ĵ��롣����ʹ�õĹ����з������������⣺ 1��û�п��ǵ����ص����
 * 2��������ȫ���Բ���������˵������һЩ���⡣ ���綨��ķ���abc��һ��������int�ͣ������Բ�������ʱ���ⲿ�����߿��ܻᴫ��һ��String�ͣ�
 * �������оͻ����argument type mismatch���쳣������ʹ������˵���������ܲ����ȶ�����������ֱ�Ӳ�����������׼ȷ
 * 
 * @author sunxiaoling
 * 
 */
public class LoadMethodEx {

	public Object Load(String cName, String MethodName, Object[] params) {
		Object retObject = null;

		try {
			// ����ָ������
			Class cls = Class.forName(cName);

			Constructor ct = cls.getConstructor(null);
			// ����newInstance()��������ȡ���췽����ʵ��
			// Constructor��newInstance�����ṩ���εĹ���ʵ��
			Object obj = ct.newInstance(null);
			// Class��newInstance����ֻ�ṩĬ���޲ι���ʵ��
			// Object obj = cls.newInstance();

			// ���ݷ�������ȡָ�������Ĳ��������б�
			Class paramTypes[] = this.getParamTypes(cls, MethodName);
			for (int i = 0; i < paramTypes.length; i++) {
				System.out.println(paramTypes[i].getName());
			}

			// ��ȡָ������
			Method method = cls.getMethod(MethodName, paramTypes);
			method.setAccessible(true);

			// ����ָ���ķ�������ȡ����ֵΪObject����
			retObject = method.invoke(obj, params);

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
	 * @param cls
	 * @param mName
	 * @return
	 */
	public Class[] getParamTypes(Class cls, String mName) {
		Class[] cs = null;

		/**
		 * Note����������һ��ͨ��������Ƶ��õķ������Ƿ�public�����������ڴ˴�ʹ��getDeclaredMethods()����
		 */
		Method[] methods = cls.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			if (!methods[i].getName().equals(mName)) {
				continue;
			}

			cs = methods[i].getParameterTypes();
		}

		return cs;
	}

}
