public class Chara {
    private String job = "冒険者";

    public Chara(String job){
        setJob(job);
//        同じクラスのメソッドを単体で呼び出すことができる（this.が隠れている）
//        this.job = job;
//        jobはメンバー変数であるが、同じクラス内であれば呼び出せるのでメソッドを使用せずに上記の形で置き換えても良い
    }
    public void sayJob(){
        System.out.println(this.job + "です.");
    }
    public String getJob(){
        return this.job;
    }

    public void setJob(String job){
        if(! job.equals("魔王")){
            this.job = job;
        }
    }
}
