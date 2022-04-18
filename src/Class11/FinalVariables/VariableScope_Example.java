package Class11.FinalVariables;

public class VariableScope_Example {

    double balance;

    // deposit
    public void deposit() {
        // code to make deposit
        // balance = balance + depositAmt
    }

    // withdraw
    public void withdraw() {
        // code to make deposit
        // balance = balance - withdrawAmt
    }

    // showBalance
    public void showBalance() {
        // System.out.println(balance);
    }

    /*
        deposit()       balance = 1000
        showBalance()   balance = 1000
        withDraw()      balance = 1000 - 100
        showBalance()   balance = 900
     */


}
