package com.adapter.standard;

import com.adapter.example.Player;

/**
 * ��������
 * 
 * @author sunxiaoling
 * 
 */
public class Translator extends Player {
	// ������ʵ����һ���ڲ����⼮�з桱���󣬱������������⼮��Ա�й���
	private ForeignCenter wjzf = new ForeignCenter();

	public Translator(String name) {
		super(name);
		wjzf.setName(name);
	}

	// �����߽���attack������Ϊ��jingong�������⼮��Ա
	@Override
	public void attack() {
		wjzf.jingong();
	}

	// �����߽���defense������Ϊ��fangshou�������⼮��Ա
	@Override
	public void defense() {
		wjzf.fangshou();
	}

}
