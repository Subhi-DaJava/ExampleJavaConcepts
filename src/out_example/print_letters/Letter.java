package out_example.print_letters;

public class Letter {
    public static void main(String[] args) {
        char letter = 'A';
        char letterMin = 'a';

        while (letter <= 'Z') {
            System.out.print(letter);
            System.out.print(letterMin + " ");
            letter++;
            letterMin++;
        }
        System.out.println();
        System.out.println("After loop letter is : \"" + letter + "\", letterMin is : \"" + letterMin +"\"");
    }
}
