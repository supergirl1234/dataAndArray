package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Author:Fanleilei
 * Created:2019/2/5 0005
 */

//scanner
public class Test8 {

    public static void code1() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入内容");
        if(scanner.hasNext()){//判断是否有输入内容
            System.out.println(scanner.next());//输出输入的内容

        }
        scanner.close();//关闭

    }

    //使用Scanner还可以接收各种数据类型，并且帮助用户减少转型处理
    public static void code2() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年龄：");
        /*if(scanner.hasNextInt()){
            System.out.println(scanner.nextInt());//输出int型的数据

        }else{

            System.out.println("输入的不是int类型的数据");
        }*/

        while(true){
            if(scanner.hasNextInt()){
                System.out.println(scanner.nextInt());
                break;
            }else{

                System.out.println("输入的不是数字，请重新输入");
                 scanner.next();//重新接收输入的数据
            }

        }
        scanner.close();
    }
    //Scanner可以对接收的数据类型使用正则表达式判断
    public static void code3() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入生日：");
        while(true){

            //2018-05-07
            if(scanner.hasNext("\\d{4}-\\d{2}-\\d{2}")){
                System.out.println(scanner.next());

            }else{
                System.out.println("输入的日期格式不正确，请重新输入");
               scanner.next();
            }

        }

    }

    //使用Scanner本身能够接收的是一个InputStream对象，那么也就意味着可以接收任意输入流
    //Scanner完美的替代了BufferedReader，而且更好的实现了InputStream的操作
    public static void main(String[] args) {
         //Scanner构造方法中传入文件，替代BufferedReader，读取文件
        try {
            //Scanner scanner=new Scanner(new FileInputStream(new File("D:/javatxt/1.txt")));
            Scanner scanner=new Scanner(Paths.get("D:","javatxt","1.txt"));   //为什么读出来是乱码呢
            scanner.useDelimiter("\n");//自定义分隔符 换行符
            while(scanner.hasNext()){

                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
