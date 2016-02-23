package com.adapter.standard;

import com.adapter.example.Player;

/**
 * 翻译者类
 * 
 * @author sunxiaoling
 * 
 */
public class Translator extends Player {
	// 声明并实例化一个内部“外籍中锋”对象，表明翻译者与外籍球员有关联
	private ForeignCenter wjzf = new ForeignCenter();

	public Translator(String name) {
		super(name);
		wjzf.setName(name);
	}

	// 翻译者将“attack”翻译为“jingong”告诉外籍球员
	@Override
	public void attack() {
		wjzf.jingong();
	}

	// 翻译者将“defense”翻译为“fangshou”告诉外籍球员
	@Override
	public void defense() {
		wjzf.fangshou();
	}

}
