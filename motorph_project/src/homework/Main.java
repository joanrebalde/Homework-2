package homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		Payroll pay1 = new Payroll();
		pay1.setEmpID(1);
		pay1.setEmpName("MMDC1");
		pay1.setBirthday("01/07/2018");
		
		Payroll pay2 = new Payroll();
		pay2.setEmpID(2);
		pay2.setEmpName("MMDC2");
		pay2.setBirthday("01/07/2019");

		
		System.out.print("Enter ID:");
		
		char choice = input.next().charAt(0);
		
		if (choice== '1') {
			System.out.println("Employee ID: " + pay1.getEmpID());
			System.out.println("Employee Name: " + pay1.getEmpName());
			System.out.println("Birthday: " + pay1.getBirthday());
			
			System.out.println("Enter Hourly Rate: ");
			pay1.setPayRate(input.nextDouble());
			
			System.out.println("Enter Number of Days: ");
			pay1.setnumberOfDays(input.nextDouble());
			
			System.out.println("Gross Pay: " + pay1.calcGrossPay());
			
			System.out.println("Enter Pag-ibig Contribution: ");
			pay1.setPagibig(input.nextDouble());
			
			System.out.println("Enter Philhealth Contribution: ");
			pay1.setPhilhealth(input.nextDouble());
			
			System.out.println("Enter SSS Contribution: ");
			pay1.setSss(input.nextDouble());
			
			System.out.println("Enter Tax: ");
			pay1.setTax(input.nextDouble());
			
			System.out.println("Total Deductions: " + pay1.calcTotalDeductions());
			System.out.println("Net Pay: " + pay1.calcNetPay());
			
			
			
		}	
		else if (choice== '2') {
			System.out.println("Employee ID: " + pay2.getEmpID());
			System.out.println("Employee Name: " + pay2.getEmpName());
			System.out.println("Birthday: " + pay2.getBirthday());
			
			System.out.println("Enter Hourly Rate: ");
			pay2.setPayRate(input.nextDouble());
			
			System.out.println("Enter Number of Days: ");
			pay2.setnumberOfDays(input.nextDouble());
			
			System.out.println("Gross Pay: " + pay2.calcGrossPay());
			
			System.out.println("Enter Pag-ibig Contribution: ");
			pay2.setPagibig(input.nextDouble());
			
			System.out.println("Enter Philhealth Contribution: ");
			pay2.setPhilhealth(input.nextDouble());
			
			System.out.println("Enter SSS Contribution: ");
			pay2.setSss(input.nextDouble());
			
			System.out.println("Enter Tax: ");
			pay2.setTax(input.nextDouble());
			
			System.out.println("Total Deductions: " + pay2.calcTotalDeductions());
			System.out.println("Net Pay: " + pay2.calcNetPay());

		}
		else {
			System.out.println("Invalid input!");
		}
		
		
		
		
	}

}