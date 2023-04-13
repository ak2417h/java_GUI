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
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class employeedatabase extends JFrame {

	private JPanel contentPane;
	private JTextField eitxt;
	private JTextField fntxt;
	private JTextField lntxt;
	private JTextField stxt;
	private JTextField dtxt;
	private JTable table;
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
					employeedatabase frame = new employeedatabase();
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
	public employeedatabase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("emoployeeID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 70, 105, 25);
		contentPane.add(lblNewLabel);
		
		eitxt = new JTextField();
		eitxt.setBounds(125, 74, 105, 20);
		contentPane.add(eitxt);
		eitxt.setColumns(10);
		
		fntxt = new JTextField();
		fntxt.setColumns(10);
		fntxt.setBounds(125, 129, 105, 20);
		contentPane.add(fntxt);
		
		JLabel lblFirstNaem = new JLabel("First Name");
		lblFirstNaem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstNaem.setBounds(10, 125, 105, 25);
		contentPane.add(lblFirstNaem);
		
		lntxt = new JTextField();
		lntxt.setColumns(10);
		lntxt.setBounds(125, 181, 105, 20);
		contentPane.add(lntxt);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLastName.setBounds(10, 177, 105, 25);
		contentPane.add(lblLastName);
		
		stxt = new JTextField();
		stxt.setColumns(10);
		stxt.setBounds(125, 235, 105, 20);
		contentPane.add(stxt);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalary.setBounds(10, 231, 105, 25);
		contentPane.add(lblSalary);
		
		dtxt = new JTextField();
		dtxt.setColumns(10);
		dtxt.setBounds(125, 291, 105, 20);
		contentPane.add(dtxt);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDepartment.setBounds(10, 287, 105, 25);
		contentPane.add(lblDepartment);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(325, 70, 352, 253);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				int id = (int) table.getValueAt(row, 0);
				String first = (String) table.getValueAt(row, 1);
				String last = (String) table.getValueAt(row, 2);
				int salary = (int) table.getValueAt(row, 3);
				String department = (String) table.getValueAt(row, 4);
				eitxt.setText("" + id);
				fntxt.setText(first);
				lntxt.setText(last);
				stxt.setText(""+salary);
				dtxt.setText(department);
			}
		});
		scrollPane.setViewportView(table);
		
		JButton loadbtn = new JButton("Load");
		loadbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//k0909471//Downloads//compsci//employee database//employeedatabase.accdb");
//					JOptionPane.showMessageDialog(null, "Connection successful!!");
					st = con.createStatement();
					String sql = "select employeeID,FirstName,LastName,Salary,Department from employeedatabase";
					rs = st.executeQuery(sql);
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		loadbtn.setBounds(325, 28, 89, 23);
		contentPane.add(loadbtn);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = eitxt.getText();
				String first = fntxt.getText();
				String last = lntxt.getText();
				int s = Integer.parseInt(stxt.getText());
				String d = dtxt.getText();
				model = (DefaultTableModel) table.getModel();
				String[] row = {id,first,last,""+s,d};
				model.addRow(row);
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//k0909471//Downloads//compsci//employee database//employeedatabase.accdb");
					st = con.createStatement();
					st.executeUpdate("insert into employeedatabase (employeeID,FirstName,LastName,Salary,Department) values('"+id+"','"+first+"','"+last+"','"+s+"','"+d+"')");
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAddEmployee.setBounds(10, 371, 105, 23);
		contentPane.add(btnAddEmployee);
		
		JButton btnRemoveEmployee = new JButton("Remove Employee");
		btnRemoveEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int deletedRow = table.getSelectedRow();
				int cell = (int) table.getValueAt(deletedRow, 0);
				model = (DefaultTableModel) table.getModel();
				model.removeRow(deletedRow);
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//k0909471//Downloads//compsci//employee database//employeedatabase.accdb");
					st = con.createStatement();
					st.executeUpdate("delete from employeedatabase where employeeID = '" + cell + "'");
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnRemoveEmployee.setBounds(152, 371, 121, 23);
		contentPane.add(btnRemoveEmployee);
		
		JButton btnUpdateEmployee = new JButton("Update Employee");
		btnUpdateEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int updatedRow = table.getSelectedRow();
				String id = eitxt.getText();
				String first = fntxt.getText();
				String last = lntxt.getText();
				int s = Integer.parseInt(stxt.getText());
				String d = dtxt.getText();
				table.setValueAt(id, updatedRow, 0);
				table.setValueAt(first, updatedRow, 1);
				table.setValueAt(last, updatedRow, 2);
				table.setValueAt(s, updatedRow, 3);
				table.setValueAt(d, updatedRow, 4);
				String cell = (String) table.getValueAt(updatedRow, 0);
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//k0909471//Downloads//compsci//employee database//employeedatabase.accdb");
					pst = con.prepareStatement("update employeedatabase set employeeID = '" + id + "',FirstName='" + first + "',LastName='" + last + "',Salary='" + s + "',Department='" + d + "' where employeeID = '" + cell + "'");
					pst.executeUpdate();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnUpdateEmployee.setBounds(303, 371, 121, 23);
		contentPane.add(btnUpdateEmployee);
	}
}
