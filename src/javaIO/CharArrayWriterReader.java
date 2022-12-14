package javaIO;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterReader {
    public static void main(String[] args) {
        CharArrayWriter caw = new CharArrayWriter();
        CharArrayReader car;
        try{
            caw.write("Coucou les Zéros");
            //Appel à la méthode toString de notre objet de manière tacite
            System.out.println(caw);
            //caw.close() n'a aucun effet sur le flux
            //Seul caw.reset() peut tout effacer
            caw.close();

            //On passe un tableau de caractères à l'objet qui va lire le tampon
            car = new CharArrayReader(caw.toCharArray());
            int i;
            //On remet tous les caractères lus dans un String
            String str = "";
            while ((i = car.read()) != -1){
                str += (char)i;
                //System.out.println(str);
            }
            System.out.println(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
