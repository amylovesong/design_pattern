package com.sun.reflectiontest;

public class Test {
	public static void main(String[] args) {
		ReflectionTest reflectionTest = new ReflectionTest();

		// // ���캯��
		// Common.get_Reflection_Constructor(reflectionTest);
		// // ����
		// Common.get_Reflection_Method(reflectionTest);
		// ���Ժ�����ֵ
		// Common.get_Reflection_Field_Value(reflectionTest);

		// // ����ʱ����com.sun.reflectiontest���adc(int, String)����
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
