package com.interpreter.template;

/**
 * �ս�����ʽ��ʵ�����ķ��е��ս��������Ľ��Ͳ����� ʵ�ֳ�����ʽ����Ҫ��Ľӿڣ���Ҫ��һ��interpret()������
 * �ķ��е�ÿһ���ս������һ�������ս���ʽ��֮���Ӧ
 * 
 * @author sunxiaoling
 * 
 */
public class TerminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("�ն˽�����");
	}

}
