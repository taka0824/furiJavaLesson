public class Chap3_6_1 {
    public static void main(String[] args) {
        String[] ewsn = {"東", "西", "南", "北"};
        System.out.println(ewsn[0]);
        System.out.println("---------------");
        ewsn[0] = "真東";
        System.out.println(ewsn[0]);
        System.out.println("---------------");
        String[] color = new String[4];
        color[0] = "red";
        System.out.println(color[0]);
        System.out.println(color[2]);
    }
}
