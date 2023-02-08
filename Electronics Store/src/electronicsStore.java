import java.awt.EventQueue;
import java.util.*;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class electronicsStore extends JFrame {

	private JPanel contentPane;
	private JTextField pidtxt;
	private JTextField nametxt;
	private JTextField desctxt;
	private JTextField qtxt;
	private JTextField pricetxt;
	private JTextField colortxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					electronicsStore frame = new electronicsStore();
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
	public electronicsStore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Electronics Store");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(104, 26, 186, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Part ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(35, 83, 79, 25);
		contentPane.add(lblNewLabel_1);
		
		pidtxt = new JTextField();
		pidtxt.setBounds(182, 87, 119, 20);
		contentPane.add(pidtxt);
		pidtxt.setColumns(10);
		
		nametxt = new JTextField();
		nametxt.setColumns(10);
		nametxt.setBounds(182, 123, 119, 20);
		contentPane.add(nametxt);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(35, 119, 79, 25);
		contentPane.add(lblNewLabel_1_1);
		
		desctxt = new JTextField();
		desctxt.setColumns(10);
		desctxt.setBounds(182, 158, 119, 20);
		contentPane.add(desctxt);
		
		JLabel lblNewLabel_1_2 = new JLabel("Description");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(35, 154, 79, 25);
		contentPane.add(lblNewLabel_1_2);
		
		qtxt = new JTextField();
		qtxt.setColumns(10);
		qtxt.setBounds(182, 194, 119, 20);
		contentPane.add(qtxt);
		
		JLabel lblNewLabel_1_3 = new JLabel("Quantity");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(35, 190, 79, 25);
		contentPane.add(lblNewLabel_1_3);
		
		pricetxt = new JTextField();
		pricetxt.setColumns(10);
		pricetxt.setBounds(182, 228, 119, 20);
		contentPane.add(pricetxt);
		
		JLabel lblNewLabel_1_4 = new JLabel("Price");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(35, 224, 79, 25);
		contentPane.add(lblNewLabel_1_4);
		
		colortxt = new JTextField();
		colortxt.setColumns(10);
		colortxt.setBounds(182, 263, 119, 20);
		contentPane.add(colortxt);
		
		JLabel lblNewLabel_1_5 = new JLabel("Color");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_5.setBounds(35, 259, 79, 25);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(365, 82, 214, 201);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("First");
		btnNewButton.setBounds(10, 320, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(">>>");
		btnNewButton_1.setBounds(109, 320, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("<<<");
		btnNewButton_2.setBounds(208, 320, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnLast = new JButton("Last");
		btnLast.setBounds(307, 320, 89, 23);
		contentPane.add(btnLast);
		
		JButton btnNew = new JButton("New");
		btnNew.setBounds(406, 320, 89, 23);
		contentPane.add(btnNew);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(504, 320, 89, 23);
		contentPane.add(btnSave);
	}

}
