import java.io.IOException;

import javax.swing.text.html.StyleSheet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main{
    public static void main(String[] arg){
        
        connect();
       
    }

    public static void connect(){
        try{
            Document doc = Jsoup
            .connect("https://www.terasky.com/about/")
            .get();
        
            System.out.println(doc.title());
            
        } catch(IOException e){
            System.out.println("No internet connection");

        }
    }
}