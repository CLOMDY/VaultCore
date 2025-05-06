package bank.management.system;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class SignupThree extends JFrame implements ActionListener{
	
	JButton submit, cancel;
	JRadioButton savingaccount, fdaccount, currentaccount, rdaccount;
	JCheckBox atmcard, internetbanking, mobilebanking, emailsmsalert, checkbook, estatement;
	String formno;
	
	SignupThree(String formno) {
		
		this.formno = formno;
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION - FORM 3");
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image i2 = i1.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel lable = new JLabel(i3);
		lable.setBounds(180, 10, 100, 100);
		add(lable);
		
		JLabel l1 = new JLabel("Page 3: Account Details");
		l1.setFont(new Font("Raleway", Font.BOLD, 30));
		l1.setBounds(280, 40, 400, 40);
		add(l1);
		
		JLabel type = new JLabel("Account Type");
		type.setFont(new Font("Raleway", Font.BOLD, 22));
		type.setBounds(150, 140, 200, 30);
		add(type);
		
		savingaccount = new JRadioButton("Saving Account");
		savingaccount.setFont(new Font("Raleway", Font.BOLD, 16));
		savingaccount.setBackground(Color.WHITE);
		savingaccount.setBounds(150, 180, 150, 20);
		add(savingaccount);
		
		fdaccount = new JRadioButton("Fixed Deposit Account");
		fdaccount.setFont(new Font("Raleway", Font.BOLD, 16));
		fdaccount.setBackground(Color.WHITE);
		fdaccount.setBounds(400, 180, 250, 20);
		add(fdaccount);
		
		currentaccount = new JRadioButton("Current Account");
		currentaccount.setFont(new Font("Raleway", Font.BOLD, 16));
		currentaccount.setBackground(Color.WHITE);
		currentaccount.setBounds(150, 220, 250, 20);
		add(currentaccount);
		
		rdaccount = new JRadioButton("Recurring Deposit Account");
		rdaccount.setFont(new Font("Raleway", Font.BOLD, 16));
		rdaccount.setBackground(Color.WHITE);
		rdaccount.setBounds(400, 220, 250, 20);
		add(rdaccount);
		
		ButtonGroup groupAccount = new ButtonGroup();
		groupAccount.add(savingaccount);
		groupAccount.add(fdaccount);
		groupAccount.add(currentaccount);
		groupAccount.add(rdaccount);
		
		JLabel card = new JLabel("Card Number: ");
		card.setFont(new Font("Raleway", Font.BOLD, 22));
		card.setBounds(150, 300, 200, 30);
		add(card);
		
		JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
		number.setFont(new Font("Raleway", Font.BOLD, 22));
		number.setBounds(380, 300, 300, 30);
		add(number);
		
		JLabel carddetail = new JLabel("Your 16 Digit Card Number");
		carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
		carddetail.setBounds(150, 330, 300, 20);
		add(carddetail);
		
		JLabel pin = new JLabel("PIN:");
		pin.setFont(new Font("Raleway", Font.BOLD, 22));
		pin.setBounds(150, 370, 200, 30);
		add(pin);
		
		JLabel pnumber = new JLabel("XXXX");
		pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
		pnumber.setBounds(380, 370, 300, 30);
		add(pnumber);
		
		JLabel pindetail = new JLabel("Your 4 Digit Pin");
		pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
		pindetail.setBounds(150, 400, 300, 20);
		add(pindetail);
		
		JLabel services = new JLabel("Services Required");
		services.setFont(new Font("Raleway", Font.BOLD, 22));
		services.setBounds(150, 450, 400, 30);
		add(services);
		
		atmcard = new JCheckBox("ATM Card");
		atmcard.setBackground(Color.WHITE);
		atmcard.setFont(new Font("Raleway", Font.BOLD, 16));
		atmcard.setBounds(150, 500, 200, 30);
		add(atmcard);
		
		internetbanking = new JCheckBox("Internet Banking");
		internetbanking.setBackground(Color.WHITE);
		internetbanking.setFont(new Font("Raleway", Font.BOLD, 16));
		internetbanking.setBounds(400, 500, 200, 30);
		add(internetbanking);
		
		mobilebanking = new JCheckBox("Mobile Banking");
		mobilebanking.setBackground(Color.WHITE);
		mobilebanking.setFont(new Font("Raleway", Font.BOLD, 16));
		mobilebanking.setBounds(150, 550, 200, 30);
		add(mobilebanking);
		
		emailsmsalert = new JCheckBox("Email & SMS Alert");
		emailsmsalert.setBackground(Color.WHITE);
		emailsmsalert.setFont(new Font("Raleway", Font.BOLD, 16));
		emailsmsalert.setBounds(400, 550, 200, 30);
		add(emailsmsalert);
		
		checkbook = new JCheckBox("Cheque Book");
		checkbook.setBackground(Color.WHITE);
		checkbook.setFont(new Font("Raleway", Font.BOLD, 16));
		checkbook.setBounds(150, 600, 200, 30);
		add(checkbook);
		
		estatement = new JCheckBox("E - Statement");
		estatement.setBackground(Color.WHITE);
		estatement.setFont(new Font("Raleway", Font.BOLD, 16));
		estatement.setBounds(400, 600, 200, 30);
		add(estatement);
		
		estatement = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
		estatement.setBackground(Color.WHITE);
		estatement.setFont(new Font("Raleway", Font.BOLD, 12));
		estatement.setBounds(150, 680, 600, 30);
		add(estatement);
		
		submit = new JButton("Submit");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Raleway", Font.BOLD, 14));
		submit.setBounds(300, 720, 100, 30);
		submit.addActionListener(this);
		add(submit);
		
		cancel = new JButton("Cancel");
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.setFont(new Font("Raleway", Font.BOLD, 14));
		cancel.setBounds(470, 720, 100, 30);
		cancel.addActionListener(this);
		add(cancel);
		
		getContentPane().setBackground(Color.white);
		
		setSize(850, 820);
		setLocation(350, 0);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == submit) {
			String accountType = null;
			if(savingaccount.isSelected()) {
				accountType = "Saving Account";
			} else if(fdaccount.isSelected()) {
				accountType = "Fixed DDeposit Account";
			} else if(currentaccount.isSelected()) {
				accountType = "Current Account";
			} else if(rdaccount.isSelected()) {
				accountType = "Recurring Deposit Account";
			}
			
			Random random = new Random();
			String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
			String pinnumber = "" + (random.nextInt(9000) + 1000);
			
			String facality = "";
			if(atmcard.isSelected()) {
				facality += " ATM Card";
			}
			if(internetbanking.isSelected()) {
				facality += " Internet Banking";
			}
			if(mobilebanking.isSelected()) {
				facality += " Mobile Banking";
			}
			if(emailsmsalert.isSelected()) {
				facality += " Email & SMS Alert";
			}
			if(checkbook.isSelected()) {
				facality += " Cheque Book";
			}
			if(estatement.isSelected()) {
				facality += " E - Statement";
			}
			
			try {
				if(accountType.equals("")) {
					JOptionPane.showMessageDialog(null, "Account Type is Required");
				} else if(facality.equals("")) {
					JOptionPane.showMessageDialog(null, "Please select any one facality");
				} else {
					Conn c = new Conn();
					String query1 = "INSERT INTO SignUpThree VALUES('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facality+"')";
					String query2 = "INSERT INTO login VALUES('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";
					c.s.executeUpdate(query1);
					c.s.executeUpdate(query2);
					
					JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin:" + pinnumber);
					
					setVisible(false);
					new Deposit(pinnumber).setVisible(true);
				}
			} catch(Exception e) {
				System.out.println(e);
			}
		} else if(ae.getSource() == cancel) {
			setVisible(false);
			new Login().setVisible(true);
		}
	}

	public static void main(String[] args) {
		new SignupThree("");
	}

}
