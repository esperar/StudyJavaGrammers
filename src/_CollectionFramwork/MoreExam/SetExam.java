package _CollectionFramwork.MoreExam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        boolean flag1 = s1.add("kang");
        boolean flag2 = s1.add("kim");
        boolean flag3 = s1.add("kang");

        System.out.println(s1.size()); // 2 kang 은 중복되있는 값이라 하나만 저장
        System.out.println(flag1); // true
        System.out.println(flag2); // true
        System.out.println(flag3); // false 이미 같은 값이 있기 때문에

        Iterator<String> iter = s1.iterator();

        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }

    }
}
