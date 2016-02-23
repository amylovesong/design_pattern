package com.visitor.example;

/**
 * “女人”类
 * 
 * @author sunxiaoling
 * 
 */
public class Woman extends Person {

	@Override
	public void getConclusion() {
		if (action.equals("成功")) {
			System.out.println("女人" + action + "时，背后大多有一个不成功的男人。");
		} else if (action.equals("失败")) {
			System.out.println("女人" + action + "时，眼泪汪汪，谁也劝不了。");
		} else if (action.equals("恋爱")) {
			System.out.println("女人" + action + "时，遇事懂也要装不懂。");
		}
	}

}
