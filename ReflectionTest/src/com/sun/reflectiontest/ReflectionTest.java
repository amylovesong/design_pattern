package com.sun.reflectiontest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

public class ReflectionTest implements ActionListener, Serializable {
	// 成员变量
	private int bInt;
	public Integer bInteger = new Integer(4);
	public String strB = "amylovesong";
	private String strA;

	// 构造函数
	public ReflectionTest() {

	}

	protected ReflectionTest(int id, String name) {

	}

	// 成员方法
	public int abc(int id, String name) {
		System.out.println("amylovesong ---> " + id + "-" + name);
		return 0;
	}

	protected static void edf() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
