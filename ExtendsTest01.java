package dd.demo;

/*
    测试类
 */
public class ExtendsTest01 {
    public static void main(String[] args) {
        //创建老师类对象进行测试
        //无参构造
        Teacher t1=new Teacher();
        t1.setName("张三");
        t1.setAge(33);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

        //带参构造
        Teacher t2=new Teacher("李四",35);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();

        //创建学生类对象进行测试
        //无参构造
        Student s1=new Student();
        s1.setName("李奕");
        s1.setAge(23);
        System.out.println(s1.getName()+","+s1.getAge());
        s1.study();

        //带参构造
        Student s2=new Student("王磊",26);
        System.out.println(s2.getName()+","+s2.getAge());
        s2.study();
    }
}

/*
    老师类
 */
class Teacher extends Person{
    public Teacher(){

    }
    public Teacher(String name,int age){
        super(name,age);
    }
    public void teach(){
        System.out.println("用爱成就每一位学生");
    }
}

/*
    学生类
 */
class Student extends Person{
    public Student(){

    }
    public Student(String name,int age){
        super(name,age);
    }
    public void study(){
        System.out.println("好好学习，天天向上");
    }
}

/*
    人类
 */
class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}