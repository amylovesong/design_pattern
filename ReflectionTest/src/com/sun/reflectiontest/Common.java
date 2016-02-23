package com.sun.reflectiontest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import javax.print.attribute.standard.Fidelity;

public class Common {
	/**
	 * ��ȡ�������еĹ��췽���������ӡ��ʽ��"Modifier���η�		���췽����(���������б�)"
	 * 
	 * @param r
	 */
	public static void get_Reflection_Constructor(ReflectionTest r) {
		Class temp = r.getClass();
		String className = temp.getName(); // ��ȡָ���������

		try {
			// // ��ȡָ����Ĺ��ã�public�����캯��
			// Constructor[] theConstructors = temp.getConstructors();

			// ��ȡָ��������У�����public�ͷ�public���ԣ����캯��
			Constructor[] theConstructors = temp.getDeclaredConstructors();

			for (int i = 0; i < theConstructors.length; i++) {
				int mod = theConstructors[i].getModifiers();// ���������ͷ�����
				// System.out
				// .print(Modifier.toString(mod) + " " + className + "(");
				System.out.print(Modifier.toString(mod) + " "
						+ theConstructors[i].getName() + "(");

				Class[] parameterTypes = theConstructors[i].getParameterTypes();// ��ȡָ�����췽���Ĳ����ļ���
				for (int j = 0; j < parameterTypes.length; j++) {// ��������б�
					System.out.print(parameterTypes[j].getName());
					if (parameterTypes.length > j + 1) {
						System.out.print(", ");
					}
				}
				System.out.println(")");
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ȡ������ķ�������ӡ�����ʽ��"RetType FuncName(paramTypeList)"
	 * 
	 * @param r
	 */
	public static void get_Reflection_Method(ReflectionTest r) {
		Class temp = r.getClass();
		String className = temp.getName();

		/**
		 * Note��getDeclaredMethods()�����ڻ�ȡ�ڵ�ǰ���ж�������еĳ�Ա������ʵ�ֵĽӿڷ������������Ӹ���̳еķ�����
		 * getMethods()�����ڻ�ȡ������е�public������ĳ�Ա�����������Ӹ���̳е�public������ʵ�ֽӿڵ�public����
		 */
		// Method[] methods = temp.getDeclaredMethods();
		Method[] methods = temp.getMethods();
		for (int i = 0; i < methods.length; i++) {
			// ������������
			int mod = methods[i].getModifiers();
			// System.err.println("mod:" + mod);
			System.out.print(Modifier.toString(mod) + " ");

			// ��������
			System.out.print(methods[i].getReturnType().getName() + " ");

			// ������
			System.out.print(methods[i].getName() + "(");

			// �����б�
			Class[] parameterTypes = methods[i].getParameterTypes();
			for (int j = 0; j < parameterTypes.length; j++) {
				System.out.print(parameterTypes[j].getName());
				if (parameterTypes.length > j + 1) {
					System.out.print(", ");
				}
			}
			System.out.println(")");
		}
	}

	/**
	 * ��ȡ�������е����Ժ�����ֵ�������ӡ��ʽ��"Modifier Type��Name=Value"
	 * Note������δ��ʼ����ָ�����͵����ԣ�����������
	 */
	public static void get_Reflection_Field_Value(ReflectionTest r) {
		Class temp = r.getClass();

		try {
			System.out.println("public ����");
			Field[] fb = temp.getFields();
			for (int i = 0; i < fb.length; i++) {
				// ���Ե�����
				Class c1 = fb[i].getType();
				// ���Ե�������
				int mod = fb[i].getModifiers();
				// ���Ե�ֵ
				Field f = temp.getField(fb[i].getName());
				f.setAccessible(true);
				Object value = f.get(r);

				// �ж������Ƿ񱻳�ʼ��
				if (value == null) {
					System.out.println(Modifier.toString(mod) + " " + c1 + "��"
							+ fb[i].getName());
				} else {
					System.out.println(Modifier.toString(mod) + " " + c1 + "��"
							+ fb[i].getName() + " = " + value.toString());
				}
			}

			System.out.println("public & ��public ����");
			Field[] fa = temp.getDeclaredFields();
			for (int i = 0; i < fa.length; i++) {
				// ���Ե�����
				Class c1 = fa[i].getType();
				// ���Ե�������
				int mod = fa[i].getModifiers();
				// ���Ե�ֵ
				Field f = temp.getDeclaredField(fa[i].getName());
				f.setAccessible(true);// very important
				Object value = f.get(r);

				if (value == null) {
					System.out.println(Modifier.toString(mod) + " " + c1 + "��"
							+ fa[i].getName());
				} else {
					System.out.println(Modifier.toString(mod) + " " + c1 + "��"
							+ fa[i].getName() + " = " + value.toString());
				}
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
