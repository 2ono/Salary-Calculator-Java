import javax.swing.*;  
import java.awt.*;   

public class SalaryCalculator {
	JFrame frame;
	JButton calcBtn;
	TextField inputSalary, total, pension, health, lonturm, hire, saltax, salTax, expectedSal;
	Label salaryLabel;
	public SalaryCalculator() {
		




		frame = new JFrame();
	
		
		calcBtn = new JButton();
		calcBtn.setBounds(50,150,80,30);    
		// label
		salaryLabel = new Label("한달 월급을 입력하세요.");
		salaryLabel.setBounds(50, 50, 100, 30);
		inputSalary = new TextField(10);
		salaryLabel.setBounds(50, 100, 100, 30);
		frame.add(salaryLabel);
		frame.add(inputSalary);
		frame.add(calcBtn);
//		, total, pension, health, lonturm, hire, saltax, salTax, expectedSal
		
		frame.setSize(300, 600);
	    frame.setLayout(null);    
		frame.setVisible(true);
		
		/*
		 * 예상 소득액
			5,000,000
			공제액 합계 
			789,310
			국민연금 (4.5%)
			216,000
			건강보험 (3.545%)
			170,160
			장기요양 (12.81%)
			21,790
			고용보험 (0.9%)
			43,200
			소득세 (간이세액)
			307,420
			지방소득세 (10%)
			30,740
			월 예상 실수령액
			4,210,690
		 */
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SalaryCalculator();
	}

}
