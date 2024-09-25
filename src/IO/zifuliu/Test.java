package IO.zifuliu;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test {
    public static void main(String[] args) {
        //1 创建一个文件字符输入流管道与原文件相连
        try(
                Reader fr = new FileReader("/Users/keweiyi/IdeaProjects/untitled/src/IO/zifuliu/file.txt");
                ){
//            int c;//每次读取的字符编号
//            while((c = fr.read()) != -1){
//                System.out.print((char)c);
//            }
            char[] buffer = new char[1024];
            int len;
            while ((len = fr.read(buffer)) != -1) {
                String s = new String(buffer, 0, len);
                System.out.println(s);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}