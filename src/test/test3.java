package test;

public class test3 {
    public static void main(String[] args) {
        //定义一个方法 求一个数组中一个数是否存在
        //1.我要干什么
        //2.我需要什么
        //3.是否需要返回值
        int [] arr ={1,23,4,5,6,7,89};
        boolean a = contain(arr,1);
        System.out.println(a);



    }
    public static boolean contain(int [] arr ,int number){
        for (int i = 0; i < arr.length; i++) {
            if(number==arr[i]){
                return true;
            }
        }
        return false;
    }
}
//return 用于结束方法，并返回值
//break用用于结束循环
