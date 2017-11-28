package com.observer.Interfaces;

import java.util.Observer;

public interface Subject {
    void subscribe(Observer observer);
    void unSubscribe(Observer observer);
    void notifySubscribers();
}
