package IO.zijieliu;

import java.io.*;

public class Try_With_Resource {//自动释放资源
    public static void main(String[] args) {
        try(//只能放置资源对象，资源都会实现AutoCloseable接口
            InputStream is = new FileInputStream("/Users/keweiyi/IdeaProjects/untitled/src/IO/123.txt");
            OutputStream os = new FileOutputStream("/Users/keweiyi/IdeaProjects/untitled/src/IO/zijieliu/out.txt");
        ){

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
