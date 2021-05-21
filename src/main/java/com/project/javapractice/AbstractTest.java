package com.project.javapractice;





abstract class AbstractClass {

	public AbstractClass() {
		System.out.println("You can create constructor in abstract class");
	}

	abstract int add(int a, int b);

	void show() {
		System.out.println("showing");
	}

	static int sub(int a, int b) {
		return a - b;

	}

}

class AbstractDemo extends AbstractClass {

	@Override
	int add(int a, int b) {
		return a + b;

	}

}

public class AbstractTest {

	public static void main(String[] args) {

		AbstractClass ac = new AbstractDemo();
		int result1 = ac.add(30, 10);
		ac.show();
		int result2 = AbstractClass.sub(90, 30);
		System.out.println(result1);
		System.out.println(result2);

	}

}
