package de.musti;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class MainView extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	static JTextField textField_watt;
	static JTextField textField_time;
	static JTextField textField_price;
	
	static JLabel lbl_ConsumPD = new JLabel("0");
	static JLabel lbl_CostPD = new JLabel("0");
	
	static JLabel lbl_ConsumPW = new JLabel("0");
	static JLabel lbl_CostPW = new JLabel("0");
	
	static JLabel lbl_ConsumPY = new JLabel("0");
	static JLabel lbl_CostPY = new JLabel("0");
	

	public MainView() {
		
		setTitle("Power Consumption Calc. v1.1 by Musti - 2022");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Device performance:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 24, 130, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Duration:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 74, 130, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Electricity price:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 49, 130, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Consumption per day:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 126, 150, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Consumption per week:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 151, 150, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cost per week:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(335, 151, 105, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Cost per day:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(335, 126, 105, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Consumption per year:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(10, 176, 150, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Cost per year:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(335, 176, 105, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("€");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(554, 126, 20, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("€");
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9_1.setBounds(554, 151, 20, 14);
		contentPane.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("€");
		lblNewLabel_9_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9_1_1.setBounds(554, 177, 20, 14);
		contentPane.add(lblNewLabel_9_1_1);
		
		
		lbl_CostPD.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_CostPD.setBounds(450, 126, 94, 14);
		contentPane.add(lbl_CostPD);
		
		lbl_CostPW.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_CostPW.setBounds(450, 152, 94, 14);
		contentPane.add(lbl_CostPW);
		
		lbl_CostPY.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_CostPY.setBounds(450, 177, 94, 14);
		contentPane.add(lbl_CostPY);
		
		JLabel lblNewLabel_9_2 = new JLabel("kWh");
		lblNewLabel_9_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9_2.setBounds(277, 126, 31, 14);
		contentPane.add(lblNewLabel_9_2);
		
		lbl_ConsumPD.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_ConsumPD.setBounds(170, 126, 97, 14);
		contentPane.add(lbl_ConsumPD);
		
		JLabel lblNewLabel_9_2_1 = new JLabel("kWh");
		lblNewLabel_9_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9_2_1.setBounds(277, 151, 31, 14);
		contentPane.add(lblNewLabel_9_2_1);
		
		lbl_ConsumPW.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_ConsumPW.setBounds(170, 151, 97, 14);
		contentPane.add(lbl_ConsumPW);
		
		JLabel lblNewLabel_9_2_2 = new JLabel("kWh");
		lblNewLabel_9_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9_2_2.setBounds(277, 176, 31, 14);
		contentPane.add(lblNewLabel_9_2_2);
		
		lbl_ConsumPY.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_ConsumPY.setBounds(170, 176, 97, 14);
		contentPane.add(lbl_ConsumPY);
		
		textField_watt = new JTextField();
		textField_watt.setText("0");
		textField_watt.setHorizontalAlignment(SwingConstants.CENTER);
		textField_watt.setBounds(150, 22, 86, 20);
		contentPane.add(textField_watt);
		textField_watt.setColumns(10);
		
		textField_time = new JTextField();
		textField_time.setText("0");
		textField_time.setHorizontalAlignment(SwingConstants.CENTER);
		textField_time.setBounds(150, 72, 86, 20);
		contentPane.add(textField_time);
		textField_time.setColumns(10);
		
		textField_price = new JTextField();
		textField_price.setHorizontalAlignment(SwingConstants.CENTER);
		textField_price.setText("0");
		textField_price.setBounds(150, 47, 86, 20);
		contentPane.add(textField_price);
		textField_price.setColumns(10);
		
		JLabel lblWatt = new JLabel("Watt");
		lblWatt.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWatt.setBounds(244, 24, 99, 14);
		contentPane.add(lblWatt);
		
		JLabel lblHoursADay = new JLabel("Hours a day (max. 24)");
		lblHoursADay.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHoursADay.setBounds(243, 74, 143, 14);
		contentPane.add(lblHoursADay);
		
		JLabel lblcentkwh = new JLabel("€-Cent/kWh");
		lblcentkwh.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblcentkwh.setBounds(246, 49, 97, 14);
		contentPane.add(lblcentkwh);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 110, 564, 12);
		contentPane.add(separator);
		
		JButton btn_calc = new JButton("Calc.");
		btn_calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calc.consumPerDay();
				Calc.costPerDay();
				Calc.consumPerWeek();
				Calc.costPerWeek();
				Calc.consumPerYear();
				Calc.costPerYear();
			}
		});
		btn_calc.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_calc.setBounds(454, 45, 90, 23);
		contentPane.add(btn_calc);
	}
	

	
}

class Calc{
	
	private static String removeComma(String inputs) {
		if(inputs.contains(",")) {
			String[] s = inputs.split(",");
			return s[0] + "." + s[1];
		}else {
			return inputs;
		}		
	}

	private static double stringToNumber(String inputs) {
		double d;
		try {
			d = Double.parseDouble(removeComma(inputs));
		}catch(NumberFormatException e) {
			d = 0.0f;
		}		
		return d;
	}
	
	private static String formatStringTwoComma(double s) {		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		return String.valueOf(df.format(s));
	}
	
	private static double getHours() {		
		double h = stringToNumber(MainView.textField_time.getText());
		if(h < 25.0f & h > 0.0f)
			return h/24*100;
		else
			MainView.textField_time.setText("24");
		return 0.0f;
	}
	
	private static double getCent() {
		double c = stringToNumber(MainView.textField_price.getText());
		if(c > 0 & c < 10000f)
			return c/100;
		else
			MainView.textField_price.setText("1");
		return 0.0f;
	}
	
	private static double getWatt() {
		double w = stringToNumber(MainView.textField_watt.getText());
		if(w > 0 & w < 1000000f)
			return w;
		else
			MainView.textField_watt.setText("1");
		return 0.0f;
	}
	
	private static double getWattHours() {
		return (getWatt()*getHours())/100;
	}

	static void consumPerDay() {
		MainView.lbl_ConsumPD.setText(formatStringTwoComma((getWattHours()*24/100)/10));
	}
	
	static void costPerDay() {
		MainView.lbl_CostPD.setText(formatStringTwoComma((getWattHours()*getCent()*24/10)/100));
	}
	
	static void consumPerWeek() {
		MainView.lbl_ConsumPW.setText(formatStringTwoComma((getWattHours()*168/100)/10));
	}
	
	static void costPerWeek() {
		MainView.lbl_CostPW.setText(formatStringTwoComma((getWattHours()*getCent()*168/10)/100));
	}
	
	static void consumPerYear() {
		MainView.lbl_ConsumPY.setText(formatStringTwoComma((getWattHours()*8765.8125/100)/10));
	}
	
	static void costPerYear() {
		MainView.lbl_CostPY.setText(formatStringTwoComma((getWattHours()*getCent()*8765.8125/10)/100));
	}
}
