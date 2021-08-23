public class EmployeeWage
{
	//constants
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int wagePerHour=20;
	public static void main(String[] args)
	{
		
		int empWage=0;
		int empHrs=0;
	
		//computation	
		double empType=(int)Math.floor(Math.random()*10)%3;
		if(empType==IS_FULL_TIME)
		{
			empHrs=8;
			System.out.println("Full time employee");		
		}
		else if(empType==IS_PART_TIME)
		{
			empHrs=4;
			System.out.println("Part time employee");
			
	        }
		wage=empHrs*WAGE_PER_HOUR;
		System.out.println("Employee wage is "+empWage);
	}
}
