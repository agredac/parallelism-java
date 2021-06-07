import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolTest {

    private String msgFormat1 = ">>>>Running %o , Thread %s";
    private String msgFormat2 = ">>>>Number of Threads:  %o ";
    private String msgFormat3 = ">>>>Threads:   %s";


    @Test
    public void singleThreadPool() throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        submitTask(executor);
    }

    @Test
    public void fixPool() throws InterruptedException {
        ExecutorService executor = Executors
                .newFixedThreadPool(5);

        submitTask(executor);
    }

    @Test
    public void cachedPool() throws InterruptedException {
        ExecutorService executor = Executors
                .newCachedThreadPool();

        submitTask(executor);
    }

    private void submitTask(ExecutorService executor) throws InterruptedException {

        Set<String> threadNames = new HashSet<>();

        for (int i = 0; i<100; i++){
            int finalI = i;


            executor.execute(()-> {
                System.out.println( String.format(msgFormat1, finalI, Thread.currentThread().getName()));
                threadNames.add(Thread.currentThread().getName());
            } );
        }
        Thread.sleep(2000);

        System.out.println();
        System.out.println( String.format(msgFormat2,threadNames.size()));
        System.out.println( String.format(msgFormat3,threadNames));



    }
}
