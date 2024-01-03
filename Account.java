public class Account{
    private int balance;
    public Account(int intialBalance){
        if (intialBalance >= 0){
            this.balance = intialBalance;
                } else {
                    System.out.println("Error: Invalid initial balance. Setting balnce to 0.");
                    this.balance = 0;
            }
        }

        public void credit(int amount) {
            balance += amount;
        }


        public void debit(int amount){
            if (amount <= balance){
                balance -= amount;
            } else {
                System.out.println("Debit amount axceed accountb balance.");
            }
        }

        public int getBalance() {
            return balance;
        }


            public static void main(String[] args){
                Account acc1 = new Account(1000);
                Account acc2 = new Account(-500);
                acc1.credit(200);
                acc2.debit(700);
                

                  System.out.println("Account 1 balance: $" + acc1.getBalance() );
                System.out.println("Account 2 balance: $"  + acc2.getBalance() );
            }
}