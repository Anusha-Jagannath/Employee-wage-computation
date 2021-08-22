public class EmployeeWage
{
	public static void main(String[] args)
	{
                //variables
		int wagePerHour=20;
		int wage=0;
		int empHrs=0;
		int noOfdays=20;
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
			   fullWage+=empHrs*wagePerHour*noOfdays;
		       System.out.println("Full time employee");
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
