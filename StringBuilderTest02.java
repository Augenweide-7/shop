package dd.demo;

import java.util.Scanner;

public class StringBuilderTest02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要进行反转的字符串：");
        String str=sc.nextLine();
        String s = myReverse(str);
        System.out.println("s:"+s);
    }
    public static String myReverse(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String s=sb.toString();
        return s;
    }
}
