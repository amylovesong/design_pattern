package com.bridge.standard;

/**
 * �ֻ�Ʒ����
 * 
 * @author sunxiaoling
 * 
 */
public abstract class HandsetBrand {
	protected HandsetSoft soft;

	// �����ֻ����
	// Ʒ����Ҫ��ע��������Կ��ڻ����а�װ����������ֻ���������Ա�����
	public void setHandsetSoft(HandsetSoft soft) {
		this.soft = soft;
	}

	// ����
	public abstract void run();
}
