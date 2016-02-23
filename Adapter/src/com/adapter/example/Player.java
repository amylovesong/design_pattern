package com.adapter.example;

/**
 * ÇòÔ±Àà
 * 
 * @author sunxiaoling
 * 
 */
public abstract class Player {
	protected String name;

	public Player(String name) {
		this.name = name;
	}

	// ½ø¹¥
	public abstract void attack();

	// ·ÀÊØ
	public abstract void defense();
}
