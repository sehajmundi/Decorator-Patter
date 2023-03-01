/**
 * ACS-3913 - Assignment 2
 */

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
