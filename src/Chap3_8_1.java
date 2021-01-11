public class Chap3_8_1 {
    public static void main(String[] args) {
        String[] team = {"A","B","C","D","E"};
        for(String t1: team){
            for(String t2: team){
//                if(t1 == t2){
//                    continue;
//                }
                if(! t1.equals(t2)) {
                    System.out.println(t1 + "x" + t2);
                }
            }
        }
    }
}
