import java.awt.EventQueue;
import java.util.*;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class carInventory extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					carInventory frame = new carInventory();
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
	public carInventory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Car Inventory");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(234, 19, 171, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblVehicleId = new JLabel("Vehicle ID");
		lblVehicleId.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblVehicleId.setBounds(51, 64, 171, 46);
		contentPane.add(lblVehicleId);
		
		JLabel lblMake = new JLabel("Make");
		lblMake.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblMake.setBounds(51, 122, 171, 46);
		contentPane.add(lblMake);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblModel.setBounds(51, 178, 171, 46);
		contentPane.add(lblModel);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblYear.setBounds(51, 236, 171, 46);
		contentPane.add(lblYear);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblPrice.setBounds(51, 296, 171, 46);
		contentPane.add(lblPrice);
		
		textField = new JTextField();
		textField.setBounds(203, 77, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(203, 133, 130, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(203, 189, 130, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(203, 247, 130, 26);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(203, 307, 130, 26);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(168, 354, 130, 26);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(24, 354, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel picLabel = new JLabel(new ImageIcon("/Users/andrew/Downloads/compsci/BMI/images/images.jfif"));
		picLabel.setSize(500*2,500);
		picLabel.setBounds(24, 354, -117, 29);
		picLabel.setVisible(true); 
		contentPane.add(picLabel);
	}
}
