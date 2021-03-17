/*
2021.3.8
error
*/

class A
{
    public int i;
}

class B
{
    private int q;
    public void f(int q)
    {
        this.q = q;
    }
    public void show()
    {
        System.out.println(q);
    }
}

public class TestReferenceAndObject
{
    public static void main(String[] args)
    {
        A aa1 = null;
        A aa2 = null;
        B bb1 = null;
        B bb2 = null;

        aa1.i = 4;
        aa2.i = 6;
        System.out.printf("%d, %d\n", aa1.i, aa2.i);
        bb1.f(10);
        bb2.f(20);
        bb1.show();
        bb2.show();

    }
}
