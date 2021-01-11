import java.util.Scanner;
public class Chap_2_3_1 {
    public static void main(String[] args) {
        System.out.print("年齢は：");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
//        Integer.parseInt() を使って入力をint化していたが、nextIntを使用することで初めからint化されたものを受け取れる
        System.out.println(age);
        if(age < 20){
            System.out.println(age + "歳は未成年");
        } else if(age < 65) {
            System.out.println(age + "歳は成人");
        } else {
            System.out.println(age + "歳は高齢者");
        }
    }
}
