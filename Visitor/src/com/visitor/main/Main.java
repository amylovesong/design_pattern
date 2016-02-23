package com.visitor.main;

import com.visitor.template.ConcreteElementA;
import com.visitor.template.ConcreteElementB;
import com.visitor.template.ConcreteVisitor1;
import com.visitor.template.ConcreteVisitor2;
import com.visitor.template.ObjectStructure;

public class Main {
	public static void main(String[] args) {
		/** 访问者模式第一版 **/
		// ArrayList<Person> persons = new ArrayList<>();
		//
		// Person man1 = new Man();
		// man1.setAction("成功");
		// persons.add(man1);
		// Person woman1 = new Woman();
		// woman1.setAction("成功");
		// persons.add(woman1);
		//
		// Person man2 = new Man();
		// man2.setAction("失败");
		// persons.add(man2);
		// Person woman2 = new Woman();
		// woman2.setAction("失败");
		// persons.add(woman2);
		//
		// Person man3 = new Man();
		// man3.setAction("恋爱");
		// persons.add(man3);
		// Person woman3 = new Woman();
		// woman3.setAction("恋爱");
		// persons.add(woman3);
		//
		// for (Person person : persons) {
		// person.getConclusion();
		// }

		/** 访问者模式第二版 **/
		// ObjectStructure o = new ObjectStructure();
		// // 在对象结构中加入要对比的“男人”和“女人”
		// o.attach(new Man());
		// o.attach(new Woman());
		//
		// /*--- 查看在各种状态下，“男人”和“女人”的反应 ---*/
		// // 成功时的反应
		// Success v1 = new Success();
		// o.display(v1);
		//
		// // 失败时的反应
		// Failing v2 = new Failing();
		// o.display(v2);
		//
		// // 恋爱时的反应
		// Amativeness v3 = new Amativeness();
		// o.display(v3);
		//
		// // 增加恋爱状态的反应
		// Marriage v4 = new Marriage();
		// o.display(v4);

		/** 访问者模式模板 **/
		ObjectStructure o = new ObjectStructure();
		o.attach(new ConcreteElementA());
		o.attach(new ConcreteElementB());

		ConcreteVisitor1 v1 = new ConcreteVisitor1();
		ConcreteVisitor2 v2 = new ConcreteVisitor2();

		o.accept(v1);
		o.accept(v2);

	}
}
