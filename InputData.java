//由键盘输入数据
import java.io.*;
public class InputData {
    public static void main(String[] args) throws IOException
    {
        BufferedReader buf; //声明buf变量
        String str;//声明str变量
        buf =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入字符串：");
        str = buf.readLine();
        System.out.println("您输入的字符串是："+str);
    }
    
}    

