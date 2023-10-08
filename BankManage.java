package org.projectjava;

import java.util.Scanner;
class Management{
	private int BankAcc;
	private String BankAcc_Name;
	private Double Balance;
	Scanner scan = new Scanner(System.in);
	void openAcc() {
			System.out.print("Enter BankAcc: ");
			BankAcc = scan.nextInt();
			System.out.print("Enter BankAcc_Name: ");
			BankAcc_Name = scan.next();
			System.out.print("Enter Balance: ");
			Balance = scan.nextDouble();
	}
	void Balanceno() {
		System.out.println(BankAcc + ","+ BankAcc_Name+","+Balance);
	}
	
	boolean search(int acc) {
		if(BankAcc==acc) {
			Balanceno();
			return true;
		}
		return false;
	}
	void Withdrawal() {
		System.out.print("Enter Withdrawal amount: ");
		Double widra = scan.nextDouble();
		if(Balance >=widra) {
			Balance -= widra;
			System.out.println("Withdraw Successfully");
			System.out.println("Main Balance is: " + Balance);
		}
		else{
			System.out.println("Faided to withdraw");
		}
	}
	void deposite() {
		System.out.print("Enter deposite amount: ");
		Double dep = scan.nextDouble();
			Balance += dep;
			System.out.println("deposite Successfully");
			System.out.println("Main Balance is: " + Balance);
		}
}

public class BankManage {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter No Of Bank Customer: ");
		int Cus = scan.nextInt();
		Management Obj[] = new Management[Cus];
		for(int i=0;i<Obj.length;i++) {
			Obj[i]=new Management();
			Obj[i].openAcc();
		}
		System.out.println("Menu:1.ViewBankDetails 2.Search 3.Withdrawal 4.Deposite 5.Exit");
		int Ch;
		do {
			System.out.print("Enter Yr Chosie: ");
			Ch = scan.nextInt();
			switch(Ch) {
			case 1:
				for(int i=0;i<Obj.length;i++) {
					Obj[i].Balanceno();
				}
				break;
			case 2:
				System.out.println("Enter the accno you want to search:");
				int acc = scan.nextInt();
				boolean found = false;
				for(int i=0;i<Obj.length;i++) {
					found=Obj[i].search(acc);
					if(found) {
						break;
					}
				}
				if(!found) {
					System.out.println("Search Failed's");
				}
				break;
			case 3:
				System.out.println("Enter the acc no:");
				acc = scan.nextInt();
				found = false;
				
				for(int i=0;i<Obj.length;i++) {
					found=Obj[i].search(acc);
					if(found) {
						Obj[i].Withdrawal();
						break;
					}
				}
				if(!found) {
					System.out.println("Faided to withdraw");
				}
				break;
			case 4:
				System.out.println("Enter the acc no:");
				acc = scan.nextInt();
				found = false;
				for(int i=0;i<Obj.length;i++) {
					found=Obj[i].search(acc);
					if(found) {
						Obj[i].deposite();
						break;
					}
				}
				if(!found) {
					System.out.println("Faided to deposite");
				}
				break;
			case 5:
				System.out.println("Thank You For Visiting Us :) :) :) :) :)");
			}
		}while(Ch<=5);
	}
}