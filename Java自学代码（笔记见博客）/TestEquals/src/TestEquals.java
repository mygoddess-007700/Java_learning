class B
{
    public int i;

    public B(int i)
    {
        this.i = i;
    }

    public boolean equals(Object obj)
    {
        B bb = (B)obj;

        if( this.i == bb.i)
            return true;
        else
            return false;
    }
}

public class TestEquals
{
    public static void main(String[] args)
    {
        System.out.println(new B(2).toString());
        B bb1 = new B(2);
        B bb2 = new B(2);
        System.out.println(bb1.equals(bb2));
    }
}
