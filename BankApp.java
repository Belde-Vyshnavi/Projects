package mini_project;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {
	static Scanner sc=new Scanner(System.in);
	ArrayList<Bank> banklist=new ArrayList<Bank>();
	
	long AccountNumber;
	public BankApp(){
		banklist.add(new Bank("Vyshnavi",123,"Hyderabad",7000,7292014892L));
		banklist.add(new Bank("Sri",124,"Banglore",20000,9826910231L));
		
	}
	public void viewAllCustomerInfo()
	{   		
		System.out.println("==================================================================================================");

		if(banklist.size()==0)
		{
			System.out.println("No record found!!");
		}
		
		
		for(Bank B:banklist)
		{
			
			System.out.println("Customer Name :"+B.getCustomerName()+"\nAccount Number: "+B. getAccountNumber()+"\nBank Branch   : "+B.getBankBranch()+"\nContact       : "+B.getContactNumber());
			System.out.println("=================================================");
		}
		System.out.println("==================================================================================================");

	}
	public void viewBankDetailsByAccountNumber() {
		System.out.println("=================================View Bank Details=======================================");
		System.out.println("Enter your Account Number");
		long AccountNumber=sc.nextLong();
		int flag=0;
		for(Bank B:banklist) {
			if(AccountNumber==B.getAccountNumber()) {
				flag=1;
				System.out.println("Customer Name :"+B.getCustomerName()+"\nAccount Number: "+B. getAccountNumber()+"\nBank Branch   : "+B.getBankBranch()+"\nBalance       : "+B.getBalance()+"\nContact       : "+B.getContactNumber());
				break;
			}
			
		}
		if(flag==0) {
			System.out.println("Customer does not exist!!");
			}
		
		
	}
	
	public void openBankAccount() {
		System.out.println("========================================Open Bank Account==================================================");
		System.out.println("Open an Account with minimum balance of 500Rs ");
		
		System.out.println("Enter Customer Name: ");
		String CustomerName=sc.next();
		System.out.println("Enter Account Number: ");
		long AccountNumber=sc.nextLong();
		System.out.println("Enter Bank Branch: ");
		String BankBranch=sc.next();
		System.out.println("Enter ContactNumber: ");
		long ContactNumber=sc.nextLong();
		System.out.println("please add a minimum amount of 500Rs");
		System.out.println("Enter  Balance: ");
		double Balance=sc.nextDouble();
		if(Balance>=500) {
			Bank B=new Bank(CustomerName,AccountNumber,BankBranch,Balance,ContactNumber);
			banklist.add(B);
			System.out.println(B);
			System.out.println("Succesfully Account created");
		}
		else {
			System.out.println("Sorry minimum amount of 500Rs need to be deposited");
		}
		System.out.println("==================================================================================================");
	}
	
	public void checkBankBalance() {
		System.out.println("=================================Check Bank Balance=======================================");
		System.out.println("Enter your Account Number");
		long AccountNumber=sc.nextLong();
		int flag=0;
		for(Bank B:banklist) {
			if(AccountNumber==B.getAccountNumber()) {
				flag=1;
				System.out.println("Your balance is "+B.getBalance());
				break;
			}
			
		}
		if(flag==0) {
			System.out.println("Sorry You have no account");
			}
		
		
	}
	public void depositAmount() {
		System.out.println("=================================Check Bank Balance=======================================");
		System.out.println("Enter your Account Number");
		long AccountNumber=sc.nextLong();
		System.out.println("Enter amount to deposit");
		float depositamount=sc.nextFloat();		
		for(Bank B:banklist) {
			if(AccountNumber==B.getAccountNumber()) {
				double Balance1=B.getBalance();
				Balance1=Balance1+depositamount;
				System.out.println("You have deposited an amount of "+depositamount);
				System.out.println("Now your current balance is "+Balance1);
				
			}
		}
		System.out.println("==================================================================================================");

		
	}
	public void updateBankByAccountNumber()
	{
		System.out.println("Enter Account Number:");
		long AccountNumber1=sc.nextLong();
	    int flag=0,index = 0;
	    Bank bank=null;
	    for(Bank B:banklist)//101
	    {
	    	if(B.getAccountNumber()==AccountNumber1)
	    	{
	    		flag=1;
	    		index=banklist.indexOf(B);//101
	    		System.out.println(index);
	    		bank=B;
	    		break;
	    	}
	    }
	    
	    if(flag==1)
	    {
	    	System.out.println("Enter Customer Name: ");
			String CustomerName=sc.next();
			System.out.println("Enter Account Number: ");
			long AccountNumber=sc.nextLong();
			System.out.println("Enter Bank Branch: ");
			String BankBranch=sc.next();			
			System.out.println("Enter Customer Contact: ");
			long ContactNumber=sc.nextLong();
			
			bank.setCustomerName(CustomerName);
			bank.setAccountNumber(AccountNumber);
			bank.setBankBranch(BankBranch);
			bank.setContactNumber(ContactNumber);
			
			banklist.set(index,bank);
			System.out.println("==================================================================================================");

			System.out.println("Customer Details updated!!");
	    }
	    else
	    {
	    	System.out.println("Id does not exist!!");
	    }
		System.out.println("==================================================================================================");

	}
	public void withDrawAmount() {
		System.out.println("================================= WithDraw Amount =======================================");
		System.out.println("Enter your Account Number");
		long AccountNumber=sc.nextLong();
		for(Bank B:banklist) {
			if(AccountNumber==B.getAccountNumber()) {
				double Balance1=B.getBalance();
				System.out.println("Your Balance Amount is :"+Balance1);
				System.out.println("Enter an amount to withdraw");
				float WithDrawAmount=sc.nextFloat();
				if(Balance1>WithDrawAmount) {
					Balance1=Balance1-WithDrawAmount;
					System.out.println("Your remaining balance is "+Balance1);
				}
				else {
					System.out.println("You have insufficient balance");
				}
			}
	}
		System.out.println("==================================================================================================");

}
}
