package test;

public class test1 {

    public static void main(String[] args) {
        // 定义一个方法循环遍历数组 并打印出来 如 [1，2，3，4，5]
        int [] arr = {1,2,3,4,5};
        printArr(arr);


    }
    public static void printArr(int [] arr ){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.print("]");
    }
}
