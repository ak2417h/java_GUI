import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentDatabaseConnection extends JFrame {

	private JPanel contentPane;
	private JTextField sitxt;
	private JTextField fntxt;
	private JLabel lblNewLabel_2;
	private JTextField lntxt;
	private JLabel lblNewLabel_3;
	private JTextField gltxt;
	private JLabel lblNewLabel_4;
	private JTextField fgtxt;
	private JTable table;
	private JButton updatebtn;
	private JScrollPane scrollPane;
	private JButton loadbtn;
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
					StudentDatabaseConnection frame = new StudentDatabaseConnection();
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
	public StudentDatabaseConnection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("StudentID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(23, 61, 76, 14);
		contentPane.add(lblNewLabel);
		
		sitxt = new JTextField();
		sitxt.setBounds(109, 60, 86, 20);
		contentPane.add(sitxt);
		sitxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(23, 111, 76, 14);
		contentPane.add(lblNewLabel_1);
		
		fntxt = new JTextField();
		fntxt.setColumns(10);
		fntxt.setBounds(109, 110, 86, 20);
		contentPane.add(fntxt);
		
		lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(23, 162, 76, 14);
		contentPane.add(lblNewLabel_2);
		
		lntxt = new JTextField();
		lntxt.setColumns(10);
		lntxt.setBounds(109, 161, 86, 20);
		contentPane.add(lntxt);
		
		lblNewLabel_3 = new JLabel("Grade Level");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(23, 213, 76, 14);
		contentPane.add(lblNewLabel_3);
		
		gltxt = new JTextField();
		gltxt.setColumns(10);
		gltxt.setBounds(109, 212, 86, 20);
		contentPane.add(gltxt);
		
		lblNewLabel_4 = new JLabel("Final Grade");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(23, 261, 76, 14);
		contentPane.add(lblNewLabel_4);
		
		fgtxt = new JTextField();
		fgtxt.setColumns(10);
		fgtxt.setBounds(109, 260, 86, 20);
		contentPane.add(fgtxt);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(284, 50, 301, 256);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				String id = (String) table.getValueAt(row, 0);
				String first = (String) table.getValueAt(row, 1);
				String last = (String) table.getValueAt(row, 2);
				String level = (String) table.getValueAt(row, 3);
				int grade = (int) table.getValueAt(row, 4);
				sitxt.setText(id);
				fntxt.setText(first);
				lntxt.setText(last);
				gltxt.setText(level);
				fgtxt.setText(""+grade);
				
			}
		});
		scrollPane.setViewportView(table);
		
		JButton addbtn = new JButton("Add Student");
		addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = sitxt.getText();
				String first = fntxt.getText();
				String last = lntxt.getText();
				String level = gltxt.getText();
				int grade = Integer.parseInt(fgtxt.getText());
				model = (DefaultTableModel) table.getModel();
				String[] row = {id,first,last,level,""+grade};
				model.addRow(row);
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//k0909471//Desktop//Student datatbase collectino//student.accdb");
					st = con.createStatement();
					st.executeUpdate("insert into student (studentid,firstname,lastname,gradelevel,finalgrade) values('"+id+"','"+first+"','"+last+"','"+level+"','"+grade+"')");
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		addbtn.setBounds(26, 324, 99, 23);
		contentPane.add(addbtn);
		
		JButton delbtn = new JButton("Delete Student");
		delbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int deletedRow = table.getSelectedRow();
				String cell = (String) table.getValueAt(deletedRow, 0);
				model = (DefaultTableModel) table.getModel();
				model.removeRow(deletedRow);
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//k0909471//Desktop//Student datatbase collectino//student.accdb");
					st = con.createStatement();
					st.executeUpdate("delete from student where studentid = '" + cell + "'");
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		delbtn.setBounds(159, 324, 105, 23);
		contentPane.add(delbtn);
		
		updatebtn = new JButton("Update Student");
		updatebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int updatedRow = table.getSelectedRow();
				String id = sitxt.getText();
				String first = fntxt.getText();
				String last = lntxt.getText();
				String level = gltxt.getText();
				int grade = Integer.parseInt(fgtxt.getText());
				table.setValueAt(id, updatedRow, 0);
				table.setValueAt(first, updatedRow, 1);
				table.setValueAt(last, updatedRow, 2);
				table.setValueAt(level, updatedRow, 3);
				table.setValueAt(grade, updatedRow, 4);
				String cell = (String) table.getValueAt(updatedRow, 0);
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//k0909471//Desktop//Student datatbase collectino//student.accdb");
					pst = con.prepareStatement("update student set studentid = '" + id + "',firstname='" + first + "',lastname='" + last + "',gradelevel='" + level + "',finalgrade='" + grade + "' where studentid = '" + cell + "'");
					pst.executeUpdate();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		updatebtn.setBounds(297, 325, 114, 23);
		contentPane.add(updatebtn);
		
		loadbtn = new JButton("Load");
		loadbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//k0909471//Desktop//Student datatbase collectino//student.accdb");
//					JOptionPane.showMessageDialog(null, "Connection successful!!");
					st = con.createStatement();
					String sql = "select studentid,firstname,lastname,gradelevel,finalgrade from student";
					rs = st.executeQuery(sql);
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		loadbtn.setBounds(429, 11, 99, 23);
		contentPane.add(loadbtn);
	}
}
