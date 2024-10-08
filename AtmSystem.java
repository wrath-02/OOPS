package oops;
class Account{
	private double balance; //Data Hiding or data security
	
	//methods :: public
	public double getbalance(double balance) {
		//perform authentication
		boolean result=validate("Anshul","Anshul123");
		
		//withdrawing the money
		if(result==true) {
			this.balance=this.balance - balance;
			return balance;
			
		}
		else {
			
			System.out.println("Invalid username/password , try again...");
			return 0.0;
		}
		
		
	}
	
	//methods :: public
	public void setbalance(double balance) {
		//perform authentication
				boolean result=validate("Anshul","Anshul123");
				
				//depositing the money
				if(result==true) {
					this.balance=this.balance + balance;
					System.out.println(balance +" rupees credited to the account");
					
				}
				else {
					
					System.out.println("Invalid username/password , try again...");
				}
				
	}
	
	//methods :: private
	private boolean validate(String username,String password) {
		//Logic for authentication
		
		return username.equalsIgnoreCase("Anshul")
				&& password.equals("Anshul123");
	}
	
}

public class AtmSystem {

	public static void main(String[] args) {
		
		Account acc=new Account();
		acc.setbalance(1000.0);
		acc.getbalance(500.0);
		
		double balance=acc.getbalance(500.0);
		System.out.println("Withdrawing "+ balance + " rupees");
		
		
	}

}
