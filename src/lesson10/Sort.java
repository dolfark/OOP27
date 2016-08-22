package lesson10;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by home on 16.08.2016.
 */
public class Sort {
    public static void main(String[] args) {
        Integer[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(array, new CompareDESC());
        System.out.println(Arrays.toString(array));

        String[] arrayStr = {"a", "b", "c"};
        Arrays.sort(arrayStr);
        Arrays.sort(arrayStr, new CompareStringIgnoreCase());
        Arrays.sort(arrayStr);
        System.out.println(Arrays.toString(arrayStr));


    }
}

class CompareDESC implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        }
        return 0;
    }


}

class CompareStringIgnoreCase implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {

        return -o1.compareToIgnoreCase(o2);
    }

}