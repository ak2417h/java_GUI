import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMI extends JFrame {

	private JPanel contentPane;
	private JTextField height;
	private JTextField weight;
	private JTextField bmi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI frame = new BMI();
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
	public BMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(334, 84, 221, 240);
		contentPane.add(lblNewLabel);
		
		Image img = new ImageIcon(this.getClass().getResource("images.jfif")).getImage();
		Image img2 = img.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(img2));
		
		JLabel lblNewLabel_1 = new JLabel("Body Mass Index");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(149, 28, 236, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter height:(inches)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(41, 128, 143, 45);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Enter weight:(pounds)");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(41, 200, 178, 45);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("BMI");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(72, 286, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		height = new JTextField();
		height.setBounds(210, 142, 86, 20);
		contentPane.add(height);
		height.setColumns(10);
		
		weight = new JTextField();
		weight.setColumns(10);
		weight.setBounds(210, 214, 86, 20);
		contentPane.add(weight);
		
		bmi = new JTextField();
		bmi.setColumns(10);
		bmi.setBounds(210, 285, 86, 20);
		contentPane.add(bmi);
		
		JButton btnCalc = new JButton("Calculate");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bmi.setText((Double.parseDouble(weight.getText()))/((Double.parseDouble(height.getText()))*(Double.parseDouble(height.getText()))) *703 + "");
			}
		});
		btnCalc.setBounds(41, 334, 89, 23);
		contentPane.add(btnCalc);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				weight.setText("");
				height.setText("");
				bmi.setText("");
			}
		});
		btnReset.setBounds(169, 334, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(296, 334, 89, 23);
		contentPane.add(btnExit);
		
	}
}
