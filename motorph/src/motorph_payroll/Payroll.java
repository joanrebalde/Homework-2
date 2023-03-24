package motorph_payroll;

public class Payroll {
	
	private int empID;
	private String empName;
	private String Birthday;
	private double payRate, numberOfDays;
	private double pagibig, philhealth, sss, tax;
	
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}	
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	public void setnumberOfDays(double numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	public void setPagibig(double pagibig) {
		this.pagibig = pagibig;
	}
	public void setPhilhealth(double philhealth) {
		this.philhealth = philhealth;
	}
	public void setSss(double sss) {
		this.sss = sss;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public int getEmpID() {
		return empID;
	}
	public String getEmpName() {
		return empName;
	}
	public String getBirthday() {
		return Birthday;
	}
	
	public double getPayRate() {
		return payRate;
	}
	public double getnumberOfDays() {
		return numberOfDays;
	}
	public double getPagibig() {
		return pagibig;
	}
	public double getPhilhealth() {
		return philhealth;
	}
	public double getSss() {
		return sss;
	}
	public double getTax() {
		return tax;
	}
	
	public double calchoursWorked () {
		return numberOfDays * 8;
	}
	
	public double calcGrossPay () {
		
		return this.calchoursWorked() * payRate;
	}
	
	public double calcTotalDeductions () {
		
		return pagibig + philhealth + sss + tax;
	}
	
	public double calcNetPay () {
		
		return this.calcGrossPay() - this.calcTotalDeductions();
	}
	
	
	
}
