package threads_example.copy_on_array_list.list_modif;

import java.util.Arrays;
import java.util.List;

/**
 * Java will, therefore, protect you by throwing a ConcurrentModificationException when you're looping through a list.
 * Looping through a list involves using an iterator, which is the same as calling iterator() on a list directly.
 * Since this iterator protects you from yourself, it is known as a fail-fast iterator.
 */
public class AverageCal {
    public static void main(String[] args) {
        List<Double> samples = Arrays.asList(25.4D, 21.3D, 30.17D);
        System.out.println(calculateAverage(samples));
    }
   static Double calculateAverage(List<Double> samples) {
        Double sampleCount = 0.0;
        Double sum = 0.0;
        for (Double sample: samples) {
            sum += sample;
            sampleCount++;
        }
        return sum/sampleCount;
    }
}
