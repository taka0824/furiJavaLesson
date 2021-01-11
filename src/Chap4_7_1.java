import java.util.ArrayList;
public class Chap4_7_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
//        ArrayList<リストの値のデータ型> = new ArrayList<リストの値のデータ型>()
        list.add("日本");
//        変数.add(追加したい値)
        list.add("アメリカ");
        list.add("イギリス");
        list.add("中国");
        System.out.println(list.get(2));
//        list.get(インデックス番号)
        list.remove(2);
//        インデックス番号２のイギリスを削除
        System.out.println(list.get(2));
//        イギリスがremoveされたことで、もともとインデックス番号３であった中国がインデックス番号２に変更される
    }
}
