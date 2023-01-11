package conversion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class conversion extends JFrame {

	private JPanel contentPane;
	private JTextField feetTxt;
	private JTextField yardTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conversion frame = new conversion();
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
	public conversion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel feetLabel = new JLabel("Feets:");
		feetLabel.setBounds(10, 35, 74, 31);
		contentPane.add(feetLabel);
		
		JLabel yardLabel = new JLabel("Yards: ");
		yardLabel.setBounds(267, 35, 74, 31);
		contentPane.add(yardLabel);
		
		JButton feetButton = new JButton(">>>");
		feetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double feet = Double.parseDouble(feetTxt.getText());
				yardTxt.setText(feet/3 + "");
			}
		});
		feetButton.setBounds(146, 82, 117, 29);
		contentPane.add(feetButton);
		
		JButton yardButton = new JButton("<<<");
		yardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double yard = Double.parseDouble(yardTxt.getText());
				feetTxt.setText(yard*3 + "");
			}
		});
		yardButton.setBounds(393, 82, 117, 29);
		contentPane.add(yardButton);
		
		feetTxt = new JTextField();
		feetTxt.setBounds(136, 37, 130, 26);
		contentPane.add(feetTxt);
		feetTxt.setColumns(10);
		
		yardTxt = new JTextField();
		yardTxt.setColumns(10);
		yardTxt.setBounds(393, 37, 130, 26);
		contentPane.add(yardTxt);
	}
}
