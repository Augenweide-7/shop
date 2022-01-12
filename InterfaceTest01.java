package dd.demo;

/*
    测试类
 */
public class InterfaceTest01 {
    public static void main(String[] args) {
        //创建一个猫类对象,调用方法
        //调用jump方法
        Jumpping cj=new Cat03();
        cj.jump();

        System.out.println("--------");
        //无参构造,调用eat方法
        Animal03 ca=new Cat03();
        ca.setName("加菲猫");
        ca.setAge(1);
        System.out.println(ca.getName()+","+ca.getAge());
        ca.eat();
        System.out.println("--------");

        //带参构造
        Animal03 ca2=new Cat03("小花",2);
        System.out.println(ca2.getName()+","+ca2.getAge());
        ca2.eat();
        System.out.println("--------");

        //创建一个狗类对象,调用方法
        Jumpping dj=new Dog03();
        dj.jump();
        System.out.println("--------");

        //无参构造
        Animal03 da=new Dog03();
        da.setName("泰迪");
        da.setAge(3);
        System.out.println(da.getName()+","+da.getAge());
        da.eat();
        System.out.println("--------");

        //带参构造
        Animal03 da2=new Dog03("二哈",4);
        System.out.println(da2.getName()+","+da2.getAge());
        da2.eat();

    }
}

/*
    定义了一个接口
 */
interface Jumpping{
    void jump();//默认public abstract
}
/*
    动物类
 */
abstract class Animal03{
    private String name;
    private int age;

    public Animal03() {
    }

    public Animal03(String name, int age) {
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
    public abstract void eat();//抽象方法
}
/*
    猫类
 */
class Cat03 extends Animal03 implements Jumpping{
    @Override
    public void jump() {
        System.out.println("猫会跳高了");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public Cat03() {
    }

    public Cat03(String name, int age) {
        super(name, age);
    }
}
/*
    狗类
 */
class Dog03 extends Animal03 implements Jumpping{
    public Dog03() {
    }

    public Dog03(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {
        System.out.println("狗会跳高了");
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
