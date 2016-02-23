package com.composite.template;

import java.util.ArrayList;

import com.composite.util.Utils;

/**
 * Composite������֦�ڵ���Ϊ�������洢�Ӳ�������Composite�ӿ���ʵ�����Ӳ����йصĲ�������������add��ɾ��remove
 * 
 * @author sunxiaoling
 * 
 */
public class Composite extends Component {
	// һ���Ӷ��󼯺������洢��������֦�ڵ��Ҷ�ڵ�
	private ArrayList<Component> children = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	// ��ʾ��֦�ڵ����ƣ��������¼����б���
	@Override
	public void display(int depth) {
		System.out.println(Utils.createString('-', depth) + name);
		for (Component c : children) {
			c.display(depth + 2);
		}
	}

}
