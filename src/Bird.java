
public class Bird extends Animal{
	public Bird() {
		super();
		System.out.println("A new bird has been created!");
	}
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("An bird sleeps...");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("An bird eats...");
	}
	
}
