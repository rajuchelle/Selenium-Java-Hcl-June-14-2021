package sample;

public class BankTransactions {
	
	int balance = 10000;
	static String bankName = "ICICI";
	
	void deposit(int depositedAmount){		
		balance = balance+depositedAmount;
//		System.out.println("Balane:"+balance);
	}
	
	long withdrawl(int withdrawlAmount){
		if(balance>=withdrawlAmount){						
			balance = balance-withdrawlAmount;		
			
		}else{
			System.out.println("Insfficient balace");
		}
		
		return balance+1;
		
	}
	
	long displayBalance(){
//		System.out.println(balance);
		return balance;
	}

	public static void main(String[] args) {
		BankTransactions customer1 = new BankTransactions();
		BankTransactions customer2 = new BankTransactions();
		
		
		
		customer1.deposit(5000);		
		customer2.deposit(10000);
		
		System.out.println("Customer1:"+customer1.displayBalance());
		System.out.println("Customer2:"+customer2.displayBalance());
		
//		customer1.displayBalance();
//		customer2.displayBalance();
		
		customer1.deposit(15000);		
		customer2.deposit(20000);
		
		System.out.println("Customer1:"+customer1.displayBalance());
		System.out.println("Customer2:"+customer2.displayBalance());
		
//		customer1.displayBalance();
//		customer2.displayBalance();
		
		customer1.withdrawl(1000);		
		customer2.withdrawl(2000);
		System.out.println("Customer1:"+customer1.displayBalance());
		System.out.println("Customer2:"+customer2.displayBalance());
//		customer1.displayBalance();
//		customer2.displayBalance();
		
		int newBalance1 = (int)customer1.withdrawl(100000);
		int newBalance2 = (int)customer2.withdrawl(200000);
		
		
		System.out.println("Customer1:"+newBalance1);
		System.out.println("Customer2:"+newBalance2);
		
		
		
		
		
	}

}
