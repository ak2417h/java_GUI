package personalInfo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class personalInfo extends JFrame {

	private JPanel contentPane;
	private JTextField fntxt;
	private JTextField lntxt;
	private JTextField stxt;
	private JTextField ctxt;
	private JTextField pntxt;
	private JTextField etxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					personalInfo frame = new personalInfo();
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
	public personalInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Personal Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 32, 707, 300);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 33, 85, 33);
		panel.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName.setBounds(10, 77, 85, 33);
		panel.add(lblLastName);
		
		JLabel lblStreet = new JLabel("Street");
		lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStreet.setBounds(10, 121, 85, 33);
		panel.add(lblStreet);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCity.setBounds(10, 165, 85, 33);
		panel.add(lblCity);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblState.setBounds(10, 209, 85, 33);
		panel.add(lblState);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPhoneNumber.setBounds(275, 33, 151, 33);
		panel.add(lblPhoneNumber);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(275, 77, 85, 33);
		panel.add(lblEmail);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGender.setBounds(275, 121, 85, 33);
		panel.add(lblGender);
		
		fntxt = new JTextField();
		fntxt.setBounds(105, 41, 109, 20);
		panel.add(fntxt);
		fntxt.setColumns(10);
		
		lntxt = new JTextField();
		lntxt.setColumns(10);
		lntxt.setBounds(105, 85, 109, 20);
		panel.add(lntxt);
		
		stxt = new JTextField();
		stxt.setColumns(10);
		stxt.setBounds(105, 129, 109, 20);
		panel.add(stxt);
		
		ctxt = new JTextField();
		ctxt.setColumns(10);
		ctxt.setBounds(105, 173, 109, 20);
		panel.add(ctxt);
		
		pntxt = new JTextField();
		pntxt.setColumns(10);
		pntxt.setBounds(402, 41, 109, 20);
		panel.add(pntxt);
		
		etxt = new JTextField();
		etxt.setColumns(10);
		etxt.setBounds(402, 85, 109, 20);
		panel.add(etxt);
		
		JRadioButton malebtn = new JRadioButton("male");
		JRadioButton femalebtn = new JRadioButton("female");
		femalebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (femalebtn.isSelected()) {
					malebtn.setSelected(false);
				}
			}
		});
		malebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (malebtn.isSelected()) {
					femalebtn.setSelected(false);
				}
			}
		});
		malebtn.setBounds(379, 128, 54, 23);
		panel.add(malebtn);
		
		femalebtn.setBounds(444, 128, 109, 23);
		panel.add(femalebtn);
		
//		ButtonGroup bg = new ButtonGroup();
//		bg.add(femalebtn);
//		bg.add(malebtn);
		
		String[] arr = {"Select state:","TX","CA","NY","TN","GA"};
		JComboBox comboBox = new JComboBox(arr);
		comboBox.setBounds(105, 216, 109, 22);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fntxt.setText("");
				lntxt.setText("");
				stxt.setText("");
				ctxt.setText("");
				pntxt.setText("");
				etxt.setText("");
				comboBox.setSelectedIndex(0);
				malebtn.setSelected(false);
				femalebtn.setSelected(false);
			}
		});
		btnNewButton.setBounds(20, 343, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuit.setBounds(628, 343, 89, 23);
		contentPane.add(btnQuit);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> al = new ArrayList<String>();
				if (fntxt.getText().equals("")) {
					al.add("Please Enter First Name");
				}
				if (lntxt.getText().equals("")) {
					al.add("Please Enter Last Name");
				}
				if (stxt.getText().equals("")) {
					al.add("Please Enter Street Address");
				}
				if (ctxt.getText().equals("")) {
					al.add("Please Enter City");
				}
				if (pntxt.getText().equals("")) {
					al.add("Please Enter Phone Number");
				}
				if (etxt.getText().equals("")) {
					al.add("Please Enter Email");
				}
				if (!femalebtn.isSelected() && !malebtn.isSelected()) {
					al.add("Please Enter Your Gender");
				}
				if (comboBox.getSelectedIndex() == 0) {
					al.add("Please select a state");
				}
				if (al.isEmpty()) {
					al.add("Form Successfully Submitted");
				}
				String temp = "";
				for (String i : al) {
					temp += i + "\n";
				}
				JOptionPane.showMessageDialog(null, temp);
			}
		});
		btnSubmit.setBounds(529, 343, 89, 23);
		contentPane.add(btnSubmit);
				
	}
}
