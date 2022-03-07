package testclasses;

class Took {
// 定义一个Took类，暂时不编写过多的内容
    public Took() {
        System.out.println("上市图书！！！！！");
    }
}

public class MuYanDemo {
    private static Object Took;//使用Object方法构造一个Took的类，Took的父类是Object


    public static void main(String[] args) {
        System.out.println("1、声明book对象： Took took = null;");
        
        Took took = null;
        System.out.println("2、实例化book对象：took = new Took();");
        Took = new Took();

    }
}
