package lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by home on 16.08.2016.
 */
public class ListSorn {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1));
        Collections.sort(list, (e1, e2) -> Integer.compare(e1, e2));
        System.out.println(list);
    }


}
