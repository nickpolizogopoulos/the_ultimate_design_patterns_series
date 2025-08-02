package app.web.nickpolizogopoulos;

public class User {

    public User(String name) {
        this.name = name;
    }

    // Fields (attributes)
    public String name;

    // Methods
    public void sayHello() {
        System.out.println("Hi, my name is " + name);
    }
}
