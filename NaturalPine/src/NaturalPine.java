import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NaturalPine extends JFrame {

	private JPanel contentPane;
	private JTextField employee;
	private JTextField hourstxt;
	private JTextField wagetxt;
	private JTextField gptxt;
	private JTextField fwtxt;
	private JTextField swtxt;
	private JTextField hospittxt;
	private JTextField udtxt;
	private JTextField tdtxt;
	private JTextField nptxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NaturalPine frame = new NaturalPine();
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
	public NaturalPine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel employeelbl = new JLabel("Employee");
		employeelbl.setBounds(10, 11, 46, 14);
		contentPane.add(employeelbl);
		
		JLabel hourslbl = new JLabel("Hours Worked");
		hourslbl.setBounds(10, 36, 88, 14);
		contentPane.add(hourslbl);
		
		JLabel lblNewLabel_2 = new JLabel("Hourly Wage");
		lblNewLabel_2.setBounds(10, 64, 88, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gross Pay");
		lblNewLabel_3.setBounds(10, 92, 88, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Deductions:");
		lblNewLabel_4.setBounds(10, 120, 88, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Federal Withholding");
		lblNewLabel_5.setBounds(10, 148, 114, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("State Withholding");
		lblNewLabel_6.setBounds(10, 176, 114, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Hospitalization");
		lblNewLabel_7.setBounds(10, 204, 88, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Union Dues");
		lblNewLabel_8.setBounds(10, 232, 114, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Total Deductions");
		lblNewLabel_9.setBounds(10, 297, 140, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Net Pay");
		lblNewLabel_10.setBounds(10, 325, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		employee = new JTextField();
		employee.setBounds(278, 8, 201, 20);
		contentPane.add(employee);
		employee.setColumns(10);
		
		hourstxt = new JTextField();
		hourstxt.setText("0.0");
		hourstxt.setColumns(10);
		hourstxt.setBounds(278, 36, 201, 20);
		contentPane.add(hourstxt);
		
		wagetxt = new JTextField();
		wagetxt.setText("0.0");
		wagetxt.setColumns(10);
		wagetxt.setBounds(278, 64, 201, 20);
		contentPane.add(wagetxt);
		
		gptxt = new JTextField();
		gptxt.setText("0.0");
		gptxt.setColumns(10);
		gptxt.setBounds(278, 92, 201, 20);
		contentPane.add(gptxt);
		
		fwtxt = new JTextField();
		fwtxt.setText("0.0");
		fwtxt.setColumns(10);
		fwtxt.setBounds(278, 148, 201, 20);
		contentPane.add(fwtxt);
		
		swtxt = new JTextField();
		swtxt.setText("0.0");
		swtxt.setColumns(10);
		swtxt.setBounds(278, 176, 201, 20);
		contentPane.add(swtxt);
		
		hospittxt = new JTextField();
		hospittxt.setText("25.65");
		hospittxt.setColumns(10);
		hospittxt.setBounds(278, 204, 201, 20);
		contentPane.add(hospittxt);
		
		udtxt = new JTextField();
		udtxt.setText("7.85");
		udtxt.setColumns(10);
		udtxt.setBounds(278, 232, 201, 20);
		contentPane.add(udtxt);
		
		tdtxt = new JTextField();
		tdtxt.setText("0.0");
		tdtxt.setColumns(10);
		tdtxt.setBounds(278, 297, 201, 20);
		contentPane.add(tdtxt);
		
		nptxt = new JTextField();
		nptxt.setText("0.0");
		nptxt.setColumns(10);
		nptxt.setBounds(278, 325, 201, 20);
		contentPane.add(nptxt);
		
		JButton calc = new JButton("Calculate");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hours = Integer.parseInt(hourstxt.getText());
				double wage = Double.parseDouble(wagetxt.getText());
				double gp = hours*wage;
				gptxt.setText(gp+"");
				
			}
		});
		calc.setBounds(328, 364, 89, 23);
		contentPane.add(calc);
	}

}
