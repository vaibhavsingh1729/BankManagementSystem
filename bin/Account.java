
package bankaccountapp;


public abstract class Account implements IBaseRate {
	
	
	//List common properties for saving and checking account
   private String name;
   private  String SSN;
   protected String accNum;
private static int index = 10000;
   private  double Balance;
    protected double rate;
     
//     
	
	//constructor to set base properties initialize the account
	public Account(String name,String SSN,double initDepo)
	{
		this.name = name;
		this.SSN = SSN;
		Balance = initDepo;
		
//		System.out.print("New Account: ");
		
		//set account number
		index++;
this.accNum = setAccNum();
setRate();

	}
	
	
	//methods
	private String setAccNum()
	{
String last2SSN = SSN.substring(SSN.length()- 2 ,SSN.length());
int uniqueID = index;
int randNumber = (int) (Math.random()* Math.pow(10,3));
return last2SSN + uniqueID + randNumber  ;
	}

public void deposit(double amount)
{
	Balance += amount;
	System.out.println("Depositing $"+ amount);
	printBalance();
}
public void withdraw(double amount)
{
	Balance -= amount;
	System.out.println("Withdrawing $"+ amount);
	printBalance();
}
public void transfer(String where, double amount)
{
	Balance -= amount;
	System.out.println("Transfering $"+amount+ " to " + where);
	printBalance();
}
public void printBalance()
{
	System.out.println("Your Balance is now: $"+ Balance);
}
public void compound()
{
	double accruedInterest = Balance * (rate/100);
	Balance += accruedInterest;
    System.out.println("Your accrued interest is "+ accruedInterest);	
}


	public abstract void setRate();
	public void showinfo()
	{
		System.out.println("Name: "+ name + "\nAccount Number: " + accNum + "\nBalance: $" + Balance + "\nRate: "+ rate +"%");
		
	}

   

}
