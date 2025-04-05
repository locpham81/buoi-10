package baitapbuoi10;
import java.util.Scanner;

public class Athlete {
	private String name;
	private int age;
	private String competition;
	private float weight;
	private float height;


//khởi tạo ko tham số

	public Athlete() {
		name = "";
		age = 0;
		competition = "";
		weight = 0;
		height = 0;
	}
	
	//khởi tạo 5 tham số
	
	public Athlete(String name, int age, String competition, float weight, float height) {
		 this.name = name;
	     this.age = age;
	     this.competition = competition;
	     this.weight = weight;
	     this.height = height;
	}
	
	public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter sport: ");
        competition = scanner.nextLine();
        System.out.print("Enter weight: ");
        weight = scanner.nextFloat();
        System.out.print("Enter height: ");
        height = scanner.nextFloat();
    }
	
	public void output() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("competition: " + competition);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
    }
	
	public boolean check(Athlete other) {
		if(this.height >= other.height)
			return true;
		if(this.height == other.height && this.weight > other.weight)
			return true;
		return false;
	}
	
	
}
