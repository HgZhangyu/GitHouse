import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class HelloWorldFileOut {
    /**
     * @description: 输出HelloWorld到txt文件中
     * @create: 2018-10-24 11:19
     **/
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            File file = new File("F://workspace//FileOut//Helloworld.txt");
            fos = new FileOutputStream(file);
            System.out.println("请输入您要输出的内容：");
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            byte[] byt = a.getBytes();
            fos.write(byt);
            fos.flush();

        }  catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}

