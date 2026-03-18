package springwoboot.DemoSpringFrame;

public class Laptop implements Computer{
	public Laptop() {
		System.out.println("Lap Constructor");
	}
	public void compile() {
		System.out.println("I'm Laptop class");
	}
}
