package dd.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class myStudentManeger {
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<myStudent> array = new ArrayList<myStudent>();

        //用循环完成再次回到主界面
        while (true) {
            //用输出语句完成主界面编写
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

            //用Scanner实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //用switch语句完成操作的选择
            switch (line) {
                case "1":
//                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
//                    System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);
            }
        }
    }

    //添加学生方法
    public static void addStudent(ArrayList<myStudent> array) {
        //键盘录入学生对象所需要的数据，显示提示信息，提示要输入何种信息
        Scanner sc = new Scanner(System.in);

        //为了让sid在while循环外面被访问到，把sid定义在循环外
        String sid;

        //为了让程序能够回到这里，使用循环实现
        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();

            if (isUsed(array, sid))
                System.out.println("你输入的学号已经被使用，请重新输入：");
            else
                break;
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();
        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        myStudent s = new myStudent();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //将学生对象添加到集合中
        array.add(s);

        //给出添加成功提示
        System.out.println("添加成功");
    }

    //查看学生方法
    public static void findAllStudent(ArrayList<myStudent> array) {
        //判断集合中是否有数据，如果没有显示提示信息
        if (array.size() == 0) {
            System.out.println("无信息，请先添加信息再查询");
            return;
            //为了让程序不再往下执行
        }
        //显示表头信息
        System.out.println("学号\t\t\t姓名\t\t\t年龄\t\t\t居住地");
        //将集合中数据取出，按照对应格式显示学生信息，年龄显示补充“岁”
        for (int i = 0; i < array.size(); i++) {
            myStudent s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t\t" + s.getAge() + "岁\t\t" + s.getAddress());
        }
    }

    //删除学生方法
    public static void deleteStudent(ArrayList<myStudent> array) {
        //键盘录入要删除的学生学号，显示提示信息
        System.out.println("请输入你要删除的学生的学号：");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();

        //在删除、修改学生操作前，对学号是否存在进行判断
        //如果不存在，显示提示信息
        //如果存在，执行删除、修改操作
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            myStudent s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在，请重新输入：");
        } else {
            array.remove(index);
            //给出删除成功提示
            System.out.println("删除学生成功");
        }

//        遍历集合将对应学生对象从集合中删除
//        for (int i = 0; i < array.size(); i++) {
//            myStudent s1 = array.get(i);
//            if (s1.getSid().equals(sid)) {
//                array.remove(i);
//                break;
//            }
//        }
    }

    //修改学生方法
    public static void updateStudent(ArrayList<myStudent> array) {
        //键盘录入要修改的学生学号，显示提示信息
        System.out.println("请输入你要修改的学生的学号：");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();

        //判断学号是否存在
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            myStudent s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在，请重新输入：");
        } else {
            //键盘录入要修改的学生信息
            System.out.println("请输入学生新姓名：");
            String newName = sc.nextLine();
            System.out.println("请输入学生新年龄：");
            String newAge = sc.nextLine();
            System.out.println("请输入学生新居住地：");
            String newAddress = sc.nextLine();

            //创建学生对象
            myStudent s = new myStudent(sid, newName, newAge, newAddress);

            //执行修改学生操作
            array.set(index, s);

            //给出修改成功提示
            System.out.println("修改学生成功");
        }
    }

    //定义一个方法，判断学号是否相同
    public static boolean isUsed(ArrayList<myStudent> array, String sid) {
        //如果与集合中的某一个学生学号相同，返回true；如果都不相同，返回false
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            myStudent s = array.get(i);
            if (sid.equals(s.getSid())) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}

class myStudent {
    private String sid;//学号
    private String name;//姓名
    private String age;//年龄
    private String address;//住址

    public myStudent() {
    }

    public myStudent(String sid, String name, String age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
