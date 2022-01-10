package dd.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要存储的学生数量：");
        int num=sc.nextInt();
        ArrayList<Student> array=new ArrayList<Student>();
        for(int i=0;i<num;i++){
            array.add(addStudent());
        }
        for(int i=0;i<num;i++){
            Student s= array.get(i);
            System.out.println("name: "+s.getName()+" age: "+s.getAge());
        }


    }
    public static Student addStudent(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name=sc.nextLine();
        System.out.println("请输入学生年龄：");
        int age=sc.nextInt();
        Student s=new Student();
        s.setName(name);
        s.setAge(age);
        return s;
    }

}
