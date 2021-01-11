public class Chap4_2_1 {
    public static void main(String[] args) {
//        Chara chara = new Chara();
//        chara.job = "魔王";
//        Charaクラスのメンバー変数jobを書き換えている
//        System.out.println(chara.getJob());
//        chara.setJob("勇者");
//        chara.sayJob();
        Chara chara1 = new Chara("バトルマスター");
        Chara chara2 = new Chara("道化師");
        chara1.sayJob();
        chara2.sayJob();
    }
}
