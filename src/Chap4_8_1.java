import java.util.ArrayList;
public class Chap4_8_1 {
    public static void main(String[] args) {
        String[] list = {"剣士", "魔法使い", "盗賊", "格闘家"};
        ArrayList<Chara> charaList = new ArrayList<Chara>();
        for(String job: list){
            charaList.add(new Chara(job));
        }
        for(Chara chara: charaList){
            chara.sayJob();
        }
    }
}
