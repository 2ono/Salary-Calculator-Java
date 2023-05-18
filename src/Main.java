import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class Main {
	JFrame frame;
	JButton calcBtn;
	TextField inputSalary, pension, health, lonturm, hire, saltax, salTax, expectedSal;
	Label ExpectedSalaryLabel;
	Label salaryLabel;
	Label TotalTaxLabel;

	public Main() {

		Font f3 = new Font(Font.DIALOG, Font.BOLD, 15);
		Font f4 = new Font(Font.DIALOG_INPUT, Font.BOLD | Font.ITALIC, 15);
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

		// expected salary
		ExpectedSalaryLabel = new Label("expected salary");
		ExpectedSalaryLabel.setBounds(50, 250, 170, 30);
		ExpectedSalaryLabel.setFont(f3);
		inputSalary = new TextField(20);

		// expected salary
		TotalTaxLabel = new Label("total tax");
		TotalTaxLabel.setBounds(50, 300, 170, 30);
		TotalTaxLabel.setFont(f3);
		inputSalary = new TextField(20);

		frame.add(salaryLabel);

		// added expected salary
		frame.add(ExpectedSalaryLabel);
		frame.add(TotalTaxLabel);
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
		 * 예상 소득액 5,000,000 공제액 합계 789,310 
		 * 국민연금 (4.5%) 216,000 건강보험 (3.545%) 170,160
		 * 장기요양 (12.81%) 21,790 고용보험 (0.9%) 43,200 
		 * 소득세 (간이세액) 307,420 지방소득세 (10%) 30,740
		 * 월 예상 실수령액 4,210,690
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
		
		
		//Calculate Monthly Salary
		double ExpectedSalary = 5000000;
		
		double PublicPensiton = ExpectedSalary * 0.045;
		double PublicHealth = ExpectedSalary * 0.03545;
		double ElderyCare = ExpectedSalary * 0.01281;
		double HireInsurance = ExpectedSalary * 0.009;
		double IncomeTax = ExpectedSalary * 0.05;
		double RuralIncomeTax = IncomeTax * 0.1;
		double ExpectedIncome = ExpectedSalary - (PublicPensiton + PublicHealth +
				ElderyCare + HireInsurance + IncomeTax + RuralIncomeTax);
		
		
		System.out.println(ExpectedIncome);
	}

}
