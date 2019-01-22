package Twitter;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Schedule {

   public static void main(String[] args) {

       ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

      // TwitterChennai clock1 = new TwitterChennai();
    //   TwitterKolkata clock2 = new TwitterKolkata();
    //   TwitterDelhi clock3 = new TwitterDelhi();
         epoch clock4= new epoch();

    //   scheduler.scheduleWithFixedDelay(clock1, 3, 10, TimeUnit.MINUTES);
     //  scheduler.scheduleWithFixedDelay(clock2, 3, 15, TimeUnit.MINUTES);
    //   scheduler.scheduleWithFixedDelay(clock3, 3, 20, TimeUnit.MINUTES);
         scheduler.scheduleWithFixedDelay(clock4, 0, 1, TimeUnit.MINUTES);

   }
}

/*  scheduler = newScheduledThreadPool();
    scheduler.scheduleWithFixedDelay(task1, initialDelayTime1, periodicDelayTime1, timeUnit);
    scheduler.scheduleWithFixedDelay(task2, initialDelayTime2, periodicDelayTime2, timeUnit);
    scheduler.scheduleWithFixedDelay(task3, initialDelayTime3, periodicDelayTime3, timeUnit);
*/