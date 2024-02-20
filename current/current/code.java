package current;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class code {
	public static void Main(String []arg) {
		String text = "This is some <example> text with <multiple> angles.";
        String pattern = "<(.*?)>";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);

        while (m.find()) {
            System.out.println("Found: " + m.group(1));
        }
	}


}
