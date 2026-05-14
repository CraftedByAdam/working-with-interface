package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add(new Person("Dana", "Wyatt", 63));
        myFamily.add(new Person("Zachary", "Westly", 31));
        myFamily.add(new Person("Elisha", "Aslan", 14));
        myFamily.add(new Person("John", "Herbert", 16));
        myFamily.add(new Person("Brooklyn", "Madison", 9));
        myFamily.add(new Person("Zara", "Nodes", 19));

        Collections.sort(myFamily);

        for (Person person : myFamily) {
            System.out.println(person);
        }
    }
}
