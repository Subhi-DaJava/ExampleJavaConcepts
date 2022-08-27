package out_exemple;

/**
 * What will be the output:
 */
public class OutputExemple {
    public static void main(String[] args){
        int i = 5;
        System.out.println("4"+(5+i)+"Code");
        System.out.println("4"+5+i+"Code");

        System.out.println('m' + 'u' + 'k' + 'e' + 'e' + 't'); // 109+117+107+101+101+116 : ASCII value

        int a = 3;
        do {
            if ((a++ % 5) == 0)
                break;
        } while (a++ < 15);

        System.out.println(a);


        System.out.println("********************************************************");

        int b =1;
        b = b++;
        System.out.println(b);

        System.out.println("*********************************************************");
        System.out.println(4*5+" Coding "+4+" is fun "+5+5);


    }

}
