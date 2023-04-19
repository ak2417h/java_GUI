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
		
		JPanel signup = new JPanel();
		contentPane.add(signup, "name_2173984930563999");
		signup.setLayout(null);
		
		JPanel quiz = new JPanel();
		JScrollPane scrquiz = new JScrollPane(quiz);
		quiz.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Java Quiz");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(293, 23, 117, 53);
		quiz.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("1. What is the output of the following code: System.out.print(\"Hello\" + \"World\");");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(35, 104, 533, 16);
		quiz.add(lblNewLabel_5);
		
		JRadioButton one_1 = new JRadioButton("Hello World");
		one_1.setBounds(35, 127, 109, 23);
		quiz.add(one_1);
		
		JRadioButton one_2 = new JRadioButton("Hello");
		one_2.setBounds(35, 153, 109, 23);
		quiz.add(one_2);
		
		JRadioButton one_corr = new JRadioButton("HelloWorld");
		one_corr.setBounds(35, 180, 109, 23);
		quiz.add(one_corr);
		contentPane.add(scrquiz, "name_2604901321356900");
		
		ButtonGroup one_button = new ButtonGroup();
		one_button.add(one_1);
		one_button.add(one_2);
		one_button.add(one_corr);
		
		JButton submitbtn = new JButton("Submit");
		submitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (one_corr.isSelected()) {
					JOptionPane.showMessageDialog(null, "100");
				}
			}
		});
		submitbtn.setBounds(258, 412, 89, 23);
		quiz.add(submitbtn);
		
		JPanel login = new JPanel();
		contentPane.add(login, "name_2173996356508799");
		login.setLayout(null);
		
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
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				signup.setVisible(false);
				login.setVisible(true);
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
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\k0909471\\Downloads\\compsci\\compsciquiz\\compsciquizdb.accdb");
					st = con.createStatement();
					String sql = "select username,email,password from db where username = " + un;
					rs = st.executeQuery(sql);
					JOptionPane.showMessageDialog(null, rs.toString());
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				signup.setVisible(false);
				login.setVisible(false);
				scrquiz.setVisible(true);
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
		
		
		
	}
}
