package javaIO;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Vous avez constaté que les objets du package java.io traitaient les données par octets.
 * Les objets du package java.nio, eux, les traitent par blocs de données : la lecture est donc accélérée !
 * Tout repose sur deux objets de ce nouveau package : les channels et les buffers.
 * Les channels sont en fait des flux, tout comme dans l'ancien package,
 * mais ils sont amenés à travailler avec un buffer dont vous définissez la taille. Pour simplifier au maximum,
 * lorsque vous ouvrez un flux vers un fichier avec un objetFileInputStream, vous pouvez récupérer un canal vers ce fichier.
 * Celui-ci, combiné à un buffer, vous permettra de lire votre fichier encore plus vite qu'avec un BufferedInputStream!
 */
public class FileInputStream_NIO {
    public static void main(String[] args) {
        FileInputStream fis;
        BufferedInputStream bis;
        FileChannel fc;

        try{
            // Création des objets
            fis = new FileInputStream("dictionnaire.txt");
            bis = new BufferedInputStream(fis);
            // Démarrage du chrono
            long time = System.currentTimeMillis();
            // Lecture
            while (bis.read() != -1);
            //Temps d'exécution
            System.out.println("Temps d'exécution avec un buffer conventionnel :  " + (System.currentTimeMillis() - time ));

            // Création d'un nouveau flux de fichier
            fis = new FileInputStream("dictionnaire.txt");
            // On récupère le canal
            fc = fis.getChannel();
            // On en déduit la taille
            int size = (int) fc.size();
            // On crée n buffer correspondant à la taille du fichier
            ByteBuffer bBuff = ByteBuffer.allocate(size);

            // Démarrage du chrono
            time = System.currentTimeMillis();
            // Démarrage de la lecture
            fc.read(bBuff);
            // On prépare à la lecture avec l'appel à flip
            bBuff.flip();
            // Affichage du temps d'exécution
            System.out.println("Temps d'exécution avec un nouveau buffer : " + (System.currentTimeMillis() - time ));

            // Puisque nous avons utilisé un buffer de byte afin de récupérer les données.
            // Nous pouvons utiliser un tableau de byte
            // La méthode array retourne un tableau de byte
            byte[] tabByte = bBuff.array();
            /**
             * Vous constatez que les gains en performance ne sont pas négligeables.
             * Sachez aussi que ce nouveau package est le plus souvent utilisé pour traiter les flux circulant sur les réseaux.
             * Je ne m'attarderai pas sur le sujet, mais une petite présentation est de mise.
             * Ce package offre un buffer par type primitif pour la lecture sur le channel, vous trouverez donc ces classes :
             *
             * IntBuffer;
             *
             * CharBuffer;
             *
             * ShortBuffer;
             *
             * ByteBuffer;
             *
             * DoubleBuffer;
             *
             * FloatBuffer;
             *
             * LongBuffer.
             */
        } catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e){
            e.printStackTrace();
        }

        /*
         finally{
      if(ois != null)ois.close();
      if(oos != null)oos.close();
    }
         */

    }

}
