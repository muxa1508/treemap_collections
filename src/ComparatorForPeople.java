public class ComparatorForPeople implements java.util.Comparator<Person> {

    protected int wordsNumber;
public ComparatorForPeople(int wordsNumber) {
    this.wordsNumber = wordsNumber;
}
    @Override
    public int compare(Person o2, Person o1) {

        int o1SurnameLenght = o1.getSurname().split(" ").length;
        int o2SurnameLenght = o2.getSurname().split(" ").length;
        if ((o1SurnameLenght >= wordsNumber) &(o2SurnameLenght >= wordsNumber)) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        if (o1SurnameLenght == o2SurnameLenght) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return o1SurnameLenght > o2SurnameLenght ?  1 : -1;

//        if (o1SurnameLenght > o2SurnameLenght) {
//            return 1;
//        } else if (o1SurnameLenght < o2SurnameLenght) {
//            return -1;
//        } else {return 0;}
    }
}
