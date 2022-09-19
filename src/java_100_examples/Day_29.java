package java_100_examples;

/**
 * Problem : Count the frequency of the words and the letters
 * Input : "Str trs str Str"
 * Output : Str= 2, trs=1, str=1 & s=4, r=4 t=4
 * Count and print number of repeated word occurrences in a String
 * Counting & Printing duplicate word occurrences:
 * https://www.benchresources.net/java-8-count-and-print-number-of-repeated-word-occurrences-in-a-text-file/
 * */
public class Day_29 {
    public static void main(String[] args) {
        String strChar = "SherqiyTurkistanSiniSoyimenSenUchunJinimPidaBolsunDeymen!YYY";
        String strWord = "Alma Neshput Uruk Jiniste Shaptul Qoghun Tawuz Anar Xorma Alma Neshput Uruk Jiniste Shaptul Shaptul Qoghun Tawuz Anar Alma Neshput";
        String word[] = strWord.split(" ");
        String[] chars = strChar.split("");

        int countWord = 0;
        int countChar = 0;

        for (int i = 0; i < word.length; i++) {
            countWord = 1; // After each iteration the number of duplicate elements begins from one
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])){
                    countWord += 1;
                    word[j] = "0"; // Assign the duplicate element with "0" and keep one only
                }

            }
            if(countWord >= 1 && word[i] != "0") {
                System.out.print(word[i] + " = " + countWord + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < chars.length; i++) {
            countChar = 1; // After each iteration the number of duplicate characters begins from one
            for (int j = i + 1; j < chars.length; j++) {
                if(chars[i].equals(chars[j])){
                    countChar += 1;
                    chars[j] = "0";
                }
            }
            if(countChar >= 1 && chars[i] != "0") {
                System.out.print(chars[i] + " = " + countChar + " ");
            }
        }

    }
}
