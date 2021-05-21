package com.project.javapractice;



interface InterfaceTest {
public int values(int a, int b);

}

public class LemdaWithMultipleParameter {

	public static void main(String[] args) {

		InterfaceTest t = (int a, int b) -> {
			return a + b;
		};
		System.out.println(t.values(10, 20));

		InterfaceTest t2 = (a, b) -> (a + b);
		System.out.println(t2.values(10, 10));

	}

}
