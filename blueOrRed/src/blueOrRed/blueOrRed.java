package blueOrRed;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class blueOrRed extends JFrame {

	private JPanel contentPane;
	private JTextField redTxt;
	private JTextField blueTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					blueOrRed frame = new blueOrRed();
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
	public blueOrRed() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel redLabel = new JLabel("Red Team");
		redLabel.setForeground(new Color(255, 0, 0));
		redLabel.setBounds(38, 54, 61, 16);
		contentPane.add(redLabel);
		
		JLabel blueLabel = new JLabel("Blue Team");
		blueLabel.setForeground(new Color(0, 0, 255));
		blueLabel.setBounds(279, 54, 85, 16);
		contentPane.add(blueLabel);
		
		redTxt = new JTextField();
		redTxt.setText("0");
		redTxt.setBounds(35, 111, 130, 26);
		contentPane.add(redTxt);
		redTxt.setColumns(10);
		
		blueTxt = new JTextField();
		blueTxt.setText("0");
		blueTxt.setColumns(10);
		blueTxt.setBounds(275, 111, 130, 26);
		contentPane.add(blueTxt);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				redTxt.setText("0");
				blueTxt.setText("0");
			}
		});
		reset.setBounds(41, 223, 363, 29);
		contentPane.add(reset);
		
		JButton redButton = new JButton("Red Score!");
		redButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				redTxt.setText(Integer.parseInt(redTxt.getText())+1 + "");
			}
		});
		redButton.setBounds(31, 171, 117, 29);
		contentPane.add(redButton);
		
		JButton blueButton = new JButton("Blue Score!");
		blueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				blueTxt.setText(Integer.parseInt(blueTxt.getText())+1 + "");
			}
		});
		blueButton.setBounds(275, 171, 117, 29);
		contentPane.add(blueButton);
	}
}
