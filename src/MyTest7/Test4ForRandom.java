package MyTest7;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Test4ForRandom {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int ran = r.nextInt(10);
            //nextInt can return 0 to parameter which you provide(excluding parameter)
            //if without parameter,this method will give you a random number
            double ran1 = r.nextGaussian();
            //the return value of this method conforms to a Gaussian distribution(高斯分布)

            System.out.println(ran);
        }
//       -------------------------------------------------------------------------------------------------
        //Math
        int m = Math.abs(-10);
        //return the absolut of your parameter
        double p = Math.PI;
        //set value is pi
        double sin = Math.sin(p/2);
        //sin
        double m1 = Math.pow(2,3);
        //return x^y        eg:this sentence return 8
        p = Math.round(p);
        //return the rounded value
        double m2 = Math.random();
        //returns a random double between [0.0,1.0)
        //Math.random() 内部使用 Random 的静态实例，每次调用都涉及 同步锁（synchronized），因此在高并发场景下性能较差
        //Random 类（非静态）无同步锁，性能更好，但多线程环境下可能不安全（推荐用 ThreadLocalRandom）
        m = (int) Math.max(m,m1);
        //return a max number between your two parameter
        //min is similarly
        m1 = Math.sqrt(64);
        //square of parameter(开根号)
//       -------------------------------------------------------------------------------------------------
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        //无锁，每个线程独立维护一个随机数生成器，避免竞争，性能最优，适用于多并发环境
    }
}
