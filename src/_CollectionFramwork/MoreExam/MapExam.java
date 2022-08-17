package _CollectionFramwork.MoreExam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        // Key, Value가 모두 String 타입인 HashMap인스턴스를 만듭니다.
        Map<String, String> map = new HashMap<>();

        // key와 value값을 put으로 저장합니다.
        map.put("001", "kim");
        map.put("002", "lee");
        map.put("003", "choi");
        // 같은 key가 2개 있을 수 없습니다. 첫번째로 저장했던 001, kim은 001, kang으로 바뀐다.
        map.put("001", "kang");

        // map에 저장된 자료의 수를 추력합니다. 3이 출력됩니다.
        System.out.println(map.size());

        // 키가 001, 002, 003인 값을 꺼내 출력합니다.
        System.out.println(map.get("001"));
        System.out.println(map.get("002"));
        System.out.println(map.get("003"));

        // map에 저장된 모든 key들을 Set자료구조로 꺼냅니다.
        Set<String> keys = map.keySet();
        // Set자료구조에 있는 모든 key를 꺼내기 위하여 Iterator를 구합니다.
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            // key를 꺼냅니다.
            String key = iter.next();
            // key에 해당하는 value를 꺼냅니다.
            String value = map.get(key);
            // key와 value를 출력합니다.
            System.out.println(key + " : " + value);
        }
    }
}
