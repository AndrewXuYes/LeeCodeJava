package Utils;

import lombok.Data;

@Data
public class Student {

    int age;
    String name;
    int Stature;

    public Student(String name, int age,int Stature) {
        this.name = name;
        this.age = age;
        this.Stature = Stature;
    }
}
