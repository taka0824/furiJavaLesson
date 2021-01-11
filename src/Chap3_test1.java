public class Chap3_test1 {
    public static void main(String[] args) {
        String[] grade = {"松", "竹", "梅"};
        for(String g: grade){
            System.out.println(g);
        }
        System.out.println("----------");
        for(int i = 0; i < grade.length; i++){
            System.out.println(grade[i]);
        }
    }
}
