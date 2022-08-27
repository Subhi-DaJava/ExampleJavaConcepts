package javaIO;

import java.io.*;

/**
 * Vous devez savoir que lorsqu'on veut écrire des objets dans des fichiers, on appelle ça la « sérialisation » :
 * c'est le nom que porte l'action de sauvegarder des objets !
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("************************************* L'objet File **************************************************");
        /**
         * Vous conviendrez que les méthodes de cet objet peuvent s'avérer très utiles !
         * Nous venons d'en essayer quelques-unes et nous avons même listé les sous-fichiers et sous-dossiers de nos lecteurs à la racine du PC.
         *
         * Vous pouvez aussi effacer le fichier grâce la méthodedelete(),
         * créer des répertoires avec la méthodemkdir()(le nom donné à ce répertoire ne pourra cependant pas contenir de point («.»)) etc.
         */
        //Création de l'objet File
        File f = new File("test.txt");
        System.out.println("Chemin absolu du fichier : " +  f.getAbsolutePath());
        System.out.println("Nom du fichier : " + f.getName());
        System.out.println("Est-ce qu'il existe ? " + f.exists());
        System.out.println("Est-ce qu'un répertoire ? " + f.isDirectory());
        System.out.println("Est-ce un ficher ? " + f.isFile());

        System.out.println("Affichage des lecteurs à la racine du PC : ");
        for(File file : f.listRoots()){
            System.out.println(file.getAbsolutePath());
            try {
                int i = 1;
                // On parcourt la liste des fichiers et répertoires
                for(File nom : file.listFiles()){
                    // S'il s'agit d'un dossier, on ajoute un "/"
                    System.out.print("\t\t" + ((nom.isDirectory()) ? nom.getName() + "/" : nom.getName()));

                    if(i%4==0){
                        System.out.print("\n");
                    }
                    i++;
                }
                System.out.println("\n");
            }catch (NullPointerException e){
                // L'instruction peut générer une NullPointerException
                // S'il n'y a pas de sous-fichier
            }
        }

        System.out.println("******************************** Les objets FileInputStream et FileOutputStream ******************************************** ");
        // Nous déclarons nos objets en dehors du bloc try/catch
        FileInputStream fis = null;
        /**
         * Pour que l'objetFileInputStreamfonctionne, le fichier doit exister
         * ! Sinon l'exceptionFileNotFoundExceptionest levée.
         * Par contre, si vous ouvrez un flux en écriture (FileOutputStream) vers un fichier inexistant,
         * celui-ci sera créé automatiquement !
         */
        FileOutputStream fos = null;

        try {
            // On instancie nos objets :
            // fis va lire le fichier
            // fos écrire dans le nouveau !
            fis = new FileInputStream("test.txt");
            fos = new FileOutputStream("test2.txt");

            // On crée un tableau de byte pour indiquer le nombre de bytes lus à chaque tour de boucle
            /*
            Les objets que nous venons d'utiliser emploient la première version d'UNICODE 1 qui ne comprend pas
            les caractères accentués, c'est pourquoi ces caractères ont un code décimal négatif dans notre fichier.
            Lorsque nous définissons un tableau debyte à 8 entrées, cela signifie que nous allons lire 8 octets à la fois.
             */
            byte[] buf = new byte[8];

            // On crée une variable de type int pour y affecter le résultat de la lecture
            // Vaut -1 quand c'est fini
            int n = 0;

            // Tant que l'affectation dans la variable est possible, on boucle
            // Lorsque la lecture du fichier est terminée l'affectation n'est plus possible
            // On sort donc de la boucle
            while((n = fis.read(buf)) >= 0){
                //On écrit dans notre deuxième fichier avec l'objet adéquat
                fos.write(buf);
                // On affiche ce qu'a lu notre boucle au format byte et au format character
                for(byte bit : buf){
                    System.out.print("\t" + bit + "(" + (char) bit + ")");
                }
                System.out.println();
                // Nous réinitialisons le buffer à vide
                // au cas où les derniers byte lus ne soient pas un multiple de 8
                // Ceci permet d'avoir un buffer vierge à chaque lecture et ne pas avoir de doublon en fin de fichier
                buf = new byte[8];
                System.out.println("La valeur de n dana la boucle est égale = " + n);
            }
            System.out.println("La valeur de n actuelle à la sortie de la boucle est égale = " + n);
            System.out.println("Copie terminée !");

        } catch (FileNotFoundException e) {
            // Cette exception est levée si l'objet FileInputStream ne trouve aucun fichier
            e.printStackTrace();
        } catch (IOException e) {
            // Celle-ci se produit lors d'une erreur d'écriture ou de lecture
            e.printStackTrace();
        }
        /*
        En effet, les objets utilisent des ressources de votre ordinateur que Java ne peut pas libérer de lui-même,
        vous devez être sûr que la vanne est fermée ! Ainsi, même si une exception est levée, le contenu du blocfinallysera exécuté et nos ressources seront libérées.
         */
        finally {
            // On ferme nos flux de données dans un bloc finally pour s'assurer
            // que ces instructions seront exécutées dans tous les cas même si une exception est levée !
            try {
                if( fis != null){
                    fis.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
            try {
                if(fos != null){
                    fos.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        System.out.println("******************************************* Les objets FilterInputStream et FilterOutputStream **************************************************");
        System.out.println("========================= Test de lecture FileInputStream et BufferedInputStream ========================");
        // Nous déclarons nos objets en dehors du bloc try/catch
        FileInputStream newFis = null;
        BufferedInputStream bis = null;

        try {
            newFis = new FileInputStream("dictionnaire.txt");
            bis = new BufferedInputStream(new FileInputStream("dictionnaire.txt"));

            byte[] newBuf = new byte[8];

            // On récupère le temps du système
            long startTime = System.currentTimeMillis();
            // Inutile d'effectuer des traitements dans notre boucle (
            while (newFis.read(newBuf) != -1);
            // On affiche le temps d'exécution
            System.out.println("Temps de lecture avec FileInputStream : " + (System.currentTimeMillis() - startTime));

            // On réinitialise
            startTime = System.currentTimeMillis();
            // Inutile d'effectuer des traitements dans notre boucle (
            while (bis.read(newBuf) != -1);
            // on réaffiche
            System.out.println("Temps de lecture avec BufferedInputStream : " + (System.currentTimeMillis() - startTime));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
        // On ferme nos flux de données
        finally {
            // On ferme nos flux de données dans un bloc finally pour s'assurer
            // que ces instructions seront exécutées dans tous les cas même si une exception est levée !
            try{
                if( newFis != null){
                    newFis.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
            try {
                if(bis != null){
                   bis.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        System.out.println("******************************************* Les objets FilterInputStream et FilterOutputStream **************************************************");
        System.out.println("========================= Test de lecture et d'écriture FileInput/OutputSteam et BufferedInput/OutputStream ========================");

        // Nous déclarons nos objets en dehors du bloc try/catch
        FileInputStream testFis = null;
        FileOutputStream testFos = null;
        BufferedInputStream testBis = null;
        BufferedOutputStream testBos = null;
        try {
            testFis = new FileInputStream("dictionnaire.txt");
            testFos = new FileOutputStream("testFos.txt");
            testBis = new BufferedInputStream(new FileInputStream("dictionnaire.txt"));
            testBos = new BufferedOutputStream(new FileOutputStream("testBos.txt"));

            byte[] testBuf = new byte[8];

            // On récupère le temps du système
            long startTime = System.currentTimeMillis();
            // Inutile d'effectuer des traitements dans notre boucle (
            while (testFis.read(testBuf) != -1){
                testFos.write(testBuf);
            }
            // On affiche le temps d'exécution
            System.out.println("Temps de lecture + écriture avec FileInputStream et FileOutputStream: "
                    + (System.currentTimeMillis() - startTime));

            // On réinitialise
            startTime = System.currentTimeMillis();
            // Inutile d'effectuer des traitements dans notre boucle (
            while (testBis.read(testBuf) != -1){
                testBos.write(testBuf);
            }
            // on réaffiche
            System.out.println("Temps de lecture + écriture avec BufferedInputStream et BufferedOutputStream: "
                    + (System.currentTimeMillis() - startTime));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // On ferme nos flux de données
        finally {
            // On ferme nos flux de données dans un bloc finally pour s'assurer
            // que ces instructions seront exécutées dans tous les cas même si une exception est levée !
            try{
                if( testFis != null){
                    testFis.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
            try {
                if(testBis != null){
                    testBis.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
            try{
                if(testFos != null){
                    testFos.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
            try {
                if(testBos != null){
                    testBos.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        /**
         * Je ne vais pas passer en revue tous les objets cités un peu plus haut, mais vu que vous risquez d’avoir besoin
         * des objetsData(Input/Output)Stream, nous allons les aborder rapidement, puisqu'ils s'utilisent comme les objetsBufferedInputStream.
         * Je vous ai dit plus haut que ceux-ci ont des méthodes de lecture pour chaque type primitif :
         * il faut cependant que le fichier soit généré par le biais d'unDataOutputStreampour que les méthodes fonctionnent correctement.
         */
        System.out.println("************************************* Data(Input/Output)Stream *************************************************");

        DataInputStream dis = null;
        DataOutputStream dos = null;
        try{
            dos = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("sdz.txt")));


            // Nous allons écrire chaque type primitif :
            dos.writeBoolean(true);
            dos.writeByte(100);
            dos.writeChar('C');
            dos.writeDouble(12.05);
            dos.writeFloat(100.23f);
            dos.writeInt(3056);
            dos.writeLong(4552233112233L);
            dos.writeShort(2);
            dos.close();

            // On récupère maintenant les données !
            dis = new DataInputStream(
                    new BufferedInputStream(
                        new FileInputStream("sdz.txt")));

            System.out.println(dis.readBoolean());
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            System.out.println(dis.readFloat());
            System.out.println(dis.readInt());
            System.out.println(dis.readLong());
            System.out.println(dis.readShort());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
        finally {
            try{
                if(dis != null){
                    dis.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                if(dos != null){
                    dos.close();

                }
            } catch (IOException e){
                e.printStackTrace();
            }

        }
        /**
         * Le code est simple, clair et concis. Vous avez pu constater que ce type d'objet ne manque pas de fonctionnalités !
         * Jusqu'ici, nous ne travaillions qu'avec des types primitifs, mais il est également possible de travailler avec des objets !
         *
         * Vous devez savoir que lorsqu'on veut écrire des objets dans des fichiers, on appelle ça la « sérialisation » :
         * c'est le nom que porte l'action de sauvegarder des objets !
         */

        System.out.println("******************************************* Les objets ObjectInputStream et ObjectOutputStream *************************************************************");

        ObjectInputStream ois;
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("game.txt")));
            // Nous allons écrire chaque objet Game dans le fichier
            oos.writeObject(new Game("Assassin", "Aventure", 50.89));
            oos.writeObject(new Game("Tomb Raider", "Plateforme", 30.89));
            oos.writeObject(new Game("Tetris", "Stratégie", 5.89));
            oos.writeObject(new Game("Maria", "Aventure", 23.89));
            //Ne pas oublier de fermer le flux
            oos.close();

            // On récupère maintenant les données
            ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("game.txt")));

            try {
                System.out.println("Affichage des jeux :");
                System.out.println("******************************\n");
                System.out.println(ois.readObject().toString());
                System.out.println(ois.readObject().toString());
                System.out.println(ois.readObject().toString());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            ois.close();
        }


        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
