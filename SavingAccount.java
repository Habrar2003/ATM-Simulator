import java.util.Scanner;

public class SavingAccount extends Account {
   private double InterestRate = 0.1; // Interest rate attribute

   public SavingAccount(int theAccountNumber, int thePIN, double theAvailableBalance, double theTotalBalance) {
      // initialize superclass variables
      super(theAccountNumber, thePIN, theAvailableBalance, theTotalBalance);
   }

   public double getInterestRate() { // get interest rate function
      return InterestRate; // return interest rate
   }

   public void setInterestRate() { // set interest rate function
      Scanner input = new Scanner(System.in); // new scanner
      System.out.println("Modify interest rate to: "); // prompt to set interest rate
      InterestRate = input.nextDouble(); // input interest rate
      input.close(); // close scanner
   }
}