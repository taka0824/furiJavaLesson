public class Chap1_11_1 {
    public static void main(String[] args) {
        String num = "30";
        System.out.println(num + 20);
//        文字列と整数の計算の場合は整数が文字列に変換される
        System.out.println(Integer.parseInt(num) + 20);
//        Integer.parseInt(引数)で引数をint型に変換する
    }
}
