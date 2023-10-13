package bankaccountapp;

public class checking extends Account {

	
	//List properties specific to checking account
	
	private int DebitCardNum;
	private int DebitCardPin;
	
	
//constructor
	public checking(String name, String SSN, double initDepo )
	{  
		super(name,SSN,initDepo);
		accNum = "2"+ accNum;
		setDebitCard();
		
	}
	public void setRate()
	{
  rate =  getBaseRate() - 0.15 ;
	}
	public void setDebitCard()
	{
		DebitCardNum =(int) (Math.random() * Math.pow(10, 12));
		DebitCardPin = (int) (Math.random()* Math.pow(10,4));
	}
	public void showinfo()
	{
		super.showinfo();
		System.out.println("Your Checking Account features");
		System.out.println("Debit Card Number: " + DebitCardNum + "\nDebit Card Pin: " + DebitCardPin);
	}
	//List any method specific to checking account
}
