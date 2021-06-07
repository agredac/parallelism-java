package asynchronousTask;

public class CheckBackMirror implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
