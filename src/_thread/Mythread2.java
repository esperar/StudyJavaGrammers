package _thread;

public class Mythread2 implements Runnable{
    String str;
    public Mythread2(String str){
        this.str = str;
    }
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(str);
            try{
                Thread.sleep((int)(Math.random() * 1000));
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
