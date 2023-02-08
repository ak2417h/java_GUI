import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class signup extends JFrame {

	private JPanel contentPane;
	private JTextField fntxt;
	private JTextField lntxt;
	private JPasswordField pwtxt;
	private JPasswordField cpwtxt;

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
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 29, 82, 14);
		panel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(10, 122, 82, 14);
		panel.add(lblPassword);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName.setBounds(10, 74, 82, 14);
		panel.add(lblLastName);
		
		fntxt = new JTextField();
		fntxt.setBounds(151, 29, 126, 20);
		panel.add(fntxt);
		fntxt.setColumns(10);
		
		lntxt = new JTextField();
		lntxt.setColumns(10);
		lntxt.setBounds(151, 74, 126, 20);
		panel.add(lntxt);
		
		pwtxt = new JPasswordField();
		pwtxt.setBounds(151, 122, 126, 20);
		panel.add(pwtxt);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConfirmPassword.setBounds(10, 168, 126, 14);
		panel.add(lblConfirmPassword);
		
		cpwtxt = new JPasswordField();
		cpwtxt.setBounds(151, 167, 126, 20);
		panel.add(cpwtxt);
		
		JButton btn = new JButton("Sign Up");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn.setBounds(133, 216, 89, 23);
		panel.add(btn);
		
		JPanel panel1= new JPanel();
		tabbedPane.addTab("Existing Customer", null, panel1, null);
	}
}
