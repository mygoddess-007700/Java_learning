//时间：2021.2.21
class A
{
    public int i;
    public int j;

    public A()
    {

    }

    public A(int i, int j)
    {
        this.i = i;
        this.i = j;
    }
}

class B extends A
{
    public int k;

    public B()
    {

    }

    public B(int i, int j, int k)
    {
//        this.i = i;
//        this.j = j;
//        A(i, j); //error,but C++ is ok
        super(i, j); //取代上面的方法，方便
        this.k = k;
    }

}

public class TestSuper
{
    public static void main(String[] args)
    {
        B bb = new B(1, 2, 3);
        System.out.printf("%d %d\n", bb.i, bb.j);
    }
}
