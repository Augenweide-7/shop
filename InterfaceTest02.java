package dd.demo;

/*
    测试类
 */
public class InterfaceTest02 {
    public static void main(String[] args) {
        //构造乒乓球运动员类
        //无参构造
        PingPongAthletes a1=new PingPongAthletes();
        a1.setName("马龙");
        a1.setAge(33);
        System.out.println(a1.getName()+","+a1.getAge());
        a1.eat();
        a1.study();
        a1.speakEnglish();
        System.out.println("--------");

        //构造乒乓球教练类
        //无参构造
        PingPangCoach c1=new PingPangCoach();
        c1.setName("陈玘");
        c1.setAge(39);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.eat();
        c1.teach();
        c1.speakEnglish();
        System.out.println("--------");

        //构造篮球运动员类
        //带参构造
        BasketballAthletes a2=new BasketballAthletes("姚明",42);
        System.out.println(a2.getName()+","+a2.getAge());
        a2.eat();
        a2.study();
        System.out.println("--------");

        //构造篮球教练类
        //带参构造
        BasketBallCoach c2=new BasketBallCoach("杨鸣",40);
        System.out.println(c2.getName()+","+c2.getAge());
        c2.eat();
        c2.teach();


    }
}

/*
    说英语接口
 */
interface SpeakEng{
    void speakEnglish();
}

/*
    抽象类 人
 */
abstract class People{
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
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
    抽象类 运动员
 */
abstract class Athletes extends People{
    public Athletes() {
    }

    public Athletes(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}

/*
    抽象类 教练
 */
abstract class Coach extends People{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}

/*
    乒乓球运动员类
 */
class PingPongAthletes extends Athletes implements SpeakEng{
    public PingPongAthletes() {
    }

    public PingPongAthletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃饭");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员学英语");
    }


}

/*
    篮球运动员类
 */
class BasketballAthletes extends Athletes{
    public BasketballAthletes() {
    }

    public BasketballAthletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃饭");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习");
    }
}

/*
    乒乓球教练类
 */
class PingPangCoach extends Coach implements SpeakEng{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练学英语");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃饭");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }
}

/*
    篮球教练类
 */
class BasketBallCoach extends Coach{
    public BasketBallCoach() {
    }

    public BasketBallCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃饭");
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教篮球");
    }
}