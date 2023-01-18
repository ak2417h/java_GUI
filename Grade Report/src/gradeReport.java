import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gradeReport extends JFrame {

	private JPanel contentPane;
	private JTextField fntxt;
	private JTextField lntxt;
	private JTextField gltxt;
	private JTextField gtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gradeReport frame = new gradeReport();
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
	public gradeReport() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 60, 125, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName.setBounds(10, 129, 125, 33);
		contentPane.add(lblLastName);
		
		JLabel lblGradeLevel = new JLabel("Grade Level");
		lblGradeLevel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGradeLevel.setBounds(10, 209, 125, 33);
		contentPane.add(lblGradeLevel);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGrade.setBounds(10, 284, 125, 33);
		contentPane.add(lblGrade);
		
		fntxt = new JTextField();
		fntxt.setBounds(175, 68, 125, 20);
		contentPane.add(fntxt);
		fntxt.setColumns(10);
		
		lntxt = new JTextField();
		lntxt.setColumns(10);
		lntxt.setBounds(175, 137, 125, 20);
		contentPane.add(lntxt);
		
		gltxt = new JTextField();
		gltxt.setColumns(10);
		gltxt.setBounds(175, 217, 125, 20);
		contentPane.add(gltxt);
		
		gtxt = new JTextField();
		gtxt.setColumns(10);
		gtxt.setBounds(175, 292, 125, 20);
		contentPane.add(gtxt);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(329, 68, 280, 299);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Display");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String line = lntxt.getText() + ", " + fntxt.getText() + " " + gltxt.getText() + " " + gtxt.getText();
				textArea.append(line + "\n");
			}
		});
		btnNewButton.setBounds(101, 344, 89, 23);
		contentPane.add(btnNewButton);
	}
}
