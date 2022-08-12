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

        iteratorUsingForEach(a);
        iteratorUsingIterator(a);
    }

    static void iteratorUsingForEach(HashMap map){
        // entries 안에 map 의 값들을 set 이라는 새로운 공간을 만들어 저장
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
            // 인자로 받은 map 의 키 밸류를 전부 대응시켜 출력
        }
    }
    // 위의 메서드와 같은 동작을함 iterator 를 사용해서
    static void iteratorUsingIterator(HashMap map){
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String,Integer>> i = entries.iterator();
        while(i.hasNext()){
            Map.Entry<String,Integer> entry = i.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
