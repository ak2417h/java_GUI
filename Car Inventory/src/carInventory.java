import java.awt.EventQueue;
import java.util.*;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class carInventory extends JFrame {

	private JPanel contentPane;
	private JTextField vitxt;
	private JTextField maketxt;
	private JTextField modeltxt;
	private JTextField yeartxt;
	private JTextField pricetxt;
	private JTextField searchtxt;

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
		
		vitxt = new JTextField();
		vitxt.setBounds(203, 77, 130, 26);
		contentPane.add(vitxt);
		vitxt.setColumns(10);
		
		maketxt = new JTextField();
		maketxt.setColumns(10);
		maketxt.setBounds(203, 133, 130, 26);
		contentPane.add(maketxt);
		
		modeltxt = new JTextField();
		modeltxt.setColumns(10);
		modeltxt.setBounds(203, 189, 130, 26);
		contentPane.add(modeltxt);
		
		yeartxt = new JTextField();
		yeartxt.setColumns(10);
		yeartxt.setBounds(203, 247, 130, 26);
		contentPane.add(yeartxt);
		
		pricetxt = new JTextField();
		pricetxt.setColumns(10);
		pricetxt.setBounds(203, 307, 130, 26);
		contentPane.add(pricetxt);
		
		searchtxt = new JTextField();
		searchtxt.setColumns(10);
		searchtxt.setBounds(166, 354, 130, 26);
		contentPane.add(searchtxt);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Scanner scan = new Scanner(new File("cars.txt"));
					while(scan.hasNextLine()) {
						String[] arr = scan.nextLine().split(",");
						if (searchtxt.getText().equals(arr[0])) {
							vitxt.setText(arr[0]);
							maketxt.setText(arr[1]);
							modeltxt.setText(arr[2]);
							yeartxt.setText(arr[3]);
							pricetxt.setText(arr[4]);
						}
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(24, 354, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton spbtn = new JButton("Show Picture");
		spbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel piclabel = new JLabel(new ImageIcon("/Users/andrew/Downloads/compsci/BMI/images/images.jfif"));
				piclabel.setVisible(true);
				piclabel.setBounds(334, 84, 221, 240);
				contentPane.add(piclabel);
			}
			
		});
		spbtn.setBounds(444, 354, 117, 29);
		contentPane.add(spbtn);
		
		/*
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(334, 84, 221, 240);
		contentPane.add(lblNewLabel);
		
		Image img = new ImageIcon(this.getClass().getResource("images.jfif")).getImage();
		Image img2 = img.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(img2));
		*/
	}
}
