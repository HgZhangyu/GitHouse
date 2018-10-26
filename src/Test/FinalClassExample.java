package Test;

public final class FinalClassExample {
/**
 *
 * @description: 设计一个不可变类
 *
 * @create: 2018-10-24 16:05
 **/
    private final int id;
    private final String name;


    public FinalClassExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        int i = 1;
        String n = "zhangsan";
        FinalClassExample t1 = new FinalClassExample(i,n);
        System.out.println("-----------------");
        System.out.println("id="+t1.getId());
        System.out.println("name="+t1.getName());
        i = 2000000;
        n = "lisi";
        System.out.println("-----------------");
        System.out.println("id="+t1.getId());
        System.out.println("name="+t1.getName());
}
}
