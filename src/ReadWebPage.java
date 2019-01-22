import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import java.io.IOException;

public class ReadWebPage {

    public static void main(String[] args) throws IOException {
        
        try (WebClient webClient = new WebClient()) {
            
            String url = "https://twitter.com/dtptraffic";
            
            HtmlPage page = webClient.getPage(url);
            WebResponse response = page.getWebResponse();
            String content = response.getContentAsString();
            
            System.out.println(content);
        }
    }
}