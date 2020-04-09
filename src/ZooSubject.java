public interface ZooSubject {
	public void registerAnimalAddedListener(AnimalAddedListener a );
	public void unregisterAnimalAddedListener(AnimalAddedListener a);
	public void addAnimal(Animal a);
}