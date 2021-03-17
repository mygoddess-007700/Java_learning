class A
{
    public String ToString()
    {
        return "haha!\n";
    }
}

public class TestToString
{
    public static void main(String[] args)
    {
//        System.out.println(new A());
        A aa = new A();
        System.out.println(aa); //等价于System.out.println(aa.toString());
    }
}
