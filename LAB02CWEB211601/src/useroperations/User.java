package useroperations;

public class User {
    private String name;
    private int age;
    private String hobby;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    public void displayInfo(String hobby) {
        displayInfo();
        System.out.println("Hobby: " + hobby);
    }


    public void displayInfo(int yearsToRetirement) {
        displayInfo();
        System.out.println(name + " will retire in: " + yearsToRetirement + ".");
    }


    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}

