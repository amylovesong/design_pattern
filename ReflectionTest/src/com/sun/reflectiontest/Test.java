package com.sun.reflectiontest;

public class Test {
	public static void main(String[] args) {
		ReflectionTest reflectionTest = new ReflectionTest();

		// // 构造函数
		// Common.get_Reflection_Constructor(reflectionTest);
		// // 方法
		// Common.get_Reflection_Method(reflectionTest);
		// 属性和属性值
		// Common.get_Reflection_Field_Value(reflectionTest);

		// // 运行时调用com.sun.reflectiontest类的adc(int, String)方法
		// String[] types = { "int", "String" };
		// String[] params = { "1", "hello, android-1!" };
		// LoadMethod loadMethod = new LoadMethod();
		// loadMethod.Load("com.sun.reflectiontest.ReflectionTest", "abc",
		// types,
		// params);

		Object[] params = { 1, "5" };
		LoadMethodEx loadMethod = new LoadMethodEx();
		loadMethod.Load("com.sun.reflectiontest.ReflectionTest", "abc", params);

	}
}
