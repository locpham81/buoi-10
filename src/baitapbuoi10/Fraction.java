package baitapbuoi10;
import java.util.Scanner;
	
public class Fraction {
	private int numerator, denominator;
	
	//khởi tạo ko tham số
	public Fraction(){
		numerator = 0;
		denominator = 1;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numerator: ");
		numerator = sc.nextInt();
		do {
			System.out.println("Enter denominator (non-zero): ");
			denominator = sc.nextInt();
		}while(denominator == 0);
	}
	
	public void show() {
		System.out.println(numerator + "/" + denominator);
	}
	//cộng
	public Fraction add(Fraction newFraction) {
		Fraction result = new Fraction();
		result.numerator = numerator * newFraction.denominator + newFraction.numerator * denominator;
		result.denominator = denominator * newFraction.denominator;
        return result;
	}
	//trừ
	public Fraction subtract(Fraction newFraction) {
		Fraction result = new Fraction();
		result.numerator = numerator * newFraction.denominator - newFraction.numerator * denominator;
        result.denominator = denominator * newFraction.denominator;
        return result;
	}
	// nhan
	public Fraction multiply(Fraction newFraction) {
		Fraction result = new Fraction();
		result.numerator = numerator * newFraction.numerator;
		result.denominator = denominator * newFraction.denominator;
		return result;
	}
	//chia
	public Fraction divide(Fraction newFraction) {
		Fraction result = new Fraction();
		result.numerator = numerator * newFraction.denominator;
		result.denominator = denominator * newFraction.numerator;
		return result;
	}
}
