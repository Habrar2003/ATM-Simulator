import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login_frame extends JFrame {
    ATM theATM = new ATM(); 
    private boolean userAuthenticated; // whether user is authenticated
    private int currentAccountNumber;
    private JPanel contentPane;
    private JPasswordField passwordField;
    private JTextField textField;
    String ac,pin;
    static int acno,pass;
    boolean stage =false;
    JLabel lblNewLabel = new JLabel("WELCOME. ");
    JLabel lbl2NewLabel = new JLabel("Please insert your card or follow the arrow to enter your information");
    JLabel lbl4NewLabel = new JLabel("Kindly press the enter key after entering each piece of information.");
    JLabel lbl3NewLabel = new JLabel("Login fail.Please try again.");
    JLabel label2 = new JLabel(); // image
    

    public login_frame() {
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
        
        JLabel label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon("assets/card in.jpg")); //Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(250, 200, size.width, size.height); //Sets the location of the image
        contentPane.add(label); //Adds objects to the container
        label.setVisible(true);
        
        label2.setIcon(new ImageIcon("assets/take card.jpg")); // Sets the image to be displayed as an icon
        label2.setBounds(240, 180, size.width, size.height); // Sets the location of the image
        label2.setVisible(false);
        contentPane.add(label); // Adds objects to the container
        
        JLabel triangle = new JLabel(); //JLabel Creation
        triangle.setIcon(new ImageIcon("assets/triangle.png"));
        Dimension size2= triangle.getPreferredSize();//Sets the image to be displayed as an icon
        triangle.setBounds(155, 140, size2.width, size2.height); //Sets the location of the image
        contentPane.add(triangle); //Adds objects to the container
        
        JLabel triangle2 = new JLabel(); //JLabel Creation
        triangle2.setIcon(new ImageIcon("assets/triangle.png"));
        triangle2.setBounds(155, 170, size2.width, size2.height); //Sets the location of the image
        contentPane.add(triangle2); //Adds objects to the container
        
        
        JButton Button1 = new JButton("1");
        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                ac = textField.getText()+"1";
                textField.setText(ac);}
             else {
                pin = passwordField.getText()+"1";
                passwordField.setText(pin);
                }
                
            }
        });
        Button1.setBounds(185, 400, 87, 23);
        contentPane.add(Button1);
        
        JButton Button2 = new JButton("2");
        Button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"2";
                    textField.setText(ac);}
                else {
                    pin = passwordField.getText()+"2";
                    passwordField.setText(pin);
                    }
            }
        });
        Button2.setBounds(297, 400, 87, 23);
        contentPane.add(Button2);
        
        JButton Button3 = new JButton("3");
        Button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"3";
                    textField.setText(ac);}
              else {
                    pin = passwordField.getText()+"3";
                    passwordField.setText(pin);
                    }
            }
        });
        Button3.setBounds(411, 400, 87, 23);
        contentPane.add(Button3);
        
        JButton Button4 = new JButton("4");
        Button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"4";
                    textField.setText(ac);}
                 else {
                    pin = passwordField.getText()+"4";
                    passwordField.setText(pin);}
            }
        });
        Button4.setBounds(185, 447, 87, 23);
        contentPane.add(Button4);
        
        JButton Button5 = new JButton("5");
        Button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"5";
                    textField.setText(ac);}
                 else {
                    pin = passwordField.getText()+"5";
                    passwordField.setText(pin);}
            }
        });
        Button5.setBounds(297, 447, 87, 23);
        contentPane.add(Button5);
        
        JButton Button6 = new JButton("6");
        Button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"6";
                    textField.setText(ac);}
                  else {
                    pin = passwordField.getText()+"6";
                    passwordField.setText(pin);}
            }
        });
        Button6.setBounds(411, 447, 87, 23);
        contentPane.add(Button6);
        
        JButton Button7 = new JButton("7");
        Button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"7";
                    textField.setText(ac);}
                   else {
                    pin = passwordField.getText()+"7";
                    passwordField.setText(pin);}
            }
        });
        Button7.setBounds(185, 499, 87, 23);
        contentPane.add(Button7);
        
        JButton Button8 = new JButton("8");
        Button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"8";
                    textField.setText(ac);}
                 else {
                    pin = passwordField.getText()+"8";
                    passwordField.setText(pin);}
            }
        });
        Button8.setBounds(297, 499, 87, 23);
        contentPane.add(Button8);
        
        JButton Button9 = new JButton("9");
        Button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"9";
                    textField.setText(ac);}
                else {
                pin = passwordField.getText()+"9";
                passwordField.setText(pin);}
            }
        });
        Button9.setBounds(411, 499, 87, 23);
        contentPane.add(Button9);
        
        JButton Button0 = new JButton("0");
        Button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"0";
                    textField.setText(ac);}
                    else {
                    pin = passwordField.getText()+"0";
                    passwordField.setText(pin);}
            }
        });
        
        Button0.setBounds(185, 548, 87, 23);
        contentPane.add(Button0);
        
        JButton Button00 = new JButton("00");
        Button00.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+"00";
                    textField.setText(ac);}
                    else {
                    pin = passwordField.getText()+"00";
                    passwordField.setText(pin);}
            }
        });
        
        Button00.setBounds(411, 548, 87, 23);
        contentPane.add(Button00);
       
        JButton Button_dot = new JButton("."); // Not useable in login
        /*Button_dot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stage!=true){
                    ac = textField.getText()+".";
                    textField.setText(ac);}
                else {
                    pin = passwordField.getText()+".";
                    passwordField.setText(pin);
                    }
            }
        });*/
        
        Button_dot.setBounds(297, 548, 87, 23);
        contentPane.add(Button_dot);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setBounds(155, 27, 420,173 );
        contentPane.add(panel);
        panel.setLayout(null);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(151, 142, 145, 21);
        panel.add(passwordField);
        
        textField = new JTextField();
        textField.setBounds(151, 112, 145, 21);
        panel.add(textField);
        textField.setColumns(10);
        
        JLabel LabelPIN = new JLabel("PIN");
        LabelPIN.setBounds(28, 145, 73, 15);
        LabelPIN.setForeground(Color.WHITE);
        panel.add(LabelPIN);
        
        JLabel LabelAC = new JLabel("Account Number");
        LabelAC.setForeground(Color.WHITE);
        LabelAC.setBounds(28, 115, 98, 15);
        panel.add(LabelAC);
        
        JLabel LabelACEmpty = new JLabel("Please Enter an Account Number");
        LabelACEmpty.setForeground(Color.WHITE);
        LabelACEmpty.setBounds(28, 81, 387, 35);
        LabelACEmpty.setForeground(Color.RED);
        panel.add(LabelACEmpty);
        LabelACEmpty.setVisible(false);
        
        JLabel LabelPINEmpty = new JLabel("Please Enter a PIN");
        LabelPINEmpty.setForeground(Color.WHITE);
        LabelPINEmpty.setBounds(28, 81, 387, 35);
        LabelPINEmpty.setForeground(Color.RED);
        panel.add(LabelPINEmpty);
        LabelPINEmpty.setVisible(false);
        
        lbl3NewLabel.setForeground(Color.RED);
        lbl3NewLabel.setBounds(28, 81, 387, 35);
        panel.add(lbl3NewLabel);
        lbl3NewLabel.setVisible(false);

        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(20, 15, 387, 35);
        lblNewLabel.setFont(new Font("", Font.PLAIN, 25));
        panel.add(lblNewLabel);
        

        lbl2NewLabel.setForeground(Color.WHITE);
        lbl2NewLabel.setBounds(23, 41, 550, 35);
        panel.add(lbl2NewLabel);
        
        
        lbl4NewLabel.setForeground(Color.YELLOW);
        lbl4NewLabel.setBounds(28, 61, 387, 35);
        panel.add(lbl4NewLabel);
       

        if (!stage){
            triangle.setVisible(true);
            triangle2.setVisible(false);
        }
        
        
        JButton ButtonEnter = new JButton("Enter");
        ButtonEnter.setBackground(new Color(0, 255, 0));
        ButtonEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            if (stage) {
                if (!passwordField.getText().isEmpty()) {
                    pass = Integer.parseInt(pin);
                    stage = false;
                    authenticateUser();
                    triangle.setVisible(true);
                    triangle2.setVisible(false);
                    LabelACEmpty.setVisible(false);
                    LabelPINEmpty.setVisible(false);
                    lbl3NewLabel.setVisible(true);
                }
                else{
                    LabelACEmpty.setVisible(false);
                    LabelPINEmpty.setVisible(true);
                    lbl3NewLabel.setVisible(false);
                }
            } else {
                if (!textField.getText().isEmpty()) {
                    stage = true;
                    acno = Integer.parseInt(ac);
                    triangle2.setVisible(true);
                    triangle.setVisible(false);
                    LabelACEmpty.setVisible(false);
                    LabelPINEmpty.setVisible(false);
                    lbl3NewLabel.setVisible(false);
                }
                else{
                    LabelACEmpty.setVisible(true);
                    LabelPINEmpty.setVisible(false);
                    lbl3NewLabel.setVisible(false);
                }
            }
            }
        });
        
        ButtonEnter.setBounds(508, 400, 87, 23);
        contentPane.add(ButtonEnter);
        
        JButton ButtonCLEAR = new JButton("Clear");
        ButtonCLEAR.setBackground(new Color(255, 255, 0));
        ButtonCLEAR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                passwordField.setText("");
                stage=false;
                triangle.setVisible(true);
                triangle2.setVisible(false);
                LabelACEmpty.setVisible(false);
                LabelPINEmpty.setVisible(false);
                lbl3NewLabel.setVisible(false);
                /*if (stage!=true){
                     textField.setText("");}
                else{
                     passwordField.setText("");}*/
            }
        });
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
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                passwordField.setText("");
                stage=false;
                triangle.setVisible(true);
                triangle2.setVisible(false);
                LabelACEmpty.setVisible(false);
                LabelPINEmpty.setVisible(false);
                lbl3NewLabel.setVisible(false);
            }
        });
        btnCancel.setBounds(508, 499, 87, 23);
        btnCancel.setBackground(new Color(255, 0, 0));
        contentPane.add(btnCancel);
        
}
public static int getac(){
          return acno;}
public static int getpin(){
          return pass;}
private void authenticateUser() 
   {
      int accountNumber = acno; // input account number
      int pin =pass; // input PIN
      // set userAuthenticated to boolean value returned by database
      userAuthenticated = ATM.BankDatabase.authenticateUser( accountNumber, pin );
      // check whether authentication succeeded
      if ( userAuthenticated )
      {
         currentAccountNumber = accountNumber; // save user's account 
         dispose();
         main_frame f2=new main_frame();
        f2.setVisible(true);
      } //if(userAuthenticated){
                //}
                 else{
                lbl3NewLabel.setVisible(true);
                passwordField.setText("");
                textField.setText("");
                 };// end if
      
   } // end method authenticateUser
}
        
    
