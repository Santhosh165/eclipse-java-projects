package org.projectjava;

import java.util.Scanner;

public class Quizs {
	Scanner sc = new Scanner(System.in);
	public String javabasics(){
		for(int i=1;i<=10;i++) {
			switch(i) {
			case 1:
				System.out.println("1. Who invented Java Programming?");
				System.out.println("a) Guido van Rossum");
				System.out.println("b) James Gosling");
				System.out.println("c) Dennis Ritchie");
				System.out.println("d) Bjarne Stroustrup");
				System.out.print("Enter your answer: ");
				char ch = sc.next().charAt(0);
				if(ch=='b') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 2:
				System.out.println("2. Which one of the following is not a Java feature?");
				System.out.println("a) Object-oriented");
				System.out.println("b) Use of pointers");
				System.out.println("c) Dennis Ritchie");
				System.out.println("d) Dynamic and Extensible");
				System.out.print("Enter your answer: ");
				char ch1 = sc.next().charAt(0);
				if(ch1=='b') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 3:
				System.out.println("3. What is the extension of java code files?");
				System.out.println("a) .js");
				System.out.println("b) .txt");
				System.out.println("c) .php");
				System.out.println("d) .java");
				System.out.print("Enter your answer: ");
				char ch2 = sc.next().charAt(0);
				if(ch2=='d') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 4:
				System.out.println("4.  Which of these cannot be used for a variable name in Java?");
				System.out.println("a) identifier & keyword");
				System.out.println("b) identifier");
				System.out.println("c) keyword");
				System.out.println("d) none of the mentioned");
				System.out.print("Enter your answer: ");
				char ch3 = sc.next().charAt(0);
				if(ch3=='c') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 5:
				System.out.println("5.  Which component is used to compile, debug and execute the java programs?");
				System.out.println("a) JRE");
				System.out.println("b)  JVM");
				System.out.println("c) JDK");
				System.out.println("d) JIT");
				System.out.print("Enter your answer: ");
				char ch4 = sc.next().charAt(0);
				if(ch4=='c') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 6:
				System.out.println("6. Arrays in java are-");
				System.out.println("a) Object reference");
				System.out.println("b) objects");
				System.out.println("c) primitive data type");
				System.out.println("d) None");
				System.out.print("Enter your answer: ");
				char ch5 = sc.next().charAt(0);
				if(ch5=='b') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 7:
				System.out.println("7. Evaluate the following Java expression, if x=3, y=5, and z=10"
						+ "++z + y - y + z + x++");
				System.out.println("a) 24");
				System.out.println("b) 23");
				System.out.println("c) 20");
				System.out.println("d) 25");
				System.out.print("Enter your answer: ");
				char ch6 = sc.next().charAt(0);
				if(ch6=='d') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 8:
				System.out.println("8. Which of the following for loop declaration is not valid?");
				System.out.println("a) for ( int i = 99; i >= 0; i / 9 )");
				System.out.println("b) for ( int i = 7; i <= 77; i += 7 )");
				System.out.println("c) for ( int i = 20; i >= 2; - -i )");
				System.out.println("d) for ( int i = 2; i <= 20; i = 2* i )");
				System.out.print("Enter your answer: ");
				char ch7 = sc.next().charAt(0);
				if(ch7=='a') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 9:
				System.out.println("9. Which package contains the Random class?");
				System.out.println("a) java.util package");
				System.out.println("b) java.lang package");
				System.out.println("c) java.awt package");
				System.out.println("d) java.io package");
				System.out.print("Enter your answer: ");
				char ch8 = sc.next().charAt(0);
				if(ch8=='a') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 10:
				System.out.println("10. In which memory a String is stored, when we create a string using new operator?");
				System.out.println("a) Stack");
				System.out.println("b) String memory");
				System.out.println("c) Heap memory");
				System.out.println("d) Random storage space");
				System.out.print("Enter your answer: ");
				char ch9 = sc.next().charAt(0);
				if(ch9=='c') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
			}
	}
		return null;
}
	public String Oops_concepts(){
		for(int i=1;i<=10;i++) {
			switch(i) {
			case 1:
				System.out.println("1. Which of the following is not OOPS concept in Java?");
				System.out.println("a) Encapsulation");
				System.out.println("b) Compilation");
				System.out.println("c) Polymorphism");
				System.out.println("d) Abstraction");
				System.out.print("Enter your answer: ");
				char ch = sc.next().charAt(0);
				if(ch=='b') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 2:
				System.out.println("2. Which of the following is a type of polymorphism in Java?");
				System.out.println("a) Compile time polymorphism");
				System.out.println("b) Runtime time polymorphism");
				System.out.println("c) Both a and b");
				System.out.println("d) None");
				System.out.print("Enter your answer: ");
				char ch1 = sc.next().charAt(0);
				if(ch1=='a') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 3:
				System.out.println("3. When does method overloading is determined?");
				System.out.println("a) At run time");
				System.out.println("b) At error time");
				System.out.println("c) At compile time");
				System.out.println("d) Both a and b");
				System.out.print("Enter your answer: ");
				char ch2= sc.next().charAt(0);
				if(ch2=='c') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 4:
				System.out.println("4.  Which concept of Java is a way of converting real world objects in terms of class?");
				System.out.println("a) Encapsulation");
				System.out.println("b) Inheritance");
				System.out.println("c) Polymorphism");
				System.out.println("d) Abstraction");
				System.out.print("Enter your answer: ");
				char ch3= sc.next().charAt(0);
				if(ch3=='d') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 5:
				System.out.println("5. Which concept of Java is achieved by combining methods and attribute into a class?");
				System.out.println("a) Encapsulation");
				System.out.println("b) Polymorphism");
				System.out.println("c) Abstraction");
				System.out.println("d) Inheritance");
				System.out.print("Enter your answer: ");
				char ch4= sc.next().charAt(0);
				if(ch4=='a') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 6:
				System.out.println("6. Method overriding is combination of inheritance and polymorphism?");
				System.out.println("a) True");
				System.out.println("b) False");
				System.out.print("Enter your answer: ");
				char ch5 = sc.next().charAt(0);
				if(ch5=='a') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 7:
				System.out.println("7. Which concept of Java is achieved by combining methods and attribute into a class?");
				System.out.println("a) Encapsulation");
				System.out.println("b) Polymorphism");
				System.out.println("c) Abstraction");
				System.out.println("d) Inheritance");
				System.out.print("Enter your answer: ");
				char ch6 = sc.next().charAt(0);
				if(ch6=='a') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 8:
				System.out.println("8. What is it called if an object has its own lifecycle and there is no owner?");
				System.out.println("a) Aggregation");
				System.out.println("b) Composition");
				System.out.println("c) Encapsulation");
				System.out.println("d)  Association");
				System.out.print("Enter your answer: ");
				char ch7 = sc.next().charAt(0);
				if(ch7=='d') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 9:
				System.out.println("9. Java is pure OOP language.");
				System.out.println("a) True");
				System.out.println("b) False");
				System.out.print("Enter your answer: ");
				char ch8 = sc.next().charAt(0);
				if(ch8=='c') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 10:
				System.out.println("10. A class ___________ interface.");
				System.out.println("a) extends");
				System.out.println("b) implements");
				System.out.println("c) both of the above");
				System.out.println("d) none of the above");
				System.out.print("Enter your answer: ");
				char ch9 = sc.next().charAt(0);
				if(ch9=='b') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
			}
		}
		return null;
		
	}
	public String Advance_in_java() {
		for(int i=1;i<=10;i++) {
			switch(i) {
			case 1:
				System.out.println("1. Which of these packages contain all the collection classes?");
				System.out.println("a) java.lang");
				System.out.println("b) java.util");
				System.out.println("c) java.net");
				System.out.println("d) java.awt");
				System.out.print("Enter your answer: ");
				char ch = sc.next().charAt(0);
				if(ch=='b') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 2:
				System.out.println("2. Which of these classes is not part of Java’s collection framework?");
				System.out.println("a) Maps");
				System.out.println("b) Array");
				System.out.println("c) Stack");
				System.out.println("d) Queue");
				System.out.print("Enter your answer: ");
				char ch1 = sc.next().charAt(0);
				if(ch1=='a') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 3:
				System.out.println("3. Which of this interface is not a part of Java’s collection framework?");
				System.out.println("a) List");
				System.out.println("b) Set");
				System.out.println("c) SortedMap");
				System.out.println("d) SortedList");
				System.out.print("Enter your answer: ");
				char ch2= sc.next().charAt(0);
				if(ch2=='d') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 4:
				System.out.println("4. Which of these methods deletes all the elements from invoking collection?");
				System.out.println("a) clear()");
				System.out.println("b) reset()");
				System.out.println("c)  delete()");
				System.out.println("d) refresh()");
				System.out.print("Enter your answer: ");
				char ch3= sc.next().charAt(0);
				if(ch3=='a') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 5:
				System.out.println("5. What is Collection in Java?");
				System.out.println("a) A group of objects");
				System.out.println("b) A group of classes");
				System.out.println("c) A group of interfaces");
				System.out.println("d) None of the mentioned");
				System.out.print("Enter your answer: ");
				char ch4= sc.next().charAt(0);
				if(ch4=='c') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 6:
				System.out.println("6. Which of the following is a part of the Java Collections Framework?");
				System.out.println("a) ArrayList");
				System.out.println("b) Array");
				System.out.println("c) int[]");
				System.out.println("d) String");
				System.out.print("Enter your answer: ");
				char ch5 = sc.next().charAt(0);
				if(ch5=='a') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 7:
				System.out.println("7. Which is the root interface of the Java Collection framework hierarchy?");
				System.out.println("a) Collection");
				System.out.println("b) Root");
				System.out.println("c) Collections");
				System.out.println("d) List/Set");
				System.out.print("Enter your answer: ");
				char ch6 = sc.next().charAt(0);
				if(ch6=='a') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 8:
				System.out.println("8. Which collection does not allow duplicate elements?");
				System.out.println("a) List");
				System.out.println("b) Set");
				System.out.println("c) Map");
				System.out.println("d) All the above");
				System.out.print("Enter your answer: ");
				char ch7 = sc.next().charAt(0);
				if(ch7=='b') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 9:
				System.out.println("9. What is the implementation of the List interface?");
				System.out.println("a) HashMap");
				System.out.println("b) HashSet");
				System.out.println("c) LinkedList");
				System.out.println("d) LinkedHashSet");
				System.out.print("Enter your answer: ");
				char ch8 = sc.next().charAt(0);
				if(ch8=='c') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
				break;
			case 10:
				System.out.println("10. Which class is a resizable array implementation?");
				System.out.println("a) LinkedList");
				System.out.println("b) ArrayList");
				System.out.println("c) HashSet");
				System.out.println("d) ArrayDeque");
				System.out.print("Enter your answer: ");
				char ch9 = sc.next().charAt(0);
				if(ch9=='b') {
					System.out.println("correct");
				}
				else {
					System.out.println("worng");
				}
			}
		}
		return null;		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quizs qu = new Quizs();
		System.out.println("Quiz's on ");
		System.out.println("1. javabasics");
		System.out.println("2. Oops concepts ");
		System.out.println("3. Advance in java");
		System.out.print("Enter your choose: ");
		int sw = sc.nextInt();
		switch(sw) {
		case 1:
			qu.javabasics();
			break;
		case 2:
			qu.Oops_concepts();
			break;
		case 3:
			qu.Advance_in_java();
			break;
		default:
			System.out.println("Invalid Input!!!!!");
		}
	}
}