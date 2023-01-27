package array_notion.for_each_loop;

/**
 * The for-each loop has some limitations. First of all, you cannot use it if you want to modify an array,
 * because the variable we use for iterations doesn't store the array element itself,
 * only its copy. It is also impossible to obtain an element by its index since we have no index.
 * Finally, as is clear from the name, we cannot move through an array with more than one step per iteration: we iterate over each and every element,
 * so we work with them one by one.
 */
public class ForEachLoop {
    public static void main(String[] args) {
        char[] characters = { 'a', 'b', 'c', 'a', 'b', 'c', 'a' };

        int counter = 0;
        for (char ch : characters) {
            if (ch == 'a') {
                counter++;
            }
        }

        System.out.println(counter); // it outputs "3"

        System.out.println("with for loop");

        char[] charactersFor = {'a', 'b', 'c', 'a', 'b', 'c', 'a'};

        int counterFor = 0;
        for (int i = 0; i < charactersFor.length; i++) {
            if (charactersFor[i] == 'a') {
                counterFor++;
            }
        }

        System.out.println(counterFor); // it outputs "3"
    }
}
