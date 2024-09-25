package IO.zifuliu;

import java.io.FileWriter;
import java.io.Writer;

public class Test2 {
    public static void main(String[] args) {//只有在流关闭或者刷新了才能写入,因为写入是先写入缓冲区，等都写完之后只需要一次调用写入,关闭包含刷新
        //缓冲区装满了会自动写入
        try(
                Writer fw = new FileWriter("/Users/keweiyi/IdeaProjects/untitled/src/IO/zifuliu/file2.txt", true);

                ){
            fw.write('a');
            fw.write('了');
            fw.write(97);
            fw.write("我爱你");
            fw.write("我草泥马", 0, 2);

            char[] buffer = {'是', ',', '1'};
            fw.write(buffer);
            fw.write("\r\n");
            fw.flush();//刷新流

        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
