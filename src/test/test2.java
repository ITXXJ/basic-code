package test;

public class test2 {
    public static void main(String[] args) {
        //求出一个数组的最大值，并返回

        int[] arr = {1, 33, 22, 44, 14};
        int max = getMax(arr);
        System.out.println("最大值是"+max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max){
                max = arr[i];

            }

        }
        return max;
    }
}