package baitapbuoi10;
import java.util.Scanner;

public  class Vehicle {
	   private String manufacturer;
	   private String name;
	   private int yearOfManufacture;
	   float maxSpeed;
	   
	   public Vehicle() {  
	   }
	   
	   public Vehicle(String manufacturer, String name, int yearOfManufacturer, float maxSpeed) {
		   this.manufacturer = manufacturer;
		   this.name = name;
		   this.yearOfManufacture = yearOfManufacturer;
		   this.maxSpeed = maxSpeed;
	   }

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter manufacturer: ");
        manufacturer = scanner.nextLine();
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter year of manufacture: ");
        yearOfManufacture = scanner.nextInt();
        System.out.print("Enter max speed: ");
        maxSpeed = scanner.nextFloat();
    }
	
	public void output() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Name: " + name);
        System.out.println("Year of manufacture: " + yearOfManufacture);
        System.out.println("Max speed: " + maxSpeed);
    }
	
	
}
