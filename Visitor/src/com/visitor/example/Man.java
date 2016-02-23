package com.visitor.example;

/**
 * “男人”类
 * 
 * @author sunxiaoling
 * 
 */
public class Man extends Person {

	@Override
	public void getConclusion() {
		if (action.equals("成功")) {
			System.out.println("男人" + action + "时，背后多半有一个伟大的女人。");
		} else if (action.equals("失败")) {
			System.out.println("男人" + action + "时，闷头喝酒，谁也不用劝。");
		} else if (action.equals("恋爱")) {
			System.out.println("男人" + action + "时，凡事不懂也要装懂。");
		}
	}

}
