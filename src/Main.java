import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        list.add(new Person("Алексей", "Иванов Нечаев", 40));
        list.add(new Person("Иван", "Николаев ", 30));
        list.add(new Person("Николай", "Петров сын Иосифа", 30));
        list.add(new Person("Петр", "Максимов", 50));
        list.add(new Person("Максим", "Алексеевич, рожденный под счастливой звездой", 11));

        int wordsNumber = 2;

        System.out.println("Оригинальный список: " + list);

        list.sort((o2, o1) -> {
            int o1SurnameLenght = o1.getSurname().split("(?U)\\W").length;
            int o2SurnameLenght = o2.getSurname().split("(?U)\\W").length;
            if ((o1SurnameLenght >= wordsNumber) & (o2SurnameLenght >= wordsNumber)) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            if (o1SurnameLenght == o2SurnameLenght) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            return o1SurnameLenght > o2SurnameLenght ? 1 : -1;
        });


        System.out.println("Отсортированный список: " + list);
    }
}