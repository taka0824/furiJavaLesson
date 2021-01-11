import java.util.Scanner;
public class Chap_2_8_1 {
    public static void main(String[] args) {
        System.out.print("年齢を入力してください：");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age < 6){
            System.out.print(age + "歳は幼児です");
        }
    }
}
