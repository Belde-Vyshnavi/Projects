package mini_project;

public class Bank {
	private String CustomerName;
	private long AccountNumber;
	private String BankBranch;
	private double Balance;
	private long ContactNumber;
	public Bank(){
		super();
	}
	public Bank(String CustomerName,long AccountNumber,String BankBranch,double Balance,long ContactNumber){
		super();
		this.CustomerName=CustomerName;
		this.AccountNumber=AccountNumber;
		this.BankBranch=BankBranch;
		this.Balance=Balance;
		this.ContactNumber=ContactNumber;
	}
	public String getCustomerName() {
		return CustomerName;		
	}
	public void setCustomerName(String CustomerName) {
		this.CustomerName=CustomerName;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.AccountNumber = accountNumber;
	}
	public String getBankBranch() {
		return BankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.BankBranch = bankBranch;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		this.Balance = balance;
	}
	public long getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.ContactNumber = contactNumber;
	}
	
	@Override
	public String toString() {
		return "Bank [CustomerName=" + CustomerName + ", AccountNumber=" + AccountNumber + ", BankBranch=" + BankBranch
				+ ", Balance=" + Balance + ", ContactNumber=" + ContactNumber + "]";
	}
	
	
	

}
