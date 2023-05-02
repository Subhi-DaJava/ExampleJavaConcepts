package pseudocode_example;

/**
 * Po decided to glue the Urn of Whispering Warriors. When Po finished the work, the Dragon Warrior put everything in the urn, receiving an array
 * a=[7,1,9,6,10,5,8,2,3,4]
 * . After that, he decided to arrange all the warriors by numbers, calling the function
 * t=5 times. What array will he end up with?   "5, 8, 2, 3, 4, 7, 1, 9, 6, 10"
 *
 * function po(a, t):
 *
 *     for j in [1, t]:
 *         x = a[1]
 *         for i in [1, len(a)-1]:
 *             a[i] = a[i+1]
 *         a[len(a)] = x
 *
 *     for i in [1, len(a)]:
 *         if i == len(a) then:
 *             print(a[i])
 *         else:
 *             print (a[i], ", ")
 *
 *
 * po(a, 5)
 */
public class PseudocodeMain {
    public static void main(String[] args) {
        int[] arr = {7,1,9,6,10,5,8,2,3,4};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        PseudocodeMain.po(arr, 5);
    }
    public static void po(int[] a, int t) {
        for (int j = 1; j <= t; j++) {
            int x = a[0];
            for (int i = 0; i < a.length - 1; i++) {
                a[i] = a[i+1];
            }
            a[a.length-1] = x;
        }

        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }
    }

}
