import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class store extends JFrame {

	private JPanel contentPane;
	private JTextField su_name;
	private JTextField su_email;
	private JPasswordField su_pw;
	private JTextField li_email;
	private JPasswordField li_pw;
	private JTable table;
	private JTextField m_item;
	private JTextField m_quantity;
	private JTextField textField;
	private Connection con;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;
	private DefaultTableModel model = new DefaultTableModel(); 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					store frame = new store();
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
	public store() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel signup = new JPanel();
		contentPane.add(signup, "name_3209259101117200");
		signup.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(268, 36, 133, 42);
		signup.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(190, 138, 99, 50);
		signup.add(lblNewLabel_1);
		
		su_name = new JTextField();
		su_name.setBounds(299, 156, 131, 20);
		signup.add(su_name);
		su_name.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(190, 210, 99, 50);
		signup.add(lblNewLabel_1_1);
		
		su_email = new JTextField();
		su_email.setColumns(10);
		su_email.setBounds(299, 228, 131, 20);
		signup.add(su_email);
		
		JLabel lblNewLabel_1_2 = new JLabel("Password");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(190, 286, 99, 50);
		signup.add(lblNewLabel_1_2);
		
		su_pw = new JPasswordField();
		su_pw.setBounds(299, 304, 131, 20);
		signup.add(su_pw);
		
		JButton subtn = new JButton("Sign Up");
		subtn.setBounds(253, 393, 107, 23);
		signup.add(subtn);
		
		JPanel login = new JPanel();
		contentPane.add(login, "name_3209278914142200");
		login.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblLogin.setBounds(268, 36, 133, 42);
		login.add(lblLogin);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1_1.setBounds(179, 126, 99, 50);
		login.add(lblNewLabel_1_1_1);
		
		li_email = new JTextField();
		li_email.setColumns(10);
		li_email.setBounds(288, 144, 131, 20);
		login.add(li_email);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Password");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_1.setBounds(179, 202, 99, 50);
		login.add(lblNewLabel_1_2_1);
		
		li_pw = new JPasswordField();
		li_pw.setBounds(288, 220, 131, 20);
		login.add(li_pw);
		
		JButton libtn = new JButton("Login");
		libtn.setBounds(242, 309, 107, 23);
		login.add(libtn);
		
		JPanel mainpage = new JPanel();
		contentPane.add(mainpage, "name_3209289713365200");
		mainpage.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblWelcome.setBounds(268, 11, 133, 42);
		mainpage.add(lblWelcome);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(329, 118, 302, 279);
		mainpage.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Load Store Items");
		btnNewButton.setBounds(406, 73, 160, 23);
		mainpage.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Item");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1_1_1.setBounds(23, 133, 99, 50);
		mainpage.add(lblNewLabel_1_1_1_1);
		
		m_item = new JTextField();
		m_item.setColumns(10);
		m_item.setBounds(132, 151, 131, 20);
		mainpage.add(m_item);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Quantity");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1_1_2.setBounds(23, 215, 99, 50);
		mainpage.add(lblNewLabel_1_1_1_2);
		
		m_quantity = new JTextField();
		m_quantity.setColumns(10);
		m_quantity.setBounds(132, 233, 131, 20);
		mainpage.add(m_quantity);
		
		JButton btnNewButton_1 = new JButton("Purchase");
		btnNewButton_1.setBounds(94, 300, 89, 23);
		mainpage.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Your total is");
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1_1_3.setBounds(23, 393, 99, 50);
		mainpage.add(lblNewLabel_1_1_1_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(132, 411, 131, 20);
		mainpage.add(textField);
		
		
	}
}
