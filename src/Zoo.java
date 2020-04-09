import java.util.ArrayList;

public class Zoo implements ZooSubject{
	private  ArrayList<AnimalAddedListener >listeners;
	private Animal animal;
	public Zoo()
	{
		listeners = new ArrayList<AnimalAddedListener >();
	}
	public void registerAnimalAddedListener(AnimalAddedListener a) {
		listeners.add(a);
	}

	public void unregisterAnimalAddedListener(AnimalAddedListener a) {
		listeners.remove(a);
	}
		

	public void notifyListeners() {
		for(int i = 0; i<listeners.size();i++)
		{
			AnimalAddedListener lis = listeners.get(i);
			lis.update(animal);
		}
		
	}
	
	public void addAnimal(Animal animal)
	{
		this.animal = animal;
		notifyListeners();
	}
	
}