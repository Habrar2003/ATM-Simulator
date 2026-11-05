import java.util.Scanner;

public class ChequeAccount extends Account {
   private double limitpercheque = 10000; // cheuque limit attribute

   public ChequeAccount(int theAccountNumber, int thePIN, double theAvailableBalance, double theTotalBalance) {
      // initialize superclass variables
      super(theAccountNumber, thePIN, theAvailableBalance, theTotalBalance);
   }

   public double getsetLimitPerCheque() { // get limit per cheque function 
      return limitpercheque; // return limit per cheque
   }

   public void setLimitPerCheque() { // set limit per cheque 
      Scanner input = new Scanner(System.in); // new scanner

      System.out.println("Modify limit per cheque to: "); // prompt to set limit per cheque
      limitpercheque = input.nextDouble(); // input limit per cheque
      input.close(); // close scanner
   }
}