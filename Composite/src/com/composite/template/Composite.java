package com.composite.template;

import java.util.ArrayList;

import com.composite.util.Utils;

/**
 * Composite定义有枝节点行为，用来存储子部件，在Composite接口中实现与子部件有关的操作，比如增加add和删除remove
 * 
 * @author sunxiaoling
 * 
 */
public class Composite extends Component {
	// 一个子对象集合用来存储其下属的枝节点和叶节点
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

	// 显示其枝节点名称，并对其下级进行遍历
	@Override
	public void display(int depth) {
		System.out.println(Utils.createString('-', depth) + name);
		for (Component c : children) {
			c.display(depth + 2);
		}
	}

}
