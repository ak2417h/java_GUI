import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.*;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentInfo extends JFrame {

	private JPanel contentPane;
	private JTextField sitxt;
	private JTextField fntxt;
	private JTextField lntxt;
	private JTextField gtxt;
	private static ArrayList<Student> list = new ArrayList<Student>();
	private int index = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentInfo frame = new studentInfo();
					frame.setVisible(true);
					Scanner scan = new Scanner(new File("students.txt"));
					while(scan.hasNextLine()) {
						String line = scan.nextLine();
						String[] alist = line.split(" ");
						String id = alist[0];
						String first = alist[1];
						String last = alist[2];
						int grade = Integer.parseInt(alist[3]);
						String gradelvl = alist[4];
						Student s = new Student(id,first,last,grade,gradelvl);
						list.add(s);
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public studentInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Information");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(151, 52, 201, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(72, 116, 89, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(72, 155, 89, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last Name");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(72, 194, 89, 28);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Grade");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(72, 233, 89, 28);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Grade Level");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(72, 272, 89, 28);
		contentPane.add(lblNewLabel_1_4);
		
		sitxt = new JTextField();
		sitxt.setBounds(215, 122, 144, 20);
		contentPane.add(sitxt);
		sitxt.setColumns(10);
		
		fntxt = new JTextField();
		fntxt.setColumns(10);
		fntxt.setBounds(215, 161, 144, 20);
		contentPane.add(fntxt);
		
		lntxt = new JTextField();
		lntxt.setColumns(10);
		lntxt.setBounds(215, 200, 144, 20);
		contentPane.add(lntxt);
		
		gtxt = new JTextField();
		gtxt.setColumns(10);
		gtxt.setBounds(215, 239, 144, 20);
		contentPane.add(gtxt);
		
		String[] arr = {"Freshmen","Sophomore","Junior","Senior"};
		JComboBox comboBox = new JComboBox(arr);
		comboBox.setBounds(215, 277, 143, 22);
		contentPane.add(comboBox);
		
		JButton firstbtn = new JButton("First");
		firstbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index = 0;
				sitxt.setText(list.get(0).firstname);
			}
		});
		firstbtn.setBounds(10, 334, 89, 23);
		contentPane.add(firstbtn);
		
		JButton nextbtn = new JButton("Next");
		nextbtn.setBounds(208, 334, 89, 23);
		contentPane.add(nextbtn);
		
		JButton lastbtn = new JButton("Last");
		lastbtn.setBounds(109, 334, 89, 23);
		contentPane.add(lastbtn);
		
		JButton previousbtn = new JButton("Previous");
		previousbtn.setBounds(307, 334, 89, 23);
		contentPane.add(previousbtn);
		
		JButton newbtn = new JButton("New");
		newbtn.setBounds(406, 334, 89, 23);
		contentPane.add(newbtn);
		
		JButton savebtn = new JButton("Save");
		savebtn.setBounds(208, 368, 89, 23);
		contentPane.add(savebtn);
	}
}