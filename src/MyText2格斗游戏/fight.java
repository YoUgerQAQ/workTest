package MyText2格斗游戏;

import java.util.Random;

public class fight {
    //属性
    String name;
    int life = 100;
    char gender;
    String face;

    String[] boyfaces = {"风流雅俊", "气宇轩昂", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"沉鱼落雁", "美轮美奂", "身材姣好", "相貌平平", "惨不忍睹"};
    //攻击描述:
    String[] attack_desc={
        "%s将存储在奥勒塔尔中的元素之力解放了，凝聚出了【惊才绝景】！",
        "%s挥起大剑，释放了【痛贯天灵】，向%s斩了过去。",
        "%s大喊”All father give me sight“，识破了%s的位置，造成暴击！",
        "%s激活了【艾欧尼亚热诚】，攻速和攻击力提高了，对%s进行了多次打击。",
        "%s闪转腾挪，结印出了了【秘奥义•表里杀缭乱】，向%s刺去，造成了大量伤害。",
    };
    //受伤描述（越来越严重）:
    String[] injured_desc = {
        "但是%s使出了一招【天际俯冲】，躲避了对方的伤害。",
        "%s竟然毫发无伤！可能是敌人眼花了没有击中吧。",
        "结果%s被对方的会心一击击飞到空中了！",
        "”噗“大量的鲜血从%s体内喷涌而出！",
        "%s重伤倒地！",
        "%s被对方终结了！",
    };

    public fight() {
    }

    public fight(String name, int life, char gender) {
        this.name = name;
        this.life = life;
        this.gender = gender;
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        //长相是随机的
        Random r = new Random();
        if (gender == '男') {
            //从boyfaces里面选取随机长相
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        }else if (gender == '女'){
            //从girlfaces里面选取随机长相
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else {
            this.face = "面怒狰狞";
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }


    //行为
    public void hit(fight fight) {
       Random r = new Random();
       int index = r.nextInt(attack_desc.length);
       String skill = attack_desc[index];
        //输出攻击效果
        System.out.printf(skill,this.getName(),fight.getName());
        System.out.println();

        //随机产生伤害
        int a = r.nextInt(20) + 1;
        //剩余血量
        int remainHit = fight.getLife() - a;
        //如果remainHit小于0，那么就把remainHit修正为0，否则还是原来的remainHit
        remainHit = remainHit < 0 ? 0 : remainHit;
        //修改被攻击人的血量
        fight.setLife(remainHit);
        //受伤描述
        if (remainHit>90){
            System.out.printf(injured_desc[0],fight.getName());
            System.out.println();
        }else if (remainHit>70/*&& remainHit<=90（可以不用写，因为代码从上往下运行）*/){
            System.out.printf(injured_desc[1],fight.getName());
            System.out.println();
        }else if (remainHit>50){
            System.out.printf(injured_desc[2],fight.getName());
            System.out.println();
        }else if (remainHit>30){
            System.out.printf(injured_desc[3],fight.getName());
            System.out.println();
        }else if (remainHit>2){
            System.out.printf(injured_desc[4],fight.getName());
            System.out.println();
        }else if (remainHit<1){
            System.out.printf(injured_desc[5],fight.getName());
            System.out.println();
        };

        //this表示方法的调用者

        /*if (a <= 10) {
            System.out.println();
            System.out.println(this.getName() + "对" + fight.getName() + "造成了 " + a + " 点伤害！" +
                    fight.getName() + "还剩下 " + remainHit + " 点血");
        } else if (a < 18 && a > 10) {
            System.out.println();
            System.out.println(this.getName() + "暴击了！！对" + fight.getName() +
                    "造成了 " + a + " 点大量伤害！" + fight.getName() + "还剩下 " + remainHit + " 点血");
        } else if (a >= 18 && a <= 20) {
            System.out.println();
            System.out.println(this.getName() + "造成了致命一击！！！！对" + fight.getName() +
                    "造成了 " + a + " 点致命伤害！" + fight.getName() + "还剩下 " + remainHit + " 点血");
        }*/

        if (life <= 0) {
            System.out.println(name + "胜利了");
        }
    }
    public void showAttribute(){
        System.out.println("姓名为:"+getName());
        System.out.println("生命值为:"+getLife());
        System.out.println("性别为:"+getGender());
        System.out.println("外貌为:"+getFace());
    }
}
