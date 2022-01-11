package dd.demo;

/*
    测试类
 */
public class DuoTaiTest {
    public static void main(String[] args) {
        //创建猫类对象进行测试
        //多态无参构造
        Animal01 a = new Cat01();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        //带参构造
        a = new Cat01("小花", 6);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        //创建狗类对象进行测试
        //多态无参构造
        Animal01 d = new Dog01();
        d.setName("泰迪");
        d.setAge(2);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();

        //带参构造
        d = new Dog01("二哈", 3);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
    }
}

/*
    动物类
 */
class Animal01 {
    private String name;
    private int age;

    public Animal01() {
    }

    public Animal01(String name, int age) {
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

    public void eat() {
        System.out.println("动物吃饭");
    }
}

/*
    狗类
 */
class Dog01 extends Animal01 {
    public Dog01() {
    }

    public Dog01(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}

/*
    猫类
 */
class Cat01 extends Animal01 {
    public Cat01() {
    }

    public Cat01(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
