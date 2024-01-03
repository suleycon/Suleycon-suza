import java.util.Scanner;
class Account{
    int Account_balance;

public Account(int Account_balance){
    if(Account_balance>=0){
        this.Account_balance=Account_balance;
    }
    else
    {
        this.Account_balance=0;
        System.out.println("initial balance was invalid");
    }
}
public void credit(int amount){
    Account_balance=amount+Account_balance;
}
public void debit(int amount){
    if(amount>Account_balance){
       System.out.print("Debit amount exeed acount balance"); 
       Account_balance=Account_balance;
    }
    else
    { 
       Account_balance=Account_balance-amount;
    }
    
}
public int getbalance(){
    return Account_balance;
}

}
class AccountTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial balance : ");
        int initial = input.nextInt();
        Account acc1 = new Account(initial);
        System.out.print("Choose 1 for credit or choose 2 for debit : ");
        int choise = input.nextInt();
        if(choise==1){
           System.out.print("Enter credit amount : "); 
           int cre = input.nextInt();
           acc1.credit(cre);
           System.out.print("The new balance is : "+acc1.getbalance());
        }
        else if(choise==2){
           System.out.print("Enter debit amount : "); 
           int deb = input.nextInt();
           acc1.debit(deb);
           System.out.print("The balance is : "+ acc1.Account_balance);
        }
        else
        {
             System.out.print("Wrong choise");
        }
    
    }
}
    
