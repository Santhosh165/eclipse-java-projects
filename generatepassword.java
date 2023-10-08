package org.projectjava;

import java.util.Random;

public class generatepassword {

	public static void main(String[] args) {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYX";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String spec_char = "<>?/';;}{][+=_-";
		String combination=upper+lower+spec_char+num;
		int len = 8;
		char[] password = new char[len];
		Random ran = new Random();
		for(int i = 0;i<len;i++) {
			password[i]=combination.charAt(ran.nextInt(combination.length()));
		}
		System.out.println("Generated Password is: "+ new String(password));
	}
}
