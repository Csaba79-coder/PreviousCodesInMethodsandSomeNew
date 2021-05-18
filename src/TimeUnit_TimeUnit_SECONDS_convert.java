import java.util.concurrent.TimeUnit;


public class TimeUnit_TimeUnit_SECONDS_convert {


    // https://mkyong.com/java/java-how-to-convert-system-nanotime-to-seconds/


    public static void main(String[] args) throws InterruptedException {

        long start = System.nanoTime();

        Thread.sleep(5000);

        long end = System.nanoTime();

        long elapsedTime = end - start;

        System.out.println(elapsedTime);

        // 1 second = 1_000_000_000 nano seconds
        double elapsedTimeInSecond = (double) elapsedTime / 1_000_000_000;

        System.out.println(elapsedTimeInSecond + " seconds");

        // TimeUnit
        long convert = TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);

        System.out.println(convert + " seconds");
    }
}
