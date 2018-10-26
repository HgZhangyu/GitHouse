package Test.Singleton;

public enum Singleton5 {
/**
 *
 * @description: 枚举
 *
 * @create: 2018-10-24 18:44
 **/
    singleton5("admin","admin");
    private String username;
    private String password;

    Singleton5(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
