package model;

public class Student {

    // properties of student: name ,age,section
     String name;
     int age;
     String section;


    // parameterized constructor

    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }



    // getter and setter-----from getter we can find out name and
    // from setter we can find out change name which name we want to change

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

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }




}
