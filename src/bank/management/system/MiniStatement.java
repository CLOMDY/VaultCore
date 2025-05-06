package bank.management.system;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MiniStatement extends JFrame {
	
	String pinnumber;
	
	MiniStatement(String pinnumber) {
		
		this.pinnumber = pinnumber;
		setTitle("Mini Statement");
		
		setLayout(null);
		
		JLabel mini = new JLabel();
		add(mini);
		
		JLabel bank = new JLabel("Indian Bank");
		bank.setBounds(150, 20, 100, 20);
		add(bank);
		
		JLabel card = new JLabel("Indian Bank");
		card.setBounds(20, 80, 300, 20);
		add(card);
		
		JLabel balance = new JLabel("Indian Bank");
		balance.setBounds(20, 400, 300, 20);
		add(balance);
		
		try {
			
			Conn conn = new Conn();
			ResultSet rs = conn.s.executeQuery("SELECT * FROM login where pin = '"+pinnumber+"'");
			
			while(rs.next()) {
				card.setText("Card Number: " + rs.getString("cardnumber").substring(0, 4) + "-XXXX-XXXX-" + rs.getString("cardnumber").substring(12));
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			
			int bal = 0;
			Conn conn = new Conn();
			ResultSet rs = conn.s.executeQuery("SELECT * FROM bank where pin = '"+pinnumber+"'");
			
			while(rs.next()) {
				mini.setText(mini.getText() + "<HTML>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><HTML>");
				if(rs.getString("type").equals("Deposit")) {
					bal += Integer.parseInt(rs.getString("amount"));
				} else {
					bal -= Integer.parseInt(rs.getString("amount"));
				}
			}
			balance.setText("Your Current Account Balance is: " + bal);
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
		mini.setBounds(20, 140, 400, 200);
		
		setSize(400, 600);
		setLocation(20, 20);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new MiniStatement("");
	}

}
