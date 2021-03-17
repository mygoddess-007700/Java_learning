//java中的函数也叫方法 方法逻辑意义代表的就是一个事物可以执行的操作
class Triangle
{
    int a;
    int b;
    int c;

    int zhouchang()//不需要定义实参，因为zhouchang函数和属性a b c是紧密联系的
    {
        return a + b + c;

    }

    double area()
    {
        double p = 1.0*(a+b+c) / 2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }
};

class TestTriangle
{
    public static void main(String[] args)
    {
        Triangle s = new Triangle(); //等价于Triangle * r = (Triangle *)malloc(sizeof(Triangle));

        s.a = 3;
        s.b = 4;
        s.c = 5;

        System.out.printf("%d    %f\n", s.zhouchang(), s.area()); //在java中double和floatdouyong%f输出

    }

}

