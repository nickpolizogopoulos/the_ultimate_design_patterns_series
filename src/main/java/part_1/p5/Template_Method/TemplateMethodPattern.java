package part_1.p5.Template_Method;

// The Template Method Pattern by GoF.
// To demonstrate the Template Method pattern, this example focuses on a bank transaction.

public class TemplateMethodPattern {

    public static void main() {
        System.out.println("========= Template Method Pattern =========");

        var task = new TransferMoneyTask();
        task.execute();
    }

}
