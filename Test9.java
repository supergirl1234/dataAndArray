package com;

/**
 * Author:Fanleilei
 * Created:2019/2/5 0005
 */

//方法定义、方法重载、方法递归
public class Test9 {

    //方法定义
    public static int  add(int a,int b){
        int sum=a+b;
        return sum;
    }
    //方法重载:定义：方法名称相同，参数的类型、顺序或个数不同（简称：参数列表不同）
    public static int  add(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }
    public static double  add(double a,double b,double c){
        double sum=a+b+c;
        return sum;
    }

    //(重要) 如果方法以void声明，那么可以使用return来结束调用（常常与if语句配合使用）
    public static void div(int a,int b){
        if(b==0){

            return;
        }else{

            int result=a/b;
            System.out.println(result);
        }

    }

    //方法递归：指的是一个方法自己调用自己的方式
    public static void print(){

        System.out.println("hello");
        print();
    }

     public  static int compute(int i){
        if(i==1){
            return 1;
        }else{

            return i+compute(i-1);
        }


     }


    public static void main(String[] args) {
        //print();
        System.out.println(compute(6));

    }
}
