package com.composite.main;

import com.composite.standard.ConcreteCompany;
import com.composite.standard.FinanceDepartment;
import com.composite.standard.HRDepartment;
import com.composite.template.Composite;
import com.composite.template.Leaf;

public class Main {
	public static void main(String[] args) {
		/******** ���ģʽ template ********/
		// // ������root��
		// Composite root = new Composite("root");
		// root.add(new Leaf("Leaf A"));
		// root.add(new Leaf("Leaf B"));
		//
		// // ���ϳ�����֧Composite X����֦��Ҳ����ҶLeafXA��LeafXB
		// Composite comp = new Composite("Composite X");
		// comp.add(new Leaf("Leaf XA"));
		// comp.add(new Leaf("Leaf XB"));
		//
		// root.add(comp);
		//
		// // ��Composite X���ٳ�����֦Composite XY����֦��Ҳ����ҶLeafXYA��LeafXYB
		// Composite comp2 = new Composite("Composite XY");
		// comp2.add(new Leaf("Leaf XYA"));
		// comp2.add(new Leaf("Leaf XYB"));
		//
		// comp.add(comp2);
		//
		// // �����ֳ�����ҶLeafC��LeafD����ϧLeafDû���Σ����紵����
		// root.add(new Leaf("Leaf C"));
		//
		// Leaf leaf = new Leaf("Leaf D");
		// root.add(leaf);
		// root.remove(leaf);
		//
		// // ��ʾ����������
		// root.display(1);

		/******** ���ģʽcompany example ********/
		ConcreteCompany root = new ConcreteCompany("�����ܹ�˾");
		root.add(new HRDepartment("�ܹ�˾������Դ��"));
		root.add(new FinanceDepartment("�ܹ�˾����"));

		ConcreteCompany comp = new ConcreteCompany("�Ϻ������ֹ�˾");
		comp.add(new HRDepartment("�����ֹ�˾������Դ��"));
		comp.add(new FinanceDepartment("�����ֹ�˾����"));
		root.add(comp);

		ConcreteCompany comp1 = new ConcreteCompany("�Ͼ����´�");
		comp1.add(new HRDepartment("�Ͼ����´�������Դ��"));
		comp1.add(new FinanceDepartment("�Ͼ����´�����"));
		comp.add(comp1);

		ConcreteCompany comp2 = new ConcreteCompany("���ݰ��´�");
		comp2.add(new HRDepartment("���ݰ��´�������Դ��"));
		comp2.add(new FinanceDepartment("���ݰ��´�����"));
		comp.add(comp2);

		System.out.println("�ṹͼ��");
		root.display(1);

		System.out.println("\nְ��");
		root.lineOfDuty();
	}
}
