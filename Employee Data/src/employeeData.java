import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class employeeData extends JFrame {

	private JPanel contentPane;
	private JTextField eitxt;
	private JTextField fntxt;
	private JTextField lntxt;
	private JTextField dtxt;
	private JTextField stxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employeeData frame = new employeeData();
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
	
	public void clear() {
		eitxt.setText("");
		fntxt.setText("");
		lntxt.setText("");
		dtxt.setText("");
		stxt.setText("");
	}
	
	public employeeData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Information");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(208, 11, 230, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(48, 88, 141, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(48, 129, 141, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last Name");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(48, 170, 141, 25);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Department");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(48, 210, 141, 23);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Salary");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(48, 249, 141, 23);
		contentPane.add(lblNewLabel_1_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(335, 88, 279, 271);
		contentPane.add(textArea);
		
		eitxt = new JTextField();
		eitxt.setBounds(167, 95, 86, 20);
		contentPane.add(eitxt);
		eitxt.setColumns(10);
		
		fntxt = new JTextField();
		fntxt.setColumns(10);
		fntxt.setBounds(167, 136, 86, 20);
		contentPane.add(fntxt);
		
		lntxt = new JTextField();
		lntxt.setColumns(10);
		lntxt.setBounds(167, 174, 86, 20);
		contentPane.add(lntxt);
		
		dtxt = new JTextField();
		dtxt.setColumns(10);
		dtxt.setBounds(167, 213, 86, 20);
		contentPane.add(dtxt);
		
		stxt = new JTextField();
		stxt.setColumns(10);
		stxt.setBounds(167, 252, 86, 20);
		contentPane.add(stxt);
		
		JButton dbtn = new JButton("Display");
		dbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String line = lntxt.getText()+", "+fntxt.getText() + " " + dtxt.getText() + " " + stxt.getText() + "\n";
				textArea.append(line);
				clear();
			}
		});
		dbtn.setBounds(100, 301, 89, 23);
		contentPane.add(dbtn);
		
		JButton sbtn = new JButton("Sort");
		sbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String [] arr = textArea.getText().split("\\n");
				Arrays.sort(arr);
				textArea.setText("");
				for (String i : arr) {
					textArea.append(i + "\n");
				}
			}
		});
		sbtn.setBounds(100, 336, 89, 23);
		contentPane.add(sbtn);
	}
}
