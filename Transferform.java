
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Transferform extends JFrame {
    private JPanel contentPane;
    private JTextField destination;
    private JTextField amounttran;
    String tac, am;
    private double amount;
    private int des;
    private boolean stage = false;

    JLabel lblNewLabel_3 = new JLabel("");
    JLabel label = new JLabel();

    public Transferform() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 650);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.gray);
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setResizable(false);

        label.setIcon(new ImageIcon("assets/money transfer.jpg")); // Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); // Gets the size of the image
        label.setBounds(240, 180, size.width, size.height); // Sets the location of the image
        label.setVisible(true);
        contentPane.add(label); // Adds objects to the container

        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setBounds(155, 27, 420, 173);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel triangle = new JLabel(); //JLabel Creation
        triangle.setIcon(new ImageIcon("assets/triangle.png"));
        Dimension size2= triangle.getPreferredSize();//Sets the image to be displayed as an icon
        triangle.setBounds(8, 78, size2.width, size2.height); //Sets the location of the image
        triangle.setVisible(true);
        panel.add(triangle); //Adds objects to the container
        
        JLabel triangle2 = new JLabel(); //JLabel Creation
        triangle2.setIcon(new ImageIcon("assets/triangle.png"));
        triangle2.setBounds(8, 108, size2.width, size2.height); //Sets the location of the image
        triangle2.setVisible(false);
        panel.add(triangle2); //Adds objects to the container
        
        

        JLabel lblNewLabel = new JLabel("Transfer");

        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(10, 10, 286, 35);
        lblNewLabel.setFont(new Font("", Font.PLAIN, 25));
        panel.add(lblNewLabel);
        
        JLabel EmptyAc = new JLabel("Please enter an Acount to transfer");
        EmptyAc.setBounds(30, 55, 200, 15);
        EmptyAc.setForeground(Color.RED);
        panel.add(EmptyAc);
        EmptyAc.setVisible(false);
        
        JLabel EmptyAm = new JLabel("Please enter an Amount to transfer");
        EmptyAm.setBounds(30, 55, 200, 15);
        EmptyAm.setForeground(Color.RED);
        panel.add(EmptyAm);
        EmptyAm.setVisible(false);
        
        lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_3.setBounds(30, 45, 398, 40);
        panel.add(lblNewLabel_3);

        JLabel lblNewLabel_1 = new JLabel("Transfer to account");
        lblNewLabel_1.setBounds(30, 80, 129, 15);
        lblNewLabel_1.setForeground(Color.WHITE);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Amount");
        lblNewLabel_2.setBounds(30, 110, 112, 15);
        lblNewLabel_2.setForeground(Color.WHITE);
        panel.add(lblNewLabel_2);

        destination = new JTextField();
        destination.setBounds(150, 80, 135, 21);
        panel.add(destination);
        destination.setColumns(10);
        
        amounttran = new JTextField();
        amounttran.setBounds(150, 110, 135, 21);
        panel.add(amounttran);
        amounttran.setColumns(10);
        
        JButton Button1 = new JButton("1");
        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                tac = destination.getText()+"1";
                destination.setText(tac);}
             else {
                am = amounttran.getText()+"1";
                amounttran.setText(am);
                }
            }
        });
        Button1.setBounds(185, 400, 87, 23);
        contentPane.add(Button1);
        
        JButton Button2 = new JButton("2");
        Button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                tac = destination.getText()+"2";
                destination.setText(tac);}
            else {
                am = amounttran.getText()+"2";
                amounttran.setText(am);
                }
            }
        });
        Button2.setBounds(297, 400, 87, 23);
        contentPane.add(Button2);
        
        JButton Button3 = new JButton("3");
        Button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                tac = destination.getText()+"3";
                destination.setText(tac);}
            else {
                am = amounttran.getText()+"3";
                amounttran.setText(am);
                }
            }
        });
        Button3.setBounds(411, 400, 87, 23);
        contentPane.add(Button3);
        
        JButton Button4 = new JButton("4");
        Button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                tac = destination.getText()+"4";
                destination.setText(tac);}
            else {
                am = amounttran.getText()+"4";
                amounttran.setText(am);
                }
            }
        });
        Button4.setBounds(185, 447, 87, 23);
        contentPane.add(Button4);
        
        JButton Button5 = new JButton("5");
        Button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                tac = destination.getText()+"5";
                destination.setText(tac);}
            else {
                am = amounttran.getText()+"5";
                amounttran.setText(am);
                }
            }
        });
        Button5.setBounds(297, 447, 87, 23);
        contentPane.add(Button5);
        
        JButton Button6 = new JButton("6");
        Button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                tac = destination.getText()+"6";
                destination.setText(tac);}
            else {
                am = amounttran.getText()+"6";
                amounttran.setText(am);
                }
            }
        });
        Button6.setBounds(411, 447, 87, 23);
        contentPane.add(Button6);
        
        JButton Button7 = new JButton("7");
        Button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                tac = destination.getText()+"7";
                destination.setText(tac);}
            else {
                am = amounttran.getText()+"7";
                amounttran.setText(am);
                }
            }
        });
        Button7.setBounds(185, 499, 87, 23);
        contentPane.add(Button7);
        
        JButton Button8 = new JButton("8");
        Button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                tac = destination.getText()+"8";
                destination.setText(tac);}
            else {
                am = amounttran.getText()+"8";
                amounttran.setText(am);
                }
            }
        });
        Button8.setBounds(297, 499, 87, 23);
        contentPane.add(Button8);
        
        JButton Button9 = new JButton("9");
        Button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                tac = destination.getText()+"9";
                destination.setText(tac);}
            else {
                am = amounttran.getText()+"9";
                amounttran.setText(am);
                }
            }
        });
        
        Button9.setBounds(411, 499, 87, 23);
        contentPane.add(Button9);
        
        JButton Button0 = new JButton("0");
        Button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                tac = destination.getText()+"0";
                destination.setText(tac);}
            else {
                am = amounttran.getText()+"0";
                amounttran.setText(am);
                }
            }
        });
        
        Button0.setBounds(185, 548, 87, 23);
        contentPane.add(Button0);
        
        JButton Button00 = new JButton("00");
        Button00.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                tac = destination.getText()+"00";
                destination.setText(tac);}
            else {
                am = amounttran.getText()+"00";
                amounttran.setText(am);
                }
            }
        });
        
        Button00.setBounds(411, 548, 87, 23);
        contentPane.add(Button00);
       
        JButton Button_dot = new JButton("."); // Not useable in login
        Button_dot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                tac = destination.getText()+".";
                destination.setText(tac);}
            else {
                am = amounttran.getText()+".";
                amounttran.setText(am);
                }
            }
        });
        
        Button_dot.setBounds(297, 548, 87, 23);
        contentPane.add(Button_dot);
        
        JButton ButtonClear = new JButton("Clear");
        ButtonClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                destination.setText("");
                amounttran.setText("");
                stage=false;
                triangle.setVisible(true);
                triangle2.setVisible(false);
                EmptyAc.setVisible(false);
                EmptyAm.setVisible(false);
            }
        });
        ButtonClear.setBackground(new Color(255, 255, 0));
        ButtonClear.setBounds(508, 447, 87, 23);
        contentPane.add(ButtonClear);

        JButton ButtonEnter = new JButton("Enter");
        ButtonEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 if (stage) {
                     if (!amounttran.getText().isEmpty()) {
                        des = Integer.parseInt(destination.getText());
                        stage = false;
                        amount = Double.parseDouble(amounttran.getText());
                        amounttran.setVisible(false);
                        amounttran.setText("");
                        destination.setVisible(false);
                        destination.setText("");
                        lblNewLabel_2.setVisible(false);
                        lblNewLabel_1.setVisible(false);
                        triangle.setVisible(false);
                        triangle2.setVisible(false);
                        execute();
        
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
                        ButtonClear.setEnabled(false);
                        
                        EmptyAm.setVisible(false);
                        EmptyAc.setVisible(false);
                        }
                        else{
                            EmptyAm.setVisible(true);
                            EmptyAc.setVisible(false);
                        }
                } 
                else {
                    if (!destination.getText().isEmpty()) {
                        des = Integer.parseInt(tac);
                        stage = true;
                        triangle2.setVisible(true);
                        triangle.setVisible(false);
                        
                        EmptyAm.setVisible(false);
                        EmptyAc.setVisible(false);
                    }
                    else{
                            EmptyAc.setVisible(true);
                            EmptyAm.setVisible(false);
                    }
                }
            }
            
        });
        
        ButtonEnter.setBackground(new Color(0, 255, 0));

        ButtonEnter.setBounds(508, 400, 87, 23);
        contentPane.add(ButtonEnter);

        JButton ButtonTransfer = new JButton("Transfer");
        ButtonTransfer.setEnabled(false);
        ButtonTransfer.setBounds(650, 145, 100, 30);
        contentPane.add(ButtonTransfer);

        JButton ButtonBalance = new JButton("Balance");
        ButtonBalance.setEnabled(false);
        ButtonBalance.setBounds(650, 49, 100, 30);
        contentPane.add(ButtonBalance);

        JButton btnNewButton_2 = new JButton("Exit");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Exitform f1=new Exitform();
                f1.setVisible(true);
            }
        });
        btnNewButton_2.setBounds(30, 58, 112, 23);
        contentPane.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Withdrawal");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Withdrawalform withdrawal = new Withdrawalform();
                withdrawal.setVisible(true);
            }
        });
        btnNewButton_3.setBounds(30, 158, 112, 23);
        btnNewButton_3.setEnabled(false);
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

            double availableBalance = ATM.BankDatabase.getAvailableBalance(login_frame.getac());

            if (ATM.BankDatabase.findAccount(des) == true && login_frame.getac() != des) {
                if (amount > 0) {
                    if (availableBalance >= amount) {
                        // change the account balance
                        ATM.BankDatabase.debit(login_frame.getac(), amount);
                        ATM.BankDatabase.credit(des, amount);

                        label.setVisible(true);
                        lblNewLabel_3
                                .setText("\nTransfer Success! You have transfer $" + amount + " to account number "
                                        + des);
                        lblNewLabel_3.setForeground(Color.WHITE);
                    }
                    else{
                        lblNewLabel_3.setText("\nInsufficient account balance. Please try again");
                        lblNewLabel_3.setForeground(Color.RED);
                    }
                }
            } else if (login_frame.getac() == des) {
                lblNewLabel_3.setText("\nCannot transfer to self. Please try again");
                lblNewLabel_3.setForeground(Color.RED);
            } else if (ATM.BankDatabase.findAccount(des) == false) {
                lblNewLabel_3.setText("\nAccount not found,Please try again");
                lblNewLabel_3.setForeground(Color.RED);
            }
            



    }

}
