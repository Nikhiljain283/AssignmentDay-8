package employeeWageBuilder;

public class EmployeeDailyWage {
	public static void main(String[] args) {
		final int present = 1; 
		final int absent = 2;
		int empHrs = 0;
		int empWage = 0;
		int empRatePerHr = 20;
			int empCheck = (int)(Math.random()*2)+1;
	
			if(empCheck == present) {
				System.out.println("Employee is present");
				empHrs = 8;
			}else {
				System.out.println("Employee is absent");
				empHrs = 0;
			}	
			empWage = empHrs*empRatePerHr;
			System.out.println("employee daily wage : "+empWage);
		}
		
	
}

