package com.sun.reflectiontest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

public class ReflectionTest implements ActionListener, Serializable {
	// ��Ա����
	private int bInt;
	public Integer bInteger = new Integer(4);
	public String strB = "amylovesong";
	private String strA;

	// ���캯��
	public ReflectionTest() {

	}

	protected ReflectionTest(int id, String name) {

	}

	// ��Ա����
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
