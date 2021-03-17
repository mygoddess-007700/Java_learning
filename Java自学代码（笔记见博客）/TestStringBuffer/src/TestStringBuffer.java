public class TestStringBuffer
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        sb.append("abc");
        System.out.println(sb);
        sb.append("123");
        System.out.println(sb);
        sb.insert(3, "--");
        System.out.println(sb);
        sb.delete(2, 6); //把下标从2开始到6-1结束的字符删除
        System.out.println(sb);
        sb.reverse(); //倒序
        System.out.println(sb);
    }
}
