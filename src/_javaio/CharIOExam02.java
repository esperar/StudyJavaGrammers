package _javaio;

import java.io.*;

public class CharIOExam02 {
    public static void main(String[] args) {
        BufferedReader br = null; // 한 줄 읽어 들이기 위해서 사용한다.
        PrintWriter pw = null; // 파일을 읽기 위해서 사용한다.

        try{
            /*
             파일을 쓰게하기 위해서 FileWriter 사용
             편리하게 출력하기 위해서 PrintWriter 사용
             */
            br = new BufferedReader(new FileReader("src/_javaio/CharIOExam02.java"));
            pw = new PrintWriter(new FileWriter("test.txt"));
            String line = null;
            // readLine 은 값이 존재하지 않으면 null 을 반환한다.
            while((line = br.readLine()) != null){
                pw.println(line); // 입력
            }
        } catch(Exception e){
            e.printStackTrace();
        }finally {
            pw.close();
            try{
                br.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
