package com.composite.main;

import com.composite.standard.ConcreteCompany;
import com.composite.standard.FinanceDepartment;
import com.composite.standard.HRDepartment;
import com.composite.template.Composite;
import com.composite.template.Leaf;

public class Main {
	public static void main(String[] args) {
		/******** 组合模式 template ********/
		// // 树根“root”
		// Composite root = new Composite("root");
		// root.add(new Leaf("Leaf A"));
		// root.add(new Leaf("Leaf B"));
		//
		// // 根上长出分支Composite X，分枝上也有两叶LeafXA和LeafXB
		// Composite comp = new Composite("Composite X");
		// comp.add(new Leaf("Leaf XA"));
		// comp.add(new Leaf("Leaf XB"));
		//
		// root.add(comp);
		//
		// // 在Composite X上再长出分枝Composite XY，分枝上也有两叶LeafXYA和LeafXYB
		// Composite comp2 = new Composite("Composite XY");
		// comp2.add(new Leaf("Leaf XYA"));
		// comp2.add(new Leaf("Leaf XYB"));
		//
		// comp.add(comp2);
		//
		// // 根部又长出两叶LeafC和LeafD，可惜LeafD没长牢，被风吹走了
		// root.add(new Leaf("Leaf C"));
		//
		// Leaf leaf = new Leaf("Leaf D");
		// root.add(leaf);
		// root.remove(leaf);
		//
		// // 显示大树的样子
		// root.display(1);

		/******** 组合模式company example ********/
		ConcreteCompany root = new ConcreteCompany("北京总公司");
		root.add(new HRDepartment("总公司人力资源部"));
		root.add(new FinanceDepartment("总公司财务部"));

		ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
		comp.add(new HRDepartment("华东分公司人力资源部"));
		comp.add(new FinanceDepartment("华东分公司财务部"));
		root.add(comp);

		ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
		comp1.add(new HRDepartment("南京办事处人力资源部"));
		comp1.add(new FinanceDepartment("南京办事处财务部"));
		comp.add(comp1);

		ConcreteCompany comp2 = new ConcreteCompany("杭州办事处");
		comp2.add(new HRDepartment("杭州办事处人力资源部"));
		comp2.add(new FinanceDepartment("杭州办事处财务部"));
		comp.add(comp2);

		System.out.println("结构图：");
		root.display(1);

		System.out.println("\n职责：");
		root.lineOfDuty();
	}
}
