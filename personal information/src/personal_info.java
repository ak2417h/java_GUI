import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class personal_info extends JFrame {

	private JPanel contentPane;
	private JTextField fn_txt;
	private JTextField ln_txt;
	private JTextField street_txt;
	private JTextField city_txt;
	private JTextField pn_txt;
	private JTextField email_txt;
	private JRadioButton male_btn;
	private JRadioButton female_btn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					personal_info frame = new personal_info();
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
	public personal_info() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Personal Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(69, 65, 551, 337);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 46, 124, 24);
		panel_1.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName.setBounds(10, 93, 124, 24);
		panel_1.add(lblLastName);
		
		JLabel lblStreet = new JLabel("Street");
		lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStreet.setBounds(10, 140, 124, 24);
		panel_1.add(lblStreet);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCity.setBounds(10, 188, 124, 24);
		panel_1.add(lblCity);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblState.setBounds(10, 243, 124, 24);
		panel_1.add(lblState);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPhoneNumber.setBounds(283, 46, 124, 24);
		panel_1.add(lblPhoneNumber);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(283, 93, 124, 24);
		panel_1.add(lblEmail);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGender.setBounds(283, 140, 124, 24);
		panel_1.add(lblGender);
		
		fn_txt = new JTextField();
		fn_txt.setBounds(105, 50, 116, 20);
		panel_1.add(fn_txt);
		fn_txt.setColumns(10);
		
		ln_txt = new JTextField();
		ln_txt.setColumns(10);
		ln_txt.setBounds(105, 97, 116, 20);
		panel_1.add(ln_txt);
		
		street_txt = new JTextField();
		street_txt.setColumns(10);
		street_txt.setBounds(105, 144, 116, 20);
		panel_1.add(street_txt);
		
		city_txt = new JTextField();
		city_txt.setColumns(10);
		city_txt.setBounds(105, 192, 116, 20);
		panel_1.add(city_txt);
		
		pn_txt = new JTextField();
		pn_txt.setColumns(10);
		pn_txt.setBounds(401, 50, 116, 20);
		panel_1.add(pn_txt);
		
		email_txt = new JTextField();
		email_txt.setColumns(10);
		email_txt.setBounds(401, 97, 116, 20);
		panel_1.add(email_txt);
		
		String[] states = {"Select a state:","TX","NY","TN","GA","CA"};
		JComboBox state_cb = new JComboBox(states);
		state_cb.setBounds(105, 246, 116, 20);
		panel_1.add(state_cb);
		
		JRadioButton male_btn = new JRadioButton("Male");
		male_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(male_btn.isSelected()) {
					female_btn.setSelected(false);
				}
			}
		});
		male_btn.setBounds(390, 143, 55, 23);
		panel_1.add(male_btn);
		
		JRadioButton female_btn = new JRadioButton("Female");
		female_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(female_btn.isSelected()) {
					male_btn.setSelected(false);
				}
			}
		});
		female_btn.setBounds(455, 143, 90, 23);
		panel_1.add(female_btn);
		
		JPanel panel = new JPanel();
		panel.setBounds(354, 14, 1, 1);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fn_txt.setText("");
				ln_txt.setText("");
				street_txt.setText("");
				city_txt.setText("");
				pn_txt.setText("");
				email_txt.setText("");
				state_cb.setSelectedIndex(0);
				female_btn.setSelected(false);
				male_btn.setSelected(false);
			}
		});
		btnNewButton.setBounds(79, 414, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuit.setBounds(531, 413, 89, 23);
		contentPane.add(btnQuit);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Your form is successful submitted!!");
			}
		});
		btnSubmit.setBounds(432, 414, 89, 23);
		contentPane.add(btnSubmit);
	}
}
