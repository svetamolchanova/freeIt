package by.molchanova.hw;

import java.util.*;

public class Ship extends Thread {

    private int capacity;
    private int containers;
    private Port port;

    public void load() {
        //this.port.getLock().lock();
        while (this.port.getContainers() > 0 && this.containers < this.capacity) {
            this.containers++;
            this.port.setContainers(this.port.getContainers() - 1);
            System.out.println(this.port.getContainers());
            System.out.println("Loading ship " + Thread.currentThread().getName());
        }
        //this.port.getLock().unlock();
    }

    public void unload() {
        //this.port.getLock().lock();
        int cargo = this.containers;
        while (this.port.getContainers() < this.port.getCapacity() && this.containers > 0) {
            this.containers--;
            this.port.setContainers(this.port.getContainers() + 1);
            System.out.println(this.port.getContainers());
            System.out.println("Unloading ship " + Thread.currentThread().getName());
        }
        //this.port.getLock().unlock();
    }

    @Override
    public void run() {
        Random r = new Random();
        this.capacity = r.nextInt(10) + 1;
        this.containers = r.nextInt(3);
        System.out.println(Thread.currentThread().getName() + "capacity: " + this.capacity);
        System.out.println(Thread.currentThread().getName() + "containers: " + this.containers);
        try {
            this.port.getDocks().acquire();
            if (this.port.getContainers() > 0 && this.capacity > this.containers) {
                load();
            } else if (this.port.getContainers() < this.port.getCapacity()) {
                unload();
            }
            this.port.getDocks().release();
        } catch (InterruptedException e) {
            System.out.println("Ship breaks up");
        }
    }

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

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }
}
