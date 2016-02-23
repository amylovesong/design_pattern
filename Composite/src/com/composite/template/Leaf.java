package com.composite.template;

import com.composite.util.Utils;

/**
 * Leaf在组合中表示叶节点对象，叶节点没有子节点
 * 
 * @author sunxiaoling
 * 
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	// 由于叶子没有在增加分支和树叶，所有add和remove方法实现它没有意义，但这样做可以消除叶节点和枝节点对象在抽象层的区别，他们具体完全一致的接口
	@Override
	public void add(Component c) {
		System.out.println("Cannot add to a leaf");
	}

	@Override
	public void remove(Component c) {
		System.out.println("Cannot remove from a leaf");
	}

	// 叶节点的具体方法，此处是显示其名称和级别
	@Override
	public void display(int depth) {
		System.out.println(Utils.createString('-', depth) + name);
	}
}
