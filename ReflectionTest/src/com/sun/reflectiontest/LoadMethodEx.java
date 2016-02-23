package com.sun.reflectiontest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 此类在LoadMethod的基础上，去掉了参数类型的传入。但在使用的过程中发现了两个问题： 1、没有考虑到重载的情况
 * 2、对于完全忽略参数类型来说还是有一些问题。 比如定义的方法abc的一个参数是int型，当忽略参数类型时，外部调用者可能会传入一个String型，
 * 这样运行就会出现argument type mismatch的异常。对于使用者来说，这样可能不够稳定，反倒不如直接参数类型来得准确
 * 
 * @author sunxiaoling
 * 
 */
public class LoadMethodEx {

	public Object Load(String cName, String MethodName, Object[] params) {
		Object retObject = null;

		try {
			// 加载指定的类
			Class cls = Class.forName(cName);

			Constructor ct = cls.getConstructor(null);
			// 利用newInstance()方法，获取构造方法的实例
			// Constructor的newInstance方法提供带参的构造实例
			Object obj = ct.newInstance(null);
			// Class的newInstance方法只提供默认无参构造实例
			// Object obj = cls.newInstance();

			// 根据方法名获取指定方法的参数类型列表
			Class paramTypes[] = this.getParamTypes(cls, MethodName);
			for (int i = 0; i < paramTypes.length; i++) {
				System.out.println(paramTypes[i].getName());
			}

			// 获取指定方法
			Method method = cls.getMethod(MethodName, paramTypes);
			method.setAccessible(true);

			// 调用指定的方法并获取返回值为Object类型
			retObject = method.invoke(obj, params);

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
	 * @param cls
	 * @param mName
	 * @return
	 */
	public Class[] getParamTypes(Class cls, String mName) {
		Class[] cs = null;

		/**
		 * Note：由于我们一般通过反射机制调用的方法，是非public方法，所以在此处使用getDeclaredMethods()方法
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
