public class EmployeeWage
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation");
	
		//constants
		int IS_PRESENT=1;
		
		//computation
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==IS_PRESENT)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	
	}
}
