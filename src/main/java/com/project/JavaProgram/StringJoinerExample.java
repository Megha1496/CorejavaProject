package com.project.JavaProgram;

import java.util.StringJoiner;

/*
 * @Author - Megha Dutta
 */
public class StringJoinerExample {
	public static void main(String[] args) {

		StringJoiner stJoiner = new StringJoiner(",", "[", "]");

		stJoiner.add("Megha");
		stJoiner.add("Rahul");

		StringJoiner stJoiner2 = new StringJoiner(":", "[", "]");

		stJoiner.add("Sakshi");
		stJoiner.add("Priya");

		StringJoiner merger = stJoiner.merge(stJoiner2);

		System.out.println(merger);

		StringJoiner stJoiner3 = new StringJoiner(",");
		System.out.println(stJoiner3);

		stJoiner3.setEmptyValue("This is empty String Joiner");

		stJoiner3.add("shivani");
		stJoiner3.add("nitin");

		int length = stJoiner3.length();
		System.out.println("Length is " + length);

		String str = stJoiner3.toString();
		System.out.println(str);

	}

}
