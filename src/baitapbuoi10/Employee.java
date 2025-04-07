package baitapbuoi10;

public abstract class Employee {
	private String name;
	private String birthOfDate;
	private float salary;

	public abstract void input();

//	public abstract void calculate();
//	public abstract void output();
	public Employee() {
	}

	public Employee(String name, String birthOfDate, float slary) {
		this.name = name;
		this.birthOfDate = birthOfDate;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(String birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
