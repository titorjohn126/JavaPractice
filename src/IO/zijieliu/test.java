package IO.zijieliu;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class test {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("/Users/keweiyi/IdeaProjects/untitled/src/IO/123.txt");//左边父类，用多态来

//        int b1 = is.read();
//        System.out.println(b1);
//        int b2 = is.read();
//        System.out.println(b2);
//        int b3 = is.read();
//        System.out.println(b3);//没有会返回-1

//        int b;
//        while((b=is.read())!=-1){//无法避免读汉字乱码,读取性能差
//            System.out.print((char)b);
//        }
//        byte[] buffer = new byte[3];
//        int len = is.read(buffer);
//        String s = new String(buffer, 0, len);
//        System.out.println(s);
//
//        int len2 = is.read(buffer);//读完返回-1
//        String s2 = new String(buffer, 0, len2);//读取多少倒出多少，避免未覆盖
//        System.out.println(s2);

//        byte[] buffer = new byte[3];
//        int len;//记录每次读取多少字节
//        while((len = is.read(buffer)) != -1){
//            String s = new String(buffer, 0, len);
//            System.out.print(s);
//        }

        //方法1:一次性读写全部字节
//        File f = new File("/Users/keweiyi/IdeaProjects/untitled/src/IO/123.txt");
//        long size = f.length();
//
//        byte[] buffer = new byte[(int)size];//文件很大，内存不一定会很大，所以这里限制只能填int类型
//        int len;//记录每次读取多少字节
//        while((len = is.read(buffer)) != -1){
//            String s = new String(buffer, 0, len);
//            System.out.print(s);
//        }
        //方法2
        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));

        is.close();//释放系统资源

        OutputStream os = new FileOutputStream("/Users/keweiyi/IdeaProjects/untitled/src/IO/1123.txt");
//        OutputStream os = new FileOutputStream("/Users/keweiyi/IdeaProjects/untitled/src/IO/1123.txt",true);//不覆盖而是追加
        os.write(97);//默认写1个字节
        os.write('b');//也是一个字节
        byte[] bytes = "我草泥马".getBytes(StandardCharsets.UTF_8);
        os.write(bytes);
        os.write(bytes, 0, 6);
        // /r/n换行符
        os.close();
    }



}
