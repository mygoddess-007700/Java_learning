/*
     2021.3.14
     统计一个字符串在另一个字符串中出现的次数
*/

public class TestString_4
{
    public static void main(String[] args)
    {
        String str1 = "abcasdabcabc";
        String str2 = "abc";
        int index = -1;
        int cnt = 0;

        index = str1.indexOf(str2);
        while(-1 != index)
        {
            ++cnt;
            index = str1.indexOf(str2, index+str2.length());
        }
        System.out.println("次数是：" + cnt);
    }
}
