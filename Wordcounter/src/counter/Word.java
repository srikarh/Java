package counter;
import java.io.IOException;
import java.nio.file.*;
public class Word {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\geets\\Desktop\\Hello.txt");
		byte[] bytes = Files.readAllBytes(path);
	    String data = new String(bytes);
	    String[] words = data.split("\\s+");
	    //System.out.println(data);
	    int wordlen = 0;
	    int i;
	    int index = 0;
	    for (i = 0; i < words.length; i++) {
	    	if (words[i].length() > wordlen) {
	    		wordlen = words[i].length();
	    		index = i;
	    	}
	    }
	    System.out.println(words[index] + " is the longest word");
	    System.out.println(words.length + " words");
	}

}
