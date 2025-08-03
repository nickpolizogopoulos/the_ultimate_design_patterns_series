package part_1.java_basics;

public class User {

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Fields (attributes)
    public String name;
    public int age;

    // Methods
    public void sayHello() {
        System.out.println("Hi, my name is " + name + "and I am " + age + " years old.");
    }
}
