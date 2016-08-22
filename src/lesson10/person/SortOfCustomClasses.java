package lesson10.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by home on 16.08.2016.
 */
public class SortOfCustomClasses {

    public static void main(String[] args) {
        ArrayList <Person> persons = new ArrayList<>(Arrays.asList(
           new Person("Vasys", "Pupkin", 40),
           new Person("Vasys", "Pupkin", 43),
           new Person("Vasys", "Pupkin", 23),
           new Person("Vasys", "Pupkin", 23),
           new Person("Vasys", "Pupkin", 56),
           new Person("Vasys", "Pupkin", 56)

        ));

        Collections.sort(persons, (p1, p2) -> p1.age - p2.age);

//        Collections.sort(persons, (p1, p2) ->{
////         if (p1.age !=p2.age)
//
//        });
    }


}


class Person {

    String name;
    String surname;
    int age;

    public Person (String name, String surname, int age){
        this.name=name;
        this.surname=surname;
        this.age=age;

    }

    @Override
    public String toString (){
        return String.format("%s, %s, %d", name, surname, age);
    }

}