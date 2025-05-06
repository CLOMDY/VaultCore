package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class SignupTwo extends JFrame implements ActionListener{
	
	JButton next;
	JRadioButton syes, sno, eyes, eno;
	JComboBox<String> religion, category, income, education, occupation;
	JTextField pan, aadhar;
	String formno;
	
	SignupTwo(String formno) {
		
		this.formno = formno;
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION - FORM 2");
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image i2 = i1.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel lable = new JLabel(i3);
		lable.setBounds(170, 10, 100, 100);
		add(lable);
		
		JLabel additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD, 30));
		additionalDetails.setBounds(270, 45, 400, 40);
		add(additionalDetails);
		
		JLabel religionfield = new JLabel("Religion: ");
		religionfield.setFont(new Font("Raleway", Font.BOLD, 20));
		religionfield.setBounds(100, 140, 100, 30);
		add(religionfield);
		
		String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christin", "Other"};
		religion = new JComboBox<>(valReligion);
		religion.setBounds(300, 140, 400, 30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		JLabel categoryfield = new JLabel("Category: ");
		categoryfield.setFont(new Font("Raleway", Font.BOLD, 20));
		categoryfield.setBounds(100, 190, 200, 30);
		add(categoryfield);
		
		String valCategory[] = {"General", "Other Backward Class", "Schedule Caste", "Schedule Tribe", "Other"};
		category = new JComboBox<>(valCategory);
		category.setBounds(300, 190, 400, 30);
		category.setBackground(Color.WHITE);
		add(category);
		
		JLabel incomefield = new JLabel("Income: ");
		incomefield.setFont(new Font("Raleway", Font.BOLD, 20));
		incomefield.setBounds(100, 240, 200, 30);
		add(incomefield);
		
		String valIncome[] = {"Null", "< 3,50,000", "< 6,50,000", "< 10,00,000", "Upto 20,00,000"};
		income = new JComboBox<>(valIncome);
		income.setBounds(300, 240, 400, 30);
		income.setBackground(Color.WHITE);
		add(income);
		
		JLabel edufield = new JLabel("Educational");
		edufield.setFont(new Font("Raleway", Font.BOLD, 20));
		edufield.setBounds(100, 290, 200, 30);
		add(edufield);
		
		JLabel qualificationfield = new JLabel("Qualification: ");
		qualificationfield.setFont(new Font("Raleway", Font.BOLD, 20));
		qualificationfield.setBounds(100, 315, 200, 30);
		add(qualificationfield);
		
		String valEducation[] = {"Non - Graduation", "Graduation", "Post - Graduation", "Doctrate", "Others"};
		education = new JComboBox<>(valEducation);
		education.setBounds(300, 315, 400, 30);
		education.setBackground(Color.WHITE);
		add(education);
		
		JLabel occupationfield = new JLabel("Occupation: ");
		occupationfield.setFont(new Font("Raleway", Font.BOLD, 20));
		occupationfield.setBounds(100, 390, 200, 30);
		add(occupationfield);
		
		String valOccupation[] = {"Salaried", "Self - Employed", "Business", "Student", "Retired", "Others"};
		occupation = new JComboBox<>(valOccupation);
		occupation.setBounds(300, 390, 400, 30);
		occupation.setBackground(Color.WHITE);
		add(occupation);
		
		JLabel panfield = new JLabel("PAN Number: ");
		panfield.setFont(new Font("Raleway", Font.BOLD, 20));
		panfield.setBounds(100, 440, 200, 30);
		add(panfield);
		
		pan = new JTextField();
		pan.setFont(new Font("Raleway", Font.BOLD, 14));
		pan.setBounds(300, 440, 400, 30);
		add(pan);
		
		JLabel aadharfield = new JLabel("Aadhar Number: ");
		aadharfield.setFont(new Font("Raleway", Font.BOLD, 20));
		aadharfield.setBounds(100, 490, 200, 30);
		add(aadharfield);
		
		aadhar = new JTextField();
		aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
		aadhar.setBounds(300, 490, 400, 30);
		add(aadhar);
		
		JLabel seniorcitizenfield = new JLabel("Senior Citizen: ");
		seniorcitizenfield.setFont(new Font("Raleway", Font.BOLD, 20));
		seniorcitizenfield.setBounds(100, 540, 200, 30);
		add(seniorcitizenfield);
		
		syes = new JRadioButton("Yes");
		syes.setBounds(300, 540, 100, 30);
		syes.setBackground(Color.WHITE);
		add(syes);
		
		sno = new JRadioButton("No");
		sno.setBounds(450, 540, 100, 30);
		sno.setBackground(Color.WHITE);
		add(sno);
		
		ButtonGroup seniorcitizenGroup = new ButtonGroup();
		seniorcitizenGroup.add(syes);
		seniorcitizenGroup.add(sno);
		
		JLabel existingaccountfield = new JLabel("Existing Account: ");
		existingaccountfield.setFont(new Font("Raleway", Font.BOLD, 20));
		existingaccountfield.setBounds(100, 590, 200, 30);
		add(existingaccountfield);
		
		eyes = new JRadioButton("Yes");
		eyes.setBounds(300, 590, 100, 30);
		eyes.setBackground(Color.WHITE);
		add(eyes);
		
		eno = new JRadioButton("No");
		eno.setBounds(450, 590, 100, 30);
		eno.setBackground(Color.WHITE);
		add(eno);
		
		ButtonGroup existingaccountGroup = new ButtonGroup();
		existingaccountGroup.add(eyes);
		existingaccountGroup.add(eno);
		
		JButton next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.white);
		
		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		String sreligion = (String) religion.getSelectedItem();
		String scategory = (String) category.getSelectedItem();
		String sincome = (String) income.getSelectedItem();
		String seducation = (String) education.getSelectedItem();
		String soccupation = (String) occupation.getSelectedItem();
		String seniorcitizen = null;
		if(syes.isSelected()) {
			seniorcitizen = "Yes";
		} else if(sno.isSelected()) {
			seniorcitizen = "No";
		}
		String existingaccount = null;
		if(eyes.isSelected()) {
			existingaccount = "Yes";
		} else if(eno.isSelected()) {
			existingaccount = "No";
		}
		String span = pan.getText();
		String saadhar = aadhar.getText();
		
		try {
			if(religion.equals("")) {
				JOptionPane.showMessageDialog(null, "Religion is Required");
			} else if(category.equals("")) {
				JOptionPane.showMessageDialog(null, "Category is Required");
			} else if(income.equals("")) {
				JOptionPane.showMessageDialog(null, "Income is Required");
			} else if(education == null) {
				JOptionPane.showMessageDialog(null, "Educational Qualification is Required");
			} else if(occupation.equals("")) {
				JOptionPane.showMessageDialog(null, "Occupation is Required");
			} else if(pan == null) {
				JOptionPane.showMessageDialog(null, "PAN Number is Required");
			} else if(aadhar.equals("")) {
				JOptionPane.showMessageDialog(null, "Aadhar Number is Required");
			} else if(seniorcitizen.equals("")) {
				JOptionPane.showMessageDialog(null, "Please specify you are Senior Citizen or not");
			} else if(existingaccount.equals("")) {
				JOptionPane.showMessageDialog(null, "Please specify you have an existing account or not");
			} else {
				Conn c = new Conn();
				String query = "INSERT INTO SignUpTwo VALUES('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new SignupThree(formno).setVisible(true);
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		new SignupTwo("");
	}

}
