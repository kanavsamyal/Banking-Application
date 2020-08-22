import java.util.Scanner;

public class Banking {
	public static void main(String [] args)
	{
		BankAccount obj =new BankAccount("abc","jk021");
		obj.showmenu();
	}

}
class BankAccount{
	
	int b; //Balance
	int pt; //Previous Transactions
	String cn; //Customer Name
	String ci; //Customer Id
	
	BankAccount(String cname ,String cid )
	{
		cn=cname;
		ci=cid;
	}
	
	void deposit(int amount)
	{
		if(amount > 0)
		{
			b=b+amount;
			pt=amount;
		}
	}
	
	void withdraw(int amount)
	{
		if(amount > 0)
		{
			b=b-amount;
			pt=-amount;
		}
	}
	
	void getprevioustransaction()
	{
		if(pt>0)
		{
			System.out.println("Deposited :\t"+pt);
		}
		else if(pt<0)
		{
			System.out.println("Withdrawn :\t"+Math.abs(pt));
		}
		else
		{
			System.out.println("No Transaction Occured");
		}
		
	}
	
	void showmenu()
	{
		char option='\0';
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Welcome "+cn);
		System.out.println("Your ID is "+ci);
		System.out.println("\n");
		System.out.println("A. Check Balance\nB. Deposit\nC. Withdraw\nD. Previous Transaction\nE. Exit\n");
		
		do
		{
			System.out.println("******************************\nEnter option\n******************************");
			option =scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.println("------------------------------");
				System.out.println("Balance:"+b);
				System.out.println("------------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("------------------------------");
				System.out.println("Enter an ammount to deposit:");
				System.out.println("------------------------------");
				int amount=scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("------------------------------");
				System.out.println("Enter an ammount to withdraw");
				System.out.println("------------------------------");
				int amount2=scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("------------------------------");
				getprevioustransaction();
				System.out.println("------------------------------");
				System.out.println("\n");
				break;
			
			case 'E':
				System.out.println("******************************");
				break;
				
			default:
				System.out.println("Invalid option!! Please enter again");
				break;
				
			}
			
			
			
		}while(option!='E');
		
		System.out.println("Thankyou for using our services");
	}
	
	
}
