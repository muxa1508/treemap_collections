import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        list.add(new Person("Алексей", "Иванов Нечаев", 40));
        list.add(new Person("Иван", "Николаев ", 30));
        list.add(new Person("Николай", "Петров сын Иосифа", 16));
        list.add(new Person("Петр", "Максимов", 50));
        list.add(new Person("Максим", "Алексеевич, рожденный под счастливой звездой", 11));

        ComparatorForPeople comp = new ComparatorForPeople(2);

        System.out.println("Оригинальный список: " + list);


//        Predicate<Person> predicate = new Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {
//                return person.getAge() < 18;
//            }
//        };

        list.removeIf(person -> person.getAge() < 18);

        Collections.sort(list, comp);

        System.out.println("Отсортированный список: " + list);
    }
}