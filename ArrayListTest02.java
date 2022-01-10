package dd.demo;

import java.util.ArrayList;

public class ArrayListTest02 {
    public static void main(String[] args) {
        ArrayList<Student> array=new ArrayList<Student>();
        Student s1=new Student("张三",20);
        Student s2=new Student("李四",30);
        Student s3=new Student("王五",40);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        for(int i=0;i<array.size();i++){
            Student s=array.get(i);
            System.out.println("name: "+s.getName()+" age: "+s.getAge());
        }
    }
}
class Student{
    private String name;
    private int age;
    public Student(){

    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

}
