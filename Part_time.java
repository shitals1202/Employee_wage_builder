public class Part_time{
        public static void main(String[] args) {
		int ispart_time=1;
		int isfull_time=2;
		double empcheck= Math.floor(Math.random() * 10) %3;  
		int emp_rate_per_hr=20;
	if(isfull_time == empcheck){
		int emp_hr =8;
		int salary= emp_rate_per_hr * emp_hr;
		System.out.println("Employee is Present");
		System.out.println("Salary=" +salary);
	}
else if (ispart_time == empcheck){
int emp_hr=4;
int salary= emp_rate_per_hr * emp_hr;
System.out.println("Employee is Present");
System.out.println("Salary=" +salary);
        }
else{
System.out.println("Employee is Absent"); 
System.out.println("Salary=0");
        }
}
}
