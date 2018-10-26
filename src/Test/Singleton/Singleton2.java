package Test.Singleton;

public class Singleton2 {
/**
 * @description: 懒汉
 *
 * @create: 2018-10-24 18:17
 **/
    private static Singleton2 singleton2 = null;
    private Singleton2(){}
    public static Singleton2 getInstance(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
