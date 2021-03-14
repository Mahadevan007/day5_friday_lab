package day5_labbook;

public class Question45 {
	public static void main(String[] args) {
		
	}
}


class BankAccount {
	String depositorName;
	int accountNumber;
	String typeOfAccount;
	int balance;
	int limit = 1000000;
	
	public void setDetails(String depositorName,int accountNumber, String typeOfAccount, int balance) {
		this.depositorName = depositorName;
		this.accountNumber = accountNumber;
		this.typeOfAccount = typeOfAccount;
		this.balance = balance;
	}
	
	public int depositAmount(int amountToBeDeposited) {
		int remainingBalance = balance + amountToBeDeposited;
		if(remainingBalance > limit) {
			System.out.println("Exceeds the limit");
			return -1;
		}else {
			balance = remainingBalance;
			return amountToBeDeposited; 
		}
	}
	
	public String getName() {
		return this.depositorName;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
}