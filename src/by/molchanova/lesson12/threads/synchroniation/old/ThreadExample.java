package by.molchanova.lesson12.threads.synchroniation.old;

public class ThreadExample extends Thread{

    private ObjectToSynchronize o;

    @Override
    public void run() {
        o.doWork();
    }

    public void setO(ObjectToSynchronize o) {
        this.o = o;
    }
}
