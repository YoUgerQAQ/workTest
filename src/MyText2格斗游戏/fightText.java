package MyText2格斗游戏;

public class fightText {
    public static void main(String[] args) {
        fight p1 = new fight("Player1",100,'男');
        fight p2 = new fight("Player2",100,'女');

        int round = 0;
        p1.showAttribute();
        p2.showAttribute();
        while (true) {
            //p1攻击p2
            System.out.println("----------------第" + (++round) + "回合开始----------------");
            p1.hit(p2);
            //判断剩余血量
            if (p2.getLife() == 0) {
                System.out.println(p1.getName() + "胜利");
                System.out.println("----------------第" + (round) + "回合结束----------------");
                break;
            }
            //p2开始攻击p1
            p2.hit(p1);
            if (p1.getLife() == 0) {
                System.out.println(p2.getName() + "胜利");
                System.out.println("----------------第" + (round) + "回合结束----------------");
                break;
            }
            System.out.println("回合结束");
        }
    }
}
