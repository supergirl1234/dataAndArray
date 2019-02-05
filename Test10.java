package com;

/**
 * Author:Fanleilei
 * Created:2019/2/5 0005
 */
public class Test10 {

    public static void code1() {

        //引用类型
        int[] a=null;
        a=new int[8];
        for(int i=0;i<a.length;i++){
            a[i]=i;
            System.out.println(a[i]);
        }

        String[] s=new String[8];
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);//默认为null

        }

        boolean[] b=new boolean[8];
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);//默认为false

        }
    }

    public static void code2() {

        int[] x=new int[3];
        x[0]=10;
        x[1]=20;
        x[2]=30;
        for (int i=0;i<x.length;i++){

            System.out.println(x[i]);
        }
        int[] y=null;
         y=x;//把数组x里面的值复制给y数组，x、y指向同一个堆内存
        for (int i=0;i<y.length;i++){

            System.out.println(y[i]);
        }
        System.out.println();

       y[2]=40;
        for (int i=0;i<x.length;i++){

            System.out.println(x[i]);
        }
        //x=null;
        for (int i=0;i<y.length;i++){

            System.out.println(y[i]);

        }

    }

    public static void code3(){
        //静态初始化
        int[] a=new int[]{1,2,3,4,5,6};
        int[] a2={1,2,3,4,5,6};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);

        }


        //匿名数组
        System.out.println(new int[]{1,2,3}.length);

        System.out.println();

        //动态初始化
        int[][] b=new int[2][3];
        b[0][0]=1;
        b[1][2]=6;
        //a.length 行数
        for(int row=0;row<a.length;row++){
            //a[row].length 每行的列数
            for(int col=0;col<b[row].length;col++){

                System.out.print(b[row][col]+" ");
            }
            System.out.println();
        }
    }

      //方法名、参数、返回值
     //打印数组
    public static void printArray(int[] arr){

        if(arr==null){
            return;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
    //修改数组
    //arrayExpend和arrayExpend2这两种方法不同
    //arrayExpend方法不会改变原数组的内容
    //arrayExpend2方法会改变原数组的内容
    public static int[] arrayExpend(int[] arr){
        if(arr==null){
            return new int[]{};

        }
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i]*5;

        }
        return temp;

    }
    public static int[] arrayExpend2(int[] arr){
        if(arr==null){
            return new int[]{};

        }

        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*5;

        }
        return arr;

    }
    public static void main(String[] args) {

        int[] a=new int[]{1,2,3,4,5,6};
        System.out.print("A before:");
        printArray(a);
        System.out.println();

        /*int[] res=arrayExpend(a);
        System.out.print("A 修改之后：");
        printArray(res);
        System.out.println();*/


        int[] res=arrayExpend2(a);
        System.out.print("A 修改之后：");
        printArray(res);
        System.out.println();


        System.out.print("A after：");
        printArray(a);
    }
}
