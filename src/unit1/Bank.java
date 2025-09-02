package unit1;

public class Bank {
    private int balance=10000;
    public void withdrawl(int amount){
        if(amount>balance){
            throw new InsufficientBalanceException("Cannot withdraw amount greater than ballance");
        }
        else{
            balance=balance-amount;
            System.out.println("Withdrawl Successful,Remaining Balance="+balance);
        }
    }
}
