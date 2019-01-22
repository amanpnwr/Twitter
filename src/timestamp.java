import java.util.Calendar;
import java.util.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

	
public class timestamp {
	public static void main( String[] args ){
ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
ses.scheduleAtFixedRate(new Runnable() {
    @Override
    public void run() {
    	epoch();
    	
        
    }
}, 0, 5, TimeUnit.SECONDS);


}

	protected static void epoch() {
		
		 long epoch = 1547696778;
		    DateFormat formatter = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
		    Calendar calendar = Calendar.getInstance();
		    calendar.setTimeInMillis(epoch * 1000);
		    System.out.println("Formatted Date:" + formatter.format(calendar.getTime()));
		
	}
}