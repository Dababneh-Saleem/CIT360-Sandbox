import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.log4j.Logger;


public class AndroidHTTPCommunicationMine {
    
    final static Logger logger = Logger.getLogger
            (AndroidHTTPCommunicationMine.class);
    
  public static void main(String[] args) {
    try {
      URL url = new URL("http://www.byui.edu");
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      String readStream = readStream(con.getInputStream());
      // Give output for the command line
      System.out.println(readStream);
      logger.info("Connection success to "+ url + " - you can continue.");
    } catch (Exception e) {
      e.printStackTrace();
      logger.error("ERROR: - " + e + " - Please contact the administrator for assistance.");
    }

  }

  private static String readStream(InputStream in) {
    StringBuilder sb = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(in));) {
      
      String nextLine = "";
      while ((nextLine = reader.readLine()) != null) {
        sb.append(nextLine);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return sb.toString();
  }
} 