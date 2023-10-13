// Made by - Vaibhav Singh
//Motto - El Psy kongroo


package bankaccountapp;
import java.util.LinkedList;
import java.util.List;
public class BankAccountApp {

	public static void main(String[] args)
	{
		List<Account> accounts = new LinkedList<Account>();
		//I am going to read a csv file and create new accounts
		String file = "C:\\\\Users\\\\91884\\\\eclipse-workspace\\\\BankManagementSystem\\\\src\\\\bankaccountapp\\NewBankAccounts.csv";
List<String[]> newAccountHolders = utilities.CSV.read(file);
for(String[] accountHolder : newAccountHolders)
{
	String name = accountHolder[0];
	String SSN = accountHolder[1];
	String accountType = accountHolder[2];
	double initDeposit = Double.parseDouble(accountHolder[3]);
if(accountType.equals("Savings"))
{
accounts.add(new savings(name,SSN,initDeposit));
}
else if(accountType.equals("Checking"))
{
	accounts.add(new checking(name,SSN,initDeposit)); 
}
else 
{
	System.out.println("Error reading the account type");
}
}

		for(Account ac : accounts)
		{
			System.out.println("\n*************");
			ac.showinfo();
		}
//Features to add later
// accounts.get((int) Math.random() * accounts.size()).deposit(1000);
	}
}
