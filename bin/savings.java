package bankaccountapp;

public class savings extends Account{
	
	//List properties specific to saving account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	
	
	//constructor
	public savings(String name, String SSN, double initDepo)
	{
		super(name, SSN,initDepo );
		accNum = "1"+ accNum;
setSafetyDepositBoxID();
	}
	public void setRate()
	{
		  rate =  getBaseRate() - 0.25 ;
	}
		//List any method specific to saving  	 account
	public void setSafetyDepositBoxID()
	{
		safetyDepositBoxID = (int)(Math.random() *  Math.pow(10,3));
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
	}
	public void showinfo()
	{
		super.showinfo();
		System.out.println("Your Savings account Features"+ "\nSafety Deposit Box ID: " + safetyDepositBoxID + "\nSafety Deposit Box Key: " +	safetyDepositBoxKey );
		
	}

}
