
public class EmployeeWage
{
	public static void main(String[] args)
	{
		 
		//variables
		int empWage=0;
		int empHrs=0;
		int totalEmpHrs=0;
		
		for(int i=0;i<NUM_OF_WORKING_HOURS;i++)
		{
		//computation using switch case
		int empType=(int)Math.floor(Math.random()*10)%3;
		switch(empType)
		{
		case 2:empHrs=8;
		       System.out.println("Full time employee");
		       break;
		               
		case 1:empHrs=4;
		       System.out.println("Part time employee");
		       System.out.println("Employee wage is "+wage);  
		       break;
		 default:
			 System.out.println("Neither full time nor part time");	
			
		}
		totalEmpHrs+=empHrs;
		empWage=empHrs*20;
		
			
		
	}
}
