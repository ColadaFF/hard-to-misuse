package com.example.demo.model;

import java.util.Objects;

public class Person {
    private ShortString name;
    private ShortString lastname;
    private String id;
    private long birthday;

    public Person() {
    }

    public ShortString getName() {
        return name;
    }

    public void setName(ShortString name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthday == person.birthday && Objects.equals(name, person.name) && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, birthday);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public ShortString getLastname() {
        return lastname;
    }

    public void setLastname(ShortString lastname) {
        this.lastname = lastname;
    }
}
