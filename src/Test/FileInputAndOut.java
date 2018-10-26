package Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputAndOut {
/**
 *
 * @description: 文件的提取与输出
 *
 * @create: 2018-10-24 12:42
 **/
public static void main(String[] args) {
    FileReader fr = null;
    FileWriter fw = null;
    String path = "F://workspace//FileOut//Helloworld.txt";
    String dataPath = "F://workspace//FileOut//Helloworld2.txt";
    try {
        fr = new FileReader(path);
        fw = new FileWriter(dataPath,true);
        int i = 0;
        while((i=fr.read())!=-1){
            System.out.print((char)i);
            fw.write(i);
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }finally {
        if(fr!=null){
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(fw!=null){
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
}
