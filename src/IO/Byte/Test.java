package IO.Byte;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String data = "a我b";
        byte[] bytes = data.getBytes();
        System.out.println(Arrays.toString(bytes));

        byte[] bytes1 = data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        String s1 = new String(bytes);
        System.out.println(s1);
        String s2 = new String(bytes1);
        System.out.println(s2);
        String s3 = new String(bytes1, "GBK");
        System.out.println(s3);
    }

}
