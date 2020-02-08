class ConstructorName{
    int a,b;
    ConstructorName(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void Numbers()
    {
        System.out.println("First Number="+a+" & "+"Second Number="+b);
    }
}
class Test{
    Test(ConstructorName obj)
    {
        int c=obj.a+obj.b;
        System.out.println("The Sum of the numbers ="+c);
    }
}
class ObjAsParameter{
    public static void main(String[] args)
    {
        ConstructorName obj1=new ConstructorName(4,5);
        obj1.Numbers();
        Test obj=new Test(obj1);

    }
}