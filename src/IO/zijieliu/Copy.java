package IO.zijieliu;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("/Users/keweiyi/IdeaProjects/untitled/src/IO/12345.txt");
        OutputStream os = new FileOutputStream("/Users/keweiyi/IdeaProjects/untitled/src/IO/zijieliu/out.txt");
        byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer)) != -1){
            os.write(buffer, 0, length);
        }
        os.close();
        is.close();
    }
}
