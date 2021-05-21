package com.project.javapractice;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		String[] st = new String[10];
		st[1] = "megha";
		st[2] = "simmi";
		st[3] = "shivani";
		st[4] = "anu";
		st[5] = "sam";

		Optional<String> op = Optional.ofNullable(st[6]);
		System.out.println(op);
		if (op.isPresent()) {
			String lowercase = st[6].toUpperCase();
			System.out.println(lowercase);
		} else {
			System.out.println("String value is not present");
		}

	}

}