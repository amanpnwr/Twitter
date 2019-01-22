import java.io.File;
import java.io.FileInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.parser.txt.TXTParser;


public class ParseTextDoc {

	   public static void main(String[] args) throws Exception {
	         
	      //detecting the file type
	      BodyContentHandler handler = new BodyContentHandler();
	      
	      Metadata metadata = new Metadata();
	      FileInputStream inputstream = new FileInputStream(new File(
	         "D:\\Important/abc.txt"));
	      ParseContext pcontext = new ParseContext();

	      //Text document parser
	      TXTParser  TexTParser = new TXTParser();
	      
	      TexTParser.parse(inputstream, handler, metadata,pcontext);
	      System.out.println("Contents of the document:" + handler.toString());
	      System.out.println("Metadata of the document:");
	      String[] metadataNames = metadata.names();

	      for(String name : metadataNames) {
	         System.out.println(name + " : " + metadata.get(name));
	      }
	   }
	}
		
