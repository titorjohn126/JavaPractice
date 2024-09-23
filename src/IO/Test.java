package IO;

import java.io.File;
import java.io.IOException;

//文件流：FileInputStream/FileOutputStream/FileReader/FileWriter
//缓冲流：操作内存：BufferedInputStream/BufferedOutputStream/BufferedReader/BufferedWriter
//数据流的读写都是基于内存的操作
//转换流:InputStreamReader/OutputStreamWriter
//打印流
//数据流
//对象流:把一个对象转化成一个数据流来读写
//随机存取文件流RandomAccessFile：任意定义从文件的什么地方读，什么地方插入数据
public class Test {
    public static void main(String[] args) {
//        File f = new File("\\Users\\keweiyi\\IdeaProjects\\untitled\\src\\IO\\123.txt");//一个\是转义符，两个\或者/是分隔符
//        File f4 = new File("\\Users\\keweiyi\\IdeaProjects\\untitled\\src");
////        File f1 = new File("\\Users\\keweiyi\\IdeaProjects\\untitled\\src\\IO\\123.txt");
////        File f3 = new File("\\Users" + File.separator + "keweiyi\\IdeaProjects\\untitled\\src\\IO/123.txt");
//        //file类不能操作文件内容，只能操作文件本身
//        System.out.println(f.getName());//获取文件名
//        System.out.println(f4.getName());//文件夹路径
//        System.out.println(f.getPath());
//        File f5 = new File("src/a/AbstractTest.java");
//        System.out.println(f5.getPath());//相对路径
//        System.out.println(f5.getAbsolutePath());
//        System.out.println(f5);
//        System.out.println(f5.getAbsoluteFile());//返回一个用当前文件的绝对路径构建的file对象
//        System.out.println(f5.getParent());//返回当前文件/文件夹的父级路径
        File oldFile = new File("/Users/keweiyi/IdeaProjects/untitled/src/IO/123.txt");
        File newFile = new File("/Users/keweiyi/IdeaProjects/untitled/src/IO/1234.txt");

//        System.out.println("原文件名: " + oldFile.getName());
//
//        // 检查原文件是否存在以及是否可读和可写
//        if (!oldFile.exists()) {
//            System.out.println("原文件不存在！");
//            return;
//        }
//        if (!oldFile.canRead()) {
//            System.out.println("没有权限读取原文件！");
//            return;
//        }
//        if (!oldFile.canWrite()) {
//            System.out.println("没有权限写入原文件！");
//            return;
//        }
//
//        // 检查目标文件是否已存在
//        if (newFile.exists()) {
//            System.out.println("目标文件已存在，重命名失败！");
//            return;
//        }
//
//        try {
//            if (oldFile.renameTo(newFile)) {
//                System.out.println("文件重命名成功！");
//                System.out.println("新文件名: " + newFile.getName());
//            } else {
//                System.out.println("文件重命名失败！");
//            }
//        } catch (SecurityException e) {
//            System.out.println("权限不足，无法重命名文件: " + e.getMessage());
//        }

        File f5 = new File("/Users/keweiyi/IdeaProjects/untitled/src/IO/1234.txt");
        System.out.println(f5.exists());
        System.out.println(f5.canRead());
        System.out.println(f5.canWrite());
        System.out.println(f5.equals(newFile));
        System.out.println(f5.isFile());
        System.out.println(f5.isDirectory());
        System.out.println(f5.isAbsolute());
        System.out.println(f5.lastModified());//获取文件最后修改时间，返回毫秒数
        System.out.println(f5.length());//文件长度，单位是字节

        File f8 = new File("/Users/keweiyi/IdeaProjects/untitled/src/IO/12345.txt");
//        if(!f8.exists()){
//            try{
//                f8.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        System.out.println(f8.exists());
//        f8.delete();
        File f9 = new File(f8.getParent() + "/cc");
        System.out.println(f9.getAbsoluteFile());
        f9.mkdir();//创建单层目录
        File f10 = new File(f8.getParent() + "/aa/bb");
        f10.mkdirs();
        File f11 = new File("/Users/keweiyi/IdeaProjects/untitled/");
        String[] f1 = f11.list();//返回子集的名称
        for(String s : f1) {
            System.out.println(s);
        }
        File[] fs = f11.listFiles();//返回子集的file对象，包括目录
        for(File f : fs) {
            System.out.println(f);
        }
    }
}
