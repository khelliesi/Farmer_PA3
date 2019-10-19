public class Application {
    public static void main(String[] args) {
        SavingsAccount saver1, saver2;
        saver1 = new SavingsAccount(2000.00);
        saver2 = new SavingsAccount(3000.00);
        int total = 0;

        SavingsAccount.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver 1 Monthly Balances");

        for (int month = 0; int month <12;
        month++)
        {
            saver1.calculateMonthlyInterest();
            System.out.println("Month 1:" + saver1.getSavingsBalance);

        }

        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
    }
}
