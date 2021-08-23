
public class EmployeeWage
{
	final static int IS_PRESENT=1;
        final static int WAGE_PER_HOUR=20;
        final static int IS_PART_TIME=1;
	final static int IS_FULL_TIME=2;
	public static void main(String[] args)
	{
		//constants
		int IS_PRESENT=1;
		int empWage=0;
		int empHrs=0;
		System.out.println("Welcome to Employee Wage Computation");
	        
	
		//computation	
		double empType=(int)Math.floor(Math.random()*10)%3;
		if(empType==IS_FULL_TIME)
		{
			empHrs=16;
			wage=empHrs*WAGE_PER_HOUR;
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

		//variables
		int wagePerHour=20;
		int wage=0;
		int empHrs=0;
				
		//computation using switch case
		int empType=(int)Math.floor(Math.random()*10)%3;
		switch(empType)
		{
		case 2:empHrs=16;
	               wage=empHrs*wagePerHour;
		       System.out.println("Full time employee");
	               System.out.println("Employee wage is "+wage);
		       break;
				               
		case 1:empHrs=8;
		       wage=empHrs*wagePerHour;
		       System.out.println("Part time employee");
		       System.out.println("Employee wage is "+wage);  
		       break;
		 default:wage=0;
			System.out.println("Neither full time nor part time");
			System.out.print("Wage is "+wage);
			
		}	

     //variables

		int wagePerHour=20;
		int wage=0;
		int empHrs=0;
		int noOfdays=20;

		
		//computation using switch case
	        int fullWage=0;
		int partWage=0;
		int totalWage=0;
		
		//iterating through 20 days using for loop
		for(int i=0;i<noOfdays;i++)
		{
		//computation of employee type using switch case

		int empType=(int)Math.floor(Math.random()*10)%3;
		switch(empType)
		{
		case 2:empHrs=16;
                       //wage=empHrs*wagePerHour*noOfdays;
		       System.out.println("Full time employee");
		       System.out.println("Employee wage is "+wage);
		       fullWage+=empHrs*wagePerHour*noOfdays;
		       break;
	       case 1:empHrs=8;
			partWage+=empHrs*wagePerHour*noOfdays;
			System.out.println("Part time employee"); 
			break;
		default:wage=0;
			System.out.println("Neither full time nor part time");
			System.out.println("Wage is "+wage);

			
			
		}	


	}
		totalWage=fullWage+partWage;
		System.out.println("Full time wage is "+fullWage);
		System.out.println("Part time wage is "+partWage);
		System.out.println("Total wage is "+totalWage);

	}
}
