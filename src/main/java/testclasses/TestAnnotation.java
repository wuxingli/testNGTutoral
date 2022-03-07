package testclasses;


import applioationcode.ClassToBeTested;

import org.testng.annotations.Test;

public class TestAnnotation {
    @Test
    public void test1 () {
        ClassToBeTested test = new ClassToBeTested();
        int result = test.add(6,8);
        System.out.println("这是一个测试方法1,这是相加后的结果：" + result);
    }

    @Test
    public void test2 () {
        System.out.println("这是一个测试方法2");
    }

    @Test
    public void test3 () {
        System.out.println("这是一个测试方法3");
    }
}
