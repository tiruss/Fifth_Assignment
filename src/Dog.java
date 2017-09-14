
public class Dog extends Animal{
	public Dog() {
		super();
		System.out.println("A new dog has been creaeted!");
	}
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("An dog sleeps...");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("An dog eats...");
	}
	
}
