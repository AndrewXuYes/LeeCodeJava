package utils;

import lombok.Data;

@Data
public class User {

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;
}
