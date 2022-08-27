package tableau_verifier_presence;
import java.util.List;
import java.util.stream.IntStream;

public class ClassA {
    static boolean exists(int[] ints, int k){
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] == k){
                return true;
            }
        }
        return false;
    }
    static boolean checkWithForLoop(int[] ints, int k){
        for(int element : ints){
            if( element == k){
                return true;
            }
        }
        return false;
    }

    static boolean checkWithStream(int[] ints, int k){
        if(IntStream.of(ints).anyMatch( x -> x == k)){
            return true;
        }
        return false;
    }

    static boolean checkWithArrayLists(List<Integer> ints, Integer k){
        if (ints.contains(k)){
            return true;
        }

        return false;
    }



}
