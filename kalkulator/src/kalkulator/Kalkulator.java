package kalkulator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kalkulator {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnC;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	
	public String s1;
	public String s2;
	public String s3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator window = new Kalkulator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Kalkulator() {
		initialize();
	}
	public void calculate (String s1, String s2, String s3){
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s3);
		int res;
		if(s2 == "+") {
			res = num1 + num2;
			textField.setText(String.valueOf(res));
			
			
		}
			
	}
		
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(41, 29, 278, 54);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btnNewButton.setBounds(41, 94, 59, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btnNewButton_1.setBounds(41, 128, 59, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("1");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btnNewButton_2.setBounds(41, 162, 59, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(41, 196, 59, 23);
		frame.getContentPane().add(btnC);
		
		btnNewButton_4 = new JButton("8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btnNewButton_4.setBounds(117, 94, 59, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btnNewButton_5.setBounds(117, 128, 59, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("2");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btnNewButton_6.setBounds(117, 162, 59, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("0");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btnNewButton_7.setBounds(117, 196, 59, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btnNewButton_8.setBounds(186, 94, 59, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("6");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btnNewButton_9.setBounds(186, 128, 59, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");

			}
			
		});
		btnNewButton_10.setBounds(186, 162, 59, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("=");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s3 = textField.getText();
				calculate(s1, s2, s3);
				
				
			}
		});
		btnNewButton_11.setBounds(186, 196, 59, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("+");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1 = textField.getText();
				textField.setText("+");
				s2 = "+";
				textField.setText(null);
				
			}
		});
		btnNewButton_12.setBounds(260, 94, 59, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("-");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "-");
			}
		});
		btnNewButton_13.setBounds(260, 128, 59, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("*");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "*");
			}
		});
		btnNewButton_14.setBounds(260, 162, 59, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("/");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "/");
			}
		});
		btnNewButton_15.setBounds(260, 196, 59, 23);
		frame.getContentPane().add(btnNewButton_15);
	}
}
