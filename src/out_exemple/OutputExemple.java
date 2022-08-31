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
        System.out.println(b);
        System.out.println("*********************************************************");
        System.out.println(4*5+" Coding "+4+" is fun "+5+5);

        System.out.println("***************************************  ***********************************************");
        int j = 1;
        for(int ii = 1; ii < 10; ii++){
            if(ii>j){
                System.out.println(ii);
            }
            else{
                System.out.println("Code");
            }
        }

        System.out.println("***************************************** false or true ********************************************************");
        String s1 = ("hello");
        String s3 = "hello";

        String s4 = s1.toUpperCase().toLowerCase();
        String s5 = s3.toUpperCase().toLowerCase();

        System.out.println(s1.equals(s4));
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);

        System.out.println(s4 == s5);


    }
}
