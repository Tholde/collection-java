package Personne;

import java.util.List;

public class Personne {
    int persCode;
    String name;
    int age;

    @Override
    public String toString() {
        return STR."ID: \{persCode}\nName: \{name}\nAge: \{age}";
    }

    public int getPersCode() {
        return persCode;
    }

    public void setPersCode(int persCode) {
        this.persCode = persCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
