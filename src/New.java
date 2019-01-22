import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.*; 
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.FileInputStream;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;




public class New extends TimerTask {

    @Override
    public void run() {
        System.out.println("Timer task started at:"+new Date());
        completeTask();
        System.out.println("Timer task finished at:"+new Date());
    }

    private void completeTask() {
        try {
            //assuming it takes 20 secs to complete the task
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]){
        TimerTask timerTask = new New();
        //running timer task as daemon thread
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10*1000);
        System.out.println("TimerTask started");
        //cancel after sometime
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask cancelled");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}




 /*    public class New {

	 public static void main(String args[]) {

			 Document doc1;
			try {
				
				doc1 = Jsoup.connect("https://twitter.com/dtptraffic").get();
			
			 Elements links = doc1.getElementsByTag("a");
			 Set<String> set = new HashSet<String>();
			 for (Element link : links) {
			     String linkHref = link.attr("href");
			     if(linkHref.contains("https://t.co")){
			         set.add(linkHref);
			         System.out.print("Link: " + linkHref + "\n");
			 
			     }
			// Elements text = doc1.select("p[class=TweetTextSize TweetTextSize--normal js-tweet-text tweet-text]");
			 
			// String Alert = doc1.getElementsByClass("TweetTextSize TweetTextSize--normal js-tweet-text tweet-text").text();
			// System.out.println("price : " + Alert);
			 
			//   for(int i=0; i<text.size();i++)
			//   System.out.println(text.get(i).text());
			        
			 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 }

*/


//  Elements tweet = document.getElementsByAttributeValue("data-user-id","143766231");
//   Elements tweet = document.getElementsByClass("time");
//   Elements tweet = document.getElementsByAttribute("data-time");
//  Elements tweet = document.getElementsByClass("_timestamp js-short-timestamp js-relative-timestamp");
 //   for (Element ans : tweet) {
//     System.out.println("Ans: " + ans.text());



/*   class New{
   
	   public static void main(String[] args)throws Exception {

	      XWPFDocument docx = new XWPFDocument(new FileInputStream("Sample.docx"));
	      
	      //using XWPFWordExtractor Class
	      XWPFWordExtractor we = new XWPFWordExtractor(docx);
	      System.out.println(we.getText());
	   }
	}


Elements links = doc.getElementsByTag("a");
Set<String> set = new HashSet<String>();
for (Element link : links) {
    String linkHref = link.attr("href");
    if(linkHref.contains("/blog/")){
        set.add(linkHref);
        System.out.print("Link: " + linkHref + "\n");
    }
}



*/




/*  public class New{
	
	    public static void main(String[] args) {
	        File imageFile = new File("D:\\Important/handwritten.png");
	    //    Tesseract instance = Tesseract.getInstance(); // JNA Interface Mapping
	        Tesseract instance = new Tesseract(); // JNA Direct Mapping

	        try {
	            String result = instance.doOCR(imageFile);
	            System.out.println(result);
	        } catch (TesseractException e) {
	            System.err.println(e.getMessage());
	        }
	    }
} */
	
  /*public static void main(String[] args) {
    try {
        Document doc = Jsoup.connect("https://twitter.com/dtptraffic").get();
        Elements trs = doc.select("td.class=\"line-content\"");

      
        trs.remove(0);

        for (Element tr : trs) {
            Elements tds = tr.getElementsByTag("td");
            Element td = tds.first();
            System.out.println("Blog: " + td.text());
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}

/* String title=null;
	try {
		Document doc = Jsoup.connect("https://twitter.com/dtptraffic").get();
		 title = doc.title();
		} 
	catch (IOException e)
	{ 
		e.printStackTrace(); 
		}

	System.out.println("title : " + title); 	
}  


	// public static void main( String[] args )
	{
	    String url = "https://twitter.com/dtptraffic";

	    Document document;
	    try {
	        document = Jsoup.connect(url).get();
	        Elements paragraphs = document.select("p");

	        Element firstParagraph = paragraphs.first();
	        Element lastParagraph = paragraphs.last();
	        Element p;
	        int i=1;
	        p=firstParagraph;
	        System.out.println("*  " +p.text());
	        while (p!=lastParagraph){
	            p=paragraphs.get(i);
	            System.out.println("*  " +p.text());
	            i++;
	        } 
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	}
}
} 



String url = "https://twitter.com/dtptraffic";
Document doc;
try {
	doc = Jsoup.connect(url).get();
	String title = doc.title();
	System.out.println("title is: " + title);  
	String traffic = doc.select("[class=TweetTextSize TweetTextSize--normal js-tweet-text tweet-text]").text();
	System.out.println("traffic is: " + traffic);
} 
catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	 }
	 } */



/* try {
	Document doc = Jsoup.connect("https://twitter.com/dtptraffic").get();
	Elements elements = doc.select("td.line-content");

	for (Element element : elements) {
	   
	        System.out.println(element.text());
	        System.out.println();
	  
	}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}  */

/*public static void main(String[] args) throws FailingHttpStatusCodeException,
MalformedURLException, IOException {
WebClient webClient = new WebClient(BrowserVersion.CHROME);
webClient.getOptions().setJavaScriptEnabled(false);
HtmlPage page = (HtmlPage) webClient.getPage("https://twitter.com/dtptraffic");
String pageContent=page.asText();
System.out.println(pageContent);
}*/

/*public static void main(String[] args) throws FailingHttpStatusCodeException,
MalformedURLException, IOException {
WebClient webClient = new WebClient(BrowserVersion.CHROME);
webClient.getOptions().setJavaScriptEnabled(false);
//WebClient webClient = new WebClient();
HtmlPage currentPage = webClient.getPage("https://twitter.com/dtptraffic");
HtmlImage imgElement = (HtmlImage)currentPage.getHtmlElementById("div");
System.out.println(imgElement.getAttribute("Traffic Alert"));
}
}*/


/*public static void main(String[] args) throws FailingHttpStatusCodeException,
MalformedURLException, IOException {
WebClient webClient = new WebClient(BrowserVersion.CHROME);
webClient.getOptions().setJavaScriptEnabled(false);

HtmlPage currentPage = 
webClient.getPage("https://twitter.com/dtptraffic");

//Using XPath to get the first result in Google query
HtmlElement element = (HtmlElement)currentPage.getByXPath("//h3").get(0);
DomNode result = element.getChildNodes().get(0);
System.out.println(result);
}
} */
