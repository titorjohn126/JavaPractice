package IO;

import java.io.File;

public class demo_delete {
    public static void main(String[] args) {
        //目标删除非空文件夹
        File file = new File("/Users/keweiyi/IdeaProjects/untitled/src/IO/cc");
        System.out.println(file.delete());
        deletedDir(file);

    }
    public static void deletedDir(File dir) {
        if(dir == null || !dir.exists()) {
            return;
        }
        if(dir.isFile()){
            dir.delete();
            return;
        }
        File[] files = dir.listFiles();
        if (files == null) {
            return;
        }
        if(files.length == 0){
            dir.delete();
        }

        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }else{
                deletedDir(file);
            }
        }
        dir.delete();
    }
}
