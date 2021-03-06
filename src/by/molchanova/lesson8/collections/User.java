package by.molchanova.lesson8.collections;

import java.util.*;

public class User {
    String name;
    String passportNumber;
    Integer age;

    public User(String name, String passportNumber, Integer age) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        User user = (User) o;

        if (!getPassportNumber().equals(user.getPassportNumber()))
            return false;
        return getAge().equals(user.getAge());
    }
//
//    @Override
//    public int hashCode() {
//        int result = 31 * getPassportNumber().hashCode();
//        result = 31 * result + getAge().hashCode();
//        return result;
//    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return name.equals(user.name) &&
//                Objects.equals(passportNumber, user.passportNumber) &&
//                Objects.equals(age, user.age);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passportNumber, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} \n";
    }

    public String getInformation() {
        return "name " + name + ", age" + age;
    }
}
