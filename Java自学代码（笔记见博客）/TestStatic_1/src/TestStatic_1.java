//目的：设计一个可以随时求出已构造的对象的数量的类
class A
{
    private int i;
    private static int cnt = 0;

    public A()
    {
        ++cnt;
    }

    public A(int i)
    {
        this.i = i;
        ++cnt;
    }

    public static int getCnt()
    {
        return cnt;//返回的是A对象的个数
    }
}

public class TestStatic_1
{
    public static void main(String[] args)
    {
        System.out.printf("当前时刻A对象的个数是：%d\n", A.getCnt());
        A aa1 = new A();
        System.out.printf("当前时刻A对象的个数是：%d\n", A.getCnt());
        A aa2 = new A();
        System.out.printf("当前时刻A对象的个数是：%d\n", A.getCnt());
    }
}
