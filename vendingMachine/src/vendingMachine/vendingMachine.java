package vendingMachine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vendingMachine extends JFrame {

	private JPanel contentPane;
	private JTextField moneytxt;
	private JTextField changetxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vendingMachine frame = new vendingMachine();
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
	public vendingMachine() {
		
		double money = 0;
		double bought = 0;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vending Machine");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(202, 0, 208, 78);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insert Money:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(113, 84, 148, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Change:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(113, 129, 148, 39);
		contentPane.add(lblNewLabel_1_1);
		
		moneytxt = new JTextField();
		moneytxt.setText("0");
		money = Double.parseDouble(moneytxt.getText());
		moneytxt.setBounds(271, 95, 86, 20);
		contentPane.add(moneytxt);
		moneytxt.setColumns(10);
		
		changetxt = new JTextField();
		changetxt.setColumns(10);
		changetxt.setBounds(271, 140, 86, 20);
		contentPane.add(changetxt);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Select an item:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(51, 179, 471, 146);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox spritecb = new JCheckBox("Sprite ($1.50)");
		if (spritecb.isSelected()) {
			if (money > bought + 1.5)
				bought += 1.5;
			else
				spritecb.setSelected(false);
		}
		spritecb.setBounds(6, 26, 132, 23);
		panel.add(spritecb);
		
		JCheckBox cokecb = new JCheckBox("Coke ($1.75)");
		if (cokecb.isSelected()) {
			if (money > bought + 1.75)
				bought += 1.75;
			else
				cokecb.setSelected(false);
		}
		cokecb.setBounds(6, 76, 143, 23);
		panel.add(cokecb);
		
		JCheckBox watercb = new JCheckBox("Water ($1.00)");
		if (watercb.isSelected()) {
			if (money > bought + 1)
				bought += 1;
			else
				watercb.setSelected(false);
		}
		watercb.setBounds(176, 26, 132, 23);
		panel.add(watercb);
		
		JCheckBox lemoncb = new JCheckBox("Lemonade ($2.00)");
		if (lemoncb.isSelected()) {
			if (money > bought + 2)
				bought += 2;
			else
				lemoncb.setSelected(false);
		}
		lemoncb.setBounds(333, 26, 132, 23);
		panel.add(lemoncb);
		
		JCheckBox pepsicb = new JCheckBox("Pepsi ($1.50)");
		if (pepsicb.isSelected()) {
			if (money > bought + 1.5)
				bought += 1.5;
			else
				pepsicb.setSelected(false);
		}
		pepsicb.setBounds(176, 76, 132, 23);
		panel.add(pepsicb);
		
		JCheckBox powercb = new JCheckBox("Powerade ($1.75)");
		if (powercb.isSelected()) {
			if (money > bought + 1.75)
				bought += 1.75;
			else
				powercb.setSelected(false);
		}
		powercb.setBounds(333, 76, 132, 23);
		panel.add(powercb);
		
		JButton purbtn = new JButton("Purchase");
		purbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		purbtn.setBounds(51, 336, 89, 23);
		contentPane.add(purbtn);
		
		JButton resetbtn = new JButton("Reset");
		resetbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spritecb.setSelected(false);
				watercb.setSelected(false);
				lemoncb.setSelected(false);
				cokecb.setSelected(false);
				pepsicb.setSelected(false);
				powercb.setSelected(false);
			}
		});
		bought -= 9.5;
		changetxt.setText(Double.toString(bought));
		resetbtn.setBounds(230, 336, 89, 23);
		contentPane.add(resetbtn);
		
		JButton quitbtn = new JButton("Quit");
		quitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		quitbtn.setBounds(388, 336, 89, 23);
		contentPane.add(quitbtn);
	}
}
