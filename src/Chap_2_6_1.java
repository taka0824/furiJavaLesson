import java.util.Scanner;
public class Chap_2_6_1 {
    public static void main(String[] args) {
        System.out.print("年齢は：");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("年齢は" + age + "歳");
        if(age <= 5 || age >= 65){
            System.out.println("幼児もしくは高齢者です");
        }
    }
}
