interface It
{
    public static final int i = 20;
    public abstract void f();
}

interface It2
{
    int i = 20;
    void f();
}

interface It3 extends It, It2
{

}

interface It4
{
    int i = 20;
}

class A implements It2
{
//    i = 28; //error
    public void f()
    {
        System.out.printf("i = %d\n", i);
    }
}

class T extends A implements It4, It3
{

}

public class TestInter
{
    public static void main(String[] args)
    {
//        A aa = new A(); //error
//        A aa = new A();
//        aa.f();
        It2 it = new A();
        it.f();
    }
}
