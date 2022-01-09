package dd.demo;

import java.util.ArrayList;

public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("world");
        arr.add("java");
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
