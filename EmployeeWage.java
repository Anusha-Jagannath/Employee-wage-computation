public class EmployeeWage
{
	public static void main(String[] args)
	{
<<<<<<< HEAD
<<<<<<< HEAD
		System.out.println("Welcome to Employee Wage Computation");
	
		//constants
		int IS_PRESENT=1;
		int wagePerHour=20;
		int totalHour=8;
		
		//computation
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==IS_PRESENT)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
		calculateEmployeeWage(wagePerHour,totalHour);
	
	}
	//method to compute wage
	public static void calculateEmployeeWage(int wagePerHour,int totalHour)
	{
		
		int wage=wagePerHour*totalHour;
		System.out.println("Daily Employee Wage "+wage);
=======
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
>>>>>>> UC3-PartTime-Wage
=======
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
>>>>>>> UC4-Switch-case
	}
}
