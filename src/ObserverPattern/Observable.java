package ObserverPattern;

public interface Observable {
    void registerObservers(Observing observing);
    void removeObservers(Observing observing);
    void notifyObservers();
}
