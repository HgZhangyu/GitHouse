package Test.Singleton;

public class Singleton4 {
/**
 *
 * @description: 双重检查
 *
 * @create: 2018-10-24 18:37
 **/
    private static Singleton4 singleton4 = null;
    private Singleton4() {}
    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized(Singleton4.class){
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}
