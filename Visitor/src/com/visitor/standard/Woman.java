package com.visitor.standard;

/**
 * Ů��
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
		return "Ů��";
	}
}
