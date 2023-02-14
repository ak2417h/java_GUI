import java.awt.EventQueue;
import java.util.*;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// https://www.w3schools.com/java/java_files_create.asp

public class signup extends JFrame {

	private JPanel contentPane;
	private JTextField ncfn;
	private JTextField ncln;
	private JPasswordField ncpw;
	private JPasswordField nccp;
	private JPasswordField ecpw;
	private JTextField ecln;
	private JTextField ecfn;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup frame = new signup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public signup() {
		
		try {
			File file = new File("customer.txt");
			file.createNewFile();
		
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 608, 436);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(89, 67, 392, 278);
			contentPane.add(tabbedPane);
			
			JPanel panel = new JPanel();
			tabbedPane.addTab("New Customer", null, panel, null);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("First Name");
			lblNewLabel.setBounds(10, 29, 82, 14);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			panel.add(lblNewLabel);
			
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setBounds(10, 122, 82, 14);
			lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
			panel.add(lblPassword);
			
			JLabel lblLastName = new JLabel("Last Name");
			lblLastName.setBounds(10, 74, 82, 14);
			lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
			panel.add(lblLastName);
			
			ncfn = new JTextField();
			ncfn.setBounds(151, 29, 126, 20);
			panel.add(ncfn);
			ncfn.setColumns(10);
			
			ncln = new JTextField();
			ncln.setBounds(151, 74, 126, 20);
			ncln.setColumns(10);
			panel.add(ncln);
			
			ncpw = new JPasswordField();
			ncpw.setBounds(151, 122, 126, 20);
			panel.add(ncpw);
			
			JLabel lblConfirmPassword = new JLabel("Confirm Password");
			lblConfirmPassword.setBounds(10, 168, 126, 14);
			lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
			panel.add(lblConfirmPassword);
			
			nccp = new JPasswordField();
			nccp.setBounds(151, 167, 126, 20);
			panel.add(nccp);
			
			JButton signup = new JButton("Sign Up");
			signup.setBounds(132, 203, 89, 23);
			signup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Scanner scan = new Scanner(file);
						boolean add = true;
						while (scan.hasNextLine()) {
							String[] temp = scan.nextLine().split(",");
							if (temp[0].equals(ncfn.getText())&&temp[1].equals(ncln.getText())) {
								JOptionPane.showMessageDialog(null, "User Already Exists");
								add = false;
							}
						}
						if (add) {
							if (String.valueOf(ncpw.getPassword()).equals(String.valueOf(nccp.getPassword()))) {
								FileWriter fw = new FileWriter("customer.txt",true);
								fw.append(ncfn.getText()+","+ncln.getText()+","+String.valueOf(ncpw.getPassword())+"\n");
								fw.close();
								JOptionPane.showMessageDialog(null, "Sign Up Successful");								
							}
							else {
								ncpw.setText("");
								nccp.setText("");
								JOptionPane.showMessageDialog(null, "Passwords Do Not Match");
							}
						}
					}
					catch(Exception e1) {
						e1.printStackTrace();
					}
				}
			});
			panel.add(signup);
			
			JPanel panel1= new JPanel();
			tabbedPane.addTab("Existing Customer", null, panel1, null);
			panel1.setLayout(null);
			
			JButton login = new JButton("Login");
			login.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Scanner scan = new Scanner(file);
						boolean _new = true;
						while (scan.hasNextLine()) {
							String[] temp = scan.nextLine().split(",");
							if (temp[0].equals(ecfn.getText()) && temp[1].equals(ecln.getText())) {
								if (temp[2].equals(String.valueOf(ecpw.getPassword()))){
									JOptionPane.showMessageDialog(null, "Login successful");
									_new = false;									
								}
								else if (!temp[2].equals(String.valueOf(ecpw.getPassword()))) {
									JOptionPane.showMessageDialog(null, "Incorrect Password");
									_new = false;
								}
							}
								
						}
						if (_new) {
							JOptionPane.showMessageDialog(null, "No User Found. Please Sign Up");
						}
						
					}
					catch (Exception e2) {
						
					}
				}
			});
			login.setBounds(133, 167, 89, 23);
			panel1.add(login);
			
			ecpw = new JPasswordField();
			ecpw.setBounds(151, 122, 126, 20);
			panel1.add(ecpw);
			
			ecln = new JTextField();
			ecln.setColumns(10);
			ecln.setBounds(151, 74, 126, 20);
			panel1.add(ecln);
			
			ecfn = new JTextField();
			ecfn.setColumns(10);
			ecfn.setBounds(151, 29, 126, 20);
			panel1.add(ecfn);
			
			JLabel lblNewLabel_1 = new JLabel("First Name");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_1.setBounds(10, 29, 82, 14);
			panel1.add(lblNewLabel_1);
			
			JLabel lblLastName_1 = new JLabel("Last Name");
			lblLastName_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblLastName_1.setBounds(10, 74, 82, 14);
			panel1.add(lblLastName_1);
			
			JLabel lblPassword_1 = new JLabel("Password");
			lblPassword_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPassword_1.setBounds(10, 122, 82, 14);
			panel1.add(lblPassword_1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
