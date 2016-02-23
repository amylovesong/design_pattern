package com.visitor.standard;

/**
 * 女人
 * 
 * @author sunxiaoling
 * 
 */
public class Woman extends Person {

	@Override
	public void accept(Action visitor) {
		visitor.getWomanConclusion(this);
	}

	@Override
	public String getName() {
		return "女人";
	}
}
