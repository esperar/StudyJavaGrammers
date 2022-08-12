package _CollectionFramwork;

import java.util.*;


public class MapDemo {
    public static void main(String[] args) {
        /*
        Map 은 키 밸류 형식으로 데이터를 저장한다 첫번째 인자가 키 두번재 인자가 밸류이다.
         */
        HashMap<String, Integer> a = new HashMap<String,Integer>();
        a.put("one" , 1);
        a.put("two", 2);
        a.put("three",3);
        // 중복된 키의 값을 put 하면 키는 그대로 유지되고 그 값만 덮어씌워지게 된다.
        System.out.println(a.get("one")); // 1
        System.out.println(a.get("two")); // 2
        System.out.println(a.get("three")); // 3

    }
}
