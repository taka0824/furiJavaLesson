import java.util.Scanner;
public class Chap_2_2_1 {
    public static void main(String[] args) {
        System.out.print("年齢を入力してください：");
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        if(age >= 20) {
            System.out.print("お酒の販売が可能です");
        } else {
            System.out.print("お酒は20才からです");
        }
    }
}
