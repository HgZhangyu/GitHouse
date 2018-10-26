package Test.Singleton;

public class Singleton3 {
/**
 *
 * @description: 静态内部类
 *
 * @create: 2018-10-24 18:28
 **/
    private Singleton3() {}
    public static Singleton3 getInstance() {
        return SingletonHolder.singleton3;
    }
    private static class SingletonHolder {
        private static final Singleton3 singleton3 = new Singleton3();
    }
}
