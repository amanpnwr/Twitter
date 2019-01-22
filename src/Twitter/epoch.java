package Twitter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class epoch implements Runnable {
			//	@Override
				public void run() {
					
					
					String url = "https://twitter.com/dtptraffic";
				    Document document;
					try {
						document = Jsoup.connect(url).get();
					
				    ArrayList<String> Arr = new ArrayList<String>();
				    Elements div = document.select("span[data-time]");
				     for(int i=0;i<div.size();i++)
				     {
				    	String result = (div.get(i).attr("data-time"));
				    	 
//				        System.out.println(div.get(i).attr("data-time"));
				    
				        Arr.add(result);
				        System.out.println(result);
				     }
					
		            Date date= new Date();
				    long time = date.getTime();
				    time = time/1000;
				    System.out.println("Time in seconds: " + time);
				 
				    long T= (time-7200);
				    System.out.println("New Time in seconds: " + T);
				    
				    int count = 0;
				    for (int j = 0; j<Arr.size(); j++)
				      {
				    long Num = Long.valueOf((String) Arr.get(j));
				    
				    if(Num>T)
				      {
				    	System.out.println("Final Value "+Num);
			        	 count++;
				      }
				      }
				    System.out.println(count);		    
					} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
	  }
}  