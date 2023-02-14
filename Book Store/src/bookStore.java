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

public class bookStore extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
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
		
		textField = new JTextField();
		textField.setBounds(104, 75, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Title");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 107, 84, 25);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(104, 111, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Author");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 143, 84, 25);
		contentPane.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(104, 147, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Price");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(10, 179, 84, 25);
		contentPane.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(104, 183, 86, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Copies");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(10, 214, 84, 25);
		contentPane.add(lblNewLabel_1_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(104, 218, 86, 20);
		contentPane.add(textField_4);
		
		table = new JTable();
		table.setBounds(238, 71, 339, 202);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(10, 261, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnChange = new JButton("Change");
		btnChange.setBounds(10, 295, 89, 23);
		contentPane.add(btnChange);
		
		JButton btnRemove = new JButton("Remove");
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
