import java.security.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


  public class test {

		public static void main(String[] args) throws Exception {
		    String url = "https://twitter.com/dtptraffic";
		    Document document = Jsoup.connect(url).get();
		    
		    Date date= new Date();
		    long time = date.getTime();
		    time = time/1000;
		    System.out.println("Time in seconds: " + time);
		  
		    long T= (time-7200);
		    System.out.println("New Time in seconds: " + T);

		    ArrayList<String> Arr = new ArrayList<String>();
		    Elements div = document.select("span._timestamp");
		    
		    Element abc= document.select("p.tweet-text").first();
		 //   System.out.println(abc.text());
		    
		     for(int i=0;i<div.size();i++)
		     {
		    	 Element EL = div.get(i);
		    	 Arr.add(EL.attr("data-time"));
		    
		     long Num = Long.valueOf((String) Arr.get(i));
		      {
	 		      if(Num>T)
	 		      {
	 		    	  
	 		    	  System.out.println("Final Value "+Num);
	 		    	  System.out.println(abc.text());
	 		      }
		     }     
  }
  }
  }
		     
		     