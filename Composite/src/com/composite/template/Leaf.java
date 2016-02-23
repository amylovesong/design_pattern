package com.composite.template;

import com.composite.util.Utils;

/**
 * Leaf������б�ʾҶ�ڵ����Ҷ�ڵ�û���ӽڵ�
 * 
 * @author sunxiaoling
 * 
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	// ����Ҷ��û�������ӷ�֧����Ҷ������add��remove����ʵ����û�����壬����������������Ҷ�ڵ��֦�ڵ�����ڳ������������Ǿ�����ȫһ�µĽӿ�
	@Override
	public void add(Component c) {
		System.out.println("Cannot add to a leaf");
	}

	@Override
	public void remove(Component c) {
		System.out.println("Cannot remove from a leaf");
	}

	// Ҷ�ڵ�ľ��巽�����˴�����ʾ�����ƺͼ���
	@Override
	public void display(int depth) {
		System.out.println(Utils.createString('-', depth) + name);
	}
}
