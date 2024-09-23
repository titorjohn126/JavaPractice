package IO;

import java.io.File;//递归遍历文件，不论层级多深
public class diguibianli {
    public static void main(String[] args) {
        File f = new File("/Users/keweiyi/IdeaProjects/untitled/src");
        new diguibianli().test(f);
    }

    public void test(File file){
        if(file.isFile()){
            System.out.println(file.getAbsoluteFile() + "是文件");
        }else{
            System.out.println(file.getAbsoluteFile() + "是文件夹");//如果是文件夹，下面可能有东西
            File[] fs = file.listFiles();
            if(fs != null && fs.length > 0){
                for(File f : fs){
                   test(f);
                }
            }
        }
    }
}

