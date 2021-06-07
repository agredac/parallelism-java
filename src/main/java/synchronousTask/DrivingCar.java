package synchronousTask;

public class DrivingCar {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        CheckBackMirror checkBackMirror = new CheckBackMirror();
        Accelerating accelerating = new Accelerating();

      //  Thread checkBackThread = new Thread( checkBackMirror);
      //  Thread acceleratingThread = new Thread(accelerating);

      //  acceleratingThread.run();
       // checkBackThread.run();


        checkBackMirror.run();
        accelerating.run();

        long stopTime = System.currentTimeMillis();

        long totalTime = ((stopTime - startTime) / 1000);
        System.out.printf("total time: %o seconds",totalTime);


    }
}
