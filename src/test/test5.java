package test;

public class test5 {
    public static void main(String[] args) {
        int change =100;
        System.out.println(change);
        System.out.println(change(100));

    }
    public static int change (int change){
        change =200 ;
        return change;
        //传递基本数据类型的时候，形参改变不影响实参（）
        //传递引用数据类型的时候，传递的是地址值，形参改变影响实参(new出来的 比如 数组 )

    }

}
