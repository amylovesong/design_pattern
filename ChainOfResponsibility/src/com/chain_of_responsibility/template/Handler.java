package com.chain_of_responsibility.template;

//Handler�࣬����һ��������ʾ�Ľӿ�
public abstract class Handler {
	protected Handler successor;

	// ���ü�����
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	public abstract void handleRequest(int request);
}
