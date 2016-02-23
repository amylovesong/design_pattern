package com.chain_of_responsibility.main;

import com.chain_of_responsibility.example.Request;
import com.chain_of_responsibility.example.refactor.CommonManager;
import com.chain_of_responsibility.example.refactor.GeneralManager;
import com.chain_of_responsibility.example.refactor.Majordomo;
import com.chain_of_responsibility.template.ConcreteHandler1;
import com.chain_of_responsibility.template.ConcreteHandler2;
import com.chain_of_responsibility.template.ConcreteHandler3;
import com.chain_of_responsibility.template.Handler;

public class Main {
	public static void main(String[] args) {
		/********** ְ����ģʽ��һ�� **********/
		// // ����������
		// Manager jinli = new Manager("����");
		// Manager zongjian = new Manager("�ڽ�");
		// Manager zhongjingli = new Manager("�Ӿ���");
		//
		// // С�������н1000
		// Request request = new Request();
		// request.setRequestType("��н");
		// request.setRequestContent("С�������н");
		// request.setNumber(1000);
		//
		// // ��ͬ�ļ���Դ��������жϺʹ���
		// jinli.getResult("����", request);
		// zongjian.getResult("�ܼ�", request);
		// zhongjingli.getResult("�ܾ���", request);
		//
		// // С�����3��
		// Request request2 = new Request();
		// request2.setRequestType("���");
		// request2.setRequestContent("С�����");
		// request2.setNumber(3);
		//
		// jinli.getResult("����", request2);
		// zongjian.getResult("�ܼ�", request2);
		// zhongjingli.getResult("�ܾ���", request2);

		/********** ְ����ģʽģ�� **********/
		// Handler h1 = new ConcreteHandler1();
		// Handler h2 = new ConcreteHandler2();
		// Handler h3 = new ConcreteHandler3();
		// // ����ְ�����ϼ����¼�
		// h1.setSuccessor(h2);
		// h2.setSuccessor(h3);
		//
		// int[] requests = { 2, 5, 14, 22, 18, 3, 27, 20 };
		//
		// // ѭ������С�������ύ���󣬲�ͬ������ɲ�ͬȨ�޴����ߴ���
		// for (int request : requests) {
		// h1.handleRequest(request);
		// }

		/********** ְ����ģʽ�ع��� **********/
		CommonManager jinli = new CommonManager("����");
		Majordomo zongjian = new Majordomo("�ڽ�");
		GeneralManager zhongjingli = new GeneralManager("�Ӿ���");
		// �����ϼ�����ȫ���Ը���ʵ����������������
		jinli.setSuperior(zongjian);
		zongjian.setSuperior(zhongjingli);

		Request request = new Request();
		request.setRequestType("���");
		request.setRequestContent("С�����");
		request.setNumber(1);
		// �ͻ��˵����붼���ɡ��������𣬵�ʵ��˭�������ɾ���������������ͻ��˲�֪��
		jinli.requestApplications(request);

		Request request2 = new Request();
		request2.setRequestType("���");
		request2.setRequestContent("С�����");
		request2.setNumber(4);
		jinli.requestApplications(request2);

		Request request3 = new Request();
		request3.setRequestType("��н");
		request3.setRequestContent("С�������н");
		request3.setNumber(500);
		jinli.requestApplications(request3);

		Request request4 = new Request();
		request4.setRequestType("��н");
		request4.setRequestContent("С�������н");
		request4.setNumber(1000);
		jinli.requestApplications(request4);
	}
}
