public class EmployeeWage
{
	public static final WAGE_PER_HOUR=20;
	public static void main(String[] args)
	{
		//variables
		int empWage=0;
		int empHrs=0;
				
		//computation using switch case
		int empType=(int)Math.floor(Math.random()*10)%3;
		switch(empType)
		{
		case 2:empHrs=8;
		       System.out.println("Full time employee");
		       break;
		case 1:empHrs=4;
		       
		       System.out.println("Part time employee"); 
		       break;
		default:
          		System.out.println("Neither full time nor part time");
			
		}
		empWage=empHrs*WAGE_PER_HOUR;
		System.out.println("The wage "+empWage);
	}
}
