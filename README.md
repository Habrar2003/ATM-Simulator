# ATM System GUI

A simple ATM simulator built with Java Swing. This was an educational project created to practice Java GUI development and object-oriented programming.

## Features

- Account number and PIN login
- Balance inquiry
- Cash withdrawal
- Money transfer between accounts
- Logout and card removal screens
- Simulated ATM cash dispenser
- On-screen numeric keypad
- Validation for incorrect login details, insufficient funds, and invalid transfers

## Technologies

- Java
- Java Swing
- Object-oriented programming

## How It Works

The application starts with a login screen where the user enters an account number and PIN using the on-screen keypad. After successful authentication, the main menu allows the user to check their balance, withdraw cash, or transfer money to another account. Use the GUI buttons and keypad to perform all ATM actions.

The cash dispenser simulates different note denominations and checks whether the ATM has enough cash before completing a withdrawal.

### Available Balance and Total Balance

- **Available balance** is the amount currently usable for withdrawals and transfers.
- **Total balance** is the full account balance, including money that may not be immediately available.

For example, the savings demo account starts with an available balance of HK$2,500 and a total balance of HK$3,000. The HK$500 difference represents funds that are part of the account total but are not currently available to use. This project does not implement pending deposits, so the difference is included to demonstrate the concept. The cheque account has the same available and total balance.

After a withdrawal or transfer, both balances are updated in this simplified project.

## How to Run

Install the JDK if needed:

```bash
winget install EclipseAdoptium.Temurin.17.JDK
```

Compile the Java files:

```bash
javac *.java
```

Run the application:

```bash
java ATMCaseStudy
```

## Demo Accounts

Use these sample accounts on the GUI login screen:

| Account | PIN | Account type | Available balance | Total balance |
|---:|---:|---|---:|---:|
| 1001 | 2468 | Savings | HK$2,500 | HK$3,000 |
| 2002 | 1357 | Cheque | HK$1,200 | HK$1,200 |

The project uses sample in-memory account data for demonstration purposes. Balances reset when the application is restarted.

## Project Structure

- `assets/` - Images used by the ATM interface
- `ATMCaseStudy.java` - Starts the application
- `login_frame.java` - Login screen
- `main_frame.java` - Main ATM menu
- `Withdrawalform.java` - Withdrawal screen
- `Transferform.java` - Transfer screen
- `BankDatabase.java` - Sample account data and account operations
- `Account.java` - Base account class
- `CashDispenser.java` - Simulated cash dispenser

## Note

This is a small educational project and does not connect to a real bank or database.
