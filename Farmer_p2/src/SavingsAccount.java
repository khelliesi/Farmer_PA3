import java.sql.Savepoint;
import java.util.Scanner;
public class SavingsAccount {

    private static double annualInterestRate;
    private static double savingsBalance;
    public static double calculateMonthlyInterest()
    {
        return (savingsBalance * annualInterestRate)/12;
        //add to savings balance
    }
    public static void modifyInterestRate(double newInterestRate)
    {
        double annualInterestRate;
        annualInterestRate = newInterestRate;
    }
    public SavingsAccount(double savingsBalance)
    {
       this.savingsBalance = savingsBalance;
    }
    public static void main(String[] args){

    }
}
