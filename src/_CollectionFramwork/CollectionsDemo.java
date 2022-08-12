package _CollectionFramwork;

import java.util.*;

class Computer implements Comparable{
    int serial;
    String owner;
    Computer(int serial, String owner){
        this.serial = serial;
        this.owner = owner;
    }
    // Comparable 은 compareTo 를 구현하도록 강제
    // 현재의 객체와 비교하는 객체의 값을 빼서 정렬
    public int compareTo(Object o){
        return this.serial -((Computer)o).serial;
        // 예를들어 a.compareTo(b) 를 한다면 a 의 시리얼 값을  b의 시리얼 값으로 뺀다
        // 양수면 a 가 더 크고 0 이면 서로 같고 음수면 b 가 더 크다.
    }
    public String toString(){
        return serial + " " +owner;
    }
}

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<Computer>();
        computers.add(new Computer(500, "egoing"));
        computers.add(new Computer(200, "leezche"));
        computers.add(new Computer(500, "graphttie"));

        Iterator i = computers.iterator();
        System.out.println("before");
        while(i.hasNext()){
            System.out.println(i.next());
        }
        Collections.sort(computers);
        System.out.println("\nafter");
        i = computers.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
