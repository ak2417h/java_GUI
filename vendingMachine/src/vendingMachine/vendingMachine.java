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
		spritecb.setBounds(6, 26, 97, 23);
		panel.add(spritecb);
		
		JCheckBox cokecb = new JCheckBox("Coke ($1.75)");
		cokecb.setBounds(6, 76, 97, 23);
		panel.add(cokecb);
		
		JCheckBox watercb = new JCheckBox("Water ($1.00)");
		watercb.setBounds(176, 26, 97, 23);
		panel.add(watercb);
		
		JCheckBox lemoncb = new JCheckBox("Lemonade ($2.00)");
		lemoncb.setBounds(333, 26, 132, 23);
		panel.add(lemoncb);
		
		JCheckBox pepsicb = new JCheckBox("Pepsi ($1.50)");
		pepsicb.setBounds(176, 76, 97, 23);
		panel.add(pepsicb);
		
		JCheckBox powercb = new JCheckBox("Powerade ($1.75)");
		powercb.setBounds(333, 76, 132, 23);
		panel.add(powercb);
		
		JButton purbtn = new JButton("Purchase");
		purbtn.setBounds(51, 336, 89, 23);
		contentPane.add(purbtn);
		
		JButton resetbtn = new JButton("Reset");
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
