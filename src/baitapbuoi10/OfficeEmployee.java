package baitapbuoi10;
import java.util.Scanner;

public class OfficeEmployee extends Employee {
	private int numWorkingDays;
	
	@Override
	 public void input() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter name: ");
	        setName(scanner.nextLine()); 
	        System.out.print("Enter birth date: ");
	        setBirthOfDate(scanner.nextLine()); 
	        System.out.print("Enter number of working days: ");
	        numWorkingDays = scanner.nextInt();
	    }
	    public void calculate() {
	        setSalary(numWorkingDays * 100000); 
	    }
	    public void output() {
	        System.out.println("Name: " + getName());
	        System.out.println("Birth date: " + getBirthOfDate());
	        System.out.println("Salary: " + getSalary());
	    }
}
