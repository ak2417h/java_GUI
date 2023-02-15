import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bookStore extends JFrame {

	private JPanel contentPane;
	private JTextField btxt;
	private JTextField ttxt;
	private JTextField atxt;
	private JTextField ptxt;
	private JTextField ctxt;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookStore frame = new bookStore();
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
	public bookStore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Store");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(238, 11, 129, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BookID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 71, 84, 25);
		contentPane.add(lblNewLabel_1);
		
		btxt = new JTextField();
		btxt.setBounds(104, 75, 86, 20);
		contentPane.add(btxt);
		btxt.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Title");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 107, 84, 25);
		contentPane.add(lblNewLabel_1_1);
		
		ttxt = new JTextField();
		ttxt.setColumns(10);
		ttxt.setBounds(104, 111, 86, 20);
		contentPane.add(ttxt);
		
		JLabel lblNewLabel_1_2 = new JLabel("Author");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 143, 84, 25);
		contentPane.add(lblNewLabel_1_2);
		
		atxt = new JTextField();
		atxt.setColumns(10);
		atxt.setBounds(104, 147, 86, 20);
		contentPane.add(atxt);
		
		JLabel lblNewLabel_1_3 = new JLabel("Price");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(10, 179, 84, 25);
		contentPane.add(lblNewLabel_1_3);
		
		ptxt = new JTextField();
		ptxt.setColumns(10);
		ptxt.setBounds(104, 183, 86, 20);
		contentPane.add(ptxt);
		
		JLabel lblNewLabel_1_4 = new JLabel("Copies");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(10, 214, 84, 25);
		contentPane.add(lblNewLabel_1_4);
		
		ctxt = new JTextField();
		ctxt.setColumns(10);
		ctxt.setBounds(104, 218, 86, 20);
		contentPane.add(ctxt);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(238, 71, 339, 202);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		scrollPane.setViewportView(table);
		
		model = (DefaultTableModel) table.getModel();
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b = btxt.getText();
				String t = ttxt.getText();
				String a = atxt.getText();
				String p = ptxt.getText();
				String c = ctxt.getText();
				String[] newRow = {b,t,a,p,c};
				model.addRow(newRow);
			}
		});
		btnNewButton.setBounds(10, 261, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnChange = new JButton("Change");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = table.getSelectedRow();
				String b = btxt.getText();
				String t = ttxt.getText();
				String a = atxt.getText();
				String p = ptxt.getText();
				String c = ctxt.getText();
				model.setValueAt(b, x, 0);
				model.setValueAt(t, x, 1);
				model.setValueAt(a, x, 2);
				model.setValueAt(p, x, 3);
				model.setValueAt(c, x, 4);
			}
		});
		btnChange.setBounds(10, 295, 89, 23);
		contentPane.add(btnChange);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				model.removeRow(row);
			}
		});
		btnRemove.setBounds(10, 329, 89, 23);
		contentPane.add(btnRemove);
		
		JButton btnFirst = new JButton("First");
		btnFirst.setBounds(136, 314, 89, 23);
		contentPane.add(btnFirst);
		
		JButton btnLast = new JButton("Next");
		btnLast.setBounds(238, 314, 89, 23);
		contentPane.add(btnLast);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(337, 314, 89, 23);
		contentPane.add(btnPrevious);
		
		JButton btnLast_1 = new JButton("Last");
		btnLast_1.setBounds(436, 314, 89, 23);
		contentPane.add(btnLast_1);
		
		model = (DefaultTableModel) table.getModel();
		String[] headers = {"BookID","Title","Author","Price","Copies"};
		model.setColumnIdentifiers(headers);
	}
}
