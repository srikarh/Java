package counter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WordFrequency {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("Directory Location"); // Put in the path to your text file
		byte[] bytes = Files.readAllBytes(path);
	    String data = new String(bytes);
	    String[] words = data.split("\\s+");
	    Hashtable<String, Integer> uniquewords = new Hashtable<String, Integer>();
	    for(int i = 0; i < words.length; i++) {
	    	if(i == 0) {
	    		uniquewords.put(words[i], 1);
	    	}
	    	else {
	    		if(uniquewords.contains(words[i])) {
	    			int a = uniquewords.get(words[i]);
	    			a += 1;
	    			uniquewords.put(words[i], a);
	    		}
	    		else {
	    			uniquewords.put(words[i], 1);
	    		}
	    	}
	    
	    }
	    for (String key : uniquewords.keySet()) {
	        System.out.println("The frequency of " + key + " is " + uniquewords.get(key));
	    }
	}

}
