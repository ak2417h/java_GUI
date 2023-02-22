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
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tictactoe extends JFrame {

	private JPanel contentPane;
	
	boolean p = true;

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
		setBounds(100, 100, 601, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("");
		l1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (l1.getIcon() == null) {
					if (p) {
						arr[0][0] = "o";
						Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
						l1.setIcon(new ImageIcon(img));						
					}
					else {
						arr[0][0] = "x";
						Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
						l1.setIcon(new ImageIcon(img));
					}
					p = !p;					
				}
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
				if ((arr[0][0]+arr[0][1]+arr[0][2]).equals(arr[0][0].repeat(3))) {
					JOptionPane.showMessageDialog(contentPane,arr[0][0].toUpperCase() + " wins","RESULT",JOptionPane.WARNING_MESSAGE);
				}
				else if ((arr[0][0]+arr[1][0]+arr[2][0]).equals(arr[0][0].repeat(3))) {
					JOptionPane.showMessageDialog(contentPane,arr[0][0].toUpperCase() + " wins","RESULT",JOptionPane.WARNING_MESSAGE);
				}
				else if ((arr[0][0]+arr[1][1]+arr[2][2]).equals(arr[0][0].repeat(3))) {
					JOptionPane.showMessageDialog(contentPane,arr[0][0].toUpperCase() + " wins","RESULT",JOptionPane.WARNING_MESSAGE);
				}
				else {
					boolean end = true;
					for (int i=0;i<3;i++) {
						for (int n = 0 ; n < 3; n++) {
							if (arr[i][n]==null) {
								end = false;
							}
						}
					}
					if (end) {
						JOptionPane.showMessageDialog(contentPane,"TIE","RESULT",JOptionPane.WARNING_MESSAGE);
					}					
				}
			}
		});
		l1.setBounds(31, 27, 167, 141);
		contentPane.add(l1);
		l1.setBorder(blackline);
		
		JLabel l2 = new JLabel("");
		l2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (l2.getIcon() == null) {
					if (p) {
						arr[0][1] = "o";
						Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(),
								l1.getHeight(), Image.SCALE_SMOOTH);
						l2.setIcon(new ImageIcon(img));
					} else {
						arr[0][1] = "x";
						Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(),
								l1.getHeight(), Image.SCALE_SMOOTH);
						l2.setIcon(new ImageIcon(img));
					}
					p = !p;
				}
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
				if ((arr[0][0]+arr[0][1]+arr[0][2]).equals(arr[0][1].repeat(3))) {
					JOptionPane.showMessageDialog(contentPane,arr[0][0].toUpperCase() + " wins","RESULT",JOptionPane.WARNING_MESSAGE);
				}
				else if ((arr[0][1]+arr[1][1]+arr[2][1]).equals(arr[0][1].repeat(3))) {
					JOptionPane.showMessageDialog(contentPane,arr[0][1].toUpperCase() + " wins","RESULT",JOptionPane.WARNING_MESSAGE);
				}
				else {
					boolean end = true;
					for (int i=0;i<3;i++) {
						for (int n = 0 ; n < 3; n++) {
							if (arr[i][n]==null) {
								end = false;
								
							}
						}
					}
					if (end) {
						JOptionPane.showMessageDialog(contentPane,"TIE","RESULT",JOptionPane.WARNING_MESSAGE);
					}					
				}
			}
		});
		l2.setBounds(208, 27, 167, 141);
		contentPane.add(l2);
		l2.setBorder(blackline);
		
		JLabel l3 = new JLabel("");
		l3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (l3.getIcon() == null) {
					if (p) {
						arr[0][2] = "o";
						Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(),
								l1.getHeight(), Image.SCALE_SMOOTH);
						l3.setIcon(new ImageIcon(img));
					} else {
						arr[0][2] = "x";
						Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(),
								l1.getHeight(), Image.SCALE_SMOOTH);
						l3.setIcon(new ImageIcon(img));
					}
					p = !p;
				}
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
				if ((arr[0][0]+arr[0][1]+arr[0][2]).equals(arr[0][2].repeat(3))) {
					JOptionPane.showMessageDialog(contentPane,arr[0][2].toUpperCase() + " wins","RESULT",JOptionPane.WARNING_MESSAGE);
				}
				else if ((arr[0][2]+arr[1][2]+arr[2][2]).equals(arr[0][2].repeat(3))) {
					JOptionPane.showMessageDialog(contentPane,arr[0][2].toUpperCase() + " wins","RESULT",JOptionPane.WARNING_MESSAGE);
				}
				else if ((arr[0][2]+arr[1][1]+arr[2][0]).equals(arr[0][2].repeat(3))) {
					JOptionPane.showMessageDialog(contentPane,arr[0][2].toUpperCase() + " wins","RESULT",JOptionPane.WARNING_MESSAGE);
				}
				else {
					boolean end = true;
					for (int i=0;i<3;i++) {
						for (int n = 0 ; n < 3; n++) {
							if (arr[i][n]==null) {
								end = false;
							}
						}
					}
					if (end) {
						JOptionPane.showMessageDialog(contentPane,"TIE","RESULT",JOptionPane.WARNING_MESSAGE);
					}					
				}
			}
		});
		l3.setBounds(385, 27, 167, 141);
		contentPane.add(l3);
		l3.setBorder(blackline);
		
		JLabel l5 = new JLabel("");
		l5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (l5.getIcon() == null) {
					if (p) {
						arr[1][1] = "o";
						Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(),
								l1.getHeight(), Image.SCALE_SMOOTH);
						l5.setIcon(new ImageIcon(img));
					} else {
						arr[1][1] = "x";
						Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(),
								l1.getHeight(), Image.SCALE_SMOOTH);
						l5.setIcon(new ImageIcon(img));
					}
					p = !p;
				}
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
				boolean end = true;
				for (int i=0;i<3;i++) {
					for (int n = 0 ; n < 3; n++) {
						if (arr[i][n]==null) {
							end = false;
						}
					}
				}
				if (end) {
					JOptionPane.showMessageDialog(contentPane,"TIE","RESULT",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		l5.setBounds(208, 179, 167, 141);
		contentPane.add(l5);
		l5.setBorder(blackline);
		
		JLabel l8 = new JLabel("");
		l8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (l8.getIcon() == null) {
					if (p) {
						arr[2][1] = "o";
						Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
						l8.setIcon(new ImageIcon(img));						
					}
					else {
						arr[2][1] = "x";
						Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
						l8.setIcon(new ImageIcon(img));
					}
					p = !p;					
				}
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
				boolean end = true;
				for (int i=0;i<3;i++) {
					for (int n = 0 ; n < 3; n++) {
						if (arr[i][n]==null) {
							end = false;
						}
					}
				}
				if (end) {
					JOptionPane.showMessageDialog(contentPane,"TIE","RESULT",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		l8.setBounds(208, 331, 167, 141);
		contentPane.add(l8);
		l8.setBorder(blackline);
		
		JLabel l4 = new JLabel("");
		l4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (l4.getIcon() == null) {
					if (p) {
						arr[1][0] = "o";
						Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(),
								l1.getHeight(), Image.SCALE_SMOOTH);
						l4.setIcon(new ImageIcon(img));
					} else {
						arr[1][0] = "x";
						Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(),
								l1.getHeight(), Image.SCALE_SMOOTH);
						l4.setIcon(new ImageIcon(img));
					}
					p = !p;
				}
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
				if ((arr[0][0]+arr[0][1]+arr[0][2]).equals(arr[0][1].repeat(3))) {
					JOptionPane.showMessageDialog(contentPane,arr[0][0].toUpperCase() + " wins","RESULT",JOptionPane.WARNING_MESSAGE);
				}
				else if ((arr[0][1]+arr[1][1]+arr[2][1]).equals(arr[0][1].repeat(3))) {
					JOptionPane.showMessageDialog(contentPane,arr[0][1].toUpperCase() + " wins","RESULT",JOptionPane.WARNING_MESSAGE);
				}
				else {
					boolean end = true;
					for (int i=0;i<3;i++) {
						for (int n = 0 ; n < 3; n++) {
							if (arr[i][n]==null) {
								end = false;
								
							}
						}
					}
					if (end) {
						JOptionPane.showMessageDialog(contentPane,"TIE","RESULT",JOptionPane.WARNING_MESSAGE);
					}					
				}
			}
		});
		l4.setBounds(31, 179, 167, 141);
		contentPane.add(l4);
		l4.setBorder(blackline);
		
		JLabel l6 = new JLabel("");
		l6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (l6.getIcon() == null) {
					if (p) {
						arr[1][2] = "o";
						Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(),
								l1.getHeight(), Image.SCALE_SMOOTH);
						l6.setIcon(new ImageIcon(img));
					} else {
						arr[1][2] = "x";
						Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(),
								l1.getHeight(), Image.SCALE_SMOOTH);
						l6.setIcon(new ImageIcon(img));
					}
					p = !p;
				}
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
				boolean end = true;
				for (int i=0;i<3;i++) {
					for (int n = 0 ; n < 3; n++) {
						if (arr[i][n]==null) {
							end = false;
						}
					}
				}
				if (end) {
					JOptionPane.showMessageDialog(contentPane,"TIE","RESULT",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		l6.setBounds(385, 179, 167, 141);
		contentPane.add(l6);
		l6.setBorder(blackline);
		
		JLabel l9 = new JLabel("");
		l9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (l9.getIcon() == null) {
					if (p) {
						arr[2][2] = "o";
						Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(),
								l1.getHeight(), Image.SCALE_SMOOTH);
						l9.setIcon(new ImageIcon(img));
					} else {
						arr[2][2] = "x";
						Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(),
								l1.getHeight(), Image.SCALE_SMOOTH);
						l9.setIcon(new ImageIcon(img));
					}
					p = !p;
				}
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
				boolean end = true;
				for (int i=0;i<3;i++) {
					for (int n = 0 ; n < 3; n++) {
						if (arr[i][n]==null) {
							end = false;
						}
					}
				}
				if (end) {
					JOptionPane.showMessageDialog(contentPane,"TIE","RESULT",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		l9.setBounds(385, 331, 167, 141);
		contentPane.add(l9);
		l9.setBorder(blackline);
		
		JLabel l7 = new JLabel("");
		l7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (l7.getIcon() == null) {
					if (p) {
						arr[2][0] = "o";
						Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(),
								l1.getHeight(), Image.SCALE_SMOOTH);
						l7.setIcon(new ImageIcon(img));
					} else {
						arr[2][0] = "x";
						Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(),
								l1.getHeight(), Image.SCALE_SMOOTH);
						l7.setIcon(new ImageIcon(img));
					}
					p = !p;
				}
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
				boolean end = true;
				for (int i=0;i<3;i++) {
					for (int n = 0 ; n < 3; n++) {
						if (arr[i][n]==null) {
							end = false;
						}
					}
				}
				if (end) {
					JOptionPane.showMessageDialog(contentPane,"TIE","RESULT",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		l7.setBounds(31, 331, 167, 141);
		contentPane.add(l7);
		l7.setBorder(blackline);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(161, 483, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(338, 483, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
