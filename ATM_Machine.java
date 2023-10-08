package org.projectjava;

//import java.util.Iterator;
import java.util.Scanner;

public class ATM_Machine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome To ABC Bank ATM Machine :) :) :) :) :) :)");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("Enter your Account Number: ");
		int accno = scan.nextInt();
		System.out.println("Hi Sir/Mam, please check your account number here: " + accno);
		System.out.println("If your account number is correct press 'Okay'");
		String str = scan.next();
		String str1= "Okay";
		if(str.equalsIgnoreCase(str1)) {
			System.out.print("Enter your Password: ");
			int pass = scan.nextInt();
			System.out.print("Enter your initial amount: ");
			double init = scan.nextDouble();
			System.out.print("Select your process range: ");
			int range = scan.nextInt();
			for(int i=1;i<=range;i++){
				System.out.println();
				System.out.println();
				System.out.println("Select the account you want to process:");
				System.out.println("Typr 1: Saving Account");
				System.out.println("Typr 2: Current Account");
				System.out.println("Typr 3: Exit");
				System.out.print("Enter your Choise:");
				int choise = scan.nextInt();
				switch(choise) {
				case 1:
					System.out.println();
					System.out.println();
					System.out.println("Saving Account");
					System.out.println("Type 1: Deposit");
					System.out.println("Type 2: Withdraw");
					System.out.println("Type 3: View Balance");
					System.out.println("Type 4: Exit");
					System.out.println();
					System.out.println();
					System.out.print("Enter your Choise:");
					int choise1 = scan.nextInt();
					double bal ;
					double bal1;
					switch(choise1) {
					case 1:
						System.out.print("Enter your deposit amount here:");
						double dep = scan.nextDouble();
						System.out.println("Amount you want to deposit from saving account : " + dep);
						init+=dep; 
						System.out.println("New Saving Account Balance is :" + init);
						System.out.println("Thank You Come Again");
						break;
					case 2:
						System.out.println("Enter your Withdraw amount here:");
						double dra = scan.nextDouble();
						System.out.println("Wait Your Transaction Is Being Processed");
						System.out.println("Press 1 to collect your Cash :" + dra);
						bal1 = init-dra;
						System.out.println("New Account Balance is:" + bal1);
						String str2 = "1";
						String str3 = scan.next();
						if(str2.equals(str3)) {
							System.out.println("Collect your Cash");
							System.out.println("Have a nice day");
							System.out.println("Thank You Come Again");
						}
						break;
					case 3:
						System.out.print("Enter your new deposit amount: ");
						double dep1 = scan.nextDouble();
						System.out.print("Enter your new withdraw amount: ");
						double dra1 = scan.nextDouble();
						System.out.println("Your Account Balance is : " + (init+(dep1-dra1)));
						System.out.println("Thank You Come Again");
						break;
					default:
						System.out.println("Invalid Data your enter");
						System.out.println("Please Contact to ypur Respected Bank");
					}
					break;
				case 2:
					System.out.println();
					System.out.println();
					System.out.println("Current Account");
					System.out.println("Type 1: Deposit");
					System.out.println("Type 2: Withdraw");
					System.out.println("Type 3: View Balance");
					System.out.println("Type 4: Exit");
					System.out.println();
					System.out.println();
					System.out.print("Enter your Choise:");
					int choise2 = scan.nextInt();
					double bal11 ;
					double bal2;
					switch(choise2) {
					case 1:
						System.out.print("Enter your deposit amount here:");
						double dep = scan.nextDouble();
						System.out.println("Amount you want to deposit from saving account : " + dep);
						init+=dep; 
						System.out.println("New Saving Account Balance is :" + init);
						System.out.println("Thank You Come Again");
						break;
					case 2:
						System.out.println("Enter your Withdraw amount here:");
						double dra = scan.nextDouble();
						System.out.println("Wait Your Transaction Is Being Processed");
						System.out.println("Press 1 to collect your Cash :" + dra);
						bal11 = init-dra;
						System.out.println("New Account Balance is:" + bal11);
						String str2 = "1";
						String str3 = scan.next();
						if(str2.equals(str3)) {
							System.out.println("Collect your Cash");
							System.out.println("Have a nice day");
							System.out.println("Thank You Come Again");
						}
						break;
					case 3:
						System.out.print("Enter your new deposit amount: ");
						double dep1 = scan.nextDouble();
						System.out.print("Enter your new withdraw amount: ");
						double dra1 = scan.nextDouble();
						System.out.println("Your Account Balance is : " + (init+(dep1-dra1)));
						System.out.println("Thank You Come Again");
						break;
					default:
						System.out.println("Invalid Data your enter");
						System.out.println("Please Contact to ypur Respected Bank");
					}
					break;
				case 3:
					System.out.println("Thank YOu For Visiting Us :) :) :) :) :) :) :) :) :)");
					break;
				default:
					System.out.println("Invalid Data your enter");
					System.out.println("Please Contact to ypur Respected Bank");
				}
			}
		}
	}
}