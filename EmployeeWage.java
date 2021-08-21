public class EmployeeWage
{
	public static void main(String[] args)
	{
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
	}
}
