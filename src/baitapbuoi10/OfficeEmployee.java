package baitapbuoi10;
import java.util.Scanner;

public class OfficeEmployee extends Employee {
	private int numWorkingDays;
	 @Override
	 	public void input() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter name: ");
	        name = scanner.nextLine();
	        System.out.print("Enter birth date: ");
	        birthOfDate = scanner.nextLine();
	        System.out.print("Enter number of working days: ");
	        numWorkingDays = scanner.nextInt();
	    }
	    public void calculate() {
	        salary = numWorkingDays * 100000;
	    }
	    public void output() {
	        System.out.println("Name: " + name);
	        System.out.println("Birth date: " + birthOfDate);
	        System.out.println("Salary: " + salary);
	    }
}
