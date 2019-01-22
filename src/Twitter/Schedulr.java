package Twitter;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Schedulr {
	public static void main( String[] args ){
ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
ses.scheduleAtFixedRate(new Runnable() {
    @Override
    public void run() {
    	try {
    		schedule();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}, 0, 15, TimeUnit.MINUTES);
	}

	private static void schedule()throws IOException {
		String url = "https://twitter.com/dtptraffic";
		 Document document = Jsoup.connect(url).get();
		  
		  long currentTime = System.currentTimeMillis()/1000;

		  long timeDiff = (currentTime-14400);
		  
		  Elements divs = document.getElementsByClass("js-stream-tweet");
		  
		  for (Element element : divs) {
				Elements header = element.getElementsByClass("stream-item-header");
				if(header != null && header.size() > 0) {
					Long timestamp = null;
					Elements timeContainer = header.get(0).getElementsByClass("js-short-timestamp");
					if(timeContainer != null && timeContainer.size() > 0) {
						timestamp = Long.parseLong(timeContainer.get(0).attr("data-time"));
					}
					
					if(timestamp > timeDiff) {
						Elements tweetContainer= element.getElementsByClass("js-tweet-text-container");
						String tweet= null;
						if(tweetContainer!= null && tweetContainer.size() > 0 ) {
							
						 tweet = tweetContainer.get(0).getElementsByTag("p").text();
						 System.out.println(tweet);
						
						}
					}
				}
		  }
	 }     
}
		

