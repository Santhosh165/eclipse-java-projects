package org.projectjava;

import java.util.Scanner;

public class AI_Bot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Welcome To AI Bot");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Hi");
		String st = "Hi";
		String str = sc.next();
		if(str.equalsIgnoreCase(st)) {
			System.out.println("What infomation did you want!!!");
			System.out.println();
			String st1 = "Java";
			String str1 = sc.next();
			if(str1.equalsIgnoreCase(st1)) {
				int range = sc.nextInt();
				for(int i=1;i<=range;i++) 
				{
					System.out.println("What infomation you want about java!!"
							+ "1.Defination of Java "
							+ "2.Features of Java "
							+ "3.Advantages of Java"
							+ "4.Application of Java");
					int num = sc.nextInt();
					switch(num) {
					case 1:
						System.out.println("Java is a widely-used programming language for coding web applications. "
								+ "It has been a popular choice among developers for over two decades, "
								+ "with millions of Java applications in use today.");
						break;
					case 2:
						System.out.println("Java is a multi-platform, object-oriented, and network-centric "
								+ "language that can be used as a platform in itself.");
						break;
					case 3:
						System.out.println(" Java is a fast, secure, reliable programming language for "
								+ "coding everything from mobile apps and enterprise software to "
								+ "big data applications and server-side technologies.");
						break;
					case 4:
						System.out.println("Advantages of java are"
								+ "1.Game Development,"
								+ "2.Cloud computing,"
								+ "3.Big Data,"
								+ "4.Artificial Intelligence,"
								+ "5.Internet of Things and"
								+ "6.Enterprices Development.");
						break;
					default:System.out.println("Invalid Input please check correctly!!!");
					}
				}
			}
		}
	}
}
