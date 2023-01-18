import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class YourAge extends JFrame {

	private JPanel contentPane;
	private JTextField fnTxt;
	private JTextField initialTxt;
	private JTextField lnTxt;
	private JTextField dobTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YourAge frame = new YourAge();
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
	public YourAge() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fnLabel = new JLabel("First Name");
		fnLabel.setBounds(70, 52, 86, 19);
		contentPane.add(fnLabel);
		
		JLabel lnLabel = new JLabel("Last Name");
		lnLabel.setBounds(70, 147, 86, 19);
		contentPane.add(lnLabel);
		
		JLabel initialLabel = new JLabel("Initial");
		initialLabel.setBounds(70, 101, 86, 19);
		contentPane.add(initialLabel);
		
		JLabel dobLabel = new JLabel("Date of Birth(MM-DD-YY)");
		dobLabel.setBounds(70, 192, 158, 19);
		contentPane.add(dobLabel);
		
		fnTxt = new JTextField();
		fnTxt.setBounds(261, 51, 160, 20);
		contentPane.add(fnTxt);
		fnTxt.setColumns(10);
		
		initialTxt = new JTextField();
		initialTxt.setColumns(10);
		initialTxt.setBounds(261, 100, 160, 20);
		contentPane.add(initialTxt);
		
		lnTxt = new JTextField();
		lnTxt.setColumns(10);
		lnTxt.setBounds(261, 146, 160, 20);
		contentPane.add(lnTxt);
		
		dobTxt = new JTextField();
		dobTxt.setColumns(10);
		dobTxt.setBounds(261, 191, 160, 20);
		contentPane.add(dobTxt);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String line = dobTxt.getText();
				String[] arr = line.split("-");
				int year = Integer.parseInt(arr[2]);
				int age = 2023-year;
				JOptionPane.showMessageDialog(null, "You are " + age + " years old");
			}
		});
		submitButton.setBounds(139, 273, 89, 23);
		contentPane.add(submitButton);
	}
}

// Hello World
