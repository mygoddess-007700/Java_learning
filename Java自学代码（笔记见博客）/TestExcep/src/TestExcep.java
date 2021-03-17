import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExcep
{
    public static void main(String[] args)
    {
        int i;

        Scanner sc = new Scanner(System.in); //System.in 表示键盘

        try
        {
            i = sc.nextInt();
            System.out.printf("i = %d\n", i);
        }
        catch (InputMismatchException a)
        {
            System.out.printf("输入数据不合法，程序被终止！\n");
        }
    }
}
