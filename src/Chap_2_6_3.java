import java.util.Scanner;
public class Chap_2_6_3 {
    public static void main(String[] args) {
        System.out.print("数値を入力せよ:");
        Scanner scanner = new Scanner(System.in);
        if(! scanner.hasNextInt()){
            System.out.println("数値ではありません");
        }
    }
}
