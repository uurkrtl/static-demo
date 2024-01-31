package net.ugurkartal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StaticDemo demo1 = new StaticDemo();
        StaticDemo demo2 = new StaticDemo();
        StaticDemo demo3 = new StaticDemo();
        StaticDemo demo4 = new StaticDemo();

        demo1.incrementInstanceCount();
        StaticDemo.incrementTotalCount();

        demo2.incrementInstanceCount();
        StaticDemo.incrementTotalCount();

        demo3.incrementInstanceCount();
        StaticDemo.incrementTotalCount();

        demo4.incrementInstanceCount();
        StaticDemo.incrementTotalCount();

        System.out.println(demo4);
    }
}