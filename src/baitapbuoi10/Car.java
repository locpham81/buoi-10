package baitapbuoi10;
import java.util.Scanner;

public class Car extends Vehicle {

	private int numSeat;
	private String type;
	
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter seat capacity");
		numSeat = scanner.nextInt();
        System.out.print("Enter engine type: ");
        type = scanner.nextLine();
	}
	
	public void output() {
		super.output();
        System.out.println("Seat capacity: " + numSeat);
        System.out.println("Engine type: " + type);
	}
	
	public int getSpeed() {
		return maxspeed;
	}
}
