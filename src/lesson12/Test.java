package lesson12;

import lesson11.classobject.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
//        arrayList.add("Orange");
//        arrayList.add("Apple");
//        arrayList.add("Mango");

        Person egor2 = new Person("Egor", 18);
        Person olga = new Person("Olga", 25);
        Person egor3 = new Person("Egor", 18);
        Person oleg = new Person("Oleg", 12);

//        arrayList.add(egor2);
//        arrayList.add(olga);
//        arrayList.add(egor3);
//        arrayList.add(oleg);



        HashMap<String, Person> stringPersonHashMap = new HashMap<>();
        stringPersonHashMap.put(egor2.getName(), egor2);
        stringPersonHashMap.put(olga.getName(), olga);
        stringPersonHashMap.put(egor3.getName(), egor3);
        stringPersonHashMap.put(oleg.getName(), oleg);

        System.out.println(stringPersonHashMap);

        for (Map.Entry<String, Person> entry : stringPersonHashMap.entrySet()) {

            var person = new Person(" ", 0);
            entry.setValue(person);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

}
