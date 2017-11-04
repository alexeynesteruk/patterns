package com.observer.Interfaces;

public interface Subject {
    void subscribe(Observable observer);
    void unSubscribe(Observable observer);
    void notifySubscribers();
}
