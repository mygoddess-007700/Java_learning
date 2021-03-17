import java.io.*;

class DivisorIsZeroException extends Exception
{
    public DivisorIsZeroException(String n) //使用指定的详细消息构造新的异常
    {
        super(n);
    }
}

class A
{
    public void f() throws ArithmeticException //这里的throws表示谁调用f方法谁就可能需要处理ArithmeticException异常，f方法本身不处理
    {
        throw new ArithmeticException();
    }

    public int divide(int a, int b) throws DivisorIsZeroException
    {
        try
        {
            if (0 == b)
                throw new DivisorIsZeroException("除数不能为零!\n");
        }
        catch(DivisorIsZeroException e)
        {
            e.printStackTrace();
        }

        int m = a / b;

        return m;
    }
}
public class TestExcep_2
{
    public static void main(String[] args)
    {
        A aa = new A();

        try
        {
            aa.f();
        }
        catch(ArithmeticException e)
        {
            System.out.printf("No!My god!");
        }
    }
}
