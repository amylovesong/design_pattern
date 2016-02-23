package com.flyweight.main;

import com.flyweight.example.standard.User;
import com.flyweight.example.standard.WebSite;
import com.flyweight.example.standard.WebSiteFactory;

public class Main {
	public static void main(String[] args) {
		/** ��Ԫģʽ��վ���ӵ�һ�� **/
		// WebSite fx = new WebSite("��Ʒչʾ");
		// fx.use();
		//
		// WebSite fy = new WebSite("��Ʒչʾ");
		// fy.use();
		//
		// WebSite fz = new WebSite("��Ʒչʾ");
		// fz.use();
		//
		// WebSite fl = new WebSite("����");
		// fl.use();
		//
		// WebSite fm = new WebSite("����");
		// fm.use();
		//
		// WebSite fn = new WebSite("����");
		// fn.use();

		/** ��Ԫģʽģ�� **/
		// int extrinsicstate = 22;
		//
		// FlyweightFactory f = new FlyweightFactory();
		//
		// Flyweight fx = f.getFlyweight("X");
		// fx.operation(--extrinsicstate);
		//
		// Flyweight fy = f.getFlyweight("Y");
		// fy.operation(--extrinsicstate);
		//
		// Flyweight fz = f.getFlyweight("Z");
		// fz.operation(--extrinsicstate);
		//
		// UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
		// uf.operation(--extrinsicstate);

		/** ��Ԫģʽ��վ���ӵڶ��� **/
		// WebSiteFactory f = new WebSiteFactory();
		// // ʵ��������Ʒչʾ���ġ���վ������
		// WebSite fx = f.getWebSiteCategory("��Ʒչʾ");
		// fx.use();
		//
		// // �����Ϸ����ɵĶ��󣬲���ʵ����
		// WebSite fy = f.getWebSiteCategory("��Ʒչʾ");
		// fy.use();
		//
		// WebSite fz = f.getWebSiteCategory("��Ʒչʾ");
		// fz.use();
		//
		// WebSite fl = f.getWebSiteCategory("����");
		// fl.use();
		//
		// WebSite fm = f.getWebSiteCategory("����");
		// fm.use();
		//
		// WebSite fn = f.getWebSiteCategory("����");
		// fn.use();
		//
		// System.out.println("��վ��������Ϊ" + f.getWebSiteCount());

		/** ��Ԫģʽ��վ���ӵ����� **/
		WebSiteFactory f = new WebSiteFactory();

		WebSite fx = f.getWebSiteCategory("��Ʒչʾ");
		fx.use(new User("С��"));

		WebSite fy = f.getWebSiteCategory("��Ʒչʾ");
		fy.use(new User("����"));

		WebSite fz = f.getWebSiteCategory("��Ʒչʾ");
		fz.use(new User("����"));

		WebSite fl = f.getWebSiteCategory("����");
		fl.use(new User("����ͯ"));

		WebSite fm = f.getWebSiteCategory("����");
		fm.use(new User("�ҹ�����"));

		WebSite fn = f.getWebSiteCategory("����");
		fn.use(new User("������"));

		System.out.println("�õ���վ��������Ϊ " + f.getWebSiteCount());

	}
}
