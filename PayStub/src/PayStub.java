import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PayStub extends JFrame {

	private JPanel contentPane;
	private JTextField prButton;
	private JTextField monHours;
	private JTextField monPay;
	private JTextField tuesHours;
	private JTextField wedHours;
	private JTextField thursHours;
	private JTextField friHours;
	private JTextField tuesPay;
	private JTextField wedPay;
	private JTextField thursPay;
	private JTextField friPay;
	private JTextField op;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayStub frame = new PayStub();
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
	public PayStub() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel prLabel = new JLabel("Pay Rate:");
		prLabel.setBounds(10, 0, 87, 24);
		prLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(prLabel);
		
		JLabel mondayLabel = new JLabel("Monday");
		mondayLabel.setBounds(10, 106, 87, 24);
		mondayLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(mondayLabel);
		
		JLabel tuesdayLabel = new JLabel("Tuesday");
		tuesdayLabel.setBounds(10, 143, 87, 24);
		tuesdayLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(tuesdayLabel);
		
		JLabel wednesdayLabel = new JLabel("Wednesday");
		wednesdayLabel.setBounds(10, 178, 87, 24);
		wednesdayLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(wednesdayLabel);
		
		JLabel thursdayLabel = new JLabel("Thursday");
		thursdayLabel.setBounds(10, 213, 87, 24);
		thursdayLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(thursdayLabel);
		
		JLabel fridayLabel = new JLabel("Friday");
		fridayLabel.setBounds(10, 252, 87, 24);
		fridayLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(fridayLabel);
		
		JLabel opLabel = new JLabel("Overall Pay");
		opLabel.setBounds(10, 287, 87, 24);
		opLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(opLabel);
		
		JLabel hoursLabel = new JLabel("Hours");
		hoursLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		hoursLabel.setBounds(232, 63, 87, 24);
		contentPane.add(hoursLabel);
		
		JLabel payLabel = new JLabel("Pay");
		payLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		payLabel.setBounds(395, 63, 87, 24);
		contentPane.add(payLabel);
		
		prButton = new JTextField();
		prButton.setText("0.0");
		prButton.setBounds(232, 4, 153, 20);
		contentPane.add(prButton);
		prButton.setColumns(10);
		
		monHours = new JTextField();
		monHours.setText("0");
		monHours.setColumns(10);
		monHours.setBounds(232, 110, 153, 20);
		contentPane.add(monHours);
		
		monPay = new JTextField();
		monPay.setText("0.0");
		monPay.setColumns(10);
		monPay.setBounds(395, 110, 153, 20);
		contentPane.add(monPay);
		
		tuesHours = new JTextField();
		tuesHours.setText("0");
		tuesHours.setColumns(10);
		tuesHours.setBounds(232, 147, 153, 20);
		contentPane.add(tuesHours);
		
		wedHours = new JTextField();
		wedHours.setText("0");
		wedHours.setColumns(10);
		wedHours.setBounds(232, 182, 153, 20);
		contentPane.add(wedHours);
		
		thursHours = new JTextField();
		thursHours.setText("0");
		thursHours.setColumns(10);
		thursHours.setBounds(232, 217, 153, 20);
		contentPane.add(thursHours);
		
		friHours = new JTextField();
		friHours.setText("0");
		friHours.setColumns(10);
		friHours.setBounds(232, 256, 153, 20);
		contentPane.add(friHours);
		
		tuesPay = new JTextField();
		tuesPay.setText("0.0");
		tuesPay.setColumns(10);
		tuesPay.setBounds(395, 147, 153, 20);
		contentPane.add(tuesPay);
		
		wedPay = new JTextField();
		wedPay.setText("0.0");
		wedPay.setColumns(10);
		wedPay.setBounds(395, 182, 153, 20);
		contentPane.add(wedPay);
		
		thursPay = new JTextField();
		thursPay.setText("0.0");
		thursPay.setColumns(10);
		thursPay.setBounds(395, 217, 153, 20);
		contentPane.add(thursPay);
		
		friPay = new JTextField();
		friPay.setText("0.0");
		friPay.setColumns(10);
		friPay.setBounds(395, 256, 153, 20);
		contentPane.add(friPay);
		
		op = new JTextField();
		op.setText("0.0");
		op.setColumns(10);
		op.setBounds(395, 291, 153, 20);
		contentPane.add(op);
		
		JButton calcButton = new JButton("Calculate");
		calcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pr = Double.parseDouble(prButton.getText());
				double mon = Integer.parseInt(monHours.getText())*pr;
				monPay.setText(mon+"");
				double tues = Integer.parseInt(tuesHours.getText())*pr;
				tuesPay.setText(tues+"");
				double wed = Integer.parseInt(wedHours.getText())*pr;
				wedPay.setText(wed+"");
				double thurs = Integer.parseInt(thursHours.getText())*pr;
				thursPay.setText(thurs+"");
				double fri = Integer.parseInt(friHours.getText())*pr;
				friPay.setText(fri+"");
				op.setText(mon+tues+wed+thurs+fri+"");
			}
		});
		calcButton.setBounds(129, 342, 89, 23);
		contentPane.add(calcButton);
	}
}
