package _CollectionFramwork.MoreExam;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String >();
        l1.add("kim");
        l1.add("kang");
        l1.add("kang");

        System.out.println(l1.size()); // List 이기 때문에 중복이 있음에도 3을 반환
        for(int i = 0; i < l1.size(); i++){
            String str1 = l1.get(i); // 순서대로 li 의 값을 가져오기
            System.out.println(str1); // kim kang kang
        }
    }
}
