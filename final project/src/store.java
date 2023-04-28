import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JTextField m_total;
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
		
		JPanel login = new JPanel();
		contentPane.add(login, "name_3209278914142200");
		login.setLayout(null);
		
		JPanel mainpage = new JPanel();
		contentPane.add(mainpage, "name_3209289713365200");
		mainpage.setLayout(null);
		
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
		subtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String name = su_name.getText();
					String email = su_email.getText();
					String password = new String(((JPasswordField) su_pw).getPassword());
					
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\k0909471\\Downloads\\compsci\\final project\\store.accdb");
					st = con.createStatement();
					st.executeUpdate("insert into db (email,name,password) values('"+email+"','"+name+"','"+password+"')");
					signup.setVisible(false);
					login.setVisible(false);
					mainpage.setVisible(true);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "User Already Exists");	
				}
			}
		});
		subtn.setBounds(251, 363, 107, 23);
		signup.add(subtn);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Already Have An Account?");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_2.setBounds(156, 397, 218, 50);
		signup.add(lblNewLabel_1_2_2);
		
		JButton su_libtn = new JButton("Login");
		su_libtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signup.setVisible(false);
				login.setVisible(true);
			}
		});
		su_libtn.setBounds(325, 412, 89, 23);
		signup.add(su_libtn);
		
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
		libtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String un = li_email.getText();
					String pw = new String(((JPasswordField) li_pw).getPassword());
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\k0909471\\Downloads\\compsci\\final project\\store.accdb");
					st = con.createStatement();
					String sql = "SELECT * from db WHERE email = '" + un + "' AND " + "password = '" + pw + "'";
					 rs = st.executeQuery(sql);
					 boolean stop = true;
					 while (rs.next()) {
						 if (rs.getString("email").equals(un) && rs.getString("password").equals(pw)) {
							 signup.setVisible(false);
								login.setVisible(false);
								mainpage.setVisible(true);
								stop = false;
						 }				 
					 }
					 if (stop) {
						 JOptionPane.showMessageDialog(null, "Incorrect Credentials");						 
					 }
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Error");	
				}
			}
		});
		libtn.setBounds(242, 309, 107, 23);
		login.add(libtn);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Don't Have An Account?");
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_2_1.setBounds(172, 343, 218, 50);
		login.add(lblNewLabel_1_2_2_1);
		
		JButton su_libtn_1 = new JButton("Sign Up");
		su_libtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.setVisible(false);
				signup.setVisible(true);
			}
		});
		su_libtn_1.setBounds(312, 358, 89, 23);
		login.add(su_libtn_1);
		
		JLabel lblWelcome = new JLabel("Welcome To The School Supply Store");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblWelcome.setBounds(121, 11, 411, 42);
		mainpage.add(lblWelcome);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(329, 118, 302, 279);
		mainpage.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Load Store Items");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data[][]={ 
						{"Pencil","$0.1"},    
                        {"Eraser","$0.25"},
                        {"Pen","$0.15"},    
                        {"Notebook","$1"},
                        {"Water","$0.5"},
                        {"Chips","$1"},
                        {"Candy","$1"},
                        {"Charging Cable", "$3"},
                        {"Charging Brick", "$10"},
                        {"Headphones","$5"},
                        {"Flash Drive","$10"},
                        {"Laptop","$500"},
                };    
				String column[]={"Item","Cost"};         
				table = new JTable(data,column);
				scrollPane.setViewportView(table);
			}
		});
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
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String item = m_item.getText();
					int quantity = Integer.parseInt(m_quantity.getText());
//				JOptionPane.showMessageDialog(null, table.getValueAt(0,1));	
					
					for (int i = 0; i < table.getRowCount();i++) {
						if (table.getValueAt(i, 0).equals(item)) {
							Double total = Double.parseDouble(table.getValueAt(i, 1).toString().substring(1))*quantity;
							m_total.setText("$" + total);
							break;
						}
						if (i == table.getRowCount()-1) {
							JOptionPane.showMessageDialog(null, "Item Doesn't Exists");	
							break;
						}
					}
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Please Enter A Number For The Quantity");	
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(94, 300, 89, 23);
		mainpage.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Your total is");
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1_1_3.setBounds(23, 393, 99, 50);
		mainpage.add(lblNewLabel_1_1_1_3);
		
		m_total = new JTextField();
		m_total.setColumns(10);
		m_total.setBounds(132, 411, 131, 20);
		mainpage.add(m_total);
		
		
	}
}
