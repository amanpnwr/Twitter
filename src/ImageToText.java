import net.sourceforge.tess4j.*;
import java.io.*;

public class ImageToText {
    public String getImgText(String imageLocation) {
      ITesseract instance = new Tesseract();
      try 
      {
         String imgText = instance.doOCR(new File(imageLocation));
         return imgText;
      } 
      catch (TesseractException e) 
      {
         e.getMessage();
         return "Error while reading image";
      }
   }
   public static void main ( String[] args)
   {
	   ImageToText Img = new ImageToText();
	     System.out.println(Img.getImgText("D:\\Important/Twitter.jpg"));
	 //  System.out.println(Img.getImgText("D:\\Important/ChennaiTP.jpg"));
	//   System.out.println(Img.getImgText("D:\\Important/Advisory.jpg"));
	  // System.out.println(Img.getImgText("D:\\Important/KolkataTraffic.jpg"));
	 //  System.out.println(Img.getImgText("D:\\Important/computer-vision.jpg"));
	//   System.out.println(Img.getImgText("D:\\Important/road.jpg"));
	//   System.out.println(Img.getImgText("D:\\Important/road-sign1.jpg"));
	 //  System.out.println(Img.getImgText("D:\\Important/receipt.png"));
	   //System.out.println(Img.getImgText("D:\\Important/test.png"));
	  // System.out.println(Img.getImgText("D:\\Important/Chapter1.png"));
	  // System.out.println(Img.getImgText("D:\\Important/eng.png"));
      // System.out.println(Img.getImgText("D:\\Important/DelhiTraffic.jpg"));
	  // System.out.println(Img.getImgText("D:\\Important/Text.png"));
	  // System.out.println(Img.getImgText("D:\\Important/Default.jpg"));
	 //  System.out.println(Img.getImgText("D:\\Important/handwritten.png"));
	 //  System.out.println(Img.getImgText("D:\\Important/D.jpg"));
	    
    }
}