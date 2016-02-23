package com.flyweight.main;

import com.flyweight.example.standard.User;
import com.flyweight.example.standard.WebSite;
import com.flyweight.example.standard.WebSiteFactory;

public class Main {
	public static void main(String[] args) {
		/** 享元模式网站例子第一版 **/
		// WebSite fx = new WebSite("产品展示");
		// fx.use();
		//
		// WebSite fy = new WebSite("产品展示");
		// fy.use();
		//
		// WebSite fz = new WebSite("产品展示");
		// fz.use();
		//
		// WebSite fl = new WebSite("博客");
		// fl.use();
		//
		// WebSite fm = new WebSite("博客");
		// fm.use();
		//
		// WebSite fn = new WebSite("博客");
		// fn.use();

		/** 享元模式模板 **/
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

		/** 享元模式网站例子第二版 **/
		// WebSiteFactory f = new WebSiteFactory();
		// // 实例化“产品展示”的“网站”对象
		// WebSite fx = f.getWebSiteCategory("产品展示");
		// fx.use();
		//
		// // 共享上方生成的对象，不再实例化
		// WebSite fy = f.getWebSiteCategory("产品展示");
		// fy.use();
		//
		// WebSite fz = f.getWebSiteCategory("产品展示");
		// fz.use();
		//
		// WebSite fl = f.getWebSiteCategory("博客");
		// fl.use();
		//
		// WebSite fm = f.getWebSiteCategory("博客");
		// fm.use();
		//
		// WebSite fn = f.getWebSiteCategory("博客");
		// fn.use();
		//
		// System.out.println("网站分类总数为" + f.getWebSiteCount());

		/** 享元模式网站例子第三版 **/
		WebSiteFactory f = new WebSiteFactory();

		WebSite fx = f.getWebSiteCategory("产品展示");
		fx.use(new User("小菜"));

		WebSite fy = f.getWebSiteCategory("产品展示");
		fy.use(new User("大鸟"));

		WebSite fz = f.getWebSiteCategory("产品展示");
		fz.use(new User("娇娇"));

		WebSite fl = f.getWebSiteCategory("博客");
		fl.use(new User("老顽童"));

		WebSite fm = f.getWebSiteCategory("博客");
		fm.use(new User("桃谷六仙"));

		WebSite fn = f.getWebSiteCategory("博客");
		fn.use(new User("北爱歌"));

		System.out.println("得到网站分类总数为 " + f.getWebSiteCount());

	}
}
