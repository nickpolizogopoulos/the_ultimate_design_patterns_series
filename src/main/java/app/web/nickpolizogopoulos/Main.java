package app.web.nickpolizogopoulos;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - 1992;

        User user = new User("Nick", age);
//        user.name = "Nick";
//        System.out.println(user.name);
        user.sayHello();

        System.out.println("-----------------------------");

        TaxCalculator calculator = getCalculator();
        double tax = calculator.calculateTax();
        System.out.println("Tax: " + tax);

        System.out.println("-----------------------------");

        var account = new Account();
        account.deposit(500);
        account.withdraw(100);
        var balance = account.getBalance();
        System.out.println("Balance: " + balance);

        System.out.println("-----------------------------");
        System.out.println("Abstraction Lesson:");

        MailService mailService = new MailService();
        mailService.sendEmail();

        System.out.println("-----------------------------");
        System.out.println("Inheritance Lesson:");

        TextBox textBox = new TextBox();
        System.out.print("TextBox ");
        textBox.setPosition(10, 20);

        System.out.println("-----------------------------");
        System.out.println("Polymorphism Lesson:");

        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());

    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2025();
    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }

}