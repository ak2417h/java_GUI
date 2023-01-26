import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class easyCalc extends JFrame {

	private JPanel contentPane;
	private JTextField fn;
	private JTextField sn;
	private JTextField atxt;
	private JTextField stxt;
	private JTextField mtxt;
	private JTextField dtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					easyCalc frame = new easyCalc();
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
	public easyCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Easy Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(242, 3, 141, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the first number: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 54, 197, 50);
		contentPane.add(lblNewLabel_1);
		
		fn = new JTextField();
		fn.setBounds(166, 71, 128, 20);
		contentPane.add(fn);
		fn.setColumns(10);
		
		sn = new JTextField();
		sn.setColumns(10);
		sn.setBounds(512, 71, 128, 20);
		contentPane.add(sn);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter the second number: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(332, 54, 197, 50);
		contentPane.add(lblNewLabel_1_1);
		
		JCheckBox abtn = new JCheckBox("Add");
		abtn.setBounds(10, 121, 97, 23);
		contentPane.add(abtn);
		
		JCheckBox sbtn = new JCheckBox("Subtract");
		sbtn.setBounds(144, 121, 97, 23);
		contentPane.add(sbtn);
		
		JCheckBox mbtn = new JCheckBox("Multiply");
		mbtn.setBounds(301, 121, 97, 23);
		contentPane.add(mbtn);
		
		JCheckBox dbtn = new JCheckBox("Divide");
		dbtn.setBounds(463, 121, 97, 23);
		contentPane.add(dbtn);
		
		JLabel lblNewLabel_2 = new JLabel("Addition");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 167, 108, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Subtraction");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(10, 227, 108, 39);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Multiplication");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(10, 280, 108, 39);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Division");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_3.setBounds(10, 330, 108, 39);
		contentPane.add(lblNewLabel_2_3);
		
		atxt = new JTextField();
		atxt.setColumns(10);
		atxt.setBounds(166, 178, 128, 20);
		contentPane.add(atxt);
		
		stxt = new JTextField();
		stxt.setColumns(10);
		stxt.setBounds(166, 238, 128, 20);
		contentPane.add(stxt);
		
		mtxt = new JTextField();
		mtxt.setColumns(10);
		mtxt.setBounds(166, 291, 128, 20);
		contentPane.add(mtxt);
		
		dtxt = new JTextField();
		dtxt.setColumns(10);
		dtxt.setBounds(166, 341, 128, 20);
		contentPane.add(dtxt);
		
		JButton calc = new JButton("Calculate");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(fn.getText());
				double num2 = Double.parseDouble(sn.getText());
				atxt.setText("");
				stxt.setText("");
				dtxt.setText("");
				mtxt.setText("");
				if (abtn.isSelected()) {
					atxt.setText(num1+num2+"");
				}
				if (sbtn.isSelected()) {
					stxt.setText(num1-num2+"");
				}
				if (mbtn.isSelected()) {
					mtxt.setText(num1*num2+"");
				}
				if (dbtn.isSelected()) {
					dtxt.setText(num1/num2+"");
				}
			}
		});
		calc.setBounds(440, 243, 89, 23);
		contentPane.add(calc);
	}
}
