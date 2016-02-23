package com.sun.reflectiontest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import javax.print.attribute.standard.Fidelity;

public class Common {
	/**
	 * 获取反射类中的构造方法。输出打印格式："Modifier修饰符		构造方法名(参数类型列表)"
	 * 
	 * @param r
	 */
	public static void get_Reflection_Constructor(ReflectionTest r) {
		Class temp = r.getClass();
		String className = temp.getName(); // 获取指定类的类名

		try {
			// // 获取指定类的公用（public）构造函数
			// Constructor[] theConstructors = temp.getConstructors();

			// 获取指定类的所有（不分public和非public属性）构造函数
			Constructor[] theConstructors = temp.getDeclaredConstructors();

			for (int i = 0; i < theConstructors.length; i++) {
				int mod = theConstructors[i].getModifiers();// 输出修饰域和方法名
				// System.out
				// .print(Modifier.toString(mod) + " " + className + "(");
				System.out.print(Modifier.toString(mod) + " "
						+ theConstructors[i].getName() + "(");

				Class[] parameterTypes = theConstructors[i].getParameterTypes();// 获取指定构造方法的参数的集合
				for (int j = 0; j < parameterTypes.length; j++) {// 输出参数列表
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
	 * 获取反射类的方法。打印输出格式："RetType FuncName(paramTypeList)"
	 * 
	 * @param r
	 */
	public static void get_Reflection_Method(ReflectionTest r) {
		Class temp = r.getClass();
		String className = temp.getName();

		/**
		 * Note：getDeclaredMethods()：用于获取在当前类中定义的所有的成员方法和实现的接口方法，不包括从父类继承的方法。
		 * getMethods()：用于获取类的所有的public修饰域的成员方法，包括从父类继承的public方法和实现接口的public方法
		 */
		// Method[] methods = temp.getDeclaredMethods();
		Method[] methods = temp.getMethods();
		for (int i = 0; i < methods.length; i++) {
			// 方法的修饰域
			int mod = methods[i].getModifiers();
			// System.err.println("mod:" + mod);
			System.out.print(Modifier.toString(mod) + " ");

			// 返回类型
			System.out.print(methods[i].getReturnType().getName() + " ");

			// 方法名
			System.out.print(methods[i].getName() + "(");

			// 参数列表
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
	 * 获取反射类中的属性和属性值。输出打印格式："Modifier Type：Name=Value"
	 * Note：对于未初始化的指针类型的属性，将不输出结果
	 */
	public static void get_Reflection_Field_Value(ReflectionTest r) {
		Class temp = r.getClass();

		try {
			System.out.println("public 属性");
			Field[] fb = temp.getFields();
			for (int i = 0; i < fb.length; i++) {
				// 属性的类型
				Class c1 = fb[i].getType();
				// 属性的修饰域
				int mod = fb[i].getModifiers();
				// 属性的值
				Field f = temp.getField(fb[i].getName());
				f.setAccessible(true);
				Object value = f.get(r);

				// 判断属性是否被初始化
				if (value == null) {
					System.out.println(Modifier.toString(mod) + " " + c1 + "："
							+ fb[i].getName());
				} else {
					System.out.println(Modifier.toString(mod) + " " + c1 + "："
							+ fb[i].getName() + " = " + value.toString());
				}
			}

			System.out.println("public & 非public 属性");
			Field[] fa = temp.getDeclaredFields();
			for (int i = 0; i < fa.length; i++) {
				// 属性的类型
				Class c1 = fa[i].getType();
				// 属性的修饰域
				int mod = fa[i].getModifiers();
				// 属性的值
				Field f = temp.getDeclaredField(fa[i].getName());
				f.setAccessible(true);// very important
				Object value = f.get(r);

				if (value == null) {
					System.out.println(Modifier.toString(mod) + " " + c1 + "："
							+ fa[i].getName());
				} else {
					System.out.println(Modifier.toString(mod) + " " + c1 + "："
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
