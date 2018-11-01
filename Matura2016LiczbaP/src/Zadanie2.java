
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
/**
 *
 * @author Admin
 */
public class Zadanie2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("dane_6_2.txt");
        BufferedReader reader = null;
        FileReader in = null;
        in = new FileReader(file);
        reader = new BufferedReader(in);
        String text;
        String newText = "";
        while ((text = reader.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(text);
            String code = st.nextToken();
            String newCode = "";
            String number = st.nextToken();
            int key= Integer.parseInt(number)%26;
            for (int i = 0; i < code.length(); i++) {
                int sign = (int) (code.charAt(i)-key);
                
                if(sign < 65) {
                    sign =  (sign + 26);
                }
                newText += (char)sign;
            }

            System.out.println(newText);
            newText = "";
        }
    }

}
