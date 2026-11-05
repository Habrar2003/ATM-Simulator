
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Withdrawalform extends JFrame {
    private JPanel contentPane;
    private JTextField textField;
    private int amount;
    String am;
    CashDispenser cashDispenser = new CashDispenser();
    JLabel promt = new JLabel("Amount you want to withdrawal");
    JLabel promt2 = new JLabel("ATM only provides HK$100, HK$500, HK$1000");
    JLabel promt3 = new JLabel("Please enter an amount to withdrawal");
    JLabel promt4 = new JLabel("Wrong amount of withdrawal. Please enter an eligible amount.");
    JLabel label = new JLabel(); // image
    JLabel label2 = new JLabel(); // image
    
    public Withdrawalform() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 650);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.gray);
        setResizable(false);
        
        label.setIcon(new ImageIcon("assets/withdrawal.jpg")); // Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); // Gets the size of the image
        label.setBounds(240, 180, size.width, size.height); // Sets the location of the image
        label.setVisible(true);
        contentPane.add(label); // Adds objects to the container
        
        label2.setIcon(new ImageIcon("assets/take cash.jpg")); // Sets the image to be displayed as an icon
        label2.setBounds(240, 180, size.width, size.height); // Sets the location of the image
        label2.setVisible(false);
        contentPane.add(label2); // Adds objects to the container

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setBounds(151, 27, 424, 173);
        contentPane.add(panel);
        panel.setLayout(null);

        promt.setBounds(30, 60, 500, 50);
        promt.setForeground(Color.WHITE);
        panel.add(promt);

        promt.setVisible(true);

        promt2.setBounds(30, 45, 400, 15);
        promt2.setForeground(Color.YELLOW);
        promt2.setFont(new Font("", Font.PLAIN, 15));
        panel.add(promt2);
        promt2.setVisible(true);
        
        promt3.setBounds(30, 65, 500, 15);
        promt3.setForeground(Color.RED);
        panel.add(promt3);
        promt3.setVisible(false);
        
        promt4.setBounds(30, 65, 500, 15);
        promt4.setForeground(Color.RED);
        panel.add(promt4);
        promt4.setVisible(false);
        
        JLabel lblNewLabel = new JLabel("Withdrawal");

        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(10, 10, 286, 35);
        lblNewLabel.setFont(new Font("", Font.PLAIN, 25));
        panel.add(lblNewLabel);


        textField = new JTextField();
        textField.setBounds(30, 100, 117, 18);
        panel.add(textField);
        textField.setColumns(10);
        textField.setVisible(true);

        JButton Button1 = new JButton("1");
        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                am = textField.getText()+"1";
                textField.setText(am);
            }
        });
        Button1.setBounds(185, 400, 87, 23);
        contentPane.add(Button1);
        
        JButton Button2 = new JButton("2");
        Button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                am = textField.getText()+"2";
                textField.setText(am);
            }
        });
        Button2.setBounds(297, 400, 87, 23);
        contentPane.add(Button2);
        
        JButton Button3 = new JButton("3");
        Button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                am = textField.getText()+"3";
                textField.setText(am);
            }
        });
        Button3.setBounds(411, 400, 87, 23);
        contentPane.add(Button3);
        
        JButton Button4 = new JButton("4");
        Button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                am = textField.getText()+"4";
                textField.setText(am);
            }
        });
        Button4.setBounds(185, 447, 87, 23);
        contentPane.add(Button4);
        
        JButton Button5 = new JButton("5");
        Button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                am = textField.getText()+"5";
                textField.setText(am);
            }
        });
        Button5.setBounds(297, 447, 87, 23);
        contentPane.add(Button5);
        
        JButton Button6 = new JButton("6");
        Button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                am = textField.getText()+"6";
                textField.setText(am);
            }
        });
        Button6.setBounds(411, 447, 87, 23);
        contentPane.add(Button6);
        
        JButton Button7 = new JButton("7");
        Button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                am = textField.getText()+"7";
                textField.setText(am);
            }
        });
        Button7.setBounds(185, 499, 87, 23);
        contentPane.add(Button7);
        
        JButton Button8 = new JButton("8");
        Button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                am = textField.getText()+"8";
                textField.setText(am);
            }
        });
        Button8.setBounds(297, 499, 87, 23);
        contentPane.add(Button8);
        
        JButton Button9 = new JButton("9");
        Button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                am = textField.getText()+"9";
                textField.setText(am);
            }
        });
        Button9.setBounds(411, 499, 87, 23);
        contentPane.add(Button9);
        
        JButton Button0 = new JButton("0");
        Button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                am = textField.getText()+"0";
                textField.setText(am);
            }
        });
        
        Button0.setBounds(185, 548, 87, 23);
        contentPane.add(Button0);
        
        JButton Button00 = new JButton("00");
        Button00.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                am = textField.getText()+"00";
                textField.setText(am);
            }
        });
        
        Button00.setBounds(411, 548, 87, 23);
        contentPane.add(Button00);
       
        JButton Button_dot = new JButton("."); // Not useable in login
    
        Button_dot.setBounds(297, 548, 87, 23);
        contentPane.add(Button_dot);
        
        JButton ButtonCLEAR = new JButton("Clear");
        ButtonCLEAR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                promt3.setVisible(false);
            }
        });
        ButtonCLEAR.setBackground(new Color(255, 255, 0));

        ButtonCLEAR.setBounds(508, 447, 87, 23);
        contentPane.add(ButtonCLEAR);
        
        JButton ButtonEnter = new JButton("Enter");
        ButtonEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()) {
                amount = Integer.parseInt(textField.getText());
                    if (amount != 0) {
                        if ((amount % 100) == 0) {
                            execute();
                            promt3.setVisible(false);
                            promt4.setVisible(false);
                            Button1.setEnabled(false);
                            Button2.setEnabled(false);
                            Button3.setEnabled(false);
                            Button4.setEnabled(false);
                            Button5.setEnabled(false);
                            Button6.setEnabled(false);
                            Button7.setEnabled(false);
                            Button8.setEnabled(false);
                            Button9.setEnabled(false);
                            Button0.setEnabled(false);
                            Button_dot.setEnabled(false);
                            Button00.setEnabled(false);
                            ButtonEnter.setEnabled(false);
                            ButtonCLEAR.setEnabled(false);
                            textField.setVisible(false);
                        } 
                        else {
                            promt3.setVisible(false);
                            promt4.setVisible(true);
                        }
                    }
                    else{
                        promt3.setVisible(false);
                        promt4.setVisible(true);
                }
            }
            else {
                promt3.setVisible(true);
                promt4.setVisible(false);
            }
        }
        });
        
        ButtonEnter.setBackground(new Color(0, 255, 0));
        ButtonEnter.setBounds(508, 400, 87, 23);
        contentPane.add(ButtonEnter);

        

        JButton ButtonTransfer = new JButton("Transfer");
        ButtonTransfer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Transferform transfer = new Transferform();
                transfer.setVisible(true);
            }
        });
        ButtonTransfer.setBounds(650, 141, 100, 30);
        ButtonTransfer.setEnabled(false);
        contentPane.add(ButtonTransfer);

        JButton ButtonBalance = new JButton("Balance");
        ButtonBalance.setEnabled(false);

        ButtonBalance.setBounds(650, 29, 100, 30);
        contentPane.add(ButtonBalance);

        JButton btnNewButton_2 = new JButton("Exit");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Exitform f1=new Exitform();
                f1.setVisible(true);
            }
        });
        btnNewButton_2.setBounds(31, 50, 110, 23);
        contentPane.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Withdrawal");
        btnNewButton_3.setEnabled(false);
        btnNewButton_3.setBounds(31, 151, 110, 23);
        contentPane.add(btnNewButton_3);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                main_frame main = new main_frame();
                main.setVisible(true);
            }
        });
        btnCancel.setBounds(508, 499, 87, 23);
        btnCancel.setBackground(new Color(255, 0, 0));
        contentPane.add(btnCancel);

    }

    public void execute() {
        promt2.setVisible(false);
        // loop until cash is dispensed or the user cancels
        // check whether the user has enough money in the account
        if (amount <= ATM.BankDatabase.getAvailableBalance(login_frame.getac())) {
            if (amount > 0) {
                if (cashDispenser.isSufficientCashAvailable(amount)) {// check whether the cash dispenser has enough
                                                                      // money
                    // update the account involved to reflect withdrawal
                    ATM.BankDatabase.debit(login_frame.getac(), amount);
                    cashDispenser.dispenseCash(amount); // dispense cash

                    promt.setVisible(true);
                    promt.setText("Please take your cash now.");
                    promt.setFont(new Font("", Font.PLAIN, 25));
                    label.setVisible(false);
                    label2.setVisible(true);
                    
                } else if (!cashDispenser.isSufficientCashAvailable(amount)){ // cash dispenser does not have enough cash
                    promt.setVisible(true);
                    promt.setText("Insufficient cash available in the ATM");
                    promt.setFont(new Font("", Font.PLAIN, 25));
                }
            } 
        } else if (amount > ATM.BankDatabase.getAvailableBalance(login_frame.getac())) {// not enough money available in
                                                                                  // user's account
            promt.setVisible(true);
            promt.setText("Insufficient funds in your account.");
            promt.setFont(new Font("", Font.PLAIN, 25));
        } // end if

    } // end method execute
}
