package com.itheima.methoddemo;

public class methodDemo3 {
    public static void main(String[] args) {
        // 带返回值的方法的定义和调用

        //在调用处根据方法的结果去执行另外的代码



        //直接调用
       //sumget(10,20,30);
        //赋值调用
        //int sum = sumget(10,20,30);

       //输出调用
        System.out.println(sumget(10,20,30));
    }
    public static int sumget(int num1 ,int num2 ,int num3){

        return num1 + num2 + num3 ;
    }
}
