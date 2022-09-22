

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    protected String getName() {
        return name;
    }
    protected String getSurname() {
        return surname;
    }
    protected int getAge() {
        return age;
    }

    protected void setName(String name) {
        this.name = name;
    }
    protected void setSurname(String surname) {
        this.surname = surname;
    }
    protected void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + " " + surname + " " + age + " лет";
    }
}
