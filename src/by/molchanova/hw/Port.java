package by.molchanova.hw;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class Port {

    private int capacity;

    private int containers;
    private Semaphore docks;
    private Lock lock;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getContainers() {
        return containers;
    }

    public void setContainers(int containers) {
        this.containers = containers;
    }

    public Semaphore getDocks() {
        return docks;
    }

    public void setDocks(Semaphore docks) {
        this.docks = docks;
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }
}
