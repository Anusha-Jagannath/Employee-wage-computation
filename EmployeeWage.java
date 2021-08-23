
public class EmployeeWage
{
	//constants
	public final static int IS_PRESENT=1;
        public final static int WAGE_PER_HOUR=20;
        public final static int IS_PART_TIME=1;
	public final static int IS_FULL_TIME=2;
	public final static int NO_OF_DAYS=20;
	public final static int MAX_HRS_IN_MONTH=100; 
	public final static int UM_OF_WORKING_DAYS
	public static void main(String[] args)
	{
		//variables
		int empWage=0;
		int empHrs=0;
		int totalWage=0;
		int totalWorkingDays=0;
		int totalEmpHrs=0;
		System.out.println("Welcome to Employee Wage Computation");
		//computation
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==IS_PRESENT)
		{
			empHrs=8;
			System.out.println("Employee is present");
		}
		else
			System.out.println("Employee is absent");
		empWage=empHrs*WAGE_PER_HOUR;
		System.out.println("Employee wage "+empWage);
		
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

		empWage=empHrs*WAGE_PER_HOUR;
		System.out.println("Employee wage is "+empWage);
		
		
		//computation using switch case
		int empType=(int)Math.floor(Math.random()*10)%3;
		switch(empType)
		{
		case IS_FULL_TIME:empHrs=8;
		                  System.out.println("Full time employee");
		                  break;
				               
		case IS_PART_TIME:empHrs=4;
		                  System.out.println("Part time employee");
		                  break;
		 default:System.out.println("Employee is absent");	
		}
		empWage=empHrs*WAGE_PER_HOUR;
		System.out.print("Wage is "+empWage);
		
		//iterating through 20 days using for loop
		for(int i=0;i<NO_OF_DAYS;i++)
		{
		int empType=(int)Math.floor(Math.random()*10)%3;
		switch(empType)
		{
		case IS_FULL_TIME: empHrs=8;
		       		   System.out.println("Full time employee");
		                   break;
	        case IS_PART_TIME:  empHrs=4;
				   System.out.println("Part time employee"); 
			           break;
		default:empHrs=0;	
		}
		empWage=empHrs*WAGE_PER_HOUR
	        totalWage+=empWage;


	}
		System.out.println("Total wage is "+totalWage);
		

		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
		{
			totalWorkingDays++;
			int empType=(int)Math.floor(Math.random()*10)%3;
			switch(empType)
			{
		 		case 2: empHrs=8;
		       			System.out.println("Full time employee");
		       			break;
	         		case 1: empHrs=4;
					System.out.println("Part time employee"); 
					break;
				default:empHrs=0;	
			}
		totalEmpHrs+=empHrs;
		}
		totalWage=totalEmpHrs*WAGE_PER_HOUR
		System.out.println("Total Wage "+totalWage);

	}
}
