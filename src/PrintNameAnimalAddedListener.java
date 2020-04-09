public class PrintNameAnimalAddedListener implements AnimalAddedListener{
	private ZooSubject s;
	public PrintNameAnimalAddedListener()
	{
		
	}
	public PrintNameAnimalAddedListener(ZooSubject s)
	{
		this.s = s;
		s.registerAnimalAddedListener(this);
	}
	@Override
	public void update(Object newState) {
		Animal animal = (Animal)newState;
		display(animal);
		
	}
	
	public void display(Animal a)
	{
		System.out.println("Added a new animal with name " + a);
	}

}