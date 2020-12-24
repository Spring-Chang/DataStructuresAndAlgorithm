package com.springchang.datastructures.stack;

/**
 * @author : 张翠山
 * 栈的测试类
 */
public class TestStack {

    public static void main(String[] args) {
//        testJdkStack();

        testArrayStack();
    }

    /**
     * 测试JDK自带的Stack的使用
     */
    public static void testJdkStack() {
        java.util.Stack<String> stack = new java.util.Stack<String>();
        stack.push("张翠山");
        stack.push("殷素素");
        stack.push("张无忌");
        stack.push("赵敏");
        stack.push("周芷若");

        System.out.println(stack);
        System.out.printf("周芷若的位置 : %s\n", stack.search("周芷若"));

        System.out.println("栈是否为空 : " + stack.isEmpty());
        System.out.println("stack = " + stack.pop());
        System.out.println("stack = " + stack.pop());
        System.out.println("stack = " + stack.pop());
        System.out.println("stack = " + stack.pop());
        System.out.println("stack = " + stack.pop());
        System.out.println("栈是否为空 : " + stack.isEmpty());
    }

    /**
     * 测试ArrayStack的使用
     */
    public static void testArrayStack() {
        Stack stack = new ArrayStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.printf("栈内容 = %s\n", stack.toString());
        System.out.printf("栈是否已满?%s\n", stack.isFull());
        System.out.printf("10的位置 = %d\n", stack.search(10));

        System.out.printf("弹栈 = %d\n", stack.pop());
        System.out.printf("弹栈 = %d\n", stack.pop());
        System.out.printf("弹栈 = %d\n", stack.pop());
        System.out.printf("弹栈 = %d\n", stack.pop());
        System.out.printf("弹栈 = %d\n", stack.pop());
        System.out.printf("弹栈 = %d\n", stack.pop());
        System.out.printf("弹栈 = %d\n", stack.pop());
        System.out.printf("弹栈 = %d\n", stack.pop());
        System.out.printf("弹栈 = %d\n", stack.pop());
        System.out.printf("弹栈 = %d\n", stack.pop());
        System.out.printf("栈内容 = %s\n", stack.toString());
        System.out.printf("栈是否已空?%s\n", stack.isEmpty());
    }
}