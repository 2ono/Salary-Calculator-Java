import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;

public class SalaryCalculator {
	JFrame frame;
	JButton calcBtn;
	TextField inputSalary, total, pension, health, lonturm, hire, saltax, salTax, expectedSal;
	Label salaryLabel;

	public SalaryCalculator() {

		Font  f3  = new Font(Font.DIALOG,  Font.BOLD, 15);
		Font  f4  = new Font(Font.DIALOG_INPUT,  Font.BOLD|Font.ITALIC, 15);
		frame = new JFrame("Salary Calculator");
//		frame.setLayout(new GridBagLayout());
		frame.setLayout(null);

		JTextField textFieldUserName = new JTextField(50);
		frame.add(textFieldUserName);
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu("File");
		JMenuItem menuItemExit = new JMenuItem("Exit");
		menuFile.add(menuItemExit);

		menuBar.add(menuFile);

		// adds menu bar to the frame
		frame.setJMenuBar(menuBar);

		calcBtn = new JButton();
		calcBtn.setBounds(90, 150, 80, 30);

		// label
		salaryLabel = new Label("put your monthly salary");
		salaryLabel.setBounds(50, 50, 170, 50);
		salaryLabel.setFont(f3);
		inputSalary = new TextField(20);

		frame.add(salaryLabel);
		frame.add(inputSalary);
		frame.add(calcBtn);
//		, total, pension, health, lonturm, hire, saltax, salTax, expectedSal

//		frame.setLocationRelativeTo(null);
		frame.setBounds(100, 100, 300, 400);
		frame.setSize(300, 600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.GREEN);
//		frame.setUndecorated(true);

		/*
		 * 예상 소득액 5,000,000 공제액 합계 789,310 국민연금 (4.5%) 216,000 건강보험 (3.545%) 170,160
		 * 장기요양 (12.81%) 21,790 고용보험 (0.9%) 43,200 소득세 (간이세액) 307,420 지방소득세 (10%) 30,740
		 * 월 예상 실수령액 4,210,690
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SalaryCalculator();
	}

}
