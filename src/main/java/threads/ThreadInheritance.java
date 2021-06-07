package threads;

public class ThreadInheritance extends Thread{

    @Override
    public void run(){
        System.out.println("Inheritance thread: "+ Thread.currentThread().getName());

    }
}
