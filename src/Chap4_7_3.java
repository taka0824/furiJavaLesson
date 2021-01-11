import java.util.ArrayList;
public class Chap4_7_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("日本");
        list.add("イギリス");
        list.add("アメリカ");
//        System.out.print(list.get(1));
        for(String nation: list){
            System.out.println(nation);
        }
    }
}
