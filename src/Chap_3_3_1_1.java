public class Chap_3_3_1_1 {
    public static void main(String[] args) {
        for(int cnt = 1; cnt <= 5; cnt ++){
            if(cnt == 3){
                continue;
            }
            System.out.println(cnt + "回目のハロー");
        }
        System.out.println("------------------");
        int money = 10000;
        while(money > 2400){
            System.out.println("所持金は" + money + "円です");
            money = money - 2400;
            System.out.println("2400円の買い物をしました");
        }
    }
}
