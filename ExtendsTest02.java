package dd.demo;

/*
    测试类
 */
public class ExtendsTest02 {
    public static void main(String[] args) {
        //创建猫类对象并进行测试
        //无参构造
        Cat c1=new Cat();
        c1.setName("小花");
        c1.setAge(3);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.catchMouse();

        //带参构造
        Cat c2=new Cat("加菲猫",4);
        System.out.println(c2.getName()+","+c2.getAge());
        c2.catchMouse();

        //创建狗类对象并进行测试
        //无参构造
        Dog d1=new Dog();
        d1.setName("泰迪");
        d1.setAge(6);
        System.out.println(d1.getName()+","+d1.getAge());
        d1.lookDoor();

        //带参构造
        Dog d2=new Dog("二哈",5);
        System.out.println(d2.getName()+","+d2.getAge());
        d2.lookDoor();
    }
}

/*
    猫类
 */
class Cat extends Animal{
    public Cat(){
    }

    public Cat(String name,int age){
        super(name,age);
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

/*
    狗类
 */
class Dog extends Animal{
    public Dog(){
    }

    public Dog(String name,int age){
        super(name,age);
    }

    public void lookDoor(){
        System.out.println("狗看门");
    }
}

/*
    动物类
 */
class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
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