package entities;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private double height;
    private int age;

    public Person(String name, Double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return Double.compare(height, person.height) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(height);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Person:" + "name= " + name + ", height = " + height +", age = " + age + "\n\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.age, person.getAge());
    }
}
