
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
public class Zadanie3 {

   public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("dane_6_3.txt");
        BufferedReader reader = null;
        FileReader in = null;
        in = new FileReader(file);
        reader = new BufferedReader(in);
        String text;
        String newText = "";
        while ((text = reader.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(text);
            String word = st.nextToken();
            String cipherWors = st.nextToken();
            int key=0;// klucz dla kolejnego słowa
            boolean wrong=false;// czy słowo zostało zakodowane z błędem?
            for(int i=0;i<word.length();i++){
                if(i==0){// wydobywanie klucza z 1 litery
                    key=cipherWors.charAt(i)-word.charAt(i);
                    if(key<0){
                        key=26+key;
                    }
                }
                else{
                    int singCipher=word.charAt(i)+key;// zaszyfrowany znak
                    if(singCipher!=cipherWors.charAt(i)){// jeżeli znaki się nie zgadzają 
                        singCipher=word.charAt(i)-26+key;// szyfrowanie uwzględniające zwijanie
                        if(singCipher!=cipherWors.charAt(i)){// jeżeli znaki nadal się nie zgadzają
                            wrong=true;// błąd słowo zakodowane jest błędne
                            break;// zakończ sprawdzanie
                        }
                    }
                }
                }
                if(wrong==true){// jeżeli błąd sprawdznia wypisz
                    System.out.println(word);
                }
        }
    }
}
