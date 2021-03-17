public class TestString_2
{
    public static void main(String[] args)
    {
        int i = 123;
        String str = "456";

//        str = i; //error
//        i = str; //error
        str = String.valueOf(i); //将基本类型转化成字符串
        System.out.printf("str = %s\n", i);

        str = "567";
        i = Integer.parseInt(str); //将字符串参数解析为带符号的十进制整数。
        System.out.printf("i = %d\n", i);
    }
}
