package part_1.p5.Template_Method;

public class TemplateMethod {

    public static void main() {
        System.out.println("========= Template Method Pattern =========");

        var task = new TransferMoneyTask();
        task.execute();
    }

}
