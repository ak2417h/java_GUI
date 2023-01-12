package computerStore;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class computerStore extends JFrame {

	private JPanel contentPane;
	private JTextField compNum;
	private JTextField ddNum;
	private JTextField spNum;
	private JTextField mcNum;
	private JTextField compCost;
	private JTextField ddCost;
	private JTextField spCost;
	private JTextField mcCost;
	private JTextField totCost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					computerStore frame = new computerStore();
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
	public computerStore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel noiLabel = new JLabel("Number of items");
		noiLabel.setBounds(6, 6, 112, 16);
		contentPane.add(noiLabel);
		
		JLabel itemLabel = new JLabel("Item");
		itemLabel.setBounds(200, 6, 112, 16);
		contentPane.add(itemLabel);
		
		JLabel costLabel = new JLabel("Cost");
		costLabel.setBounds(392, 6, 112, 16);
		contentPane.add(costLabel);
		
		JLabel computerLabel = new JLabel("Computer");
		computerLabel.setBounds(200, 67, 112, 16);
		contentPane.add(computerLabel);
		
		JLabel ddLabel = new JLabel("Disk Drive");
		ddLabel.setBounds(200, 124, 112, 16);
		contentPane.add(ddLabel);
		
		JLabel spLabel = new JLabel("Software Package");
		spLabel.setBounds(200, 179, 112, 16);
		contentPane.add(spLabel);
		
		JLabel mcLabel = new JLabel("Memory Card");
		mcLabel.setBounds(200, 232, 112, 16);
		contentPane.add(mcLabel);
		
		JLabel totalLabel = new JLabel("Total");
		totalLabel.setBounds(200, 290, 112, 16);
		contentPane.add(totalLabel);
		
		compNum = new JTextField();
		/*
		compNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				compCost.setText(Integer.parseInt(compNum.getText())*675 + "");
				
			}
		});
		*/
		compNum.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent e) {
		    	compCost.setText(Integer.parseInt(compNum.getText())*675 + "");
		    }
		});
		compNum.setBounds(6, 62, 130, 26);
		compNum.setText("0");
		contentPane.add(compNum);
		compNum.setColumns(10);
		
		ddNum = new JTextField();
		ddNum.setBounds(6, 119, 130, 26);
		ddNum.setText("0");
		ddNum.setColumns(10);
		contentPane.add(ddNum);
		
		spNum = new JTextField();
		spNum.setBounds(6, 174, 130, 26);
		spNum.setText("0");
		spNum.setColumns(10);
		contentPane.add(spNum);
		
		mcNum = new JTextField();
		mcNum.setBounds(6, 227, 130, 26);
		mcNum.setText("0");
		mcNum.setColumns(10);
		contentPane.add(mcNum);
		
		compCost = new JTextField();
		compCost.setBounds(392, 62, 130, 26);
		compCost.setText("0.0");
		compCost.setColumns(10);
		contentPane.add(compCost);
		
		ddCost = new JTextField();
		ddCost.setBounds(392, 119, 130, 26);
		ddCost.setText("0.0");
		ddCost.setColumns(10);
		contentPane.add(ddCost);
		
		spCost = new JTextField();
		spCost.setBounds(392, 174, 130, 26);
		spCost.setText("0.0");
		spCost.setColumns(10);
		contentPane.add(spCost);
		
		mcCost = new JTextField();
		mcCost.setBounds(392, 227, 130, 26);
		mcCost.setText("0.0");
		mcCost.setColumns(10);
		contentPane.add(mcCost);
		
		totCost = new JTextField();
		totCost.setBounds(392, 285, 130, 26);
		totCost.setText("0.0");
		totCost.setColumns(10);
		contentPane.add(totCost);
		
		JButton CalcButton = new JButton("Calculate");
		CalcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		CalcButton.setBounds(233, 320, 117, 29);
		contentPane.add(CalcButton);
	}

}
