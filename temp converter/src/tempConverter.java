import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;

public class tempConverter extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private JTextField output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tempConverter frame = new tempConverter();
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
	public tempConverter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Input");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(129, 32, 71, 29);
		contentPane.add(lblNewLabel);
		
		input = new JTextField();
		input.setBounds(276, 38, 86, 20);
		contentPane.add(input);
		input.setColumns(10);
		
		JLabel lblInputScale = new JLabel("Input Scale");
		lblInputScale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInputScale.setBounds(31, 124, 121, 29);
		contentPane.add(lblInputScale);
		
		JLabel lblOutputScale = new JLabel("Output Scale");
		lblOutputScale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOutputScale.setBounds(374, 124, 114, 29);
		contentPane.add(lblOutputScale);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(31, 164, 188, 126);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton inc = new JRadioButton("Celsius");
		inc.setBounds(16, 7, 109, 23);
		panel.add(inc);
		
		JRadioButton inf = new JRadioButton("Fahrenheit");
		inf.setBounds(16, 46, 109, 23);
		panel.add(inf);
		
		JRadioButton ink = new JRadioButton("Kelvin");
		ink.setBounds(16, 85, 109, 23);
		panel.add(ink);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(inc);
		group1.add(inf);
		group1.add(ink);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(336, 164, 188, 126);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton outc = new JRadioButton("Celsius");
		outc.setBounds(20, 7, 109, 23);
		panel_1.add(outc);
		
		JRadioButton outf = new JRadioButton("Fahrenheit");
		outf.setBounds(20, 46, 109, 23);
		panel_1.add(outf);
		
		JRadioButton outk = new JRadioButton("Kelvin");
		outk.setBounds(20, 83, 109, 23);
		panel_1.add(outk);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(outc);
		group2.add(outf);
		group2.add(outk);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOutput.setBounds(129, 317, 71, 29);
		contentPane.add(lblOutput);
		
		output = new JTextField();
		output.setColumns(10);
		output.setBounds(276, 323, 86, 20);
		contentPane.add(output);
		
		/*
		ActionListener radioButtonActionListener = new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	if (inc.isSelected()) {
            		System.out.println(10);
            		if (outc.isSelected()) {
            			output.setText(input.getText());
            		}
            		else if (outf.isSelected()) {
            			output.setText(Double.parseDouble(input.getText())*1.8+32 + "");
            		}
            		else if (outk.isSelected()) {
            			output.setText(Double.parseDouble(input.getText())+273.15+"");
            		}
            	}
            	else if (inf.isSelected()) {
            		if (outc.isSelected()) {
            			
            		}
            		else if (outf.isSelected()) {
            			
            		}
            		else if (outk.isSelected()) {
            			
            		}
            	}
            	if (ink.isSelected()) {
            		if (outc.isSelected()) {
            			
            		}
            		else if (outf.isSelected()) {
            			
            		}
            		else if (outk.isSelected()) {
            			
            		}
            	}
                
            }
        };
		 */
		/*
		if (inc.isSelected()) {
    		System.out.println(10);
    		if (outc.isSelected()) {
    			output.setText(input.getText());
    		}
    		else if (outf.isSelected()) {
    			output.setText(Double.parseDouble(input.getText())*1.8+32 + "");
    		}
    		else if (outk.isSelected()) {
    			output.setText(Double.parseDouble(input.getText())+273.15+"");
    		}
    	}
    	else if (inf.isSelected()) {
    		if (outc.isSelected()) {
    			
    		}
    		else if (outf.isSelected()) {
    			
    		}
    		else if (outk.isSelected()) {
    			
    		}
    	}
    	if (ink.isSelected()) {
    		if (outc.isSelected()) {
    			
    		}
    		else if (outf.isSelected()) {
    			
    		}
    		else if (outk.isSelected()) {
    			
    		}
    	}
		*/
		
		
		if (group1.getSelection() == inc.getModel()) {
		    // Perform action for celsius is selected
			if (inc.isSelected())
			output.setText("HI");
		}


		
	}
}
