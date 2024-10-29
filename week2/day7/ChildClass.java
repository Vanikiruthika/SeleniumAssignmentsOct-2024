package week2.day7;

public class ChildClass extends Superclass{
	@Override
	public void methodSuper() {
		System.out.println("Inside child class");
		//super.methodSuper();
	}
	public static void main(String[] args) {
		ChildClass cobj= new ChildClass();
		cobj.methodSuper();
	}
	

}
