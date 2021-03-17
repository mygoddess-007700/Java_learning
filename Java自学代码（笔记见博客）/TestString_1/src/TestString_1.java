/*
    2021.3.7
    测试String类的
        equals方法的使用
        ==的用法
        常量字符串的用法
*/

public class TestString_1
{
    public static void main(String[] args)
    {
        String str1 = new String("china");
        String str2 = new String("china");
        System.out.println(str1.equals(str2)); //true

        if( str1 == str2 ) //false
            System.out.println("str1 == str2");
        else
            System.out.println("str1 != str2");

        String str3 = "china";
        String str4 = "china";
        if( str3 == str4 ) //true
            System.out.println("str3 == str4");
        else
            System.out.println("str3 != str4");
    }
}
