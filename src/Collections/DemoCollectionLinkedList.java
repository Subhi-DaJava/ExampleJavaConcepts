package Collections;

import java.util.*;

public class DemoCollectionLinkedList {
    public static void main(String[] args) {
        List l = new LinkedList();

        l.add(12);
        l.add("toto !!");
        l.add(12.20f);

        for (int i= 0; i < l.size(); i++){
            System.out.println("Élément à l'index  " + i + " = " + l.get(i) );
        }

        System.out.println("\n \tParcours avec un itérateur ");
        System.out.println("-------------------------------------");

        ListIterator listIterator = l.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("---------------------------------------------------------------");

        ArrayList al = new ArrayList();
        al.add(12);
        al.add("Une chaîne de caractères !");
        al.add(12.20f);
        al.add('d');

        for(int i = 0; i < al.size(); i++)
        {
            System.out.println("donnée à l'indice " + i + " = " + al.get(i));
        }

        System.out.println("--------------------------------------------------------------");
        Hashtable ht = new Hashtable();
        ht.put(1, "printemps");
        ht.put(10, "été");
        ht.put(12, "automne");
        ht.put(45, "hiver");

        Enumeration e = ht.elements();

        while(e.hasMoreElements())
            System.out.println(e.nextElement());

        System.out.println("-------------------------------------------------------------");

        HashSet hs = new HashSet();
        hs.add("toto");
        hs.add(12);
        hs.add('d');

        Iterator it = hs.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        System.out.println("\nParcours avec un tableau d'objet");
        System.out.println("-----------------------------------");

        Object[] obj = hs.toArray();
        for(Object o : obj)
            System.out.println(o);
    }
}
