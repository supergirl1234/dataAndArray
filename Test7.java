package com;

import java.util.Scanner;

/**
 * Author:Fanleilei
 * Created:2019/2/5 0005
 */
    //for循环
    //if...else语句
    //switch
    //while
    //do ...while

public class Test7 {
    //for循环
    public static void triangle(){
       /* for(int i=0;i<10;i++){
            System.out.println(i);

        }*/

       //双重循环(输出一个直角三角形)
        int line=10;

        for(int i=0;i<line;i++){//控制行数
            for(int j=0;j<line-i;j++){ //控制空格
                System.out.print(" ");
            }
            for(int z=0;z<i;z++){
                System.out.print("*");//控制*的个数

            }
            System.out.println();
        }
    }
    //if...else语句
   public static void ifMethod() {
        System.out.println("请输入一个字符串");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        if(str.equals("java")){
            System.out.println("java is best");

        }else if(str.equals("mysql")){
            System.out.println("i like mysql");

        }else{

            System.out.println("i dont know");
        }

    }

   //switch语句
    public static void switchMethod() {
        System.out.println("请输入一个字符串");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        switch(str){
            case "java":
                System.out.println("java is best");
                break;
            case "mysql":
                System.out.println("i like mysql");
                break;
            default:
                System.out.println("i dont know");
        }
    }

    public static void main(String[] args) {
      int count=10;
         /*while(count>0){
            System.out.println(count);
            count--;
        }//先做判断再循环*/

        /*do{
            System.out.println(count);
            count--;
        }while(count>0);*/ //先循环一次再做判断

        while(count<10){
            System.out.println(count);
            count++;
        }//没有输出
        do{
            System.out.println(count);
            count++;
        }while(count<10);//会输出一个10；这就是两者的不同之处
    }
}
