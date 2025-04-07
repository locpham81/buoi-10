package baitapbuoi10;
import java.util.ArrayList;
import java.util.Scanner;

public class Process {
	    public static void main(String[] args) {
//	    	1
	        Fraction fr1 = new Fraction();
	        Fraction fr2 = new Fraction();

	        fr1.input();
	        fr2.input();

	        System.out.print("Fraction 1: ");
	        fr1.show();
	        System.out.println();

	        System.out.print("Fraction 2: ");
	        fr2.show();
	        System.out.println();

	        Fraction result = fr1.add(fr2);
	        System.out.print("Sum: ");
	        result.show();
	        System.out.println();

	        result = fr1.subtract(fr2);
	        System.out.print("Difference: ");
	        result.show();
	        System.out.println();

	        result = fr1.multiply(fr2);
	        System.out.print("Product: ");
	        result.show();
	        System.out.println();

	        result = fr1.divide(fr2);
	        System.out.print("Quotient: ");
	        result.show();
	        System.out.println();

//	        2
	        Athlete athlete1 = new Athlete();
	        Athlete athlete2 = new Athlete();

	        athlete1.input();
	        athlete2.input();

	        System.out.println("Athlete 1:");
	        athlete1.output();
	        System.out.println("Athlete 2:");
	        athlete2.output();

	        if (athlete1.check(athlete2)) {
	            System.out.println("Athlete 1 is taller or heavier than Athlete 2.");
	        } else {
	            System.out.println("Athlete 2 is taller or heavier than Athlete 1.");
	        }

	        
	        ProductionEmployee employee1 = new ProductionEmployee();
	        employee1.input();
	        employee1.calculate();
	        employee1.output();

	        OfficeEmployee employee2 = new OfficeEmployee();
	        employee2.input();
	        employee2.calculate();
	        employee2.output();
//	        4
	        int n;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter number of cars: ");
	        n = scanner.nextInt();
	        ArrayList<Car> carList = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            Car car = new Car();
	            System.out.println("Enter details for car " + (i + 1));
	            car.input();
	            carList.add(car);
	        }

	        System.out.print("Enter max speed to search: ");
	        float targetSpeed = scanner.nextFloat();

	        System.out.println("Cars with max speed of " + targetSpeed + ":");
	        for (Car car : carList) {
	            if (car.getMaxSpeed() == targetSpeed) {
	                car.output();
	            }
	        }
	    }
}
	    

	    
	   
