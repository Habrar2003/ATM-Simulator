import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exitform extends JFrame {
    ATM theATM = new ATM(); 
    private boolean userAuthenticated; // whether user is authenticated
    private int currentAccountNumber;
    private JPanel contentPane;
    private JPasswordField passwordField;
    private JTextField textField;
    String ac,pin;
    static int acno,pass;
    boolean stage =false;
    
    JLabel label = new JLabel(); // image
    
    public Exitform() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 650);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.gray);
        setResizable(false);
        passwordField=null;
        textField=null;
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        label.setIcon(new ImageIcon("assets/take card.jpg")); // Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize();
        label.setBounds(240, 180, size.width, size.height); // Sets the location of the image
        label.setVisible(true);
        contentPane.add(label); // Adds objects to the container
        
        JLabel lblNewLabel = new JLabel("Please take your card. ");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(270, 140, 286, 35);
        lblNewLabel.setFont(new Font("", Font.PLAIN, 25));
        contentPane.add(lblNewLabel);

        
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
       
        JButton Button_dot = new JButton("."); // Not useable in login
        
        Button_dot.setBounds(297, 548, 87, 23);
        contentPane.add(Button_dot);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setBounds(155, 27, 420,173 );
        contentPane.add(panel);
        panel.setLayout(null);
        
        
        
        
        JButton ButtonCLEAR = new JButton("Clear");
        ButtonCLEAR.setBackground(new Color(255, 255, 0));

        ButtonCLEAR.setBounds(508, 447, 87, 23);
        contentPane.add(ButtonCLEAR);
        
        JButton ButtonTransfer = new JButton("Transfer");
        ButtonTransfer.setEnabled(false);
        ButtonTransfer.setBounds(650, 145, 100, 30);
        contentPane.add(ButtonTransfer);
        
        JButton ButtonBalance = new JButton("Balance");
        ButtonBalance.setEnabled(false);
        ButtonBalance.setBounds(650, 49, 100, 30);
        contentPane.add(ButtonBalance);
        
        JButton btnNewButton_2 = new JButton("Exit");
     
        btnNewButton_2.setEnabled(false);
        btnNewButton_2.setBounds(24, 49, 100, 30);
        contentPane.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("Withdrawal");
        btnNewButton_3.setEnabled(false);
        btnNewButton_3.setBounds(24, 145, 100, 30);
        contentPane.add(btnNewButton_3);
        

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(508, 499, 87, 23);
        btnCancel.setBackground(new Color(255, 0, 0));
        contentPane.add(btnCancel);
        
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
        ButtonCLEAR.setEnabled(false);
        btnCancel.setEnabled(false);
        
        JButton ButtonEnter = new JButton("Enter");
        ButtonEnter.setBackground(new Color(0, 255, 0));
        ButtonEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              dispose();
              login_frame f1=new login_frame();
              f1.setVisible(true);
              
            }
        });
        
        ButtonEnter.setBounds(508, 400, 87, 23);
        contentPane.add(ButtonEnter);
}
}
        
    
