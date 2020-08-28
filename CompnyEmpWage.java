public class EmpWageComapany {
	
	//instance variables
	private String companyName;
	private int empRate;
	private int numOfWorkingDays;
	private int maxHrsInMonth;

	public EmpWageInstance(final String companyName, final int empRate, final int numOfWorkingDays, final int maxHrsInMonth) {
		
		this.companyName=companyName;
		this.empRate = empRate;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsInMonth = maxHrsInMonth;
	}

	public static void main(String[] args) {
		final EmpWageInstance ewcMicrosoft = new EmpWageInstance("Microsoft",20, 20, 100);
		final int tMicEmpWages=ewcMicrosoft.computeEmpWage();
		System.out.println("Total Emp Wage of Microsift company="+tMicEmpWages);
		
		final EmpWageInstance ewcApple = new EmpWageInstance("Apple",20, 20, 100);
		final int tAppleEmpWages=ewcApple.computeEmpWage();
		System.out.println("Total Emp Wage of Apple company="+tAppleEmpWages);
		
		final EmpWageInstance ewcHtc = new EmpWageInstance("Htc",20, 20, 100);
		final int tHtcEmpWages=ewcHtc.computeEmpWage();
		System.out.println("Total Emp Wage of Htc Company="+tHtcEmpWages);
	}

	/**
	 * calculate employee daily wages based on type of employee
	 */

	public int computeEmpWage() {
		
		//local Variables
		int totalWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalEmpHrs < maxHrsInMonth && totalWorkingDays<numOfWorkingDays) {
			totalWorkingDays++;

			final int empHrs = getEmpHrs();
			final int empWage = empHrs * empRate;
			totalEmpHrs = empHrs;
			totalWage = empWage;
			System.out.println("EMP day=" + totalWorkingDays + "wages=" + empWage);
		}
		return totalWage;
	}

	/* @return employee hrs */
	public int getEmpHrs() {
		
		//local variables
		final int isFullTime = 1;
		final int isPartTime = 2;
		int empHrs = 0;

//get random value
		final double randomValue = Math.floor(Math.random() * 10) % 3;

		switch ((int) randomValue) {

		case isFullTime:
			empHrs = 8;
			System.out.println("Emp is Present for full time");
			break;
		case isPartTime:
			empHrs = 4;
			break;
		default:
			System.out.println("Emp is absent");
			break;

		}
		return empHrs;

	}

}
