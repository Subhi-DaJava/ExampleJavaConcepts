package threads_example.copy_on_array_list.copyonwritearraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Java will, therefore, protect you by throwing a ConcurrentModificationException when you're looping through a list.
 * Looping through a list involves using an iterator, which is the same as calling iterator() on a list directly.
 * Since this iterator protects you from yourself, it is known as a fail-fast iterator.
 */
public class ReadRemoveEltArray {

    public static void main(String[] args) throws InterruptedException {
       List<Double> getDoubleNumber =  new ArrayList<>(Arrays.asList(2.5D, 3.5D, 4.1D, 6.8D)); // 4.225 but

        Thread thread1 = new Thread(()-> {
            System.out.print("average: ");
            calculateAverage(getDoubleNumber);
        });
        Thread thread2 = new Thread(()-> getDoubleNumber.forEach(elt-> System.out.println("Ele: " + elt)));
        Thread thread3 = new Thread(()-> getDoubleNumber.forEach(getDoubleNumber::remove));

        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
        System.out.println(thread3.getState());

        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(2000);
        System.out.println(getDoubleNumber);

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
