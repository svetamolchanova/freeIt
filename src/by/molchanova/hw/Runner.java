package by.molchanova.hw;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class Runner {

    public static void main(String[] args) {
        Port port = new Port();
        port.setCapacity(100);
        port.setContainers(50);
        port.setDocks(new Semaphore(5));
        port.setLock(new ReentrantLock());

        for (int i = 0; i < 20; i++) {
            Ship ship = new Ship();
            ship.setPort(port);
            ship.start();
        }
    }
}
