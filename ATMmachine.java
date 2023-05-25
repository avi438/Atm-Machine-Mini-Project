import java.util.*;

public class ATMmachine{
public static void main(String[] args){
    ATM obj = new ATM();
    obj.checkpin();
  }
}

class ATM{
  int PIN=1234;
  float balance=95000;

  public void checkpin(){
    System.out.println("Enter your PIN");
    Scanner sc = new Scanner(System.in);
    int enteredpin = sc.nextInt();
    if(enteredpin == PIN) {
	        menu();
            }
    else {
	System.out.println("Entered a wrong pin, Please try again");
	checkpin();
    }

  }

  public void menu() {
    System.out.println("Enter your choice");
    System.out.println("1, Check balance");
    System.out.println("2, Withdraw money");
    System.out.println("3, Deposit money");
    System.out.println("4, EXIT");

    Scanner sc = new Scanner (System.in);
    int opt = sc.nextInt();

    if (opt == 1)
      {
	checkbalance ();
      }
    else if (opt == 2)
      {
	withdrawmoney ();
      }
    else if (opt == 3)
      {
	depositmoney ();
      }
    else if (opt == 4)
      {
	return;
      }
    else
      {
	System.out.println("Incorrect choice, Please try again ");
	
      }
      menu();

  }

  public void checkbalance()
  {
    System.out.println("Balance : " + balance);
    menu();
  }

  public void withdrawmoney()
  {
    System.out.println("Enter the amount to Withdraw");
    Scanner sc = new Scanner (System.in);
    float amount = sc.nextFloat ();
    if (amount > balance)
      {
	System.out.println("Insufficient Balance");
      }
    else
      {
	balance = balance - amount;
	System.out.println("Money Withdraw Successful");
	System.out.println("Your Final Account Balance is : " +balance);
      }
    menu ();
  }
  public void depositmoney ()
  {
    System.out.println("Enter the amount : ");
    Scanner sc = new Scanner (System.in);
    float amount = sc.nextFloat ();
    balance = amount + balance;
    System.out.println("Money Deposited Successful.");
    System.out.println("Your Final Account Balance is : " +balance);
    }
}