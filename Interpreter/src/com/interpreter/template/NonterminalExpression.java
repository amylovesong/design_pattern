package com.interpreter.template;

/**
 * ���ս�����ʽ��Ϊ�ķ��еķ��ս��ʵ�ֽ��Ͳ����� ���ķ���ÿһ������R1��R2����Rn����Ҫһ������ķ��ս�����ʽ�ࡣ
 * ͨ��ʵ�ֳ�����ʽ��interpret()����ʵ�ֽ��Ͳ����� ���Ͳ����Եݹ鷽ʽ�����������ᵽ�Ĵ���R1��R2����Rn�и������ŵ�ʵ������
 * 
 * @author sunxiaoling
 * 
 */
public class NonterminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("���ն˽�����");
	}

}
