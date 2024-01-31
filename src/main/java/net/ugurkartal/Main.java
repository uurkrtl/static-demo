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
        System.out.println(demo1);

        demo2.incrementInstanceCount();
        StaticDemo.incrementTotalCount();
        System.out.println(demo2);

        demo3.incrementInstanceCount();
        StaticDemo.incrementTotalCount();
        System.out.println(demo3);

        demo4.incrementInstanceCount();
        StaticDemo.incrementTotalCount();
        System.out.println(demo4);

        System.out.println();

        //For Bonus Task:
        System.out.println("3 + 5 = " + Calculator.add(3,5));
        System.out.println("8 - 2 = " + Calculator.subtract(8,2));
        System.out.println("6 / 2 = " + Calculator.divide(6,2));
        System.out.println("2 * 5 = " + Calculator.multiply(2,5));
    }
}