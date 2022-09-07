package javaIO;

import java.io.*;

/**
 * Les objets du package java.io traitaient les données par octets
 *  Les objets du package java.nio, eux, les traitent par blocs de données : la lecture est donc accélérée !
 * traiter les fichiers de texte avec des flux de caractères.
 * Depuis le JDK 1.4, un nouveau package a vu le jour, visant à améliorer les performances des flux, buffers,
 * etc. traités par java.io. En effet, vous ignorez probablement que le package que nous explorons depuis le début existe depuis la version 1.1 du JDK.
 * Il était temps d'avoir une remise à niveau afin d'améliorer les résultats obtenus avec les objets traitant les flux. C'est là que le package java.nio a vu le jour !
 */
public class FileWriterReader {
    public static void main(String[] args) {
        File file = new File("testFileWriter");
        FileWriter fw;
        FileReader fr;
        try {
            // Création de l'objet
            fw = new FileWriter(file);
            String str = "Bonjour à tous, amis Zéros ! \n";
            str +=  "\tComment allez-vous ? \n";
            // On écrit la chaîne
            fw.write(str);
            // On ferme le flux
            fw.close();

            // Création de l'objet de lecture
            fr = new FileReader(file);
            str = "";
            int i ;
            // Lecture de données
            while ((i = fr.read()) != -1){
                str += (char)i;
                //System.out.println(str);
            }
            // Affichage de
            System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
