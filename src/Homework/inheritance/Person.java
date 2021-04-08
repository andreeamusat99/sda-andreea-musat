package Homework.inheritance;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String name;

    public Person(String name) {
            this.name = name;

        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nume='" + name + '\'' +
                '}';
    }
}