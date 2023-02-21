import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class tictactoe extends JFrame {

	private JPanel contentPane;

	private String[][] arr = {
	{null,null,null},
	{null,null,null},
	{null,null,null},
	};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictactoe frame = new tictactoe();
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
	public tictactoe() {
		Border blackline = BorderFactory.createLineBorder(Color.black,2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("");
		l1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
				l1.setIcon(new ImageIcon(img));				
			}
		});
		l1.setBounds(10, 11, 167, 141);
		contentPane.add(l1);
		l1.setBorder(blackline);
		
		JLabel l2 = new JLabel("");
		l2.setBounds(218, 11, 167, 141);
		contentPane.add(l2);
		l2.setBorder(blackline);
		
		JLabel l3 = new JLabel("");
		l3.setBounds(424, 11, 167, 141);
		contentPane.add(l3);
		l3.setBorder(blackline);
		
		JLabel l5 = new JLabel("");
		l5.setBounds(218, 181, 167, 141);
		contentPane.add(l5);
		l5.setBorder(blackline);
		
		JLabel l8 = new JLabel("");
		l8.setBounds(218, 348, 167, 141);
		contentPane.add(l8);
		l8.setBorder(blackline);
		
		JLabel l4 = new JLabel("");
		l4.setBounds(10, 181, 167, 141);
		contentPane.add(l4);
		l4.setBorder(blackline);
		
		JLabel l6 = new JLabel("");
		l6.setBounds(424, 181, 167, 141);
		contentPane.add(l6);
		l6.setBorder(blackline);
		
		JLabel l9 = new JLabel("");
		l9.setBounds(424, 348, 167, 141);
		contentPane.add(l9);
		l9.setBorder(blackline);
		
		JLabel l7 = new JLabel("");
		l7.setBounds(10, 348, 167, 141);
		contentPane.add(l7);
		l7.setBorder(blackline);
	}
}
