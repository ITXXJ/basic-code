package test;

public class test4 {

    public static void main(String[] args) {
        // 复制一个数组索引从from到to下标的元素到一个新的数组
        int [] arr = {11,22,33,44,55,66,77,88,99};
        int[] ints = copyArr(arr, 0, 7);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+" ");
        }

    }
    public static int[] copyArr(int [] arr ,int from,int  to){
        //定义一个新的数组
        int [] newarr = new int[to-from];


        for (int i = from; i < to; i++) {
            newarr[i-from]=arr[i];

        }
        return newarr;

    }
}
