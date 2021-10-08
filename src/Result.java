abstract class First
{
    abstract void method1();
}

class Second extends First
{
    @Override
    protected void method1()
        {
            System.out.println("welcome");
        }
}

interface i1
{
    default public void m2()
    {

    }
    int t=5;
    public static void m1()
    {
        System.out.println("sf");
    }

}
class Result {
    public static void main(String ...args)
    {

        i1 o1=new i1() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }
    public void m6()
    {

    }
}

