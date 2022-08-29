package _Object;

class Printer2{

    private static int numOfPapers;
    private static boolean duplex;

    public Printer2(int numOfPapers , boolean duplex) {
        this.numOfPapers = numOfPapers;
        this.duplex= duplex;
    }

    public void print(int amount) {
        if(!duplex) {
            if(numOfPapers - amount < 0) {
                if(numOfPapers > 0) {
                    System.out.print("모두 출력하려면 용지가" + (numOfPapers - amount) * -1 + "장 더 필요합니다.");
                    System.out.println(numOfPapers + "장만 출력 됐습니다.");

                    numOfPapers = 0;
                } else {
                    System.out.println("용지가 부족합니다.");
                }

            } else {
                numOfPapers -= amount;
                System.out.println(amount + "장 출력했습니다." + "남아있는 용지는" + numOfPapers);
            }
        } else {
            if(numOfPapers - amount / 2 > 0) {
                if(numOfPapers % 2 == 0) {
                    numOfPapers -= amount / 2;
                    System.out.println("양면으로" + amount / 2 + "장 출력 되었습니다.");
                } else {
                    numOfPapers = numOfPapers + amount / 2 + 1;
                    System.out.println("양면으로" + amount / 2 + 1 + "장 출력 되었습니다.");
                }
            } else {

                System.out.print("양면으로" + numOfPapers + "장 출력 되었습니다.");
                System.out.println((numOfPapers - amount / 2) * -1 + "장 만큼 부족합니다.");
            }
        }
    }


    public boolean getDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex= duplex;
    }
}

public class PrintDemo {

    public static void main(String[] args) {

        Printer2 p1 = new Printer2(20,true);
        p1.print(25);
        p1.setDuplex(false);
        p1.print(10);


    }

}
