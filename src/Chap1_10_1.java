import java.util.Scanner;
public class Chap1_10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("あなたの名前を入力してください：");
        String input = scanner.nextLine();
        System.out.println("あなたの名前は" + input + "です");
    }
}
