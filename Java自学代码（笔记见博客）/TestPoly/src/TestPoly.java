class A
{
    public void f()
    {
        System.out.printf("AAAA\n");
    }
}

class B extends A
{
    public void f()
    {
        System.out.printf("BBBB\n");
    }
}

class C extends B
{
    public void f()
    {
        System.out.printf("CCCC\n");
    }
}
public class TestPoly
{
    public static void f(A aa)
    {
        aa.f();
    }

    public static void main(String[] args)
    {
        A aa = new A();
        B bb = new B();
        C cc = new C();

//        aa.f();
//        bb.f();
//        cc.f();
        f(aa);
        f(bb);
        f(cc);
    }
}
