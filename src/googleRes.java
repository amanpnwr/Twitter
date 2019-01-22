import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlParagraph;

public class googleRes {

  public static void main(String[] args) throws FailingHttpStatusCodeException,MalformedURLException, IOException {
WebClient webClient = new WebClient(BrowserVersion.CHROME);
webClient.getOptions().setJavaScriptEnabled(false);
   HtmlPage page = webClient.getPage("https://twitter.com/dtptraffic");
List<?> text = page.getByXPath("//*[@id=\"stream-item-tweet-1085467746601705472\"]/div[1]/div[2]/div[1]/small");

    System.out.println(text);


//for (Object obj : text) {
	//HtmlParagraph a = (HtmlParagraph) obj;
   // System.out.println(a.getTextContent());
    
    }
  }
//} 

	
	







