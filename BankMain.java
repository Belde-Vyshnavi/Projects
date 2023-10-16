package mini_project;

import java.util.Scanner;

public class BankMain {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("====================================================================");
		System.out.println("============= Simple Banking Application =============================");
		System.out.println("====================================================================");
		String ch;
		BankApp app=new BankApp();
		do {
			System.out.println("\t\t 1)viewAllCustomerInfo\r\n"
					+"\t\t 2)View Bank Details ByAccountNumber\r\n"
					+ "\t\t 3)Open Bank Account.\r\n"
					+ "\t\t 4)Check Bank Balance.\r\n"
					+ "\t\t 5)Deposit Amount.\r\n"
					+"\t\t 6)updateBankByAccountNumber\r\n"
					+ "\t\t 7)Withdraw Amount.\r\n");
			System.out.println("====================================================================");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:app.viewAllCustomerInfo();
			break;
			case 2:	app.viewBankDetailsByAccountNumber();
			break;
			case 3:	app.openBankAccount();
			break;
			case 4:	app.checkBankBalance();
			break;
			case 5:	app.depositAmount();
			break;
			case 6:app.updateBankByAccountNumber();
			break;
			case 7:	app.withDrawAmount();
			break;
		    default:System.out.println("Wrong choice!!"); 		   
			
		    
		    
			}
			
			System.out.println("Do you want to continue? (Y-Yes / N-No)");
			 ch=sc.next();
			}
			while(ch.equals("Y")||ch.equals("y"));
			System.out.println("====================================================================");

			System.out.println("Bye....");
		
			System.out.println("====================================================================");


		}

	}

