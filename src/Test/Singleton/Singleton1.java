package Test.Singleton;

public class Singleton1 {
    /**
     * @description: 饿汉
     * @create: 2018-10-24 18:13
     **/
        private static Singleton1 singleton1 = new Singleton1();

        private Singleton1() {
        }

        public static Singleton1 getInstance() {

            return singleton1;
        }
    }
