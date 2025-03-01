//输入数字
import java.io.*;
public class InputNumber {
    public static void main(String[] args) throws IOException
    {
        float num;
        BufferedReader buf;
        String str;
        buf =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入实数");
        str = buf.readLine();
        num =Float.parseFloat(str);
        System.out.println("您输入的数是"+num);

    }
}
