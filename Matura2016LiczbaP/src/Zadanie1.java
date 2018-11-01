
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Andrzej Kierepka
 */
public class Zadanie1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("dane_6_1.txt");
        BufferedReader reader = null;
        FileReader in = null;
        in = new FileReader(file);
        reader = new BufferedReader(in);
        String text;
        String newText="";
        char key=107%26;//klucz
        while ((text = reader.readLine()) != null) {
            for(int i=0;i<text.length();i++){
                char sign= (char) (text.charAt(i)+key);//kodowanie znaku
                if(sign>90){// jeżeli zakodowany znak przekroczył watośc 90 tj jesteśmy poza znakiem z
                    sign=(char) (sign-26);//przesuń o 26
                }
                newText+=sign;
            }
            System.out.println(newText);
            newText="";
        }
    }
}
