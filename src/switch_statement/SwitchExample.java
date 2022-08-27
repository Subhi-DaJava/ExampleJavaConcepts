package switch_statement;

public class SwitchExample {
    public static void main(String[] args) {
        int a = 97;
        switch (a){
            case 'a'|'b': System.out.println("got a or b");
            case ' ': System.out.print("got empty space");

        }
    }
}
