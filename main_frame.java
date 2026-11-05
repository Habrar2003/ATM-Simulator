
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.awt.Font;
import java.awt.Color;

public class main_frame extends JFrame {
    private JPanel contentPane;
    private JPasswordField passwordField;
    private JTextField textField;
    String account,pin;
    static int account_number,password;
    
    public main_frame() {
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 650);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.gray);
        passwordField=null;
        textField=null;
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setResizable(false);
        
        

        
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setBounds(155, 27, 420,173 );
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Welcome");

        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(10, 10, 286, 35);
        lblNewLabel.setFont(new Font("", Font.PLAIN, 25));
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel2 = new JLabel("Select a function to execute.");

        lblNewLabel2.setForeground(Color.WHITE);
        lblNewLabel2.setBounds(23, 45, 500, 35);
        lblNewLabel2.setFont(new Font("", Font.PLAIN, 15));
        panel.add(lblNewLabel2);
        
        JLabel lblNewLabel3 = new JLabel("Exit to logout.");

        lblNewLabel3.setForeground(Color.YELLOW);
        lblNewLabel3.setBounds(23, 65, 500, 35);
        panel.add(lblNewLabel3);
        
        JLabel lblNewLabel4 = new JLabel("Cancel to return to main menu.");

        lblNewLabel4.setForeground(Color.YELLOW);
        lblNewLabel4.setBounds(23, 80, 500, 35);
        panel.add(lblNewLabel4);
        
        
        JLabel lblBalanceInformation = new JLabel("Balance");
        lblBalanceInformation.setBounds(10, 20, 400, 20);
        lblBalanceInformation.setFont(new Font("", Font.PLAIN, 25));

        lblBalanceInformation.setForeground(Color.WHITE);
        panel.add(lblBalanceInformation);
        lblBalanceInformation.setVisible(false);
        
        JLabel lblNewLabel_1 = new JLabel("Available balance:");
        lblNewLabel_1.setBounds(23, 51, 268, 40);
        panel.add(lblNewLabel_1);
        lblNewLabel_1.setVisible(false);
        
        JLabel lblNewLabel_2 = new JLabel("Total balance: ");
        lblNewLabel_2.setBounds(23, 76, 268, 40);
        panel.add(lblNewLabel_2);
        lblNewLabel_2.setVisible(false);
        
        JButton Button_dot = new JButton(".");
        Button_dot.setBounds(297, 548, 87, 23);
        contentPane.add(Button_dot);

        JButton Button1 = new JButton("1");
        Button1.setBounds(185, 400, 87, 23);
        contentPane.add(Button1);

        JButton Button2 = new JButton("2");
        Button2.setBounds(297, 400, 87, 23);
        contentPane.add(Button2);

        JButton Button3 = new JButton("3");
        Button3.setBounds(411, 400, 87, 23);
        contentPane.add(Button3);

        JButton Button4 = new JButton("4");
        Button4.setBounds(185, 447, 87, 23);
        contentPane.add(Button4);

        JButton Button5 = new JButton("5");
        Button5.setBounds(297, 447, 87, 23);
        contentPane.add(Button5);

        JButton Button6 = new JButton("6");
        Button6.setBounds(411, 447, 87, 23);
        contentPane.add(Button6);

        JButton Button7 = new JButton("7");
        Button7.setBounds(185, 499, 87, 23);
        contentPane.add(Button7);

        JButton Button8 = new JButton("8");
        Button8.setBounds(297, 499, 87, 23);
        contentPane.add(Button8);

        JButton Button9 = new JButton("9");
        Button9.setBounds(411, 499, 87, 23);
        contentPane.add(Button9);

        JButton Button0 = new JButton("0");
        Button0.setBounds(185, 548, 87, 23);
        contentPane.add(Button0);

        JButton Button00 = new JButton("00");
        Button00.setBounds(411, 548, 87, 23);
        contentPane.add(Button00);

        
        JButton ButtonEnter = new JButton("Enter");
        ButtonEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        ButtonEnter.setBackground(new Color(0, 255, 0));
        
        ButtonEnter.setBounds(508, 400, 87, 23);
        contentPane.add(ButtonEnter);
        
        JButton ButtonCLEAR = new JButton("Clear");
        ButtonCLEAR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        ButtonCLEAR.setBackground(new Color(255, 255, 0));
        
        ButtonCLEAR.setBounds(508, 447, 87, 23);
        contentPane.add(ButtonCLEAR);
        
        JButton ButtonTransfer = new JButton("Transfer");
         ButtonTransfer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              dispose();
               Transferform transfer=new Transferform();
                transfer.setVisible(true);
            }
        });
        ButtonTransfer.setBounds(650, 148, 122, 23);
        contentPane.add(ButtonTransfer);
        
        JButton btnNewButton_3 = new JButton("Withdrawal");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Withdrawalform withdrawal=new Withdrawalform();
                withdrawal.setVisible(true);
            }
        });
        btnNewButton_3.setBounds(9, 148, 111, 23);
        contentPane.add(btnNewButton_3);
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(508, 499, 87, 23);
        btnCancel.setBackground(new Color(255, 0, 0));
        contentPane.add(btnCancel);
        
        JButton ButtonBalance = new JButton("Balance");
        ButtonBalance.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double totalBalance = ATM.BankDatabase.getTotalBalance(login_frame.getac());
                String formattedTotalBalance = formatAmount(totalBalance);
                double availableBalance = ATM.BankDatabase.getAvailableBalance(login_frame.getac());
                String formattedAvailableBalance = formatAmount(availableBalance);
                
                lblNewLabel.setVisible(false);
                lblNewLabel2.setVisible(false);
                lblNewLabel3.setVisible(false);
                lblNewLabel4.setVisible(false);
                
                lblNewLabel_2.setText("Total balance: $"+formattedTotalBalance);
                lblNewLabel_2.setVisible(true);
                lblNewLabel_2.setFont(new Font("", Font.PLAIN, 15));
                lblNewLabel_2.setForeground(Color.YELLOW);
                
                lblNewLabel_1.setText("Available balance: $"+formattedAvailableBalance);
                lblNewLabel_1.setVisible(true);
                lblBalanceInformation.setVisible(true);
                lblNewLabel_1.setFont(new Font("", Font.PLAIN, 15));
                lblNewLabel_1.setForeground(Color.YELLOW);
                
                ButtonBalance.setEnabled(false);
                btnNewButton_3.setEnabled(false);
                ButtonTransfer.setEnabled(false);
                btnCancel.setEnabled(true);
            }
        });
        ButtonBalance.setBounds(650, 54, 122, 23);
        contentPane.add(ButtonBalance);
        
        JButton btnNewButton_2 = new JButton("Exit");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              dispose();
              Exitform f1=new Exitform();
              f1.setVisible(true);
              
            }
        });
        btnNewButton_2.setBounds(9, 54, 111, 23);
        contentPane.add(btnNewButton_2);
        
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
        btnCancel.setEnabled(false);
        
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblNewLabel.setVisible(true);
                lblNewLabel2.setVisible(true);
                lblNewLabel3.setVisible(true);
                lblNewLabel4.setVisible(true);
                lblNewLabel_1.setVisible(false);
                lblNewLabel_2.setVisible(false);
                lblBalanceInformation.setVisible(false);
                
                ButtonBalance.setEnabled(true);
                btnNewButton_3.setEnabled(true);
                ButtonTransfer.setEnabled(true);
                btnCancel.setEnabled(false);
            }
        });
}
    private String formatAmount(double amount) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(amount);
    }
}
        
    

