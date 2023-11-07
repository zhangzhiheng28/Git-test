package org.example;

public class Sub extends Base {
    private int var = 20;

    public void method() {
        super.method(); // 访问父类Base中的method方法
        System.out.println("This is method in sub class");

        // 访问父类Base中的var成员变量
        System.out.println(super.var);
    }

}
