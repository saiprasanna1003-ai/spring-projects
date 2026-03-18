package springwoboot.DemoSpringFrame;

public class Dev {
	
	private Computer computer;
	private Laptop laptop;
	private int age;
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public void setLaptop(Laptop laptop)
	{
		this.laptop = laptop;
	}
	public Laptop getLaptop()
	{
		return laptop;
	}
	
	public int getAge()
	{
		return age;
	}
	public Dev() {
		System.out.println("Dev Constructor");
	}
	public Dev(Laptop laptop) {
		this.laptop=laptop;
	}
//	public Dev(int age) {
//		this.age=age;
//		System.out.println("Dev Constructor");
//	}
	
	public void build() {
		System.out.println("Welcome to Spring Project without boot");
		computer.compile();
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

}
