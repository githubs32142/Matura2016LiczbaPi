
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            int tmp=0;
            boolean wrong=false;
            for(int i=0;i<word.length();i++){
                if(i==0){
                    tmp=cipherWors.charAt(i)-word.charAt(i);
                    if(tmp<0){
                        tmp=26+tmp;
                    }
                }
                else{
                    int singCipher=word.charAt(i)+tmp;
                    if(singCipher!=cipherWors.charAt(i)){
                        singCipher=word.charAt(i)-26+tmp;
                        if(singCipher!=cipherWors.charAt(i)){
                            wrong=true;
                            break;
                        }
                    }
                }
                }
                if(wrong==true){
                    System.out.println(word);
                }
        }
    }
}
