import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.util.*;
import java.io.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class bankAccount extends JFrame {

	private JPanel contentPane;
	private JTextField fntxt;
	private JTextField lntxt;
	private JTextField agetxt;
	private JTextField citytxt;
	private JTextField baltxt;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bankAccount frame = new bankAccount();
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
	public bankAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bank Account Report");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBounds(282, 5, 199, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(6, 84, 91, 24);
		contentPane.add(lblNewLabel_1);
		
		fntxt = new JTextField();
		fntxt.setBounds(109, 84, 130, 26);
		contentPane.add(fntxt);
		fntxt.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(6, 120, 91, 24);
		contentPane.add(lblNewLabel_1_1);
		
		lntxt = new JTextField();
		lntxt.setColumns(10);
		lntxt.setBounds(109, 120, 130, 26);
		contentPane.add(lntxt);
		
		JLabel lblNewLabel_1_2 = new JLabel("Age");
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(6, 156, 91, 24);
		contentPane.add(lblNewLabel_1_2);
		
		agetxt = new JTextField();
		agetxt.setColumns(10);
		agetxt.setBounds(109, 156, 130, 26);
		contentPane.add(agetxt);
		
		JLabel lblNewLabel_1_3 = new JLabel("City");
		lblNewLabel_1_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(6, 192, 91, 24);
		contentPane.add(lblNewLabel_1_3);
		
		citytxt = new JTextField();
		citytxt.setColumns(10);
		citytxt.setBounds(109, 192, 130, 26);
		contentPane.add(citytxt);
		
		JLabel lblNewLabel_1_4 = new JLabel("Balance");
		lblNewLabel_1_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(6, 228, 91, 24);
		contentPane.add(lblNewLabel_1_4);
		
		baltxt = new JTextField();
		baltxt.setColumns(10);
		baltxt.setBounds(109, 228, 130, 26);
		contentPane.add(baltxt);
		
		JButton cfbtn = new JButton("Clear Fields");
		cfbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fntxt.setText("");
				lntxt.setText("");
				agetxt.setText("");
				citytxt.setText("");
				baltxt.setText("");
			}
		});
		cfbtn.setBounds(58, 338, 136, 29);
		contentPane.add(cfbtn);
		
		JButton aabtn = new JButton("Add Account");
		aabtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fn = fntxt.getText();
				String ln = lntxt.getText();
				String age = agetxt.getText();
				String city = citytxt.getText();
				String balance = baltxt.getText();
				String[] newRow = {fn,ln,age,city,balance};
				model.addRow(newRow);
			}
		});
		aabtn.setBounds(192, 338, 136, 29);
		contentPane.add(aabtn);
		
		JButton uabtn = new JButton("Update Account");
		uabtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = table.getSelectedRow();
				String fn = fntxt.getText();
				String ln = lntxt.getText();
				String age = agetxt.getText();
				String city = citytxt.getText();
				String balance = baltxt.getText();
				model.setValueAt(fn, x, 0);
				model.setValueAt(ln, x, 1);
				model.setValueAt(age, x, 2);
				model.setValueAt(city, x, 3);
				model.setValueAt(balance, x, 4);
			}
		});
		uabtn.setBounds(327, 338, 136, 29);
		contentPane.add(uabtn);
		
		JButton rabtn = new JButton("Remove Account");
		rabtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				model.removeRow(row);
			}
		});
		rabtn.setBounds(461, 338, 136, 29);
		contentPane.add(rabtn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(282, 61, 365, 252);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				String fn = (String) table.getValueAt(row, 0);
				String ln = (String) table.getValueAt(row, 1);
				String age = (String) table.getValueAt(row, 2);
				String city = (String) table.getValueAt(row, 3);
				String balance = (String) table.getValueAt(row, 4);
				fntxt.setText(fn);
				lntxt.setText(ln);
				agetxt.setText(age);
				citytxt.setText(city);
				baltxt.setText(balance);
			}
		});
		scrollPane.setViewportView(table);
		
		JButton ldbtn = new JButton("Load Data");
		ldbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Scanner scan = new Scanner(new File("accounts.txt"));
					scan.nextLine();
					while (scan.hasNextLine()) {
						String[] arr = scan.nextLine().split(" ");
						model.addRow(arr);
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		ldbtn.setBounds(493, 20, 136, 29);
		contentPane.add(ldbtn);
		model = (DefaultTableModel) table.getModel();
		String[] headers = {"First Name","Last Name","Age","City","Balance"};
		model.setColumnIdentifiers(headers);
	}
}
