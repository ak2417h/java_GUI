import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pizzaOrder extends JFrame {

	private JPanel contentPane;
	static double total = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pizzaOrder frame = new pizzaOrder();
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
	public pizzaOrder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Small: $4.99");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(36, 100, 90, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Mama Mia Pizzeria");
		lblNewLabel.setBounds(142, 10, 405, 61);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Medium: 6.99");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(36, 140, 124, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Large: $8.99");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(36, 177, 109, 27);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Toppings: $0.50 each");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(34, 215, 161, 29);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2 = new JLabel("Size");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(218, 82, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Toppings");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(399, 76, 101, 26);
		contentPane.add(lblNewLabel_2_1);
		
		JRadioButton smallbtn = new JRadioButton("Small");
		smallbtn.setBounds(218, 127, 109, 23);
		contentPane.add(smallbtn);
		
		JRadioButton mediumbtn = new JRadioButton("Medium");
		mediumbtn.setBounds(218, 163, 109, 23);
		contentPane.add(mediumbtn);
		
		JRadioButton largebtn = new JRadioButton("Large");
		largebtn.setBounds(218, 202, 109, 23);
		contentPane.add(largebtn);
		
		ButtonGroup group = new ButtonGroup();
		group.add(smallbtn);
		group.add(mediumbtn);
		group.add(largebtn);
		
		
		JCheckBox ppcb = new JCheckBox("Pepperoni");
		ppcb.setBounds(387, 127, 97, 23);
		contentPane.add(ppcb);
		
		JCheckBox iscb = new JCheckBox("Italian Sausage");
		iscb.setBounds(387, 163, 134, 23);
		contentPane.add(iscb);
		
		JCheckBox pacb = new JCheckBox("Pineapple");
		pacb.setBounds(387, 202, 97, 23);
		contentPane.add(pacb);
		
		JCheckBox eccb = new JCheckBox("Extra Cheese");
		eccb.setBounds(387, 238, 97, 23);
		contentPane.add(eccb);
		
		JCheckBox gpcb = new JCheckBox("Green Pepper");
		gpcb.setBounds(387, 276, 97, 23);
		contentPane.add(gpcb);
		
		JCheckBox olivescb = new JCheckBox("Olives");
		olivescb.setBounds(387, 312, 97, 23);
		contentPane.add(olivescb);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ppcb.isSelected()) {
					total += 0.5;
				}
				if (iscb.isSelected()) {
					total += 0.5;
				}
				if (pacb.isSelected()) {
					total += 0.5;
				}
				if (eccb.isSelected()) {
					total += 0.5;
				}
				if (gpcb.isSelected()) {
					total += 0.5;
				}
				if (olivescb.isSelected()) {
					total += 0.5;
				}
				if (smallbtn.isSelected()) {
					total += 4.99;
				}
				if (mediumbtn.isSelected()) {
					total += 6.99;
				}
				if (largebtn.isSelected()) {
					total += 8.99;
				}
				JOptionPane.showMessageDialog(null, "The total is " + total);
				total = 0;
			}
		});
		btnNewButton.setBounds(126, 348, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(238, 348, 89, 23);
		contentPane.add(btnExit);
	}
}
