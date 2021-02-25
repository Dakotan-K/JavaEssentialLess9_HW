package addTask;

import java.util.Objects;

public class Animal {

    String name;
    int age;
    Boolean tail;

    public Animal(String name, int age, Boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        if (tail == true) {
            return "Имя: " + this.name + ", возраст: " + this.age + ", хвост: есть";
        } else {
            return "Имя: " + this.name + ", возраст: " + this.age + ", хвост: нет";
        }
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
