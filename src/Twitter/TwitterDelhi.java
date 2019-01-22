package Twitter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Configuration
@PropertySource(value={"classpath:Schedule.properties"})
public class TwitterDelhi {
	
	@Autowired
	private static Environment environment;

	 public static void main(String args[]) throws IOException {
		try {
 		   String url = "https://twitter.com/dtptraffic";
 		   Document document = Jsoup.connect(url).get();
 		    
 		    long currentTime = System.currentTimeMillis()/1000;
 		    
 		    long timeDiff = currentTime-14400;
 		    
 		//    long timeDiff= currentTime-(environment.getRequiredProperty("minustime"));
 		  
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
						 if(tweet.startsWith("Traffic Alert")) {
							 
							 System.out.println(tweet);
						 }
						
						}
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	 }
}
