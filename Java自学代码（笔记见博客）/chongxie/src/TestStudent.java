//时间：2021.2.23
//目的：关于重写的代码
class Human
{
    private String name;
    private int age;

    public Human()
    {

    }

    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getInfor()
    {
        String strInf = name + ":" + age;
        return strInf;
    }
}

class Student extends Human
{
    public String school;

    public Student()
    {

    }

    public Student(String name, int age, String school)
    {
        super(name, age);
//        this.name = name; //error,因为name是私有的
//        this.age = age; //error
        this.school = school;
    }

    public void setSchool(String school)
    {
        this.school = school;
    }

    public String getInfor()
    {
//        String strInf = name + ":" + age; //error,同上
        String strInf = super.getInfor() + ":" + school;
        return strInf;
    }
}

public class TestStudent
{
    public static void main(String[] args)
    {
        Student st1 = new Student("张三", 22, "中学");
        System.out.printf("%s\n", st1.getInfor());
    }
}
