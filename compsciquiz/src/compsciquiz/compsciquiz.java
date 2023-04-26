package compsciquiz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JRadioButton;

public class compsciquiz extends JFrame {

	private JPanel contentPane;
	private JTextField su_un;
	private JTextField su_e;
	private JTextField su_p;
	private Connection con;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;
	private DefaultTableModel model = new DefaultTableModel(); 
	private JTextField un_su;
	private JTextField e_su;
	private JTextField p_su;
	private JTextField li_p;
	private JTextField li_un;
	int total = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					compsciquiz frame = new compsciquiz();
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
	public compsciquiz() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel login = new JPanel();
		contentPane.add(login, "name_2173996356508799");
		login.setLayout(null);
		
		JPanel quiz_1 = new JPanel();
		quiz_1.setLayout(null);
		contentPane.add(quiz_1, "name_2777836204087300");
		
		JPanel signup = new JPanel();
		contentPane.add(signup, "name_2173984930563999");
		signup.setLayout(null);
		
		JPanel quiz_2 = new JPanel();
		contentPane.add(quiz_2, "name_3037702298492800");
		quiz_2.setLayout(null);
		
		JPanel quiz_3 = new JPanel();
		contentPane.add(quiz_3, "name_3126394146466800");
		quiz_3.setLayout(null);
		
		JPanel quiz_4 = new JPanel();
		contentPane.add(quiz_4, "name_3126400354851900");
		quiz_4.setLayout(null);
		
		JPanel quiz_5 = new JPanel();
		contentPane.add(quiz_5, "name_3126401590626000");
		quiz_5.setLayout(null);
		
		JPanel quiz_6 = new JPanel();
		contentPane.add(quiz_6, "name_3126402554441000");
		quiz_6.setLayout(null);
		
		JPanel quiz_7 = new JPanel();
		contentPane.add(quiz_7, "name_3126403682077100");
		quiz_7.setLayout(null);
		
		JPanel quiz_8 = new JPanel();
		contentPane.add(quiz_8, "name_3126408087137900");
		quiz_8.setLayout(null);
		
		JPanel quiz_9 = new JPanel();
		contentPane.add(quiz_9, "name_3126409809389100");
		quiz_9.setLayout(null);
		
		JPanel quiz_10 = new JPanel();
		contentPane.add(quiz_10, "name_3126411353395000");
		quiz_10.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("Java Quiz");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_1.setBounds(293, 23, 117, 53);
		quiz_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("1. What is the output of the following code: System.out.print(\"Hello\" + \"World\");");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5_1.setBounds(35, 104, 533, 16);
		quiz_1.add(lblNewLabel_5_1);
		
		JRadioButton one_1 = new JRadioButton("Hello World");
		one_1.setBounds(35, 127, 109, 23);
		quiz_1.add(one_1);
		
		JRadioButton one_2 = new JRadioButton("Hello");
		one_2.setBounds(35, 153, 109, 23);
		quiz_1.add(one_2);
		
		JRadioButton one_corr = new JRadioButton("HelloWorld");
		one_corr.setBounds(35, 180, 109, 23);
		quiz_1.add(one_corr);
		
		JButton submitbtn_1 = new JButton("Submit");
		submitbtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (one_corr.isSelected()) {
//					JOptionPane.showMessageDialog(null, "Correct");
					total += 10;
				}
				signup.setVisible(false);
				login.setVisible(false);
				quiz_1.setVisible(false);
				quiz_2.setVisible(true);
			}
		});
		submitbtn_1.setBounds(258, 412, 89, 23);
		quiz_1.add(submitbtn_1);
		quiz_1.add(one_2);
		quiz_1.add(one_1);
		
		ButtonGroup one_button = new ButtonGroup();
		one_button.add(one_corr);
		
		login.setVisible(false);
		signup.setVisible(true);
		quiz_1.setVisible(false);
		
		
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(293, 23, 117, 53);
		signup.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(201, 125, 108, 47);
		signup.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Email");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(201, 200, 108, 47);
		signup.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Password");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(201, 278, 108, 47);
		signup.add(lblNewLabel_2_2);
		
		un_su = new JTextField();
		un_su.setBounds(313, 140, 117, 20);
		signup.add(un_su);
		un_su.setColumns(10);
		
		e_su = new JTextField();
		e_su.setColumns(10);
		e_su.setBounds(313, 215, 117, 20);
		signup.add(e_su);
		
		p_su = new JPasswordField();
		p_su.setColumns(10);
		p_su.setBounds(313, 293, 117, 20);
		signup.add(p_su);
		
		JButton subtn = new JButton("Sign Up");
		subtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String username = un_su.getText();
					String email = e_su.getText();
					String password = new String(((JPasswordField) p_su).getPassword());
					
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\k0909471\\Downloads\\compsci\\compsciquiz\\compsciquizdb.accdb");
					st = con.createStatement();
					st.executeUpdate("insert into db (username,email,password) values('"+username+"','"+email+"','"+password+"')");
					signup.setVisible(false);
					login.setVisible(false);
					quiz_1.setVisible(true);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		subtn.setBounds(263, 356, 89, 23);
		signup.add(subtn);
		
		JLabel lblNewLabel_3_1 = new JLabel("Already Have An Account?");
		lblNewLabel_3_1.setBounds(211, 394, 157, 14);
		signup.add(lblNewLabel_3_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signup.setVisible(false);
				login.setVisible(true);
			}
		});
		btnLogin.setBounds(378, 390, 89, 23);
		signup.add(btnLogin);
		
		JLabel lblNewLabel_1 = new JLabel("login");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(293, 23, 117, 53);
		login.add(lblNewLabel_1);
		
		JButton lbtn = new JButton("Login");
		lbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String un = li_un.getText();
					String pw = li_p.getText();
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\k0909471\\Downloads\\compsci\\compsciquiz\\compsciquizdb.accdb");
					st = con.createStatement();
					String sql = "SELECT * from db WHERE username = '" + un + "' AND " + "password = '" + pw + "'";
//					String sql = "SELECT CASE WHEN EXISTS (SELECT * from db WHERE username = '" + un + "' AND " + "password = '" + pw + "') THEN 'TRUE' ELSE 'FALSE' END";
//					String sql = "SELECT * when EXISTS ( SELECT * from db WHERE username = '" + un + "' AND " + "password = '" + pw + "' then TRUE else FALSE end";
					
//					JOptionPane.showMessageDialog(null, sql);
					 rs = st.executeQuery(sql);
					 boolean stop = true;
					 while (rs.next()) {
						 if (rs.getString("username").equals(un) && rs.getString("password").equals(pw)) {
							 signup.setVisible(false);
								login.setVisible(false);
								quiz_1.setVisible(true);
								stop = false;
						 }
//						 JOptionPane.showMessageDialog(null, rs.getString("username"));						 
					 }
					 if (stop) {
						 JOptionPane.showMessageDialog(null, "Incorrect Credentials");						 
					 }
					
//					JOptionPane.showMessageDialog(null, rs.toString());
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//				finally {
//					JOptionPane.showMessageDialog(null, "User Doesn't Exist");
//				}
			}
		});
		lbtn.setBounds(265, 280, 89, 23);
		login.add(lbtn);
		
		li_p = new JPasswordField();
		li_p.setColumns(10);
		li_p.setBounds(315, 217, 117, 20);
		login.add(li_p);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Password");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_2_1.setBounds(203, 202, 108, 47);
		login.add(lblNewLabel_2_2_1);
		
		li_un = new JTextField();
		li_un.setColumns(10);
		li_un.setBounds(315, 139, 117, 20);
		login.add(li_un);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Username");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(203, 124, 108, 47);
		login.add(lblNewLabel_2_1_1);
		
		JButton gtsu = new JButton("Signup");
		gtsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signup.setVisible(true);
				login.setVisible(false);
			}
		});
		gtsu.setBounds(363, 314, 89, 23);
		login.add(gtsu);
		
		
		JLabel lblNewLabel_3 = new JLabel("Don't Have An Account?");
		lblNewLabel_3.setBounds(214, 318, 140, 14);
		login.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Java Quiz");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_1_1.setBounds(292, 25, 117, 53);
		quiz_2.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("2. What is the output of the following code: System.out.print(1%3);");
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5_1_1.setBounds(34, 106, 533, 16);
		quiz_2.add(lblNewLabel_5_1_1);
		
		JRadioButton two_corr = new JRadioButton("1");
		two_corr.setBounds(34, 129, 109, 23);
		quiz_2.add(two_corr);
		
		JRadioButton one_2_1 = new JRadioButton("0");
		one_2_1.setBounds(34, 181, 109, 23);
		quiz_2.add(one_2_1);
		
		JRadioButton one_corr_1 = new JRadioButton("3");
		one_corr_1.setBounds(34, 155, 109, 23);
		quiz_2.add(one_corr_1);
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(one_corr_1);
		bg1.add(one_2_1);
		bg1.add(two_corr);
		
		JButton submitbtn_1_1 = new JButton("Submit");
		submitbtn_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (two_corr.isSelected()) {
					total += 10;
				}
				signup.setVisible(false);
				login.setVisible(false);
				quiz_1.setVisible(false);
				quiz_2.setVisible(false);
				quiz_3.setVisible(true);
			}
		});
		submitbtn_1_1.setBounds(257, 414, 89, 23);
		quiz_2.add(submitbtn_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Java Quiz");
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_1_1_1.setBounds(276, 11, 117, 53);
		quiz_3.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("3. What is the output of the following code: System.out.print(3/3);");
		lblNewLabel_5_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5_1_1_1.setBounds(18, 92, 533, 16);
		quiz_3.add(lblNewLabel_5_1_1_1);
		
		JRadioButton three_corr = new JRadioButton("1");
		three_corr.setBounds(18, 115, 109, 23);
		quiz_3.add(three_corr);
		
		JRadioButton one_corr_1_1 = new JRadioButton("3");
		one_corr_1_1.setBounds(18, 141, 109, 23);
		quiz_3.add(one_corr_1_1);
		
		JRadioButton one_2_1_1 = new JRadioButton("0");
		one_2_1_1.setBounds(18, 167, 109, 23);
		quiz_3.add(one_2_1_1);
		
		JButton submitbtn_1_1_1 = new JButton("Submit");
		submitbtn_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (three_corr.isSelected()) {
					total += 10;
//					JOptionPane.showMessageDialog(null, total);
				}
				signup.setVisible(false);
				login.setVisible(false);
				quiz_1.setVisible(false);
				quiz_2.setVisible(false);
				quiz_3.setVisible(false);
				quiz_4.setVisible(true);
			}
		});
		submitbtn_1_1_1.setBounds(241, 400, 89, 23);
		quiz_3.add(submitbtn_1_1_1);
		
		
		JLabel lblNewLabel_4_1_1_2 = new JLabel("Java Quiz");
		lblNewLabel_4_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_1_1_2.setBounds(281, 11, 117, 53);
		quiz_4.add(lblNewLabel_4_1_1_2);
		
		JLabel lblNewLabel_5_1_1_2 = new JLabel("4. What is the output of the following code: System.out.print(1*3);");
		lblNewLabel_5_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5_1_1_2.setBounds(23, 92, 533, 16);
		quiz_4.add(lblNewLabel_5_1_1_2);
		
		JRadioButton one_1_1_2 = new JRadioButton("1");
		one_1_1_2.setBounds(23, 115, 109, 23);
		quiz_4.add(one_1_1_2);
		
		JRadioButton four_corr = new JRadioButton("3");
		four_corr.setBounds(23, 141, 109, 23);
		quiz_4.add(four_corr);
		
		JRadioButton one_2_1_2 = new JRadioButton("0");
		one_2_1_2.setBounds(23, 167, 109, 23);
		quiz_4.add(one_2_1_2);
		
		JButton submitbtn_1_1_2 = new JButton("Submit");
		submitbtn_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (four_corr.isSelected()) {
					total += 10;
				}
				signup.setVisible(false);
				login.setVisible(false);
				quiz_1.setVisible(false);
				quiz_2.setVisible(false);
				quiz_3.setVisible(false);
				quiz_4.setVisible(false);
				quiz_5.setVisible(true);
			}
		});
		submitbtn_1_1_2.setBounds(246, 400, 89, 23);
		quiz_4.add(submitbtn_1_1_2);
		
		
		
		JLabel lblNewLabel_4_1_1_3 = new JLabel("Java Quiz");
		lblNewLabel_4_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_1_1_3.setBounds(274, 11, 117, 53);
		quiz_5.add(lblNewLabel_4_1_1_3);
		
		JLabel lblNewLabel_5_1_1_3 = new JLabel("5. What is the output of the following code: System.out.print(\"1\" + 3);");
		lblNewLabel_5_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5_1_1_3.setBounds(16, 92, 533, 16);
		quiz_5.add(lblNewLabel_5_1_1_3);
		
		JRadioButton five_corr = new JRadioButton("13");
		five_corr.setBounds(16, 115, 109, 23);
		quiz_5.add(five_corr);
		
		JRadioButton one_corr_1_3 = new JRadioButton("3");
		one_corr_1_3.setBounds(16, 141, 109, 23);
		quiz_5.add(one_corr_1_3);
		
		JRadioButton one_2_1_3 = new JRadioButton("4");
		one_2_1_3.setBounds(16, 167, 109, 23);
		quiz_5.add(one_2_1_3);
		
		JButton submitbtn_1_1_3 = new JButton("Submit");
		submitbtn_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (five_corr.isSelected()) {
					total += 10;
				}
				signup.setVisible(false);
				login.setVisible(false);
				quiz_1.setVisible(false);
				quiz_2.setVisible(false);
				quiz_3.setVisible(false);
				quiz_4.setVisible(false);
				quiz_5.setVisible(false);
				quiz_6.setVisible(true);
			}
		});
		submitbtn_1_1_3.setBounds(239, 400, 89, 23);
		quiz_5.add(submitbtn_1_1_3);
		
		JLabel lblNewLabel_4_1_1_4 = new JLabel("Java Quiz");
		lblNewLabel_4_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_1_1_4.setBounds(279, 11, 117, 53);
		quiz_6.add(lblNewLabel_4_1_1_4);
		
		JLabel lblNewLabel_5_1_1_4 = new JLabel("6. What is the output of the following code: System.out.print(1-3);");
		lblNewLabel_5_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5_1_1_4.setBounds(21, 92, 533, 16);
		quiz_6.add(lblNewLabel_5_1_1_4);
		
		JRadioButton six_corr = new JRadioButton("-2");
		six_corr.setBounds(21, 115, 109, 23);
		quiz_6.add(six_corr);
		
		JRadioButton one_corr_1_4 = new JRadioButton("3");
		one_corr_1_4.setBounds(21, 141, 109, 23);
		quiz_6.add(one_corr_1_4);
		
		JRadioButton one_2_1_4 = new JRadioButton("6");
		one_2_1_4.setBounds(21, 167, 109, 23);
		quiz_6.add(one_2_1_4);
		
		JButton submitbtn_1_1_4 = new JButton("Submit");
		submitbtn_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (six_corr.isSelected()) {
					total += 10;
				}
				signup.setVisible(false);
				login.setVisible(false);
				quiz_1.setVisible(false);
				quiz_2.setVisible(false);
				quiz_3.setVisible(false);
				quiz_4.setVisible(false);
				quiz_5.setVisible(false);
				quiz_6.setVisible(false);
				quiz_7.setVisible(true);
			}
		});
		submitbtn_1_1_4.setBounds(244, 400, 89, 23);
		quiz_6.add(submitbtn_1_1_4);
		
		JLabel lblNewLabel_4_1_1_5 = new JLabel("Java Quiz");
		lblNewLabel_4_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_1_1_5.setBounds(277, 11, 117, 53);
		quiz_7.add(lblNewLabel_4_1_1_5);
		
		JLabel lblNewLabel_5_1_1_5 = new JLabel("7. What is the output of the following code: System.out.print(1^2);");
		lblNewLabel_5_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5_1_1_5.setBounds(19, 92, 533, 16);
		quiz_7.add(lblNewLabel_5_1_1_5);
		
		JRadioButton one_1_1_5 = new JRadioButton("1");
		one_1_1_5.setBounds(19, 115, 109, 23);
		quiz_7.add(one_1_1_5);
		
		JRadioButton seven_corr = new JRadioButton("error");
		seven_corr.setBounds(19, 141, 109, 23);
		quiz_7.add(seven_corr);
		
		JRadioButton one_2_1_5 = new JRadioButton("0");
		one_2_1_5.setBounds(19, 167, 109, 23);
		quiz_7.add(one_2_1_5);
		
		JButton submitbtn_1_1_5 = new JButton("Submit");
		submitbtn_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (seven_corr.isSelected()) {
					total += 10;
				}
				signup.setVisible(false);
				login.setVisible(false);
				quiz_1.setVisible(false);
				quiz_2.setVisible(false);
				quiz_3.setVisible(false);
				quiz_4.setVisible(false);
				quiz_5.setVisible(false);
				quiz_6.setVisible(false);
				quiz_7.setVisible(false);
				quiz_8.setVisible(true);
			}
		});
		submitbtn_1_1_5.setBounds(242, 400, 89, 23);
		quiz_7.add(submitbtn_1_1_5);
		
		JLabel lblNewLabel_4_1_1_6 = new JLabel("Java Quiz");
		lblNewLabel_4_1_1_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_1_1_6.setBounds(278, 11, 117, 53);
		quiz_8.add(lblNewLabel_4_1_1_6);
		
		JLabel lblNewLabel_5_1_1_6 = new JLabel("8. What is the output of the following code: System.out.print(\"1\"/3);");
		lblNewLabel_5_1_1_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5_1_1_6.setBounds(20, 92, 533, 16);
		quiz_8.add(lblNewLabel_5_1_1_6);
		
		JRadioButton one_1_1_6 = new JRadioButton("1");
		one_1_1_6.setBounds(20, 115, 109, 23);
		quiz_8.add(one_1_1_6);
		
		JRadioButton one_corr_1_6 = new JRadioButton("3");
		one_corr_1_6.setBounds(20, 141, 109, 23);
		quiz_8.add(one_corr_1_6);
		
		JRadioButton eight_corr = new JRadioButton("error");
		eight_corr.setBounds(20, 167, 109, 23);
		quiz_8.add(eight_corr);
		
		JButton submitbtn_1_1_6 = new JButton("Submit");
		submitbtn_1_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (eight_corr.isSelected()) {
					total += 10;
				}
				signup.setVisible(false);
				login.setVisible(false);
				quiz_1.setVisible(false);
				quiz_2.setVisible(false);
				quiz_3.setVisible(false);
				quiz_4.setVisible(false);
				quiz_5.setVisible(false);
				quiz_6.setVisible(false);
				quiz_7.setVisible(false);
				quiz_8.setVisible(false);
				quiz_9.setVisible(true);
			}
		});
		submitbtn_1_1_6.setBounds(243, 400, 89, 23);
		quiz_8.add(submitbtn_1_1_6);
		
		
		JLabel lblNewLabel_4_1_1_7 = new JLabel("Java Quiz");
		lblNewLabel_4_1_1_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_1_1_7.setBounds(275, 11, 117, 53);
		quiz_9.add(lblNewLabel_4_1_1_7);
		
		JLabel lblNewLabel_5_1_1_7 = new JLabel("9. What is the output of the following code: System.out.print(3**2);");
		lblNewLabel_5_1_1_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5_1_1_7.setBounds(17, 92, 533, 16);
		quiz_9.add(lblNewLabel_5_1_1_7);
		
		JRadioButton nine_corr = new JRadioButton("error");
		nine_corr.setBounds(17, 115, 109, 23);
		quiz_9.add(nine_corr);
		
		JRadioButton one_corr_1_7 = new JRadioButton("3");
		one_corr_1_7.setBounds(17, 141, 109, 23);
		quiz_9.add(one_corr_1_7);
		
		JRadioButton one_2_1_7 = new JRadioButton("9");
		one_2_1_7.setBounds(17, 167, 109, 23);
		quiz_9.add(one_2_1_7);
		
		JButton submitbtn_1_1_7 = new JButton("Submit");
		submitbtn_1_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nine_corr.isSelected()) {
					total += 10;
				}
				signup.setVisible(false);
				login.setVisible(false);
				quiz_1.setVisible(false);
				quiz_2.setVisible(false);
				quiz_3.setVisible(false);
				quiz_4.setVisible(false);
				quiz_5.setVisible(false);
				quiz_6.setVisible(false);
				quiz_7.setVisible(false);
				quiz_8.setVisible(false);
				quiz_9.setVisible(false);
				quiz_10.setVisible(true);
			}
		});
		submitbtn_1_1_7.setBounds(240, 400, 89, 23);
		quiz_9.add(submitbtn_1_1_7);
		
		
		JLabel lblNewLabel_4_1_1_8 = new JLabel("Java Quiz");
		lblNewLabel_4_1_1_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4_1_1_8.setBounds(279, 11, 117, 53);
		quiz_10.add(lblNewLabel_4_1_1_8);
		
		JLabel lblNewLabel_5_1_1_8 = new JLabel("10. What is the output of the following code: System.out.print(\"1+1\");");
		lblNewLabel_5_1_1_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5_1_1_8.setBounds(21, 92, 533, 16);
		quiz_10.add(lblNewLabel_5_1_1_8);
		
		JRadioButton one_1_1_8 = new JRadioButton("1");
		one_1_1_8.setBounds(21, 115, 109, 23);
		quiz_10.add(one_1_1_8);
		
		JRadioButton one_corr_1_8 = new JRadioButton("2");
		one_corr_1_8.setBounds(21, 141, 109, 23);
		quiz_10.add(one_corr_1_8);
		
		JRadioButton ten_corr = new JRadioButton("1+1");
		ten_corr.setBounds(21, 167, 109, 23);
		quiz_10.add(ten_corr);
		
		JButton submitbtn_1_1_8 = new JButton("Submit");
		submitbtn_1_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You got: " + total);
			}
		});
		submitbtn_1_1_8.setBounds(244, 400, 89, 23);
		quiz_10.add(submitbtn_1_1_8);
		
		
		
	}
}
