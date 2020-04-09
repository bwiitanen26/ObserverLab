import java.util.Observer;

public interface ZooSubject {
	public void addObserver( Observer o );

	/* removes an observer */	
	public void removeObserver( Observer o );

	/* notifes all registered observers when its state changes */	
	public void notifyObservers();
	}
