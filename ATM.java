// ATM.java
// Represents an automated teller machine

public class ATM 
{
   private boolean userAuthenticated; // whether user is authenticated
   private int currentAccountNumber; // current user's account number
   private CashDispenser cashDispenser; // ATM's cash dispenser
   private BankDatabase bankDatabase; // account information database
   static BankDatabase BankDatabase=new BankDatabase();


      
   // no-argument ATM constructor initializes instance variables
   public ATM() 
   {
      
       userAuthenticated = false; // user is not authenticated to start
      currentAccountNumber = 0; // no current account number to start
      cashDispenser = new CashDispenser(); // create cash dispenser
      bankDatabase = new BankDatabase(); // create acct info database
   } // end no-argument ATM constructor




} // end class ATM

