public class EmployeeWage
{
	public static void main(String[] args)
	{
		//constants
		int IS_PART_TIME=1;
		int IS_FULL_TIME=2;
		int wagePerHour=20;
		int wage=0;
		int empHrs=0;
	
		//computation	
		double empType=(int)Math.floor(Math.random()*10)%3;
		if(empType==IS_FULL_TIME)
		{
			empHrs=16;
			wage=empHrs*wagePerHour;
			System.out.println("Full time employee");
			System.out.println("Employee wage is "+wage);
			
			
		}
		else if(empType==IS_PART_TIME)
		{
			empHrs=8;
			wage=empHrs*wagePerHour;
			System.out.println("Part time employee");
			System.out.println("Employee wage is "+wage);
			
			
		}
		else
		{
			wage=0;
			System.out.println("Neither full time nor part time");
			System.out.print("Wage is "+wage);
		
	
	}
	}
}
