//目的：设计一个只能分配一个对象的类

class A
{
    public int i = 20;
    private static A aa = new A(); //aa是A对象的属性，可以实现因为程序从上往下的
                                    //static不能省略，因为静态方法无法访问非静态数据

    private A()
    {

    }

    public static A getA() //static一定不能省略，要不然其他类无法访问该方法
    {
        return aa;
    }


}

public class TestStatic_2
{
    public static void main(String[] args)
    {
        A aa1 = A.getA();
        A aa2 = A.getA();

        aa1.i = 99;
        System.out.printf("%d\n", aa2.i);

        if(aa1 == aa2)
        {
            System.out.printf("aa1 和 aa2相等\n");
        }
        else
        {
            System.out.printf("a1 和 aa2不相等\n");
        }
    }
}
