//统计一串字符串中大写字符，小写字符和其他字符的个数
import java.util.Scanner;

class Method
{
    private String str;
    private int cntU = 0; //大写字母的个数
    private int cntL = 0; //小写字母的个数
    private int cntOther = 0;

    public Method(String str)
    {
        this.str = str;
    }

    public void method1()
    {
        int i;
        for(i=0; i<str.length(); ++i)
        {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z')
                cntL++;
            else if(ch>='A' && ch<='Z')
                cntU++;
            else
                cntOther++;
        }
        System.out.printf("大写字母个数：%d\n", cntU);
        System.out.printf("小写字母个数：%d\n", cntL);
        System.out.printf("其他字母个数：%d\n", cntOther);
        System.out.println("\n");
        cntU = 0;
        cntL = 0;
        cntOther = 0;
    }

    public void method2()
    {
        int i;
        char ch;
        for(i=0; i<str.length(); ++i)
        {
            ch = str.charAt(i);
            if(Character.isUpperCase(ch))
                cntU++;
            else if(Character.isLowerCase(ch))
                cntL++;
            else
                cntOther++;
        }
        System.out.printf("大写字母个数：%d\n", cntU);
        System.out.printf("小写字母个数：%d\n", cntL);
        System.out.printf("其他字母个数：%d\n", cntOther);
        System.out.println("\n");
        cntU = 0;
        cntL = 0;
        cntOther = 0;
    }

    public void method3()
    {
        int i;
        char ch;
        String s1 = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
        String s2 = "abcdefghigklmnopqrstuvwxyz";
        for(i=0; i<str.length(); ++i)
        {
            ch = str.charAt(i);

            if(-1 != (s1.indexOf(ch))) //public int indexOf(String str) 返回字符串中出现str的第一个位置
                cntU++;
            else if(-1 != (s2.indexOf(ch)))
                cntL++;
            else
                cntOther++;
        }
        System.out.printf("大写字母个数：%d\n", cntU);
        System.out.printf("小写字母个数：%d\n", cntL);
        System.out.printf("其他字母个数：%d\n", cntOther);
        System.out.println("\n");
        cntU = 0;
        cntL = 0;
        cntOther = 0;
    }

}

public class TestString_3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        Method m = new Method(str);
        m.method1();
        m.method2();
        m.method3();
    }
}
