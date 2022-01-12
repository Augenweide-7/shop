package dd.demo;

/*
    测试类
 */
public class AbstractTest01 {
    public static void main(String[] args) {
        //创建一个猫类对象
        //无参构造
        Animal02 c=new Cat02();
        c.setName("加菲猫");
        c.setAge(1);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();

        //带参构造
        Animal02 c2=new Cat02("小花",2);
        System.out.println(c2.getName()+","+c2.getAge());
        c2.eat();

        //创建一个狗类对象
        //无参构造
        Animal02 d=new Dog02();
        d.setName("泰迪");
        d.setAge(3);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();

        //带参构造
        Animal02 d2=new Dog02("二哈",4);
        System.out.println(d2.getName()+","+d2.getAge());
        d2.eat();
    }
}

/*
    动物类
 */
abstract class Animal02{
    private String name;
    private int age;

    public Animal02() {
    }

    public Animal02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
}

/*
    猫类
 */
class Cat02 extends Animal02{
    public Cat02() {
    }

    public Cat02(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

/*
    狗类
 */
class Dog02 extends Animal02{
    public Dog02() {
    }

    public Dog02(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}