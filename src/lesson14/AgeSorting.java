package lesson14;

import java.util.Comparator;

public class AgeSorting implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int result = 0;
        result = o1.getAge() - o2.getAge();
        if (result == 0) {
            result = o1.getFirstName().compareTo(o2.getFirstName());
        }
        return result;
    }
}
