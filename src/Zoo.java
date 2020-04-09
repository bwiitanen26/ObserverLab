import java.util.ArrayList;
import java.util.Observer;

public class Zoo implements ZooSubject{
	private ArrayList<Observer> observers;
	private Animal latestAnimal;
	
	public void registerAnimalAddedListener(PrintNameAnimalAddedListener printNameAnimalAddedListener) {
		observers.add((Observer) printNameAnimalAddedListener);
	}

	public void addAnimal(Animal animal) {
		this.latestAnimal = latestAnimal;
		notifyObservers();
		
	}

	public void unregisterAnimalAddedListener(PrintNameAnimalAddedListener al1) {
		// TODO Auto-generated method stub
		
	}
}
