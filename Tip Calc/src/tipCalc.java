import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class tipCalc extends JFrame {

	private JPanel contentPane;
	private JTextField amountTxt;
	private JLabel lblTip;
	private JLabel lblTotal;
	private JTextField tipTxt;
	private JTextField totalTxt;
	private int value = 20;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tipCalc frame = new tipCalc();
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
	public tipCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amount");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(107, 49, 92, 59);
		contentPane.add(lblNewLabel);
		
		amountTxt = new JTextField();
		amountTxt.setBounds(276, 70, 114, 20);
		contentPane.add(amountTxt);
		amountTxt.setColumns(10);
		
		lblTip = new JLabel("Tip");
		lblTip.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTip.setBounds(107, 184, 92, 59);
		contentPane.add(lblTip);
		
		lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotal.setBounds(107, 254, 92, 59);
		contentPane.add(lblTotal);
		
		tipTxt = new JTextField();
		tipTxt.setColumns(10);
		tipTxt.setBounds(276, 205, 114, 20);
		contentPane.add(tipTxt);
		
		totalTxt = new JTextField();
		totalTxt.setColumns(10);
		totalTxt.setBounds(276, 275, 114, 20);
		contentPane.add(totalTxt);
		
		JLabel lblpercent = new JLabel("20%");
		lblpercent.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblpercent.setBounds(107, 119, 92, 59);
		contentPane.add(lblpercent);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,20);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				value = slider.getValue();
				lblpercent.setText(value+"%");
			}
		});
		slider.setBounds(245, 125, 252, 53);
		contentPane.add(slider);
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double amount = Integer.parseInt(amountTxt.getText());
				double tip = amount*value/100;
				tipTxt.setText(tip+"");
				totalTxt.setText(amount+tip+"");
			}
		});
		btnNewButton.setBounds(218, 346, 127, 23);
		contentPane.add(btnNewButton);
	}
}
