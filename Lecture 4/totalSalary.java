import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int basic_salary=sc.nextInt();
		
		String grade=sc.next();
		char grades=grade.charAt(0);
		int allow;
		
		if(grades=='A'){
			allow=1700;
		}
		else if(grades=='B'){
			allow=1500;
		}
		else{
			allow=1300;
		}
		double hra=(0.2*(double)basic_salary);
		double  da=(0.5*(double)basic_salary);
		double pf=(0.11*(double)basic_salary);
		double s1=hra+da+allow-pf;
		int minSalary=(int)Math.round(s1);

		int totalSalary=basic_salary+minSalary;
		System.out.println(totalSalary);


	}
}
