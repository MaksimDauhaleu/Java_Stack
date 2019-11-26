import java.util.Set;
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Track1", "Lyrics1");
        userMap.put("Track2", "Lyrics2");
        userMap.put("Track3", "Lyrics3");
        
        // Get One
        String song = userMap.get("Track1");
        System.out.println(song);
        System.out.println("***");
        
        

        //Get all
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key + ":" + userMap.get(key));
  
        }
    }
}